package m.zapata.icaro;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;


/**
 * Created by miguelo on 27-08-13.
 */
public final class BackgroundTask extends AsyncTask<Void, Long, Boolean> {    //parametros, progreso, resultado
    private Activity activity;
    private ProgressDialog dialogoEjecucion;


    public BackgroundTask(Activity activity) {

        this.activity = activity;
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

        return true;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        //apariencia
        dialogoEjecucion.dismiss();

    }

}

