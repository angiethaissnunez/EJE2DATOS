package com.example.eje2datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button enviarInfo;
    EditText nomb,apellidos,edad,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomb=(EditText)findViewById(R.id.txtNombre);
        apellidos=(EditText)findViewById(R.id.txtApellidos);
        edad=(EditText)findViewById(R.id.txtEdad);
        email=(EditText)findViewById(R.id.txtEmail);
        enviarInfo=(Button) findViewById(R.id.btnGuardar);

        enviarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nomb.getText().toString().isEmpty() && !apellidos.getText().toString().isEmpty() && !edad.getText().toString().isEmpty() && !email.getText().toString().isEmpty()) {

                    String nombre = nomb.getText().toString();
                    String Apelli2 = apellidos.getText().toString();
                    Intent pantalla = new Intent(getApplicationContext(), MostrarDatos.class);
                    pantalla.putExtra("Nombre", nombre);
                    pantalla.putExtra("Apellido", Apelli2);
                    pantalla.putExtra("Edad", edad.getText().toString());
                    pantalla.putExtra("correo", email.getText().toString());
                    startActivity(pantalla);

                } else{
                    Toast mensaje = Toast.makeText(getApplicationContext(),"HAY CAMPOS VACIOS", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });


    }
}