package com.jacky.androidinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class TextToSpeechDemo extends AppCompatActivity {
    EditText ttstext;
    Button ttsbutton;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        ttstext = findViewById(R.id.ttstext);
        ttsbutton = findViewById(R.id.ttsbutton);
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });
        ttsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ttstextContent = ttstext.getText().toString();
                textToSpeech.speak(ttstextContent,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}