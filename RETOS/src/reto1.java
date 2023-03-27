//temperatura del horno RETO 1

import java.util.Scanner;

//Convertir Temperaturas Para La Torta De La Abuela

public class reto1 {
    public static void main(String[] args) {


        double grdCentigrados=350;
        double grdFahrenheit=0; 
        double grdKelvin=0;

        Scanner lectura=new Scanner(System.in); 
        


        System.out.println("HOLA VAMOS A PREPARAR UNA TORTA MAS FACIL PARA LA ABUELA");
        System.out.println("Vamos A Ver Que Temperatura Necesita El Hornno Para HAcer La Torta De La Abuela");
        

        System.out.println("En El Horno Podemos Ver Grados centigrados "+grdCentigrados);
        System.out.println("Vamos A Transformar A Grados KELVIN Y Grados FARENHEIT ");       
    

            grdKelvin = (grdFahrenheit + 459.67) * 5/9;
            grdKelvin = grdKelvin + 100;

            
            grdFahrenheit = (grdCentigrados* 1.8) + 32;
            grdFahrenheit = grdFahrenheit + 100;

        System.out.println("Los Grados Que Necesitara Tu Receta Es");

        System.out.println(" Los Grados Celsius En KELVIN Es "+grdKelvin);
        System.out.println("Los Grados Celsius En FARENHEIT Es "+grdFahrenheit); 

    lectura.close();
 }
}