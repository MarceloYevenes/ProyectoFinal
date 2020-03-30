package com.example.proyectofinal;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
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
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //SANDWICHES
        lista_sandwiches.add(new sandwich(0, getString(R.string.Mechado),R.drawable.mechado, getString(R.string.Mechado_precio), getString(R.string.Mechado_descripcion)));
        lista_sandwiches.add(new sandwich(1, getString(R.string.Chacarero), R.drawable.chacarero, getString(R.string.Chacarero_precio), getString(R.string.Chacarero_descripcion)));
        lista_sandwiches.add(new sandwich(2, getString(R.string.Barros_luco), R.drawable.barros_luco, getString(R.string.Barros_luco_precio), getString(R.string.Barros_luco_descripcion)));
        lista_sandwiches.add(new sandwich(3, getString(R.string.Chemilico), R.drawable.chemilico, getString(R.string.Chemilico_precio), getString(R.string.Chemilico_descripcion)));
        lista_sandwiches.add(new sandwich(4, getString(R.string.Churrasco_italiano), R.drawable.italianio, getString(R.string.Churrasco_italiano_precio), getString(R.string.Churrasco_italiano_descripcion)));


        for(sandwich c:lista_sandwiches){
            Button cb = new Button(this);
            //cb.setLayoutParams(lp);
            cb.setText(c.nombre);
            cb.setId(c.cod);
            cb.setTextColor(Color.WHITE);
            params.setMargins(40,40,40,40);
            cb.setBackgroundColor(Color.rgb(255,136,0));
            contenedor.addView(cb);
            cb.setLayoutParams(params);
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

        sandwich(int cod, String nombre, int idImagen, String precio, String descripcion) {
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
