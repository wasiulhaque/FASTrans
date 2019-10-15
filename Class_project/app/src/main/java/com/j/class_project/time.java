package com.j.class_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class time extends AppCompatActivity {
     TextView dateView;
     TextView plainText;
     Date textView;
     Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        dateView=(TextView) findViewById(R.id.dateText);
        //plainText=(TextView)findViewById(R.id.);
        btn=(Button)findViewById(R.id.TimeBtn);

        String date=dateView.getText().toString();
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               newActivity();
           }
       });
    }

    private void newActivity() {
        Intent intent=new Intent(this,TicketOrientation.class);
        startActivity(intent);

    }
}
