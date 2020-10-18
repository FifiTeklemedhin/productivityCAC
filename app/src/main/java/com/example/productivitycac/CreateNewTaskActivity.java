package com.example.productivitycac;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;


public class CreateNewTaskActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createnewtask_activity);

        EditText taskName = findViewById(R.id.taskNameInput);
        EditText taskTime = findViewById(R.id.taskTimeInput);

        Log.i("Task Name", taskName.toString());
        Log.i("Task Time", taskTime.toString());


        Spinner spinner = (Spinner) findViewById(R.id.listOptions);

        // Create an ArrayAdapter using the string array and a default spinner layout
        @SuppressLint("ResourceType") ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this,  android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner

        adapter.add("List 1");
        adapter.add("List 2");
        adapter.add("List 3");
        adapter.add("List 4");
        adapter.add("List 5");
        adapter.add("New List");
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
            {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {
                // your code here
            }

        });


    }
}