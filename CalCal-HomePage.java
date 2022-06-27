package com.example.chemicalculators;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(view -> {
            Intent p = new Intent(MainActivity.this, CalCal.class);
            startActivity(p);
        });

        button2.setOnClickListener(view -> {
            Intent p = new Intent(MainActivity.this, CalCal2.class);
            startActivity(p);
        });

        button3.setOnClickListener(view -> {
            Intent p = new Intent(MainActivity.this, CalCal5.class);
            startActivity(p);
        });
    }
}
