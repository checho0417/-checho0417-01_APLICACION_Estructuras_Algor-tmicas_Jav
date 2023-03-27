 // Formulario Con While

import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        
    int numPersonas;
    int i;
    
    String correo;
    String nombre;
    String apellido;
    int edad;
    String tipoDocum;
    int numeroDocum;


    Scanner lectura= new Scanner(System.in);



    System.out.println("Ingrese el número de personas que desea registrar: ");
    numPersonas = lectura.nextInt();

    lectura.nextLine();


    i = 1;
    while (i <= numPersonas){
        System.out.println("Eres El Usuario Uùmero "+i+" en registrarse" );

     

            System.out.println("Digite Su Correo");
            correo = lectura.nextLine();
            System.out.println("Digite Su Nombre");
            nombre = lectura.nextLine();
            System.out.println("Digite Su Apellido");
            apellido = lectura.nextLine();
            System.out.println("Digite Su Edad");
            edad = lectura.nextInt();
            System.out.print("Digite Su Tipo De Documento");
            tipoDocum = lectura.nextLine();
            System.out.print("Digite Su Numero De Documento");
            numeroDocum = lectura.nextInt();

            i++;
        }


lectura.close();
    }
}
