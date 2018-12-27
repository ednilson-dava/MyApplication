package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();

        TextView txtSaudar = findViewById(R.id.txtSuadar);
        txtSaudar.setText("Ocorreu um erro!");
    }
}
