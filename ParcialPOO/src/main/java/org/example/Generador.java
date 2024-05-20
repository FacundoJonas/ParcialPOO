package org.example;
import java.util.Random;

public class Generador {

    public final static int generadordepedido(){
        //Colocamos el random y que le asigne a la variable de
        //numeropedido un numero asi posteriormente la llamamos
        //desde sistema para poder saber cual es el numero
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
