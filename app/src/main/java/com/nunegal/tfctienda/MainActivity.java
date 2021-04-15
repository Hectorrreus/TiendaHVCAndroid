package com.nunegal.tfctienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.nunegal.tfctienda.io.MyApiAdapter;
import com.nunegal.tfctienda.modelos.Usuario;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<ArrayList<Usuario>> {

    private Button btnInicioSesion;
    private Button btnCrearUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicioSesion = findViewById(R.id.btnIniciarSesion);
        btnCrearUsuario = findViewById(R.id.btnCrearCuenta);

        xestionarEventos();

        Call<ArrayList<Usuario>> call = MyApiAdapter.getApiService().getUsuarios();
        call.enqueue(this);
    }

    private void xestionarEventos() {
        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InicioSesion.class));
            }
        });

        btnCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CrearCuenta.class));
            }
        });
    }

    @Override
    public void onResponse(Call<ArrayList<Usuario>> call, Response<ArrayList<Usuario>> response) {
        if(response.isSuccessful()) {
            ArrayList clientes = response.body();
            Log.d("onResponse clientes", "Size of clientes=>" + clientes.size());
        }
    }

    @Override
    public void onFailure(Call<ArrayList<Usuario>> call, Throwable t) {

    }
}