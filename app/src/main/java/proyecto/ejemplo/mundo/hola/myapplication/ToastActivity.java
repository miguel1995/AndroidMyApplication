package proyecto.ejemplo.mundo.hola.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        buttom = (Button)findViewById(R.id.button5);
        buttom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button5:
                Toast.makeText(this, "Soy un TOAST", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
