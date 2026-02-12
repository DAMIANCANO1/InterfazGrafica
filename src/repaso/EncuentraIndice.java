/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author damia
 */
public class EncuentraIndice {
    
    public static int encuentraIndice (int arr[], int valor){
        //1.- recorrer el arreglo par encontrar la igualda de valores 
        // y determinar el indice 

        for (int i = 0; i < arr.length; i++) {
            if (valor == arr[i]) {
                return i;
            }
        }
        return 0;
    }
    public static void main (String args[]){
        int Posiciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la longitud del arreglo: "));
        
        int arr [] = new int[Posiciones]; 
        
        for (int  i = 0; i < arr.length; i++ ) {
            arr[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa un valor "));
        }
        
        int Valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor a busacar"));
        int ValorE = encuentraIndice(arr, Valor);
    }

}
