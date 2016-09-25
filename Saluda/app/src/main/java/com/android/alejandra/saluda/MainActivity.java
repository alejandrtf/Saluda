package com.android.alejandra.saluda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private Button saludar;
    private String miNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencias objetos
        nombre = (EditText) findViewById(R.id.etNombre);
        miNombre = nombre.getText().toString();
        saludar = (Button) findViewById(R.id.btSaludar);


    }

    public void lanzarActivitySaludo(View v) {
        Intent i = new Intent(MainActivity.this, ActivitySaludo.class);
        i.putExtra("NOMBRE", miNombre);
        startActivity(i);
    }
}
