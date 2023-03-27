//Adivina La Palabra

import java.util.Scanner;
import java.util.Random;


public class reto6 {
    public static void main(String[] args) {
        

        int num;
        int palabras=0;
        int respuesta;
        String palabra;
        int n;

        Random random = new Random();
        Scanner lectura=new Scanner(System.in);

        System.out.println("Hola Bienvenido A Adivinar La Palabra ");

        System.out.println("Cuantas pPalabras Quieres Adivinar Puedes Escoger Desde 1 Hasta 4");
        n=lectura.nextInt();

        int i=0;
        while(i<n){

        num = random.nextInt(4) + 1;

                if(num==1){

                    System.out.println("Tiene Cuatro Patas, Es Un Animal Domestico,Le Gusta Jugar Con Las Personas.Que Animal es? ");
                    palabra=lectura.next();

                    if(palabra=="perro"){
                        System.out.println("Correcto el objeto es un perro");
                    } else{
                        System.out.println("la palabra que digitaste es incorrecta");
                    }

                }
                else if(num==2){
                    System.out.println("tiene 4 llantas, nos movilizamos por la ciudad en ellos, pueden ir 5 personas, lleva un conductor, que objeto es?");
                    palabra=lectura.next();
                

                    if(palabra=="carro"){
                        System.out.println("Correcto el objeto es un carro");
                    } else{
                        System.out.println("la palabra que digitaste es incorrecta");
                    }

            }
            else if(num==3){
                System.out.println("se utiliza para tomar liquidos, todos los tenemos en las casas, puede ser de pocelanato o vidrio?");
                palabra=lectura.next();
            

                if(palabra=="vaso"){
                    System.out.println("Correcto el objeto es un vaso");
                } else{
                    System.out.println("la palabra que digitaste es incorrecta");
                }
            }
        
        else if(num==4){
            System.out.println("la utilizamos para no mojarnos y evitar la lluvia?");
            palabra=lectura.next();
        

            if(palabra=="sombrilla"){
                System.out.println("Correcto el objeto es un sombrilla");
            } else{
                System.out.println("la palabra que digitaste es incorrecta");
            }
        }
                    
        i++;
                    
    
        
    System.out.println("Fin Del Juego");
    lectura.close();

                }
            }}



