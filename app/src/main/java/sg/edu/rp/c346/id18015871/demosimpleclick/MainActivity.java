package sg.edu.rp.c346.id18015871.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //Declare variables
    TextView tvDisplay;
    Button btnClick;
    EditText etInput;
    ToggleButton tbEnable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link to UI elements
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnClick=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        tbEnable=findViewById(R.id.toggleButtonEnabled);

        //Button event action
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });
        tbEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDisplay.setText("@string/show");

            }
        });

    }
}
