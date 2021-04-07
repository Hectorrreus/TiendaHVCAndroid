package com.nunegal.tfctienda.modelos;

import java.util.Date;

public class Vendedor {

    String dni_vendedor;
    String nombre;
    String apellidos;
    String correo;
    Date fecha_nacimiento;
    String contraseña;
    String telefono;
    String beneficios;

    public Vendedor() {

    }

    public Vendedor(String dni_vendedor, String nombre, String apellidos, String correo, Date fecha_nacimiento, String contraseña, String telefono, String beneficios) {
        this.dni_vendedor = dni_vendedor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.beneficios = beneficios;
    }

    public String getDni_vendedor() {
        return dni_vendedor;
    }

    public void setDni_vendedor(String dni_vendedor) {
        this.dni_vendedor = dni_vendedor;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "dni_vendedor='" + dni_vendedor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", contraseña='" + contraseña + '\'' +
                ", telefono='" + telefono + '\'' +
                ", beneficios='" + beneficios + '\'' +
                '}';
    }
}
