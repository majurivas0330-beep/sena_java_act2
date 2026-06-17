package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {

        byte numeroByte = 127;
        short numeroShort = 32000;
        int numeroInt = 2000000;
        long numeroLong = 999999999L;

        System.out.println("=== ENTEROS ===");
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
    }

    public static void demostrarFlotantes() {

        float precioCafe = 4500.50f;
        double precioCafePremium = 8500.99;

        System.out.println("\n=== FLOTANTES ===");
        System.out.println("Precio café (float): " + precioCafe);
        System.out.println("Precio café premium (double): " + precioCafePremium);
    }

    public static void demostrarCaracteres() {

        char inicial = 'M';

        System.out.println("\n=== CARACTERES ===");
        System.out.println("Inicial: " + inicial);
    }

    public static void demostrarBooleanos() {

        boolean luzEncendida = true;

        System.out.println("\n=== BOOLEANOS ===");
        System.out.println("Luz encendida: " + luzEncendida);
    }

    public static void demostrarValoresPorDefecto() {

        System.out.println("\n=== VALORES POR DEFECTO ===");

        int numero = 0;
        boolean estado = false;
        char letra = 'A';

        System.out.println("int: " + numero);
        System.out.println("boolean: " + estado);
        System.out.println("char: " + letra);
    }
}