package com.example.mpdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Printer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.Kontrol);
        editText1 = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);
    }


        public void Kontrol (View view){
        int sayi1 = Integer.parseInt(editText1.getText().toString());
        int sayi2 = Integer.parseInt(editText2.getText().toString());
        if (sayi1 > sayi2) {
            Toast.makeText(MainActivity.this, "1. sayı daha büyüktür", Toast.LENGTH_LONG).show();
        }
        if (sayi2 > sayi1) {
            Toast.makeText(MainActivity.this, "2.sayı daha büyüktür.", Toast.LENGTH_LONG).show();
        }
        if (sayi1 == sayi2) {
            Toast.makeText(MainActivity.this, "iki sayı birbirine eşittir", Toast.LENGTH_LONG).show();
        }
    }
    }
