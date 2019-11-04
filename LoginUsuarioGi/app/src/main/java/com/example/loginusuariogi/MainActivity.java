package com.example.loginusuariogi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.Main_ET_username);
        password = findViewById(R.id.Main_ET_password);
        login = findViewById(R.id.Main_Button_Login);

        //creo el escuchador del boton
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cambiarDeActivity();
            }
        });

    }

    //creo el metodo cambiarDeActivity
    public void cambiarDeActivity(){
        //guardo el valor del username
        String nombreUser = username.getText().toString();
        //creo el intent a la nueva actividad(el pasaje)
        Intent intent = new Intent(this, SegundaActivity.class);
        //creo el bundle(la valija)
        Bundle bundle = new Bundle();
        //le guardo los valores al bundle(cargo la valija)
        bundle.putString(SegundaActivity.CLAVE_USUARIO, nombreUser);
        //le ponemos el bundle al intent
        intent.putExtras(bundle);
        //arrancamos la nueva activity
        startActivity(intent);
    }
}
