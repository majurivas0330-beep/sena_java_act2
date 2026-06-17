package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        System.out.println("=== DECLARAR, CREAR E INICIALIZAR ===");

        // Declarar y crear (valores por defecto: 0)
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.print("Asignación manual: ");
        for (int n : numeros) System.out.print(n + " ");
        System.out.println();

        // Inicialización directa con literales
        String[] frutas = {"Mango", "Banano", "Guanábana", "Maracuyá"};
        System.out.print("Frutas: ");
        for (String f : frutas) System.out.print(f + " ");
        System.out.println();

        // Arreglo de doubles
        double[] precios = new double[]{1500.0, 2300.5, 980.0};
        System.out.print("Precios: ");
        for (double p : precios) System.out.print(p + " ");
        System.out.println();
    }

    public static void mostrarLongitud() {
        System.out.println("\n=== PROPIEDAD LENGTH ===");
        int[] datos = {3, 6, 9, 12, 15, 18};
        System.out.println("Arreglo: [3, 6, 9, 12, 15, 18]");
        System.out.println("Longitud: " + datos.length);
        System.out.println("Primer elemento: " + datos[0]);
        System.out.println("Último elemento: " + datos[datos.length - 1]);
    }

    public static void recorrerConForClasico() {
        System.out.println("\n=== RECORRER CON FOR CLÁSICO ===");
        int[] valores = {100, 200, 300, 400, 500};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("valores[" + i + "] = " + valores[i]);
        }
    }

    public static void recorrerConForEach() {
        System.out.println("\n=== RECORRER CON FOR-EACH ===");
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};

        for (String color : colores) {
            System.out.println("Color: " + color);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        System.out.println("\n=== ARRAY COMO PARÁMETRO Y RETORNO ===");
        System.out.print("Array recibido: ");
        for (int n : array) System.out.print(n + " ");
        System.out.println();

        // Crear nuevo array con el doble de cada valor
        int[] dobles = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            dobles[i] = array[i] * 2;
        }

        System.out.print("Array retornado (dobles): ");
        for (int n : dobles) System.out.print(n + " ");
        System.out.println();

        return dobles;
    }
}