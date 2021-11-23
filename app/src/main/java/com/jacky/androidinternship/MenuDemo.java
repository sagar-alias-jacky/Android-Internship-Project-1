package com.jacky.androidinternship;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_demo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Intent intent = new Intent(getApplicationContext(), CallPage.class);
                Toast.makeText(getApplicationContext(), "Call selected!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return true;
            case R.id.item2:
                Intent intent2 = new Intent(getApplicationContext(), smsDemo.class);
                Toast.makeText(getApplicationContext(), "Message selected!", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                return true;
            case R.id.item3:
                Intent intent3 = new Intent(getApplicationContext(), TextToSpeechDemo.class);
                Toast.makeText(getApplicationContext(), "Text To Speech selected!", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
                return true;
            case R.id.item4:
                Intent intent4 = new Intent(getApplicationContext(), PopUpMenuDemo.class);
                Toast.makeText(getApplicationContext(), "Pop Up Menu Demo selected!", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
                return true;
                case R.id.item5:
                Intent intent5 = new Intent(getApplicationContext(), ContextMenuDemo.class);
                Toast.makeText(getApplicationContext(), "Context Menu Demo selected!", Toast.LENGTH_SHORT).show();
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}