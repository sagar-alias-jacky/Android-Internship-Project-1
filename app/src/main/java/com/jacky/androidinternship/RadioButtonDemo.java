package com.jacky.androidinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonDemo extends AppCompatActivity {

    RadioButton radioButton;
    RadioGroup radioGroup;
    Button btnradio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_demo);
        radioGroup=findViewById(R.id.radioGroup1);
        btnradio=findViewById(R.id.btnradio);
        btnradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(id);
                if(id==-1)
                {
                    Toast.makeText(getApplicationContext(),"Please select an option!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}