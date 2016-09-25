package com.android.alejandra.saluda;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivitySaludo extends AppCompatActivity {
    TextView textoSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        //referencias
        textoSaludo=(TextView)findViewById(R.id.tvSaludo);

        Intent i=getIntent();
        String nombreRecibido=i.getStringExtra("NOMBRE");

        textoSaludo.setText(nombreRecibido);



    }
}
