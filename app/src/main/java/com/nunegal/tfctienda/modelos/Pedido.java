package com.nunegal.tfctienda.modelos;

import java.util.Date;

public class Pedido {

        int id_pedido;
        Date fecha;
        Float precio_final;
        String dni_cliente;

    public Pedido() {

    }

    public Pedido(int id_pedido, Date fecha, Float precio_final, String dni_cliente) {
        this.id_pedido = id_pedido;
        this.fecha = fecha;
        this.precio_final = precio_final;
        this.dni_cliente = dni_cliente;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(Float precio_final) {
        this.precio_final = precio_final;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id_pedido=" + id_pedido +
                ", fecha=" + fecha +
                ", precio_final=" + precio_final +
                ", dni_cliente='" + dni_cliente + '\'' +
                '}';
    }
}
