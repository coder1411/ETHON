package com.example.ethon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        EditText edit1 = findViewById(R.id.editTextTextPersonName);
        EditText edit2 = findViewById(R.id.editTextTextPersonName2);
        EditText edit3 = findViewById(R.id.editTextTextPersonName3);
        TextView txt1 = findViewById(R.id.textView);
        TextView txt2 = findViewById(R.id.textView2);
        TextView txt3= findViewById(R.id.textView3);
        txt1.setText(edit1.getText().toString());
        txt2.setText(edit2.getText().toString());
        txt3.setText(edit3.getText().toString());

    }
}