package com.example.josue.laboratorio07.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.josue.laboratorio07.R;

public class MainActivity extends AppCompatActivity {

    EditText etBuscador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBuscador = (EditText) findViewById(R.id.etBuscador);
    }

    public void searchPlaces(View view){
        Intent intent = new Intent(MainActivity.this, EmpresaActivity.class);
        String busqueda = etBuscador.getText().toString();
        intent.putExtra("rubro", busqueda);

        startActivity(intent);
    }
}
