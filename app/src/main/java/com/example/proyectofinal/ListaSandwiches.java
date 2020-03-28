package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListaSandwiches extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_sandwiches);
        //BOTON APPBAR
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle(R.string.mi_titulo);



    }
    //FUNCIÓN PARA VOLVER ATRÁS
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }





}
