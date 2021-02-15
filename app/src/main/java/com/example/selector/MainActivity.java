package com.example.selector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] subject=new String[]{"Maths","Physics","Chemistry","Computer","Bio","English"};
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subject) ;
        autoCompleteTextView.setAdapter(arr);
    }
}