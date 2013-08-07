package m.zapata.icaro;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by miguelo on 07-08-13.
 */
public class Preferencias extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.ajustes_aplicacion);
        this.getActivity().getActionBar().setTitle(R.string.action_settings);
    }
}
