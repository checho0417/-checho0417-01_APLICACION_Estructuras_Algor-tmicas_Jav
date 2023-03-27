//cara o sello

import java.util.Scanner;
import java.util.Random;

public class reto3 {
    public static void main(String[] args) {

         int edad;
        int moneda;
       

        Scanner lectura= new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Bienvenido al juego de cara o sello");

        System.out.println("Para jugar, por favor ingrese su edad:");
        edad = lectura.nextInt();

         if (edad < 18) {
            System.out.println("Lo siento, no puedes jugar si eres menor de edad.");
            return;
        }

         System.out.println("Excelente, ahora vamos a lanzar la moneda");
        System.out.println("cual eliges cara o sello");

        System.out.println("PREPARATE EL JUEGO VA A COMENZAR ");

        moneda = aleatorio.nextInt(2); //1.sello 2.cara

        if (moneda == 0) {
            System.out.println("sello, has ganado");
        } else {
            System.out.println("cara, has perdido");
        }

        lectura.close();
    }

}

