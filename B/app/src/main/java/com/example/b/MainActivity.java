package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText Edtval1;
EditText Edtval2;

Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edtval1 = findViewById(R.id.edtNum1);
        Edtval2 = findViewById(R.id.edtNum2);
        Btn1 = findViewById(R.id.edtBtn1);
    }
}