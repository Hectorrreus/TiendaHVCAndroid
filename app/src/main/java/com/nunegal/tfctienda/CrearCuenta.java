package com.nunegal.tfctienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nunegal.tfctienda.io.MyApiAdapter;
import com.nunegal.tfctienda.modelos.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CrearCuenta extends AppCompatActivity {

    private EditText etDni;
    private EditText etNombre;
    private EditText etApellidos;
    private EditText etContraseña;
    private EditText etRepetirContraseña;
    private EditText etTelefono;
    private EditText etCorreo;
    private Button btnVolver;
    private Button btnCrearUsuario;
    private CheckBox chbEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crearusuario);

        etDni = findViewById(R.id.etDniUsuario);
        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etContraseña = findViewById(R.id.etContraeña);
        etRepetirContraseña = findViewById(R.id.etRepetirContraeña);
        etTelefono = findViewById(R.id.etTelefono);
        etCorreo = findViewById(R.id.etCorreo);
        btnVolver = findViewById(R.id.btnVolver);
        btnCrearUsuario = findViewById(R.id.btnCrearUsuario);
        chbEdad = findViewById(R.id.chbEdad);
        gestionarBotones();

    }

    public void crearUsuario() {
        String dni = etDni.getText().toString();
        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        String correo = etCorreo.getText().toString();
        String contraseña = etContraseña.getText().toString();
        String telefono = etTelefono.getText().toString();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

        Usuario usuario = new Usuario(dni,nombre,apellidos,correo,contraseña,telefono,false, 0 );
        MyApiAdapter.getApiService().postUsuario(usuario)
                .enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if(response.isSuccessful()) {
                    Toast.makeText(CrearCuenta.this, "Usuario creado", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                Toast.makeText(CrearCuenta.this, "Error al crear usuario", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void gestionarBotones() {
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearCuenta.this, MainActivity.class));
            }
        });

        btnCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dni = etDni.getText().toString();
                if(dni.length()>9 ||dni.length()<9) {
                    Toast.makeText(CrearCuenta.this, "El dni introducido no es válido", Toast.LENGTH_LONG).show();
                } else {
                    if(chbEdad.isChecked()) {
                        crearUsuario();
                    } else {
                        Toast.makeText(CrearCuenta.this, "Debes confirmar que eres mayor de edad", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

}
