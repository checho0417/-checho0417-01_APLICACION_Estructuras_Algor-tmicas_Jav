// Vacuna Bebe

import java.util.Scanner;

 public class reto2 {
    public static void main(String[] args) {
        
    
    String nmbMedico;
    String nmbBebe;
    String epsBebe;
    String vacuna;
    int edadBebe;
    double pesoBebe;
    double dosis=0;

    Scanner lectura=new Scanner(System.in);

    System.out.println("Bienvenido Al Centro De Salud FAMISALUD,Este Centro De Salud Aplica Vacunas A Los Bebes Menores De Un Año");

        System.out.println("Digite El Nombre Del Bebe");
        nmbBebe=lectura.next();
        System.out.println("Digite La Edad Del Bebe En Meses");
        edadBebe=lectura.nextInt();
        System.out.println("Digite El Peso Del Bebe");
        pesoBebe=lectura.nextDouble();
        System.out.println("Digite La EPS Del Bebe");
        epsBebe=lectura.next();
        System.out.println("Digite La Vacuna Que Desea Aplicarle Al Bebe");
        vacuna=lectura.next();
        System.out.println("Digite EL Nombre Del Medico Encargado De APlicar La Vacuna");
        nmbMedico=lectura.next();
    
        if (edadBebe<=12) {
            System.out.println(nmbBebe+" Si Esta En La Edad Adecuada Para Su Vacunacion ");
            }else{
                System.out.println("La Edad Del Bebe No Es La Adecuada Para su Vacuna");
                return;
            }
    

        dosis=(pesoBebe+15)/(edadBebe+15)*10;


            System.out.println(nmbBebe+" Tiene " +edadBebe+ " Meses, Su Peso Es De " +pesoBebe+ "KG Esta Vinculado A La EPS " +epsBebe);
            System.out.println("El Medico Encargado De Aplicar La Vacuna Al Bebe Es: " +nmbMedico);
            System.out.println("La Dosis Correcta De La Inyeccion Es " +dosis+ " de el medicamento contra " +vacuna);
         
            
            lectura.close();
        }

    }