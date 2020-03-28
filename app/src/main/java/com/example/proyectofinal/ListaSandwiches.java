package com.example.proyectofinal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

public class ListaSandwiches extends AppCompatActivity {

    //PARA PODER ACCEDER AL OBJETO//
    LinearLayout contenedor;
    ArrayList<sandwich> lista_sandwiches = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_sandwiches);
        //BOTON APPBAR
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //TITULO AL ACTIVITY
        this.setTitle(R.string.mi_titulo);

        //CONTENEDOR
        contenedor = findViewById(R.id.contenedor);

        //PARAMETROS DE ESTILO//
        new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //SANDWICHES
        lista_sandwiches.add(new sandwich(0, "Mechado",R.drawable.mechado, "4000", "Un sandwich Mechado"));
        lista_sandwiches.add(new sandwich(1, "Chacarero", R.drawable.chacarero, "3500", "Un sandwich Chacarero"));
        lista_sandwiches.add(new sandwich(2, "Barros luco", R.drawable.barros_luco, "5000", "Un sandwich Barros luco"));
        lista_sandwiches.add(new sandwich(3, "Chemilico", R.drawable.chemilico, "3500", "Un sandwich Chemilico"));
        lista_sandwiches.add(new sandwich(4, "Churrasco italiano", R.drawable.italianio, "3000", "Un sandwich Churrasco italiano"));


        for(sandwich c:lista_sandwiches){
            Button cb = new Button(this);
            //cb.setLayoutParams(lp);
            cb.setText(c.nombre);
            cb.setId(c.cod);
            contenedor.addView(cb);
            cb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nombre_sandwich=lista_sandwiches.get(v.getId()).nombre;
                    String precio_sandwich=lista_sandwiches.get(v.getId()).precio;
                    String descripcion_sandwich = lista_sandwiches.get(v.getId()).descripcion;
                    int  imagen_sandwich = lista_sandwiches.get(v.getId()).idImagen;

                    Intent intent = new Intent(v.getContext(), DetallesSandwich.class);
                    intent.putExtra("nombre_sandwich",nombre_sandwich);
                    intent.putExtra("precio_sandwich",precio_sandwich);
                    intent.putExtra("descripcion_sandwich", descripcion_sandwich);
                    intent.putExtra("descripcion_sandwich", descripcion_sandwich);
                    intent.putExtra("imagen_sandwich", imagen_sandwich);

                    startActivityForResult(intent, 0);
                }

            });
        }
    }

    //CLASE CON LOS PARAMETRO DE SANDWICH(MODELO)
    private static class sandwich{
        private int cod;
        private String nombre;
        private int idImagen;
        private String precio;
        private String descripcion;

        public sandwich(int cod, String nombre, int idImagen, String precio, String descripcion) {
            this.cod = cod;
            this.nombre = nombre;
            this.idImagen = idImagen;
            this.precio = precio;
            this.descripcion = descripcion;
        }
    }







    //FUNCIÓN PARA VOLVER ATRÁS
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }





}
