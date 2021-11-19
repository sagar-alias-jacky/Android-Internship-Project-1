package com.jacky.androidinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText eusername, epassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button1);
        eusername = findViewById(R.id.edtuname);
        epassword = findViewById(R.id.edtpassword);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = eusername.getText().toString();
                String pass = epassword.getText().toString();
                Toast.makeText(getApplicationContext(), uname, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondPage.class);
                startActivity(intent);
            }
        });
    }
}