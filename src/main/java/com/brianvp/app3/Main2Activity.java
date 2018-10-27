package com.brianvp.app3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView campo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        campo = (TextView) findViewById(R.id.texto);

        Bundle recibido = getIntent().getExtras();

        String texto = recibido.getString("clave");

        campo.setText("Elemento seleccionado"+ texto);
    }

}
