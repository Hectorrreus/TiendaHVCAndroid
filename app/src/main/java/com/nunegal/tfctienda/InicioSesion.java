package com.nunegal.tfctienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InicioSesion extends AppCompatActivity {

    private EditText etLogin;
    private EditText etContraseña;
    private Button btnInicioSesion;
    private TextView tvCrearUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciosesion);

        etLogin = findViewById(R.id.etLogin);
        etContraseña = findViewById(R.id.etPassword);
        tvCrearUsuario = findViewById(R.id.tvCrearUsuario);
        btnInicioSesion = findViewById(R.id.btnIniciarSesion);

        xestionarEventos();
    }

    private void xestionarEventos () {
        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tvCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InicioSesion.this, CrearCuenta.class));

            }
        });
    }
}
