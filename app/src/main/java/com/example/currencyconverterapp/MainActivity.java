package com.example.currencyconverterapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button button ;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonConvertId);
        editText = findViewById(R.id.editTextId);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editTextId = editText.getText().toString();
                double stringToDouble = Double.parseDouble(editTextId);
                double dollar = stringToDouble*1.3;

                Toast.makeText(getApplicationContext(), "£: "+editTextId+" is $: "+dollar, Toast.LENGTH_SHORT).show();
            }
        });


    }
}