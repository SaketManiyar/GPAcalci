package com.example.gpacalci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int sb1=0,sb2=0,sb3=0,sb4=0,sb5=0,sb6=0,sb7=0,sb8=0;
    int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
    TextView display;
    Button result,reset;
    Spinner s1,s2,s3,s4,s5,s6,s7,s8;
    Spinner cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cd1=findViewById(R.id.c1);
        cd2=findViewById(R.id.c2);
        cd3=findViewById(R.id.c3);
        cd4=findViewById(R.id.c4);
        cd5=findViewById(R.id.c5);
        cd6=findViewById(R.id.c6);
        cd7=findViewById(R.id.c7);
        cd8=findViewById(R.id.c8);

        display = findViewById(R.id.textView3);
        result = findViewById(R.id.button);
        reset = findViewById(R.id.button2);

        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        s7=findViewById(R.id.s7);
        s8=findViewById(R.id.s8);

        String[] grades ={"Enter Grade","S","A","B","C","D","E"};
        String[] credit={"Enter Credit","1","2","3","4"};

        ArrayAdapter<String> aa= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, grades);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);
        s2.setAdapter(aa);
        s3.setAdapter(aa);
        s4.setAdapter(aa);
        s5.setAdapter(aa);
        s6.setAdapter(aa);
        s7.setAdapter(aa);
        s8.setAdapter(aa);

        ArrayAdapter<String> ab= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, credit);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cd1.setAdapter(ab);
        cd2.setAdapter(ab);
        cd3.setAdapter(ab);
        cd4.setAdapter(ab);
        cd5.setAdapter(ab);
        cd6.setAdapter(ab);
        cd7.setAdapter(ab);
        cd8.setAdapter(ab);

    }



}