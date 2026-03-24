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
        JOptionPane.showMessageDialog(null, "Tableros con arreglos bidimensionales");
    }
    
    public static void ImprimeArray(int arr[][]) {
        System.out.println("EL ARREGLO BIDIMENSIONAL ES:  \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
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

}
