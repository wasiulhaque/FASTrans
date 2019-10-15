package com.j.class_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TicketOrientation extends AppCompatActivity {
    private Bus_name_seat busName=new Bus_name_seat();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_orientation);
        Button bus1;
        Button bus2;
        Button bus3;
        bus1=(Button)findViewById(R.id.bus1);
        bus2=(Button)findViewById(R.id.button2);
        String name=busName.getData();
        String name2=busName.getData();
        bus1.setText(name);
        bus2.setText(name2);
        bus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newActivity();
            }
        });
bus2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        newActivity();
    }
});

    }

    private void newActivity() {
        Intent intent=new Intent(this,ticketForm.class);
        startActivity(intent);
    }
}
