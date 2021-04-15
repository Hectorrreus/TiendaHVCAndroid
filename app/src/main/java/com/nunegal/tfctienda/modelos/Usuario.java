package com.nunegal.tfctienda.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Usuario {

    @SerializedName("dni_usuario")
    @Expose
    String dni_usuario;

    @SerializedName("nombre")
    @Expose
    String nombre;

    @SerializedName("apellidos")
    @Expose
    String apellidos;

    @SerializedName("correo")
    @Expose
    String correo;

    @SerializedName("contraseña")
    @Expose
    String contraseña;

    @SerializedName("telefono")
    @Expose
    String telefono;

    @SerializedName("esvendedor")
    @Expose
    Boolean esvendedor;

    @SerializedName("beneficios")
    @Expose
    float beneficios;

    public Usuario() {

    }

    public Usuario(String dni_usuario, String nombre, String apellidos, String correo, String contraseña, String telefono, Boolean esvendedor, float beneficios) {
        this.dni_usuario = dni_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.esvendedor = esvendedor;
        this.beneficios = beneficios;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getEsvendedor() {
        return esvendedor;
    }

    public void setEsvendedor(Boolean esvendedor) {
        this.esvendedor = esvendedor;
    }

    public float getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(float beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni_usuario='" + dni_usuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", telefono='" + telefono + '\'' +
                ", esvendedor=" + esvendedor +
                ", beneficios=" + beneficios +
                '}';
    }
}
