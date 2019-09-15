package com.example.contadorgi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //COMPONENTES ATRIBUTOS

    private Button botonSumar;
    private TextView numeroInicial;
    private Button botonRestar;

    //CREO LA VARIABLE CONTADOR

    private Integer contador;

    //LE AGREGO UN ID A LOS COMPONENTES

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSumar = findViewById(R.id.mainActivity_BotonSumar);
        numeroInicial = findViewById(R.id.mainActivity_TextView);
        botonRestar = findViewById(R.id.mainActivity_BotonRestar);

        //DOY INICIO A MI CONTADOR
        contador = 0;


        //LE CREO A CADA BOTON EL ON CLICK LISTENER

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = contador + 1;
                modificarVista();
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = contador - 1;
                modificarVista();
            }
        });

}
//EXTRAIGO EL METODO MODIFICAR VISTA

    public void modificarVista(){
        numeroInicial.setText(contador.toString());
    }

}
