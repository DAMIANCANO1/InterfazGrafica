/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;

/**
 *
 * @author damia
 */
public class MasaCorporal {

    public static void main(String args[]) {
        Scanner enter = new Scanner(System.in);

        System.out.println("INGRESA TU PESO EN KILOS");
        double Kg = enter.nextDouble();
        System.out.println("INGRESA TU ESTATURA EN M");
        double Cm = enter.nextDouble();

        double Peso = Kg / (Cm * Cm);

        if (Peso < 16) {
            System.out.println("CRITERIO DE INGRESO EN HOSPITAL");
        } else if (Peso >= 16 && Peso < 17) {
            System.out.println("INFRA PESO");
        } else if (Peso >= 17 && Peso < 18) {
            System.out.println("BAJO PESO");
        } else if (Peso >= 18 && Peso < 25) {
            System.out.println("PESO NOMRAL SALUDABLE");
        } else if (Peso >= 25 && Peso < 30) {
            System.out.println("SOBRE PESO GRADO I");
        } else if (Peso >= 30 && Peso < 35) {
            System.out.println("SOBRE PESO CRONICO GRADO II");
        } else if (Peso >= 35 && Peso < 40) {
            System.out.println("OBESIDAD PRE MORBIDA OBESIDAD GRADO III");
        } else {
            System.out.println("OBESIDAD MORBIDA GRADO IV");
        }

    }
    
    
    
}
