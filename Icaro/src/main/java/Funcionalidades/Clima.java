package Funcionalidades;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import m.zapata.icaro.MainActivity;
import m.zapata.icaro.R;

/**
 * Created by miguelo on 31-08-13.
 */
public class Clima {
    Activity mActivity;
    LayoutInflater mInflater;
    View mVistaUI;

    public Clima(Activity mActivity, LayoutInflater mInflater, View mVistaUI) {
        this.mActivity = mActivity;
        this.mInflater = mInflater;
        this.mVistaUI = mVistaUI;

        View interfazUsuario = mVistaUI;
        ViewGroup interfazPadre = (ViewGroup) interfazUsuario.getParent();
        int index = interfazPadre.indexOfChild(interfazUsuario);
        interfazPadre.removeView(interfazUsuario);
        interfazUsuario = mInflater.inflate(R.layout.clima, interfazPadre, false);
        interfazPadre.addView(interfazUsuario, index);
        MainActivity.VistaUI = interfazUsuario;

    }

    public void mostrarClima() {

        Toast.makeText(mActivity, "hola, este es un toast de clima", Toast.LENGTH_LONG).show();


    }

    public void mostrarClima(String ubicacion) {

        Toast.makeText(mActivity.getBaseContext(), "hola, este es un toast de clima con lugar", Toast.LENGTH_LONG).show();

    }
}
