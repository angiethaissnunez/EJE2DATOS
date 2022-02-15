package com.example.eje2datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView nom, edad, ape, email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        nom=(TextView) findViewById(R.id.txtMosNomb);
        ape=(TextView) findViewById(R.id.txtMostApe);
        edad=(TextView) findViewById(R.id.txtMostEdad);
        email=(TextView)findViewById(R.id.txtMostEmail);

        Button btnmenu = findViewById(R.id.btnMenu);


        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Borrar();

        Intent Info= getIntent();
        String nombres=getIntent().getStringExtra("Nombre");
        String apellidos=getIntent().getStringExtra("Apellido");
        String edades=getIntent().getStringExtra("Edad");
        String correos=getIntent().getStringExtra("correo");

        nom.setText(nombres);
        ape.setText(apellidos);
        edad.setText(edades);
        email.setText(correos);


    }

    void Borrar(){
        nom.setText("");
        ape.setText("");
        edad.setText("");
        email.setText("");
    }

}