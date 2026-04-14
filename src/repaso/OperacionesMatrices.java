/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author canod
 */
public class OperacionesMatrices {

    public static void main(String args[]) {
        //se decalra un arr final para los resultados 
        int Resultados[] = new int[3];
        //se declaran las matrices a operar 
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        // se declaran variables de apoyo a la operacion 
        int x = 0, y = 0, suma = 0;
        //llenar las matrices a operar
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = i + j;
                b[i][j] = i + j;
            }
        }
        ImprimeArray(a);
        System.out.println();
        ImprimeArray(b);

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                x = j;
                y = i;
                suma += a[i][j] * b[x][y];

            }
            Resultados[i] = suma;
            suma = 0;

        }

        System.out.println();

        for (int i = 0; i < Resultados.length; i++) {
            System.out.print(Resultados[i] + " ");

        }

    }

    public static void ImprimeArray(int arr[][]) {
        System.out.println("EL ARREGLO ES: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
