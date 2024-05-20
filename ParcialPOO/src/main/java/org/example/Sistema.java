package org.example;

public class Sistema {
    private static int numeropedido; // Se coloca el numero de pedido
    private static String clientedelpedido;//Se detalla que cliente pidio el Pedido
    private static String descripcionpedido; // descripcion de pedido
    private static int fechapedido; // Fecha del pedido sin guiones ni nada
    private static int pesopedido; // peso del pedido
    private static String zonadeentrega;
    private static String estadopedido;
    //Se tienen que poder dar de alta
    //repartidores dentro del sistema.
    //capacidad del repartidor

    //Definimos como una clase Singleton a SISTEMA.
    private static Sistema instance;
    private Sistema() {}
    public static Sistema getInstance() {
        if (instance == null) {
            instance = new Sistema();
        }
        return instance;
    }

    private static void sistemapedido(){
        //Tenemos que hacer los pedidos de los clientes
        //La informacion la tenemos en pantalla . java
        //Hacemos singleton a la clase de sistema
        Sistema sistema = Sistema.getInstance();
        //Fin de sistemapedido
    }
    private static void generacionpedido(){
        Sistema sistema = Sistema.getInstance();
    }

    public static int getNumeropedido() {
        return numeropedido;
    }

    public static void setNumeropedido(int numeropedido) {
        Sistema.numeropedido = numeropedido;
    }

    public static String getClientedelpedido() {
        return clientedelpedido;
    }

    public static void setClientedelpedido(String clientedelpedido) {
        Sistema.clientedelpedido = clientedelpedido;
    }

    public static String getDescripcionpedido() {
        return descripcionpedido;
    }

    public static void setDescripcionpedido(String descripcionpedido) {
        Sistema.descripcionpedido = descripcionpedido;
    }

    public static int getFechapedido() {
        return fechapedido;
    }

    public static void setFechapedido(int fechapedido) {
        Sistema.fechapedido = fechapedido;
    }

    public static int getPesopedido() {
        return pesopedido;
    }

    public static void setPesopedido(int pesopedido) {
        Sistema.pesopedido = pesopedido;
    }

    public static String getZonadeentrega() {
        return zonadeentrega;
    }

    public static void setZonadeentrega(String zonadeentrega) {
        Sistema.zonadeentrega = zonadeentrega;
    }

    public static String getEstadopedido() {
        return estadopedido;
    }

    public static void setEstadopedido(String estadopedido) {
        Sistema.estadopedido = estadopedido;
    }

    public static void setInstance(Sistema instance) {
        Sistema.instance = instance;
    }
}
