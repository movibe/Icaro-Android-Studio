package Funcionalidades;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import m.zapata.icaro.MainActivity;
import m.zapata.icaro.R;

/**
 * Created by miguelo on 07-10-13.
 */
public class Ubicacion extends Activity {
    Activity mActivity;
    LayoutInflater mInflater;
    View mVistaUI;

    RelativeLayout UbicacionActualLayout;

    public Ubicacion(Activity mActivity, LayoutInflater mInflater, View mView) {
        this.mActivity = mActivity;
        this.mInflater = mInflater;
        this.mVistaUI = mView;

        View interfazUsuario = mVistaUI;
        ViewGroup interfazPadre = (ViewGroup) interfazUsuario.getParent();
        int index = interfazPadre.indexOfChild(interfazUsuario);
        interfazPadre.removeView(interfazUsuario);
        interfazUsuario = mInflater.inflate(R.layout.ubicacion_actual, interfazPadre, false);
        interfazPadre.addView(interfazUsuario, index);
        MainActivity.VistaUI = interfazUsuario;
    }

    public void ubicacionActual() {
        Toast.makeText(mActivity, "hola, este es pequeño un toast de ubicacion", Toast.LENGTH_LONG).show();

    }

}
