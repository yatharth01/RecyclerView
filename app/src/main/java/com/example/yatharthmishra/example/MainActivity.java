package com.example.yatharthmishra.example;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import java.util.ArrayList;
import java.util.Arrays;
public class MainActivity extends AppCompatActivity {
    // ArrayList for person names
    ArrayList personNames = new ArrayList<>(Arrays.asList("Person1", "Person2", "Person3", "Person4", "Person5", "Person6"));
    ArrayList age = new ArrayList<>(Arrays.asList("40","67","45","34","89","76"));
    ArrayList address = new ArrayList<>(Arrays.asList("Mumbai", "Bangalore" , "Pune", "Ranchi", "Surat","Allahabad"));
    ArrayList ID = new ArrayList<>(Arrays.asList("218211","262171","21721","216211","001921","521211"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, personNames,age,address,ID);
        recyclerView.setAdapter(customAdapter);
    }
}