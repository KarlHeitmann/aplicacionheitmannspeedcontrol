package com.example.neilson.blut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interfaz extends AppCompatActivity {

    private Button bot5;
    private Button bot6;
    private Button bot7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz);

        bot5 = (Button) findViewById(R.id.bot5);
        bot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensenal5();
            }
        });

        bot6 = (Button) findViewById(R.id.bot6);
        bot6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                opensenal6();
            }
        });

        bot7 = (Button) findViewById(R.id.bot7);
        bot7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                opensenal7();
            }
        });

    }

    public void opensenal5() {
        Intent intent = new Intent(this, senal.class);
        startActivity(intent);
    }

    public void opensenal6() {
        Intent intent = new Intent(this, inicio.class);
        startActivity(intent);
    }

    public void opensenal7() {
        Intent intent = new Intent(this, Select.class);
        startActivity(intent);
    }
}