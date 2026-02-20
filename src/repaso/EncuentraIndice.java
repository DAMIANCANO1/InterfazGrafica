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
    
    public static int[] encuentraIndice (int arr[], int valor){
        //1.- recorrer el arreglo par encontrar la igualda de valores 
        // y determinar el indice 
        
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            if (valor == arr[i]) {
                contador++;             
            }
        }
        
        int arr2[] = new int [contador];
        int j  = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                arr2[j] = i;
                j++;
            }
        }
        return arr2;
    }
    
    
    public static void main (String args[]){
        int Posiciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la longitud del arreglo: "));
        
        int arr [] = new int[Posiciones]; 
        
        for (int  i = 0; i < arr.length; i++ ) {
            arr[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa un valor "));
        }
        
        int Valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor a buscar"));
        int [] ValorE = encuentraIndice(arr, Valor);
        
        String PosicionesA = "";
        
        for (int i = 0; i < ValorE.length; i++){
            PosicionesA = PosicionesA +" "+ ValorE[i]+" ";          
        }
         
        JOptionPane.showMessageDialog(null, "el valor ingresado se localizo\n en la posicion "+PosicionesA+" en el arreglo");
    }

}
