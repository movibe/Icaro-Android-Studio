package m.zapata.icaro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        }
        return (super.onOptionsItemSelected(item));
    }
}
