package org.example;

public class Pedido {
    private static int numeropedido; // Se coloca el numero de pedido
    private String cientedelpedido;//Se detalla que cliente pidio el Pedido
    private String descripcionpedido; // descripcion de pedido
    private static int fechapedido; // Fecha del pedido sin guiones ni nada
    private static int pesopedido; // peso del pedido
    private String zonadeentrega;
    private String estadopedido;

    public int getNumeropedido() {
        return numeropedido;
    }

    public void setNumeropedido(int numeropedido) {
        this.numeropedido = numeropedido;
    }

    public String getCientedelpedido() {
        return cientedelpedido;
    }

    public void setCientedelpedido(String cientedelpedido) {
        this.cientedelpedido = cientedelpedido;
    }

    public String getDescripcionpedido() {
        return descripcionpedido;
    }

    public void setDescripcionpedido(String descripcionpedido) {
        this.descripcionpedido = descripcionpedido;
    }

    public int getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(int fechapedido) {
        this.fechapedido = fechapedido;
    }

    public int getPesopedido() {
        return pesopedido;
    }

    public void setPesopedido(int pesopedido) {
        this.pesopedido = pesopedido;
    }

    public String getZonadeentrega() {
        return zonadeentrega;
    }

    public void setZonadeentrega(String zonadeentrega) {
        this.zonadeentrega = zonadeentrega;
    }

    public String getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(String estadopedido) {
        this.estadopedido = estadopedido;
    }
}
