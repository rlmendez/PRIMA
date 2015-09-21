package uan.mendez.marco.prima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Calendar;

public class pedido_express extends AppCompatActivity {

    final TextView fecha_actual = (TextView) findViewById(R.id.fecha01);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_express);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pedido_express, menu);
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

    final Calendar c = Calendar.getInstance();
    int anio = c.get(Calendar.YEAR); //obtenemos el año
    int mes = c.get(Calendar.MONTH); //obtenemos el mes

    mes = mes + 1;
    int dia = c.get(Calendar.DAY_OF_MONTH); // obtemos el día.
    fecha_actual.setText(dia+” : “+mes+” : “+anio); //cambiamos el texto que tiene el
}
