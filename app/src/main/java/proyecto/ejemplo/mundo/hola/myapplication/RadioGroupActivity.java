package proyecto.ejemplo.mundo.hola.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);


        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton4){
                    Toast.makeText(getApplicationContext(), "Opcion 1", Toast.LENGTH_SHORT).show();

                }else if (checkedId == R.id.radioButton5){
                    Toast.makeText(getApplicationContext(), "Opcion 2", Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.radioButton6){
                    Toast.makeText(getApplicationContext(), "Opcion 3", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
