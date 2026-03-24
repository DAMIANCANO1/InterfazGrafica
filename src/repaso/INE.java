/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author canod
 */
public class INE {

    public static void main(String args[]) {
        Scanner Enter = new Scanner(System.in);

        ArrayList<Integer> PRI = new ArrayList<>();
        ArrayList<Integer> PAN = new ArrayList<>();
        ArrayList<Integer> PRD = new ArrayList<>();
        ArrayList<Integer> NULO = new ArrayList<>();

        System.out.println("                 ----BIENVENIDO AL SISTEMA DE VOTACIONES----               ");
        System.out.println("PODRAS VOTAR POR 3 PARTIDOS DIFERENTES Y SI LO DESEAS PODRAS ANULAR TU VOTO");

        for (int i = 0; i < 30; i++) {

            System.out.println("        SI DESEA VOTAR POR EL PRI INGRESE |P|         ");
            System.out.println("        SI DESEA VOTAR POR EL PAN INGRESE |A|         ");
            System.out.println("        SI DESEA VOTAR POR EL PRD INGRESE |D|         ");
            System.out.println("SI DESEA ANULAR SU VOTO INGRESE UN CARACTER DIFERENTE ");

            String Voto = Enter.next();

            if (Voto.equalsIgnoreCase("P")) {
                PRI.add(1);
                System.out.println("USTED VOTO POR PRI");
                System.out.println("VOTO GUARDADO....");
            } else if (Voto.equalsIgnoreCase("A")) {
                PAN.add(1);
                System.out.println("USTED VOTO POR PAN");
                System.out.println("VOTO GUARDADO....");
            } else if (Voto.equalsIgnoreCase("D")) {
                PRD.add(1);
                System.out.println("USTED VOTO POR PRD");
                System.out.println("VOTO GUARDADO....");

            }else {
                NULO.add(1);
                System.out.println("USTED ANULO SU VOTO");
            }
        }
        
        System.out.println("|LOS VOTOS FAVORABLES TOTALES PARA PRI SON: " + PRI.size() + "|");
        System.out.println("|LOS VOTOS FAVORABLES TOTALES PARA PAN SON: " + PAN.size() + "|");
        System.out.println("|LOS VOTOS FAVORABLES TOTALES PARA PRD SON: " + PRD.size() + "|");
        System.out.println("|        LOS VOTOS NULOS SON              : " + NULO.size() + "|");      

    }

}
