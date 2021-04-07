package com.nunegal.tfctienda.modelos;

public class Direccion_entrega {

    int id_direccion;
    String dni_cliente;
    String pais;
    String provincia;
    String ciudad;
    String codigopostal;
    String calle;
    String numero;

    public Direccion_entrega() {

    }

    public Direccion_entrega(int id_direccion, String dni_cliente, String pais, String provincia, String ciudad, String codigopostal, String calle, String numero) {
        this.id_direccion = id_direccion;
        this.dni_cliente = dni_cliente;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.codigopostal = codigopostal;
        this.calle = calle;
        this.numero = numero;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion_entrega{" +
                "id_direccion=" + id_direccion +
                ", dni_cliente='" + dni_cliente + '\'' +
                ", pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigopostal='" + codigopostal + '\'' +
                ", calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
