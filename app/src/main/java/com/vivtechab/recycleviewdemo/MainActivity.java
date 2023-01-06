package com.vivtechab.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("John Wick", "johnwick@gmail.com",R.drawable.a));
        items.add(new item("James Robert", "jamesrobert@gmail.com",R.drawable.b));
        items.add(new item("Michael David", "michaeldavid@gmail.com",R.drawable.c));
        items.add(new item("William Richard", "williamrichard@gmail.com",R.drawable.d));
        items.add(new item("Joesph Thomas", "joesohthomas@gmail.com",R.drawable.e));
        items.add(new item("Charles Daniel", "charlesdaniel@gmail.com",R.drawable.f));
        items.add(new item("Matthew Anthony", "matthewanthony@gmail.com",R.drawable.g));
        items.add(new item("Mark Donald", "markdonald@gmail.com",R.drawable.h));
        items.add(new item("John Wick", "johnwick@gmail.com",R.drawable.a));
        items.add(new item("James Robert", "jamesrobert@gmail.com",R.drawable.b));
        items.add(new item("Michael David", "michaeldavid@gmail.com",R.drawable.c));
        items.add(new item("William Richard", "williamrichard@gmail.com",R.drawable.d));
        items.add(new item("Joesph Thomas", "joesohthomas@gmail.com",R.drawable.e));
        items.add(new item("Charles Daniel", "charlesdaniel@gmail.com",R.drawable.f));
        items.add(new item("Matthew Anthony", "matthewanthony@gmail.com",R.drawable.g));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}