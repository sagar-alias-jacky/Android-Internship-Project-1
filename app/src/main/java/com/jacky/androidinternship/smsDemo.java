package com.jacky.androidinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class smsDemo extends AppCompatActivity {

    EditText phoneNumberField;
    EditText messageField;
    Button sendSMSButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_demo);
        phoneNumberField=findViewById(R.id.phoneNumberField);
        messageField=findViewById(R.id.messageField);
        sendSMSButton=findViewById(R.id.sendSMSButton);
        sendSMSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber=phoneNumberField.getText().toString();
                String message=messageField.getText().toString();
                Intent intent=new Intent(getApplicationContext(),smsDemo.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),0,intent,0);
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(phoneNumber,null,message,pendingIntent,null);
            }
        });
    }
}