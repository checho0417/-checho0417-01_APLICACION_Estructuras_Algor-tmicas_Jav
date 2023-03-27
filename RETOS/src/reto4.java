//Piedra Papel Tijera

import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        
      String[] opciones = {"piedra", "papel", "tijeras"};
      int usuario, maquina;

      Scanner lectura = new Scanner(System.in);

          System.out.println("Elija una opción:");
          System.out.println("1. Piedra");
          System.out.println("2. Papel");
          System.out.println("3. Tijeras");
            
            usuario = lectura.nextInt();
            if (usuario < 0 || usuario > 3) {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
              
            } 
            maquina = (int) (Math.random() * 3) + 1;
            
            System.out.println("El usuario eligió " + opciones[usuario - 1]);
            System.out.println("La máquina eligió " + opciones[maquina - 1]);
            
            if (usuario == maquina) {
                System.out.println("Empate!");
            } else if (usuario == 1 && maquina == 3 || usuario == 2 && maquina == 1 || usuario == 3 && maquina == 2) {
                System.out.println("El usuario gana!");
            } else {
                System.out.println("La máquina gana!");
            }
            
        
        System.out.println("Fin del juego.");

        lectura.close();
    }

}