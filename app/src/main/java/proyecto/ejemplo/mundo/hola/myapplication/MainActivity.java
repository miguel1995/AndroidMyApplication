package proyecto.ejemplo.mundo.hola.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button boton1;
    Spinner spinner;

    List opciones = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        spinner = (Spinner) findViewById(R.id.spinnerMain);

        opciones.add(0, "0 TextView y Edit Text");
        opciones.add(1, "1 ImageView");
        opciones.add(2, "2 Toast");
        opciones.add(3, "3 Intercambio de datos entre Actividades");
        opciones.add(4, "4 Radio Button y Radio Group");
        opciones.add(5, "5 Spinner");
        opciones.add(6, "6 Toggle");
        opciones.add(7, "7 ScrollView");
        opciones.add(8, "8 AutoCompleted");


        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                nextActivity();


                break;

            default:
                break;
        }

    }

    public void nextActivity(){

        switch (spinner.getSelectedItemPosition()){
            case 0:
                Intent intent0 = new Intent(this, EditTextActivity.class);
                startActivity(intent0);
                break;
            case 1:
                Intent intent1 = new Intent(this, ImageViewActivity.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, ToastActivity.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, SendDataActivity.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, RadioGroupActivity.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, SpinnerActivity.class);
                startActivity(intent5);
                break;

            case 6:
                Intent intent6 = new Intent(this, ToggleActivity.class);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this, ScrollActivity.class);
                startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(this, AutoCompletarActivity.class);
                startActivity(intent8);
                break;
            default:
                break;


        }
    }


}
