package com.example.proyectofinal;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

public class DetallesSandwich extends AppCompatActivity {

    String nombre_sandwich, precio_sandwich, descripcion_sandwich;
    TextView nombreID, precioID, DescripcionID;

    ImageView imagenID;
    int imagen_sandwich;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_sandwich);
        //BOTON APPBAR
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //RECIBIR DATOS DEL ACTIVITY LISTASANDWICHES
        Intent intent = getIntent();
        nombre_sandwich = intent.getStringExtra("nombre_sandwich");
        precio_sandwich = intent.getStringExtra("precio_sandwich");
        descripcion_sandwich = intent.getStringExtra("descripcion_sandwich");
        imagen_sandwich = intent.getIntExtra("imagen_sandwich",R.drawable.no_disponible);

        Log.i("infoo",""+imagen_sandwich);
        //TITULO AL ACTIVITY
        this.setTitle("Detalle Sandwich "+nombre_sandwich);

        //SE INSTANCIA LAS ID DE LOS OBJETOS
        nombreID = findViewById(R.id.nombreID);
        precioID = findViewById(R.id.precioID);
        DescripcionID = findViewById(R.id.DescripcionID);
        imagenID = findViewById(R.id.imagenID);

        //TRASPASO DE DATOS RECIBIDOS DE LA VENTANA ANTERIOR
        nombreID.setText(nombre_sandwich);
        precioID.setText("$"+precio_sandwich);
        DescripcionID.setText(descripcion_sandwich);
        imagenID.setImageResource(imagen_sandwich);




    }


    //FUNCIÓN PARA VOLVER ATRÁS
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }





}
