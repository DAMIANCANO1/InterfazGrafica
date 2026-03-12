/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exa2doP;

import java.util.Scanner;

/**
 *
 * @author canod
 */
public class Software {
    public static void main(String args[]) {
        Scanner Enter = new Scanner(System.in);
        int Programador1[] = new int[5];
        int Programador2[] = new int[5];
        int Programador3[] = new int[5];
        int TotalHoras []=new int [5];
        int Total1 = 0;
        int Total2 = 0;
        int Total3 = 0;

        System.out.println("INGRESA LAS HORAS TRABAJADAS POR DIA PARA EL PROGRAMADOR 1 ");
        System.out.println("TOMANDO EN CUENTA QUE 0 REPRESENTA A LUNES Y ASI SUCESIVAMENTE ");

        for (int i = 0; i < 5; i++) {
            System.out.println("INGRESA LAS HORAS TRABAJADAS DEL DIA " + i + " ");
            int Dias1 = Enter.nextInt();
            Programador1[i] = Dias1;     
        }
        System.out.println("INGRESA LAS HORAS TRABAJADAS POR DIA PARA EL PROGRAMADOR 2 ");
        System.out.println("TOMANDO EN CUENTA QUE 0 REPRESENTA A LUNES Y ASI SUCESIVAMENTE ");

        for (int i = 0; i < 5; i++) {
            System.out.println("INGRESA LAS HORAS TRABAJADAS DEL DIA " + i + " ");
            int Dias2 = Enter.nextInt();
            Programador2[i] = Dias2;
            
        }
        System.out.println("INGRESA LAS HORAS TRABAJADAS POR DIA PARA EL PROGRAMADOR 3 ");
        System.out.println("TOMANDO EN CUENTA QUE 0 REPRESENTA A LUNES Y ASI SUCESIVAMENTE ");

        for (int i = 0; i < 5; i++) {
            System.out.println("INGRESA LAS HORAS TRABAJADAS DEL DIA " + i + " ");
            int Dias3 = Enter.nextInt();
            Programador3[i] = Dias3;      
        }
        
        System.out.println(" EMPLEADOS        1 --------           2 --------         3 --------  ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Lunes                 "+Programador1[0]+"               "+Programador2[0]+"            "+Programador3[0]);
        System.out.println("Martes                "+Programador1[1]+"               "+Programador2[1]+"            "+Programador3[1]);
        System.out.println("Miercoles             "+Programador1[2]+"               "+Programador2[2]+"            "+Programador3[2]);
        System.out.println("Jueves                "+Programador1[3]+"               "+Programador2[3]+"            "+Programador3[3]);
        System.out.println("Viernes               "+Programador1[4]+"               "+Programador2[4]+"            "+Programador3[4]);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("LAS HORAS TOTALES TRABAJADAS POR LOS 3 EMPLEADOS EL DIA "+i+" Son:");
            TotalHoras[i] = Programador1[i]+ Programador2[i]+Programador3[i];
            System.out.println(TotalHoras[i]);
        }
        for (int i = 0; i < 5; i++) {
            Total1+= Programador1[i];
            Total2+= Programador2[i];
            Total3 += Programador3[i];
        }
        System.out.println("LAS HORAS TRABAJADAS POR POR EL EMPLEADO 1 SON");
        System.out.println(Total1);
        System.out.println("LAS HORAS TRABAJADAS POR POR EL EMPLEADO 2 SON");
        System.out.println(Total2);
        System.out.println("LAS HORAS TRABAJADAS POR POR EL EMPLEADO 3 SON");
        System.out.println(Total3);

    }

}
