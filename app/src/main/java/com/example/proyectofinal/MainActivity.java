package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Nosotros, Sandwiches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nosotros = findViewById(R.id.Nosotros);
        Sandwiches = findViewById(R.id.Sandwiches);


        //ABRIR VENTANA SOBRE NOSOSTROS
        Nosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SobreNosotros.class);
                startActivityForResult(intent, 0);
            }
        });

        //ABRIR VENTANA DE LISTA DE SANDWICHES
        Sandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ListaSandwiches.class);
                startActivityForResult(intent, 0);
            }
        });



    }





}
