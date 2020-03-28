package com.example.proyectofinal;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ListaSandwiches extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_sandwiches);
        //BOTON APPBAR
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        this.setTitle(R.string.mi_titulo);



    }
    //FUNCIÓN PARA VOLVER ATRÁS
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }





}
