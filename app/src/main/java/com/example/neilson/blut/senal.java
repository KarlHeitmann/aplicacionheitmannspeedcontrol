package com.example.neilson.blut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class senal extends AppCompatActivity {

    private Button bot8;
    private Button bot9;
    private Button bot10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senal);


        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);

        bot8 = (Button) findViewById(R.id.bot8);
        bot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensenal8();
            }
        });

        bot9 = (Button) findViewById(R.id.bot9);
        bot9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                opensenal9();
            }});

        bot10 = (Button) findViewById(R.id.bot10);
        bot10.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                opensenal10();
            }});

    }

    public void opensenal8(){
        Intent intent = new Intent(this,interfaz.class);
        startActivity(intent);
    }

    public void opensenal9() {
        Intent intent = new Intent(this, inicio.class);
        startActivity(intent);
    }

    public void opensenal10() {
        Intent intent = new Intent(this, Select.class);
        startActivity(intent);
    }

}