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
        System.out.println();

        //Resultados multiplicacion
        System.out.println("MULTIPLICACION");
        int Resultado[][] = multiplicarMatrices(a, b);
        ImprimeArray(Resultado);
        
        //Resultados suma
        System.out.println("SUMA");
        Resultado = sumarMatrices(a, b);
        ImprimeArray(Resultado);
        
        //Resultados resta
        System.out.println("RESTA");
        Resultado = restarMatrices(a, b);
        ImprimeArray(Resultado);

    }

    public static int[][] multiplicarMatrices(int a[][], int b[][]) {
        int Resultados[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {              // FILA del resultado
            for (int j = 0; j < b[0].length; j++) {       // COLUMNA del resultado
                int suma = 0;
                for (int k = 0; k < a[0].length; k++) {    // MULTIPLICACIÓN
                    suma += a[i][k] * b[k][j];
                }
                Resultados[i][j] = suma;
            }
        }
        return Resultados;
    }

    public static int[][] sumarMatrices(int a[][], int b[][]) {
        int Resultados[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {           // FILAS
            for (int j = 0; j < a[0].length; j++) {    // COLUMNAS
                int Suma = a[i][j] + b[i][j];
                Resultados[i][j] = Suma;
                Suma = 0;
            }
        }

        return Resultados;
    }
    
    public static int[][] restarMatrices(int a[][], int b[][]) {
        int Resultados[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {           // FILAS
            for (int j = 0; j < a[0].length; j++) {    // COLUMNAS
                int Suma = a[i][j] - b[i][j];
                Resultados[i][j] = Suma;
                Suma = 0;
            }
        }

        return Resultados;

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
