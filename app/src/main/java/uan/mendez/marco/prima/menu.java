package uan.mendez.marco.prima;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.Serializable;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void regreso(View r){

        Intent picIntent = new Intent(this, login.class);

        startActivity(picIntent);

    }//void

    public void pedido(View p){

        Intent picIntent = new Intent(this, pedido_express.class);

        Spinner proyecto = (Spinner)findViewById(R.id.Obra);
        String o = proyecto.getSelectedItem().toString();

        picIntent.putExtra("Obra",o.toString());

        startActivity(picIntent);

    }//void

    public void estado(View l){

        Intent e = new Intent(this, estado_solicitudes.class);

        startActivity(e);

    }//void

    public void observacion(View l){

        Intent e = new Intent(this, observaciones.class);

        startActivity(e);

    }//void

}
