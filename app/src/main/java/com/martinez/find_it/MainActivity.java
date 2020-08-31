package com.martinez.find_it;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Creamos las variables que haran referencia a los widgets
    private TextView txtTitulo;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Realizar las referencias
        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciar = findViewById(R.id.btnIniciar);

        txtTitulo.setTextColor(Color.BLUE);
    }

    public void Saludar(View view){
        Toast.makeText(this,"Hiciste click",Toast.LENGTH_LONG).show();
    }

    public void Despedir(View view){
        Toast.makeText(this,"Adios",Toast.LENGTH_LONG).show();
    }
}