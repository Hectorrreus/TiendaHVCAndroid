package com.nunegal.tfctienda.modelos;

public class Producto {

    int id_producto;
    String nombre;
    Float precio;
    int stock;
    String lugar_procedencia;
    String foto;

    public Producto() {

    }

    public Producto(int id_producto, String nombre, Float precio, int stock, String lugar_procedencia, String foto) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.lugar_procedencia = lugar_procedencia;
        this.foto = foto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getLugar_procedencia() {
        return lugar_procedencia;
    }

    public void setLugar_procedencia(String lugar_procedencia) {
        this.lugar_procedencia = lugar_procedencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", lugar_procedencia='" + lugar_procedencia + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
