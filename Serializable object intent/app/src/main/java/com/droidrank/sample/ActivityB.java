package com.droidrank.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent myIntent = getIntent();
        Person myPerson = (Person) myIntent.getSerializableExtra("Person");
        Log.d("ACTIVITY B", "Received object Person for lastname: " + myPerson.getName());

    }
}
