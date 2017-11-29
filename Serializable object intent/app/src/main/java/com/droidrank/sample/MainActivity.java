package com.droidrank.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person myPerson = new Person(
                "Sebastien",
                "Cayetanot",
                "sebastien.cayetanot@gmail.com",
                "Ashford",
                "Irvine",
                "CA",
                "92618"
        );
        Log.d("MAIN", "Sending object Person for lastname: " + myPerson.getName());
        Intent myIntent = new Intent(this, ActivityB.class);
        myIntent.putExtra("Person", myPerson);
        startActivity(myIntent);
    }
}
