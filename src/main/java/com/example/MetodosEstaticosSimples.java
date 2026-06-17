package com.example;

public class MetodosEstaticosSimples {
<<<<<<< HEAD

    public static void ejemploDeclaracionLlamada() {
        System.out.println("=== DECLARACIÓN Y LLAMADA DE MÉTODOS ===");
        saludar();
        imprimirLinea();
    }

    // Método auxiliar sin parámetros ni retorno
    private static void saludar() {
        System.out.println("Hola desde un método estático.");
    }

    private static void imprimirLinea() {
        System.out.println("-----------------------------");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("\n=== PASO DE PARÁMETROS ===");
        System.out.println("Hola, " + nombre + "!");
        mostrarEdad("Ana", 22);
        mostrarEdad("Carlos", 30);
    }

    private static void mostrarEdad(String nombre, int edad) {
        System.out.println(nombre + " tiene " + edad + " años.");
    }

    public static int ejemploRetornoValores() {
        System.out.println("\n=== RETORNO DE VALORES ===");
        int suma = sumar(10, 5);
        System.out.println("sumar(10, 5) = " + suma);

        double area = calcularAreaCirculo(3.0);
        System.out.println("Área del círculo con radio 3: " + area);

        return suma; // retorna el valor para uso en App.java
    }

    private static int sumar(int a, int b) {
        return a + b;
    }

    private static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Sobrecarga: mismo nombre, sin parámetros
    public static void ejemploSobrecarga() {
        System.out.println("\n=== SOBRECARGA (sin parámetros) ===");
        System.out.println("Método sobrecargado sin argumentos.");
    }

    // Sobrecarga: mismo nombre, con parámetro int
    public static void ejemploSobrecarga(int n) {
        System.out.println("=== SOBRECARGA (con int n=" + n + ") ===");
        System.out.println("Tabla del " + n + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  " + n + " x " + i + " = " + (n * i));
        }
=======
    public static void ejemploDeclaracionLlamada() {
        // TODO
    }

    public static void ejemploPasoParametros(String nombre) {
        // TODO
    }

    public static int ejemploRetornoValores() {
        // TODO
        return 0;
    }

    public static void ejemploSobrecarga() {
        // TODO
    }

    public static void ejemploSobrecarga(int n) {
        // TODO
>>>>>>> 91f4b12783edb2ea8d3dcc67a0174c46fc8ae5cc
    }
}