package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView txtSaudar = new TextView(this);
        txtSaudar.setText("Ola cliente de frango");
        setContentView(R.layout.activity_main);
    }
}
