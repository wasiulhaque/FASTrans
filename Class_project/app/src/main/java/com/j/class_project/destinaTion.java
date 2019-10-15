package com.j.class_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class destinaTion extends AppCompatActivity {
    String[]Cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destina_tion);

        Spinner staticSpinner = (Spinner) findViewById(R.id.spinner);
        Spinner newSpinner =(Spinner)findViewById(R.id.spinner2);
        Button btn=(Button)findViewById(R.id.button);
        Cities=getResources().getStringArray(R.array.City);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.activity_drop_down,R.id.destinationResult,Cities);
        staticSpinner.setAdapter(adapter);
        newSpinner.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newActivity();
            }
        });


        }
        public void newActivity(){
        Intent intent=new Intent(this,time.class);
        startActivity(intent);
        }
    }

