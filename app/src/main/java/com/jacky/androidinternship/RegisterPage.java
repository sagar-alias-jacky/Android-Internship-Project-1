package com.jacky.androidinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {

    EditText firstNameField;
    EditText lastNameField;
    EditText registerEmailField;
    EditText registerPasswordField;
    Button registerButton2;
    Button loginButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        firstNameField = findViewById(R.id.firstName);
        lastNameField = findViewById(R.id.lastName);
        registerEmailField = findViewById(R.id.registerEmail);
        registerPasswordField = findViewById(R.id.registerPassword);
        registerButton2 = findViewById(R.id.registerButton2);
        loginButton2 = findViewById(R.id.loginButton2);
        registerButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameField.getText().toString();
                String lastName = lastNameField.getText().toString();
                String registerEmail = registerEmailField.getText().toString();
                String registerPassword = registerPasswordField.getText().toString();
                if (!firstName.isEmpty() && !registerEmail.isEmpty() && !registerPassword.isEmpty()) {
                    Toast.makeText(getApplicationContext(), firstName + " " + lastName + " registered successfully!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(RegisterPage.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "First Name, Email and Password are required fields!", Toast.LENGTH_LONG).show();
                }
            }
        });
        loginButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}