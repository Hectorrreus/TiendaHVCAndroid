package com.nunegal.tfctienda.modelos;

public class Linea_pedido {

    int id_lineapedido;
    int id_pedido;
    int id_producto;
    int unidades;

    public Linea_pedido() {

    }

    public Linea_pedido(int id_lineapedido, int id_pedido, int id_producto, int unidades) {
        this.id_lineapedido = id_lineapedido;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.unidades = unidades;
    }

    public int getId_lineapedido() {
        return id_lineapedido;
    }

    public void setId_lineapedido(int id_lineapedido) {
        this.id_lineapedido = id_lineapedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Linea_pedido{" +
                "id_lineapedido=" + id_lineapedido +
                ", id_pedido=" + id_pedido +
                ", id_producto=" + id_producto +
                ", unidades=" + unidades +
                '}';
    }
}
