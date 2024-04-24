package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);




        List<String> list = new ArrayList<>();
        list.add("蘋果");
        list.add("香蕉");
        list.add("橘子");
        list.add("西瓜");
        list.add("芭樂");
        list.add("梨子");
        list.add("葡萄");
        list.add("櫻桃");
        list.add("草莓");
        list.add("藍莓");




        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spfruit =  findViewById(R.id.spfruit);
        TextView tvshow1 = findViewById(R.id.tvshow1);
        ListView lvfruit = findViewById(R.id.lvfruit);

        spfruit.setAdapter(adapter);
        lvfruit.setAdapter(adapter);

        spfruit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tvshow1.setText(String.valueOf(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

       lvfruit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               tvshow1.setText(String.valueOf(position));
           }
       });



    }
}