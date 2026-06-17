package com.example;

public class ConversionDeTipos {
<<<<<<< HEAD

    public static void demostrarCastingImplicitito() {
        System.out.println("=== CASTING IMPLÍCITO (Widening) ===");

        byte numeroByte = 42;
        short numeroShort = numeroByte;   // byte -> short
        int numeroInt = numeroShort;      // short -> int
        long numeroLong = numeroInt;      // int -> long
        float numeroFloat = numeroLong;   // long -> float
        double numeroDouble = numeroFloat; // float -> double

        System.out.println("byte:   " + numeroByte);
        System.out.println("short:  " + numeroShort);
        System.out.println("int:    " + numeroInt);
        System.out.println("long:   " + numeroLong);
        System.out.println("float:  " + numeroFloat);
        System.out.println("double: " + numeroDouble);

        // int a double
        int entero = 25;
        double doble = entero;
        System.out.println("int " + entero + " -> double: " + doble);
    }

    public static void demostrarCastingExplicito() {
        System.out.println("\n=== CASTING EXPLÍCITO (Narrowing) ===");

        double decimal = 45.89;
        int entero = (int) decimal; // trunca la parte decimal
        System.out.println("double " + decimal + " -> int: " + entero);

        double precio = 9999.99;
        float precioFloat = (float) precio;
        System.out.println("double " + precio + " -> float: " + precioFloat);

        int numero = 65;
        char letra = (char) numero; // 65 = 'A' en ASCII
        System.out.println("int " + numero + " -> char: " + letra);
    }

    public static void demostrarProblemasDePrecision() {
        System.out.println("\n=== PROBLEMAS DE PRECISIÓN Y OVERFLOW ===");

        // Overflow al convertir long a short
        long numeroGrande = 40000L;
        short numeroShort = (short) numeroGrande;
        System.out.println("long " + numeroGrande + " -> short (overflow): " + numeroShort);

        // Pérdida de decimales
        double pi = 3.141592653589793;
        int piInt = (int) pi;
        System.out.println("double PI " + pi + " -> int (truncado): " + piInt);

        // Pérdida de precisión float vs double
        double preciso = 1.123456789012345;
        float menorPrecision = (float) preciso;
        System.out.println("double: " + preciso);
        System.out.println("float:  " + menorPrecision + " (menos decimales)");
=======
    public static void demostrarCastingImplicitito() {
        // TODO
    }

    public static void demostrarCastingExplicito() {
        // TODO
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
>>>>>>> 91f4b12783edb2ea8d3dcc67a0174c46fc8ae5cc
    }
}