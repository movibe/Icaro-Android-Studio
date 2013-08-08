package m.zapata.icaro;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

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
        this.requestWindowFeature(Window.FEATURE_LEFT_ICON);
        setContentView(R.layout.acerca_de);
        this.setTitle(R.string.acerca_de);
        this.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.action_about);
    }

}
