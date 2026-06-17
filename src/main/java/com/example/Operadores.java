package com.example;

public class Operadores {
<<<<<<< HEAD

    public static void demostrarAritmeticos() {
        System.out.println("=== OPERADORES ARITMÉTICOS ===");
        int a = 10, b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma:        " + a + " + " + b + " = " + (a + b));
        System.out.println("Resta:       " + a + " - " + b + " = " + (a - b));
        System.out.println("Múltiplicación: " + a + " * " + b + " = " + (a * b));
        System.out.println("División:    " + a + " / " + b + " = " + (a / b));   // división entera
        System.out.println("Módulo:      " + a + " % " + b + " = " + (a % b));

        double x = 10.0, y = 3.0;
        System.out.println("División real: " + x + " / " + y + " = " + (x / y));
    }

    public static void demostrarIncrementoDecremento() {
        System.out.println("\n=== INCREMENTO Y DECREMENTO ===");
        int n = 5;

        System.out.println("n inicial: " + n);
        System.out.println("n++ (post-incremento): " + n++); // muestra 5, luego n=6
        System.out.println("n después de n++: " + n);        // 6
        System.out.println("++n (pre-incremento):  " + (++n)); // n=7, muestra 7
        System.out.println("n-- (post-decremento): " + n--); // muestra 7, luego n=6
        System.out.println("--n (pre-decremento):  " + (--n)); // n=5, muestra 5
    }

    public static void demostrarRelacionales() {
        System.out.println("\n=== OPERADORES RELACIONALES ===");
        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >  b: " + (a > b));
        System.out.println("a <  b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    public static void demostrarLogicos() {
        System.out.println("\n=== OPERADORES LÓGICOS ===");
        boolean p = true, q = false;

        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p && q (AND): " + (p && q));
        System.out.println("p || q (OR):  " + (p || q));
        System.out.println("!p     (NOT): " + (!p));
        System.out.println("!q     (NOT): " + (!q));

        // Cortocircuito
        int x = 0;
        boolean resultado = (x != 0) && (10 / x > 1); // no evalúa 10/x por cortocircuito
        System.out.println("Cortocircuito (x=0): (x != 0) && (10/x > 1) = " + resultado);
    }

    public static void demostrarAsignacionCompuesta() {
        System.out.println("\n=== ASIGNACIÓN COMPUESTA ===");
        int n = 10;

        System.out.println("n inicial: " + n);
        n += 5;  System.out.println("n += 5  → " + n);
        n -= 3;  System.out.println("n -= 3  → " + n);
        n *= 2;  System.out.println("n *= 2  → " + n);
        n /= 4;  System.out.println("n /= 4  → " + n);
        n %= 3;  System.out.println("n %= 3  → " + n);
    }

    public static void demostrarOperadorTernario() {
        System.out.println("\n=== OPERADOR TERNARIO ===");
        int edad = 17;
        String acceso = (edad >= 18) ? "Acceso permitido" : "Acceso denegado";
        System.out.println("Edad: " + edad + " → " + acceso);

        int a = 42, b = 99;
        int mayor = (a > b) ? a : b;
        System.out.println("Mayor entre " + a + " y " + b + ": " + mayor);
=======
    public static void demostrarAritmeticos() {
        // TODO
    }

    public static void demostrarIncrementoDecremento() {
        // TODO
    }

    public static void demostrarRelacionales() {
        // TODO
    }

    public static void demostrarLogicos() {
        // TODO
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
    }

    public static void demostrarOperadorTernario() {
        // TODO
>>>>>>> 91f4b12783edb2ea8d3dcc67a0174c46fc8ae5cc
    }
}