//dados

import java.util.Scanner;
import java.util.Random;


public class reto8 {
    
    public static void main(String[] args) {
        

        int j=4;
        int lanzamiento1=0;
        int lanzamiento2=0;
        String jugador1;
        String jugador2;


       Scanner lectura=new Scanner(System.in);
        Random lanzamiento = new Random();


        System.out.println("Esto Es Un Juego De Los Dados El Que Saque Numero Mayor Gana");


        System.out.println("Digite el nombre del jugador 1");
        jugador1=lectura.next();

        System.out.println("Digite el nombre del jugador 2");
        jugador2=lectura.next();



     int i=1;
       while (i<j){

    System.out.println("setp"+i);

        lanzamiento1 = lanzamiento.nextInt(6) + 1; // Genera un número aleatorio del 1 al 6
       System.out.println("Juega el primer turnooo, jugador unoo! su resultado es " +lanzamiento1);


        lanzamiento2 = lanzamiento.nextInt(6) + 1; // Genera un número aleatorio del 1 al 6
       System.out.println("Juega el segundo turnooo, jugador doss! su resultado es " +lanzamiento2);

       if(lanzamiento1>lanzamiento2){
        System.out.println("A ganado el jugador 1" +jugador1); 
       }
       else if(lanzamiento2>lanzamiento1){
        System.out.println("A ganado el jugador 2" +jugador2);
       }
       else if(lanzamiento1==lanzamiento2){
        System.out.println("Empate");
       }

        i++;   
    }

    lectura.close();
    }

}