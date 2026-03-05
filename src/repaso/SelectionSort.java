/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author damia
 */
import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {
        Scanner Enter = new Scanner(System.in);
        //declarar una variable que almacenara
        //al elemento minimo de cada arreglo
        int Minimo = 0;
        //declaraar variable que almacenara
        //de manera temporal in elemento del 
        //arreglo para que no se pierda 
        int Tempi = 0;
        // declarar una variable que localiza
        //la posicion en la que se encuentra el 
        //elemento minimo 
        int index = 0;
        //Se lee el arreglo a ordenar ingresado
        //desde el teclado 
        //leer el numero de elementos del arreglo
        System.out.print("INGRESA LA CANTIDAD DE VALORES: ");
        int Valores = Enter.nextInt();
        System.out.println();
        int Desordenado[] = new int[Valores];
        for (int i = 0; i < Desordenado.length; i++) {
            System.out.println("ingresa el elemento " + i + " para el arreglo: ");
            Desordenado[i] = Enter.nextInt();
            System.out.println();
        }

        System.out.println();
        System.out.println("EL ARREGLO A SER ORDENADO POR EL METODO DE SELECCION ES : ");
        for (int i = 0; i < Desordenado.length; i++) {
            System.out.println("|" + Desordenado[i] + "|");

        }
        boolean Bandera = false;
        for (int e = 0; Bandera = true; e++) {
            System.out.println("INGRESA 1 PARA ORDENAR DE MENOR A MAYOR");
            System.out.println("INGRESA 2 PARA ORDENAR DE MAYOR A MENOR");
            System.out.println("INGRESA 3 PARA SALIR");
            int Menu = Enter.nextInt();
            if (Menu == 1) {
                System.out.println();

                //se declara un arreglo temporal que ira
                //conteniendo a los subarreglos del arreglo org
                int temp[];
                //se declara una variable de apoyo que manejara 
                // la longitud cambiante del arreglo temporal
                // de manera que solo se almacenen elementos requeridos

                int leng = Desordenado.length;
                //se declara una varianle que ayudara para
                //copiar los elemtos necesarios del arreglo 
                //original al temporal
                int t;
                //se declarfa un ciclo principal sobre
                //el que se recorre todo el arreglo principal
                //y permitira ir creando sub arreglos
                for (int i = 0; i < Desordenado.length; i++) {
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
                        temp[k] = Desordenado[t];
                        t++;
                    }
                    //se localiza el elemento minimo del arreglo actual
                    Minimo = encuentraMinimo(temp);
                    index = encuentraposicion(Desordenado, Minimo);

                    //almacenar en una variable temporal el valor de 
                    //la posicion actual en la que esta en el arreglo
                    Tempi = Desordenado[i];

                    Desordenado[i] = Desordenado[index];
                    Desordenado[index] = Tempi;
                    //se disminuye la variable leng para ir disminuyendp
                    //las posiciones a ordenar del del arreglo principal
                    leng--;
                }
                System.out.println("El arreglo ordenado es:");
                System.out.println();
                for (int i = 0; i < Desordenado.length; i++) {
                    System.out.println("|" + Desordenado[i] + "|");

                }

            } else if (Menu == 2) {
                int temp[];
              
                int leng = Desordenado.length;

                int t;

                for (int i = Desordenado.length-1; i >=0; i++) {
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
                        temp[k] = Desordenado[t];
                        t++;
                    }
                    //se localiza el elemento minimo del arreglo actual
                    Minimo = encuentraMinimo(temp);
                    index = encuentraposicion(Desordenado, Minimo);

                    //almacenar en una variable temporal el valor de 
                    //la posicion actual en la que esta en el arreglo
                    Tempi = Desordenado[i];

                    Desordenado[i] = Desordenado[index];
                    Desordenado[index] = Tempi;
                    //se disminuye la variable leng para ir disminuyendp
                    //las posiciones a ordenar del del arreglo principal
                    leng--;

                }
            } else if (Menu == 3) {
                Bandera = true;
                break;
            }
        }
    }

    public static int encuentraMinimo(int arr[]) {
        int min = arr[0];
        int mayor = arr[0];

        //validar la posicion con el resto de elementos 
        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            } else if (mayor <= arr[i]) {
                mayor = arr[i];
            }
        }
        return min;
    }

    public static int encuentraposicion(int ar[], int v) {
        for (int i = 0; i < ar.length; i++) {
            if (v == ar[i]) {
                return i;
            }

        }
        return 0;
    }
}

    


