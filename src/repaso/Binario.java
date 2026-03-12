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
public class Binario {

    public static void main(String args[]) {
        Scanner Enter = new Scanner(System.in);
        System.out.println("----- BINARIO A DECIMAL -----");
        System.out.println("INGRESA LA CANTIDAD DE BITS");
        int Bits = Enter.nextInt();

        int Numero[] = new int[Bits];

        for (int i = 0; i < Numero.length; i++) {
            System.out.println("INGRESA  EL NUMERO EN BINARIO");
            int Binario = Enter.nextInt();
            Numero[i] = Binario;
        }
        double Suma=0;
        for (int i = 0; i < Numero.length; i++) {
            double Resultado = Numero[i] * Math.pow(2, i);
            Suma = Suma + Resultado;  
        }
        System.out.println(Suma);
    }
}

