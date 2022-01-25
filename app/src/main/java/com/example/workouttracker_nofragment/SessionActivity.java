package com.example.workouttracker_nofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;

public class SessionActivity extends AppCompatActivity {
    Spinner spnLifters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
        ArrayList lifterList = new ArrayList<String>();
        lifterList.add("Sam");
        lifterList.add("Ryan");
        lifterList.add("Andrew");
        spnLifters = findViewById(R.id.spnLifters);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, lifterList);
        spnLifters.setAdapter(adapter);

    }
}