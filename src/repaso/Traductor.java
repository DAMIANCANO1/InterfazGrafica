/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author canod
 */
public class Traductor {
    public static void main (String args[]){
        Scanner Enter = new Scanner(System.in);
        int Bandera = 1;
        do {
            System.out.println(" ------ MENU ------ ");
            System.out.println("INGRESA LA OPCION QUE DESEAS REALIZAR");
            System.out.println("1; Traducir Español a Ingles" );
            System.out.println("2; Traducir Ingles a Español" );
            System.out.println("3; Salir" );
            int Menu = Enter.nextInt();
            
            switch (Menu) {
                case 1:
                    System.out.println(" TRADUCCION DE ESPAÑOL A INGLES ");
                    System.out.println(" ------Ingresa tu palabra------");
                    String Palabra = Enter.next();
                    String Traduccion = EAI(Palabra);
                    System.out.println(EAI(Palabra));
                    break;
                case 2:
                    System.out.println(" TRADUCCION DE INGLES A ESPAÑOL ");
                    System.out.println(" ------Ingresa tu palabra------ ");
                    String Ingles = Enter.next();
                    String Tradu = In(Ingles);
                    System.out.println(In(Ingles));
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            
        } while (Bandera != 3);
        
    }
    
    public static String EAI(String ES) {
        String Resultado = " ";
        if (ES.equalsIgnoreCase("padre") || ES.equalsIgnoreCase("papa")) {
            Resultado = "FATHER";     
        }else if (ES.equalsIgnoreCase("Madre")|| ES.equalsIgnoreCase("Mama")){
            Resultado = "MOTHER";
        }else if (ES.equalsIgnoreCase("Hermano")|| ES.equalsIgnoreCase("Carnal")){
            Resultado = "BROTHER";
        }
        else if (ES.equalsIgnoreCase("hermana")|| ES.equalsIgnoreCase("Carnala")){
            Resultado = "SISTER";
        }  
      return Resultado ;
    }
    
    public static String In(String INN) {
        String Resultado1 = " ";
        if (INN.equalsIgnoreCase("FATHER") || INN.equalsIgnoreCase("dad")) {
            Resultado1 = "Padre";     
        }else if (INN.equalsIgnoreCase("MOTHER")|| INN.equalsIgnoreCase("Mom")){
            Resultado1 = "Mama";
        }else if (INN.equalsIgnoreCase("BROTHER")|| INN.equalsIgnoreCase("Bro")){
            Resultado1 = "Hermano";
        }
        else if (INN.equalsIgnoreCase("SISTER")|| INN.equalsIgnoreCase("sisterna")){
            Resultado1 = "Hermana";
        }  
      return Resultado1 ;
    }
    
}
