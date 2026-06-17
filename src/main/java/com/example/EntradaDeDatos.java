package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad (entero): ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu estatura en metros (decimal): ");
        double estatura = sc.nextDouble();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();

        System.out.println("\n--- Resumen de datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Estudiante: " + esEstudiante);
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        sc.nextLine(); // limpia el "\n" que quedó en el buffer

        System.out.print("Ahora ingresa tu nombre completo: ");
        String nombreCompleto = sc.nextLine(); // ahora sí espera al usuario

        System.out.println("\nEdad ingresada: " + edad);
        System.out.println("Nombre ingresado: " + nombreCompleto);

        System.out.println("\nNota: si hubiéramos llamado a nextLine() " +
                "justo después de nextInt() sin limpiar el buffer, " +
                "nombreCompleto habría quedado vacío.");
    }
}