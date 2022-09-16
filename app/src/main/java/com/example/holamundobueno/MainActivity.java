package com.example.holamundobueno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvSaludo = findViewById(R.id.tvSaludo);
        tvSaludo.setText("Hola esto es un prueba");
        //Log.e(getClass().getSimpleName(),"Error falso");
    }
}