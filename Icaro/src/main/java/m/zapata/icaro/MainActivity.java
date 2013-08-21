package m.zapata.icaro;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

public class MainActivity extends Activity implements TextToSpeech.OnInitListener {
    private static final int REQUEST_CODE = 1000;
    private static final int VOICE_DATA_CHECK_CODE = 0;
    private static TextToSpeech TTS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        SearchView searchView = (SearchView) menu.findItem(R.id.action_busqueda).getActionView();
        //TODO: SetQueryHint con Android Resource
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
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

    private void ejecutarEngine(String peticion) {

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

    }

    @Override
    public void onInit(int status) {

    }
}
