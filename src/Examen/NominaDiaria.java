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
public class NominaDiaria {

    public static void main(String args[]) {
        Scanner enter = new Scanner(System.in);
        //se utiliza Scanner para poder escribir en consola y trabajar con esos datos 
        System.out.println("INGRESA EL TIPO DE EMPLEDADO ");
        int Empleado = enter.nextInt();
        //LOS DIAS SON DE LUNES A SABADO (6 DIAS) 
        System.out.println("INGRES LAS HORAS TRABAJADAS POR DIA");
        int Horas = enter.nextInt();
        
        switch (Empleado) {
            // En el caso 1 se hace las operaciones solo y unicamente
            // del trabajador tipo 1 y asi como consecuente el caso 2 y 3
            case 1:
                double PagoHoras = Horas * 250;               
                double PagoImss = PagoHoras * 0.04;
                double PagoInfonavit = PagoHoras * 0.03;
                double Total = PagoHoras - PagoImss - PagoInfonavit;
                System.out.println("EL SALARIO DEL EMPLEADO: "+Empleado+" CON UN NUMERO DE HORAS TRABJADAS DE: "+Horas+" ES DE: "+Total);
                break;
            case 2:
                double PagoHoras2 = Horas * 150;
                double PagoImss2 = PagoHoras2 * 0.04;
                 double PagoInfonavit2 = PagoHoras2 * 0.03;
                double Total2 = PagoHoras2 - PagoImss2 - PagoInfonavit2;
                System.out.println("EL SALARIO DEL EMPLEADO: "+Empleado+" CON UN NUMERO DE HORAS TRABJADAS DE: "+Horas+" ES DE: "+Total2);
                break;
            case 3:
                double PagoHoras3 = Horas * 100;
                double PagoImss3 = PagoHoras3 * 0.04;
                double PagoInfonavit3 = PagoHoras3 * 0.03;
                double Total3 = PagoHoras3 - PagoImss3 - PagoInfonavit3;
                System.out.println("EL SALARIO DEL EMPLEADO: "+Empleado+" CON UN NUMERO DE HORAS TRABJADAS DE: "+Horas+" ES DE: "+Total3);
                break;
                //en cada caso se le cambia el pago por horas ya que cambia el tipo de trabador
        }

    }

}
