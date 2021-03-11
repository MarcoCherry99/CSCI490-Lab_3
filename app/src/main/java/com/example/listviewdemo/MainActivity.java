package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView class_schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] classes = {"PORT 101", "PORT 102", "ARTH 101", "ARTH 102", "CITA 280"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, classes);

        class_schedule = findViewById(R.id.class_schedule);
        class_schedule.setAdapter(adapter);

        class_schedule.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String s = (String) adapterView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }
        });

        class_schedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l){
                //return false;
                String s = (String) adapterView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
                return true;
            }
        });

    }
}