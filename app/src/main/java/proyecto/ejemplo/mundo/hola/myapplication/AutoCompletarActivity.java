package proyecto.ejemplo.mundo.hola.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class AutoCompletarActivity extends AppCompatActivity implements View.OnClickListener {

    AutoCompleteTextView auto;
    TextView texto;
    Button boton;

    String[] nombres = {"Juan", "Juan valdez", "Miguel", "Miguel Angel", "Leon", "Leonardo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_completar);
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

        auto = (AutoCompleteTextView) findViewById(R.id.auto);
        texto = (TextView) findViewById(R.id.texto);
        boton = (Button)findViewById(R.id.boton);

        boton.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, nombres);
        auto.setThreshold(3);
        auto.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.boton):
                texto.setText(auto.getText());
                break;
        }
    }
}
