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
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA VALOR"));
            }
        }
        ImprimeArray(arr);
        
        JOptionPane.showInputDialog(null, " INGRESA 1 PARA DIAGONAL \n INGRESA 2 PARA DIAGONAL INVERTIDA \n INGRESA 3 PARA TRINANGULO SUPERIOR DERECHO \n"
                + "INGRESA 4 PARA TRIANGULO SUPERIOR IZQUIERDO \n INGRESA 5 PARA TRIANGULO INFERIOR DERECHO \n INGRESA 6 PARA TRIANGULO INFERIOR IZQUIERDO ");
        
        JOptionPane.showMessageDialog(null, "Tableros con arreglos bidimensionales");
        System.out.println();
        
        JOptionPane.showMessageDialog(null, "DIAGONAL INVERTIDA");
        DiagonalEnCero(arr);
        ImprimeArray(arr);
        
        JOptionPane.showMessageDialog(null, "DIAGONAL INVERTIDA");
        DigonalInvertida(arr);
        ImprimeArray(arr);
        
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
                } else {
                    arr[i][j] = arr[i][j];
                }
            }
        }
    }
    
    public static void DigonalInvertida(int arr[][]) {
        for (int i = 0; i< arr.length; i++) {
            for (int j = arr[0].length-1; j >=0; j--) {
                    
                if (i + j == arr.length-1) {
                    arr[i][j] = 0;
                }  
            }
        }
    }

}
