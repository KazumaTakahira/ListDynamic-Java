package com.example.listdynamic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> data = new ArrayList<>();
        data.add("JavaScript");
        data.add("Python");
        data.add("Java");
        data.add("C/CPP");
        data.add("PHP");
        data.add("Swift");
        data.add("Kotlin");
        data.add("C#");
        data.add("Ruby");
        data.add("Haskell");
        data.add("Objective-C");
        data.add("Go");
        data.add("Rust");
        data.add("Elm");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}
