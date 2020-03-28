package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class SobreNosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nosotros);
        //FLECHA PARA VOLVER ATRÁS
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


    }

    //FUNCIÓN PARA VOLVER ATRÁS
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}


