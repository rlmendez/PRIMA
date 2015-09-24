package uan.mendez.marco.prima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class pedido_express extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_express);

        //Definimos el objeto texto a partir de el elemento con id caja_de_texto
        TextView texto = (TextView)findViewById(R.id.fecha);

        Date fecha = new java.util.Date(); //manejador de fechas

        //Cambiamos el texto
        texto.setText("Fecha: "+ fecha.getDate()+"-"+fecha.getMonth()+"-"+fecha.getYear());
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

    /*public void fecha(View f){

        final TextView fecha_actual = (TextView) findViewById(R.id.fecha);

        final Calendar c = Calendar.getInstance();
        int anio = c.get(Calendar.YEAR); //obtenemos el año
        int mes = c.get(Calendar.MONTH); //obtenemos el mes

        mes = mes + 1;
        int dia = c.get(Calendar.DAY_OF_MONTH);
        fecha_actual.setText(dia);


    }//fecha*/



}