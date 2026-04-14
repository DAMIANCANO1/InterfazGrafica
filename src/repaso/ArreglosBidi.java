/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author canod
 */
import javax.swing.JOptionPane;

public class ArreglosBidi {

    public static void main(String args[]) {
        int Filas = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA LAS FILAS DEL ARRAY"));
        int Columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA LAS COLUMNAS DEL ARRAY"));
        int arr[][] = new int[Filas][Columnas];
        
        JOptionPane.showMessageDialog(null, "ARREGLO BIDIMENSIONAL BASICO");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 1;
            }
        }
        ImprimeArray(arr);
        
        int Op = Integer.parseInt(JOptionPane.showInputDialog(null, " INGRESA 1 PARA DIAGONAL \n INGRESA 2 PARA DIAGONAL INVERTIDA \n INGRESA 3 PARA TRIANGULO SUPERIOR DERECHO \n"
                + "INGRESA 4 PARA TRIANGULO SUPERIOR IZQUIERDO \n INGRESA 5 PARA TRIANGULO INFERIOR DERECHO \n INGRESA 6 PARA TRIANGULO INFERIOR IZQUIERDO "));
        
        switch (Op){
            case 1:
                JOptionPane.showMessageDialog(null, "DIAGONAL");
                DiagonalEnCero(arr);
                
                ImprimeArray(arr);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "DIAGONAL INVERTIDA");
                DiagonalInvertida(arr);
                ImprimeArray(arr);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "TRIANGULO SUPERIOR DERECHO");
                TrianguloSupDer(arr);
                ImprimeArray(arr);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "TRIANGULO SUPERIOR IZQUIERDO");
                TrianguloSupIzq(arr);
                ImprimeArray(arr);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "TRIANGULO INFERIOR DERECHO");
                TrianguloInfDer(arr);
                ImprimeArray(arr);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "TRIANGULO INFERIOR IZQUIERDO");
                TrianguloInfIzq(arr);
                ImprimeArray(arr);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
        }
    }

    public static void ImprimeArray(int arr[][]) {
        System.out.println("EL ARREGLO BIDIMENSIONAL ES:  \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void DiagonalEnCero(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void DiagonalInvertida(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i + j == arr.length - 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void TrianguloSupDer(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i < j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void TrianguloSupIzq(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j < arr[0].length - i - 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void TrianguloInfDer(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j > arr[0].length - i - 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void TrianguloInfIzq(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i > j) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
