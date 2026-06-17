package com.example;

public class ArreglosBidimensionales {
<<<<<<< HEAD
    
    public static void declararCrearMatrices() {
        // Forma 1: declarar y crear con tamaño fijo (valores por defecto en 0)
        int[][] matriz1 = new int[3][4]; // 3 filas, 4 columnas

        // Forma 2: declarar y luego inicializar con valores literales
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Forma 3: arreglo "irregular" (jagged array), donde cada fila
        // puede tener un número diferente de columnas
        int[][] matrizIrregular = new int[3][];
        matrizIrregular[0] = new int[]{1};
        matrizIrregular[1] = new int[]{1, 2};
        matrizIrregular[2] = new int[]{1, 2, 3};

        // Forma 4: matriz de tipo double
        double[][] matrizDecimales = new double[2][2];
        matrizDecimales[0][0] = 1.5;
        matrizDecimales[0][1] = 2.75;
        matrizDecimales[1][0] = 3.0;
        matrizDecimales[1][1] = 4.25;

        System.out.println("matriz1 (todo en 0): " + matriz1.length + " filas x "
                + matriz1[0].length + " columnas");
        System.out.println("matriz2 inicializada con literales:");
        for (int[] fila : matriz2) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz irregular (cada fila con distinto tamaño):");
        for (int i = 0; i < matrizIrregular.length; i++) {
            System.out.println("Fila " + i + " tiene " + matrizIrregular[i].length + " columnas");
        }

        System.out.println("\nMatriz de decimales:");
        System.out.println(matrizDecimales[0][0] + " " + matrizDecimales[0][1]);
        System.out.println(matrizDecimales[1][0] + " " + matrizDecimales[1][1]);
    }

    public static void recorrerMatriz() {
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("--- Recorrido con for tradicional (por índices) ---");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Recorrido con for-each ---");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Recorrido por columnas ---");
        // Útil cuando se necesita procesar la matriz en sentido vertical
        int numColumnas = matriz[0].length;
        for (int columna = 0; columna < numColumnas; columna++) {
            for (int[] fila : matriz) {
                System.out.print(fila[columna] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Ejemplos de usos típicos de matrices: suma total, suma por fila,
     * búsqueda del valor máximo y transposición.
     */
    public static void ejemploUsosTipicos() {
        int[][] matriz = {
            {3, 8, 2},
            {6, 1, 9},
            {4, 7, 5}
        };

        // Uso 1: sumar todos los elementos
        int sumaTotal = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                sumaTotal += valor;
            }
        }
        System.out.println("Suma total de todos los elementos: " + sumaTotal);

        // Uso 2: suma de cada fila
        System.out.println("\nSuma por fila:");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int valor : matriz[i]) {
                sumaFila += valor;
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Uso 3: encontrar el valor máximo y su posición
        int maximo = matriz[0][0];
        int filaMax = 0, columnaMax = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }
        System.out.println("\nValor máximo: " + maximo
                + " (encontrado en fila " + filaMax + ", columna " + columnaMax + ")");

        // Uso 4: transposición de la matriz (filas se convierten en columnas)
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz original:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transpuesta:");
        for (int[] fila : transpuesta) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
=======
    public static void declararCrearMatrices() {
        // TODO
    }

    public static void recorrerMatriz() {
        // TODO
    }

    public static void ejemploUsosTipicos() {
        // TODO
>>>>>>> 91f4b12783edb2ea8d3dcc67a0174c46fc8ae5cc
    }
}