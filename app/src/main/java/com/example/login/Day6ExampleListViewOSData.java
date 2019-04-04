package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Day6ExampleListViewOSData extends AppCompatActivity {

    private ListView lv;

    String[] values = new String[] {"Android","Ios","Blackberry","Samsung","Windows"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day6_example_list_view_osdata);

        lv = findViewById(R.id.listview);
        ArrayAdapter<String>mArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,values);

        lv.setAdapter(mArrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Day6ExampleListViewOSData.this,values[position], Toast.LENGTH_LONG).show();
            }
        });


    }
}
