package Funcionalidades;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.Normalizer;

import m.zapata.icaro.JSON;
import m.zapata.icaro.MainActivity;
import m.zapata.icaro.R;

/**
 * Created by miguelo on 31-08-13.
 *
 * Acceso a API Open Weather Map
 *
 */
public class Clima {
    Activity mActivity;
    LayoutInflater mInflater;
    View mVistaUI;

    RelativeLayout climaLayout;
    ProgressDialog pDialog;

    ImageView iconoClima;
    TextView temperatura;
    TextView tempMin;
    TextView tempMax;
    TextView humedad;
    TextView estadoClima;
    TextView ciudad;
    TextView pais;

    int _temperatura;
    int _tempMin;
    int _tempMax;
    String _humedad;
    String _estadoClima;
    String _ciudad;
    String _pais;



    public Clima(Activity mActivity, LayoutInflater mInflater, View mVistaUI) {
        this.mActivity = mActivity;
        this.mInflater = mInflater;
        this.mVistaUI = mVistaUI;

        View interfazUsuario = mVistaUI;
        ViewGroup interfazPadre = (ViewGroup) interfazUsuario.getParent();
        int index = interfazPadre.indexOfChild(interfazUsuario);
        interfazPadre.removeView(interfazUsuario);
        interfazUsuario = mInflater.inflate(R.layout.clima, interfazPadre, false);
        //interfazUsuario.setVisibility(View.GONE);
        interfazPadre.addView(interfazUsuario, index);
        MainActivity.VistaUI = interfazUsuario;

        iconoClima = (ImageView) mActivity.findViewById(R.id.image_iconoClima);
        temperatura = (TextView) mActivity.findViewById(R.id.t_Temperatura);
        tempMin = (TextView) mActivity.findViewById(R.id.t_Min);
        tempMax = (TextView) mActivity.findViewById(R.id.t_Max);
        humedad = (TextView) mActivity.findViewById(R.id.t_Humedad);
        estadoClima = (TextView) mActivity.findViewById(R.id.t_EstadoClima);
        ciudad = (TextView) mActivity.findViewById(R.id.t_Ciudad);
        pais = (TextView) mActivity.findViewById(R.id.t_Pais);

        climaLayout = (RelativeLayout) mActivity.findViewById(R.id.layout_clima);

        pDialog = new ProgressDialog(mActivity);
        pDialog.setMessage("Cargando Informacion");
        pDialog.setCancelable(false);
        pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    }

    public void mostrarClima() {
        Toast.makeText(mActivity, "hola, este es pequeño un toast de clima", Toast.LENGTH_LONG).show();
    }

    public void mostrarClima(String ubicacion) {
        climaLayout.setVisibility(View.GONE);
        String lugar = ubicacion.replace(" ", "+");
        String urlAPI = "http://api.openweathermap.org/data/2.5/weather?q=" + lugar + "&units=metric&lang=sp&type=like&appid=7bc384e6dd840ab93ff9ecdf089b27ab";
        new EjecuccionTarea(urlAPI, "POST").execute();
    }


    private class EjecuccionTarea extends AsyncTask<String, Void, Void> {
        String URL = null;
        String metodo = null;
        int error = 0;


        public EjecuccionTarea(String url, String method) {
            this.URL = url;
            this.metodo = method;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog.show();
        }

        @Override
        protected Void doInBackground(String... params) {
            JSONObject resultadoJSON;
            resultadoJSON = JSON.descargarJSON(URL, metodo);

            if (resultadoJSON != null) {
                try {
                    _estadoClima = Normalizer.normalize(resultadoJSON.getJSONArray("weather").getJSONObject(0).getString("description"), Normalizer.Form.NFD);
                    _estadoClima = _estadoClima.replaceAll("[^\\p{ASCII}]", "");

                    _temperatura = (int) Math.round(Double.parseDouble(resultadoJSON.getJSONObject("main").getString("temp")));
                    _tempMin = (int) Math.round(Double.parseDouble(resultadoJSON.getJSONObject("main").getString("temp_min")));
                    _tempMax = (int) Math.round(Double.parseDouble(resultadoJSON.getJSONObject("main").getString("temp_max")));

                    _humedad = resultadoJSON.getJSONObject("main").getString("humidity");
                    //velocidadViento = resultado.getJSONObject("wind").getString("speed");
                    _ciudad = resultadoJSON.getString("name");
                    _pais = resultadoJSON.getJSONObject("sys").getString("country");

                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("Icaro", "Error parseando JSON");
                    Log.e("Icaro", e.getMessage());
                    error = 1; //error parseando datos
                }

            } else {
                Log.e("Icaro", "JSON obtenido null");
                error = 2; //error obteniendo datos
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            if (error == 0) {
                estadoClima.setText(_estadoClima.toUpperCase());
                temperatura.setText(_temperatura + "º");
                tempMin.setText(_tempMin + "º");
                tempMax.setText(_tempMax + "º");
                humedad.setText(_humedad + "%");
                //vientoValue.setText(velocidadViento+" kmh");
                ciudad.setText(_ciudad);
                pais.setText(_pais);

                pDialog.dismiss();
                //MainActivity.VistaUI.setVisibility(View.VISIBLE);
                climaLayout.setVisibility(View.VISIBLE);
            }

            if (error == 1) {
                pDialog.dismiss();
                Toast.makeText(mActivity, R.string.error_parser, Toast.LENGTH_LONG).show();
            }

            if (error == 2) {
                pDialog.dismiss();
                Toast.makeText(mActivity, R.string.error_red_datos, Toast.LENGTH_LONG).show();
            }
        }
    }
}

