package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    /**
     * Demuestra el manejo de la excepción ArithmeticException
     * que ocurre al intentar dividir un número entero entre cero.
     */
    public static void ejemploTryCatchDivision() {
        int[] numeradores = {10, 20, 30};
        int[] denominadores = {2, 0, 5}; // el segundo provocará una división por cero

        for (int i = 0; i < numeradores.length; i++) {
            try {
                int resultado = numeradores[i] / denominadores[i];
                System.out.println(numeradores[i] + " / " + denominadores[i] + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir " + numeradores[i]
                        + " entre " + denominadores[i] + " (" + e.getMessage() + ")");
            }
        }

        System.out.println("\nNota: dividir por cero con enteros lanza ArithmeticException, "
                + "pero con double (ej. 10.0 / 0) el resultado es 'Infinity', no una excepción.");
    }

    /**
     * Demuestra el manejo de InputMismatchException, que ocurre cuando
     * el usuario ingresa un tipo de dato distinto al esperado por Scanner
     * (por ejemplo, texto cuando se espera un número).
     */
    public static void ejemploTryCatchInput() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingresa un número entero: ");
            try {
                numero = sc.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: eso no es un número entero válido. Intenta de nuevo.");
                sc.nextLine(); // limpiar el dato inválido del buffer para no entrar en bucle infinito
            }
        }

        System.out.println("Número ingresado correctamente: " + numero);
    }

    /**
     * Demuestra el uso del bloque finally, que se ejecuta siempre,
     * haya ocurrido o no una excepción, normalmente usado para
     * liberar recursos (cerrar archivos, conexiones, etc.).
     */
    public static void ejemploBloqueFinally() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un divisor: ");
            int divisor = sc.nextInt();
            int resultado = 100 / divisor;
            System.out.println("100 / " + divisor + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un número entero.");
        } finally {
            // Este bloque se ejecuta SIEMPRE, sin importar si hubo excepción o no.
            System.out.println("Bloque finally: esta línea siempre se ejecuta.");
            System.out.println("Aquí normalmente se liberarían recursos (cerrar Scanner, archivos, etc.).");
        }

        System.out.println("El programa continúa su ejecución normalmente.");
    }

    /**
     * Demuestra cómo el manejo de excepciones evita que un error
     * inesperado detenga (cierre) por completo la ejecución del programa,
     * permitiendo continuar con el resto de las operaciones.
     */
    public static void evitarCierrePrograma() {
        String[] datos = {"10", "20", "abc", "40", "0", "5"};

        System.out.println("Procesando una lista de datos, algunos inválidos...\n");

        for (String dato : datos) {
            try {
                int numero = Integer.parseInt(dato); // puede lanzar NumberFormatException
                int resultado = 100 / numero;        // puede lanzar ArithmeticException
                System.out.println("100 / " + dato + " = " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("\"" + dato + "\" no es un número válido. Se omite y se continúa.");
            } catch (ArithmeticException e) {
                System.out.println("\"" + dato + "\" provocó división por cero. Se omite y se continúa.");
            }
        }

        System.out.println("\nEl programa terminó de procesar TODOS los datos "
                + "sin cerrarse abruptamente, gracias al manejo de excepciones.");
    }
}