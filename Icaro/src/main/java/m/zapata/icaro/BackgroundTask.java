package m.zapata.icaro;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import IcaroEngine.EngineLexer;
import IcaroEngine.EngineParser;


/**
 * Created by miguelo on 27-08-13.
 */
public final class BackgroundTask extends AsyncTask<Void, Long, Boolean> {    //parametros, progreso, resultado
    private Activity activity;
    private ProgressDialog dialogoEjecucion;
    private LayoutInflater inflater;
    private String peticion;
    private View VistaUI;


    public BackgroundTask(Activity activity, LayoutInflater inflater, View vistaUI, String peticionModificada) {
        this.activity = activity;
        this.inflater = inflater;
        this.peticion = peticionModificada;
        this.VistaUI = vistaUI;
    }

    @Override
    protected void onPreExecute() {
        //dialogoEjecucion = ProgressDialog.show(context,"","Cargando informacion, espere...",true);

        //funcionalidad
        dialogoEjecucion = new ProgressDialog(activity);
        dialogoEjecucion.setMessage("Cargando informacion..."); //TODO: Cambiar por resource
        dialogoEjecucion.setCancelable(false);
        dialogoEjecucion.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialogoEjecucion.show();

    }

    @Override
    protected Boolean doInBackground(Void... params) {

        EngineLexer lexer = new EngineLexer(new ANTLRInputStream(peticion));
        EngineParser parser = new EngineParser(new CommonTokenStream(lexer));
        parser.icaro(this.activity, this.inflater, this.VistaUI);
        return true;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        //apariencia
        dialogoEjecucion.dismiss();

    }

}

