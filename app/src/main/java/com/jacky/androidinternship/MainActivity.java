package com.jacky.androidinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    Button registerButton;
    EditText usernameField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = findViewById(R.id.loginButton);
        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = usernameField.getText().toString();
                String pass = passwordField.getText().toString();
                if (!uname.isEmpty() && !pass.isEmpty()) {
                    Toast.makeText(getApplicationContext(), uname + " logged in successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Username and password are required fields!", Toast.LENGTH_LONG).show();
                }
            }
        });
        registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterPage.class);
                startActivity(intent);
            }
        });
    }
}