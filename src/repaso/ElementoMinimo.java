/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author damia
 */
public class ElementoMinimo {
    public static void main (String args[]){
        //definir el arreglo a ordenar 
        
        int arr []= new int[7];
        arr[0] = 8;
        arr[1] = 1;
        arr[2] = 7;
        arr[3] = 0;
        arr[4] = 2;
        arr[5] = 9;
        arr[6] = 4;
        
        //suponer que el primer elemento 
        // del arreglo es el menor
        
        int min = arr[0];
        int mayor = arr[0];
        
        //validar la posicion con el resto de elementos 
        
        for(int i = 1; i< arr.length; i++){
            if (min >= arr[i]){
                min = arr[i];           
            }else if (mayor <= arr[i]){
                mayor = arr[i];      
            }        
        }
        System.out.println("el numero menor es: "+ min);
        System.out.println("El numero mayor es: "+ mayor );
    }
    
}
