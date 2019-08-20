package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] ={"India","Canada","China","Australia", "America"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList =(ListView)findViewById(R.id.simpleListView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.activity_listview,R.id.textView,countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}
