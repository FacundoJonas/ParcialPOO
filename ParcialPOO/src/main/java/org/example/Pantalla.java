package org.example;
import java.util.Scanner;

public class Pantalla {
    public final static void opciones(){ //Hace de selector principal y es quien llamado por main
        Scanner scanner = new Scanner(System.in);
        int opciones = 0;
        do {
            System.out.println("Ingrese una opcion para continuar :");
            System.out.println("1-Hacer un pedido");
            System.out.println("2-Sistema para repartidores");
            String input = scanner.nextLine();
            try {
                opciones = Integer.parseInt(input);
                if (opciones == 1) {
                    Pantalla.pedidos();
                }
                else if (opciones == 2) {
                    Pantalla.repartidores();
                }
            }catch (NumberFormatException e){
                System.out.println("Ingrese un numero valido");
            }
        }while (opciones != 1 && opciones != 2);
    }
    public final static  void pedidos(){
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = Sistema.getInstance();
        System.out.println("Ingrese la siguiente informacion del pedido:");

        String clientedelpedido = Sistema.getClientedelpedido();
        System.out.println("Ingrese el cliente nombre del cliente que lo solicito:");
        clientedelpedido= scanner.nextLine();
        Sistema.setClientedelpedido(clientedelpedido);

        String descripcionpedido = Sistema.getDescripcionpedido();
        System.out.println("Ingrese la descripcion del pedido:");
        descripcionpedido = scanner.nextLine();
        Sistema.setDescripcionpedido(descripcionpedido);

        int numeropedido = Sistema.getNumeropedido();
        System.out.println("Ingrese la fecha del pedido:");
        //numeropedido = scanner.nextLine();
        //numeropedido = Sistema.setNumeropedido(numeropedido);

        int pesopedido = Sistema.getPesopedido();
        System.out.println("Ingrese el peso del pedido:");
        //pesopedido = scanner.nextLine();

        System.out.println("Ingrese la Zona de entrega del pedido:");
        //input = scanner.nextLine();
        System.out.println("Ingrese el estado del pedido:");
        //input = scanner.nextLine();
    }
    public static void repartidores(){
        int elecciones;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al progrma de repatidores");
        System.out.println("Para dar de alta a un repartidor ingrese la siguiente informacion : ");
        System.out.println("DNI del repartidor : ");
        String input = scanner.nextLine();
        System.out.println("Nombre del repartidor : ");
        input = scanner.nextLine();
        System.out.println("Indique cuantas cajas de pizza puede llevar el repartidor");
        input = scanner.nextLine();
    }

}
