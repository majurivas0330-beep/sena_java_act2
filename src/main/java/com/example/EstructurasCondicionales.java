package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        System.out.println("=== IF SIMPLE ===");
        int temperatura = 35;

        if (temperatura > 30) {
            System.out.println("Hace calor (" + temperatura + "°C). Usa ropa ligera.");
        }

        int saldo = 500;
        if (saldo < 1000) {
            System.out.println("Saldo bajo: $" + saldo);
        }
    }

    public static void ejemploIfElse() {
        System.out.println("\n=== IF - ELSE ===");
        int edad = 16;

        if (edad >= 18) {
            System.out.println("Mayor de edad. Acceso permitido.");
        } else {
            System.out.println("Menor de edad (" + edad + " años). Acceso denegado.");
        }
    }

    public static void ejemploIfElseIfElse() {
        System.out.println("\n=== IF - ELSE IF - ELSE ===");
        double nota = 7.5;

        if (nota >= 9.0) {
            System.out.println("Nota " + nota + " → Excelente");
        } else if (nota >= 8.0) {
            System.out.println("Nota " + nota + " → Bueno");
        } else if (nota >= 6.0) {
            System.out.println("Nota " + nota + " → Aprobado");
        } else {
            System.out.println("Nota " + nota + " → Reprobado");
        }
    }

    public static void ejemploSwitch() {
        System.out.println("\n=== SWITCH CLÁSICO ===");
        int diaSemana = 3;

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día inválido");
        }
    }

    public static void ejemploSwitchExpression() {
        System.out.println("\n=== SWITCH EXPRESSION (Java 14+) ===");
        String estacion = "verano";

        String descripcion = switch (estacion) {
            case "primavera" -> "Flores y temperaturas suaves";
            case "verano"    -> "Calor intenso y días largos";
            case "otoño"     -> "Hojas cayendo y frescor";
            case "invierno"  -> "Frío y días cortos";
            default          -> "Estación desconocida";
        };

        System.out.println("Estación: " + estacion + " → " + descripcion);
    }
}