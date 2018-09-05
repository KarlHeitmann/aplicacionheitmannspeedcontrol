package com.example.neilson.blut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;


public class inicio extends AppCompatActivity {

    private Button bot1;
    private Button bot2;
    private Button bot3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        bot1 = (Button) findViewById(R.id.bot1);
        bot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensenal1();
            }
        });


        bot2 = (Button) findViewById(R.id.bot2);
        bot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensenal2();
            }
        });

        bot3 = (Button) findViewById(R.id.bot3);
        bot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensenal3();
            }
        });


        Button btnlogout = (Button) findViewById(R.id.bot4);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(inicio.this);
                builder.setTitle("Salir");
                builder.setMessage("¿Desea salir?");
                builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();
                        System.exit(0);

                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    public void opensenal1(){
        Intent intent = new Intent(this,interfaz.class);
        startActivity(intent);
    }

    public void opensenal2() {
        Intent intent = new Intent(this, Select.class);
        startActivity(intent);
    }

    public void opensenal3() {
        Intent intent = new Intent(this, senal.class);
        startActivity(intent);
    }

}
