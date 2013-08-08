package m.zapata.icaro;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by miguelo on 07-08-13.
 */
public class Dialogo_AcercaDe extends Dialog {
    private static Context mContext = null;

    public Dialogo_AcercaDe(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.acerca_de);
    }

}
