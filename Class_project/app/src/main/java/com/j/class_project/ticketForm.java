package com.j.class_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ticketForm extends AppCompatActivity {
    Button finalBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_form);
        finalBtn=(Button)findViewById(R.id.ticket_FInal);
        finalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }
    public void nextActivity(){
        Intent intent=new Intent(this,Form.class);
        startActivity(intent);
    }
}
