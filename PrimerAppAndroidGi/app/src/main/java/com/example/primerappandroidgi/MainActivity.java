package com.example.primerappandroidgi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //creo los atributos que quiero programar
    private TextView comoSeLlamaTuMascota;
    private EditText escribirNombre;
    private Button botonToast;

    //traigo el linearlayout para poder cambiar su color cuando haga clik
    private LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //encuentro las vistas para inicializar
        linearLayout = findViewById(R.id.linearLayout);
        comoSeLlamaTuMascota = findViewById(R.id.Main_TextView_ComoSeLlamaTuMascota);
        escribirNombre = findViewById(R.id.Main_EditText_NombreIngresado);
        botonToast = findViewById(R.id.Main_ButtonToast);

        botonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pedirle al EditText su texto
                String nombreDeMascotaEscrito = escribirNombre.getText().toString();
                //le pasamos el valor que nos da el editText al Toast
                Toast.makeText(MainActivity.this, nombreDeMascotaEscrito, Toast.LENGTH_SHORT).show();

                //Le seteo un color al background cuando hago click
                linearLayout.setBackgroundColor(Color.MAGENTA);
            }
        });

        botonToast.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "click largo", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
