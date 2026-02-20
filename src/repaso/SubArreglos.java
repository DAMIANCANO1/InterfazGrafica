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
public class SubArreglos {

    public static void main(String args[]) {
        int cv = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa la cantidad de de posiciones del arreglo:"));

        int arr[] = new int[cv];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA UN VALOR"));
        }
        //se decalra un arreglo temporal que ira
        //conteniendo a los subarreglos del arreglo org

        int temp[];
        //se declara una variable de apoyo que manejara 
        // la longitud cambiante del arreglo temporal
        // de manera que solo se almacenen elementos requeridos

        int leng = 1;
        //se decalra una varianle que ayudara para
        //copiar los elemtos necesarios del arreglo 
        //original al temporal
        int t;
        //se declarfa un ciclo principal sobre
        //el que se recorre todo el arreglo principal
        //y permitira ir creando sub arreglos
        for (int i = arr.length - 1; i >= 0; i--) {
            //igualar t a i para que el sub arreglo
            //pueda tener los elementos del arreglo
            //original conforme se vayan necesitando
            //se comienza con el arreglo completo y 
            //se ira quitando una posicion en cada vuelta
            t = i;
            //se inicializa el arreglo temporal con la 
            //cantidad de posiciones que solo se van a 
            //necesitar. La variable lengh ira cambiando
            //conforme se vayan quitando posiciones del 
            //arreglo original
            temp = new int[leng];
            //se procede a llenar el arreglo temporar con los
            //elementos requeridos del arreglo original
            for (int k = 0; k < temp.length; k++) {
                //se va copiando al arreglo temporar los
                //elemento que se necesitan
                temp[k] = arr[t];
                t++;
            }
            //comprobar la creacion de sub arreglos 
            System.out.println("El arreglo en la interaccion "+i+"es:");
            System.out.println();
            
            for (int j = 0; j < temp.length; j++) {
                System.out.print("|"+temp[j]+"| ");           
            }
            System.out.println();
            System.out.println();
            //se disminuye la variable leng para ir 
            //decremnetando las posiciones
            leng++; 

        }
    }

}
