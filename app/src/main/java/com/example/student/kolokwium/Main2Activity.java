package com.example.student.kolokwium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("latte","12"));
        coffees.add(new Coffee("czarna","16"));
        coffees.add(new Coffee("americana","10"));
        coffees.add(new Coffee("espresso","8"));

    }
}
