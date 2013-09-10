package m.zapata.icaro;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Locale;

import IcaroEngine.EngineLexer;
import IcaroEngine.EngineParser;

public class MainActivity extends Activity implements TextToSpeech.OnInitListener {

    Locale Español = new Locale("spa");

    boolean networkStatus = false;
    private static final int REQUEST_CODE = 1000;
    private static final int VOICE_DATA_CHECK_CODE = 0;

    private static TextToSpeech TTS;
    private static TextView peticionIngresada;
    public static View VistaUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VistaUI = findViewById(R.id.VistaUI);
        peticionIngresada = (TextView) findViewById(R.id.peticionIngresada);
        peticionIngresada.setVisibility(TextView.INVISIBLE);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);


        final MenuItem menuBusqueda = menu.findItem(R.id.action_busqueda);
        SearchView searchView = (SearchView) menuBusqueda.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                peticionIngresada.setText(query);
                peticionIngresada.setVisibility(TextView.VISIBLE);
                menuBusqueda.collapseActionView();
                ejecutarEngine(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        Intent intentCheckReconocimiento = new Intent();
        intentCheckReconocimiento.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(intentCheckReconocimiento, VOICE_DATA_CHECK_CODE);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ManejoPreferencias.class);
                startActivityForResult(intent, 0);
                break;

            case R.id.acerca_de:
                Dialogo_AcercaDe acercaDe = new Dialogo_AcercaDe(this);
                acercaDe.show();
                break;

            case R.id.action_microfono:
                reconocimientoVoz();
                break;

        }
        return (super.onOptionsItemSelected(item));
    }

    private void reconocimientoVoz() {
        Intent intentGoogleVoice = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intentGoogleVoice.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "es_CL");
        intentGoogleVoice.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        intentGoogleVoice.putExtra(RecognizerIntent.EXTRA_PROMPT, R.string.busqueda_voz);
        startActivityForResult(intentGoogleVoice, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == VOICE_DATA_CHECK_CODE) {

            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                TTS = new TextToSpeech(this, this);
            } else {

                new AlertDialog.Builder(this)
                        .setTitle(R.string.atencion)
                        .setMessage(R.string.instalacion_tts)
                        .setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent installTTS = new Intent();
                                installTTS.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                                startActivity(installTTS);
                            }
                        })
                        .setNegativeButton(R.string.cancelar, null)
                        .show();
            }
        }

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            //SearchView.setQuery(matches.get(0), false);

            peticionIngresada.setText(matches.get(0));
            peticionIngresada.setVisibility(TextView.VISIBLE);
            ejecutarEngine(matches.get(0));
            Log.d("String Voz", matches.get(0));
        }

        if (resultCode == RecognizerIntent.RESULT_AUDIO_ERROR) {
            Log.e("Icaro", "Audio Error");
            Toast.makeText(this, R.string.error_audio, Toast.LENGTH_LONG).show();
        }

        if (resultCode == RecognizerIntent.RESULT_CLIENT_ERROR) {
            Log.e("Icaro", "Audio Error");
            Toast.makeText(this, R.string.error_audio, Toast.LENGTH_LONG).show();
        }

        if (resultCode == RecognizerIntent.RESULT_NETWORK_ERROR) {
            Log.e("Icaro", "Network Error");
            Toast.makeText(this, R.string.error_red_datos, Toast.LENGTH_LONG).show();
        }

        if (resultCode == RecognizerIntent.RESULT_SERVER_ERROR) {
            Log.e("Icaro", "Server Error");
            Toast.makeText(this, R.string.error_audio_servidor, Toast.LENGTH_LONG).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            if (TTS.isLanguageAvailable(Español) == TextToSpeech.LANG_AVAILABLE) ;
            TTS.setLanguage(Español);
        } else if (status == TextToSpeech.ERROR) {
            Toast.makeText(this, R.string.error_tts, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        if (TTS != null) {
            TTS.shutdown();
        }
        super.onDestroy();
    }

    private void ejecutarEngine(String peticion) {

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo estadoRed = cm.getActiveNetworkInfo();

        if (estadoRed != null && estadoRed.isConnectedOrConnecting()) {
            networkStatus = true;
        } else networkStatus = false;

        LayoutInflater inflater = getLayoutInflater();
        peticion.toLowerCase();
        peticion = Normalizer.normalize(peticion, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        EngineLexer lexer = new EngineLexer(new ANTLRInputStream(peticion));
        EngineParser parser = new EngineParser(new CommonTokenStream(lexer));
        parser.icaro(this, inflater, VistaUI, networkStatus);
    }
}
