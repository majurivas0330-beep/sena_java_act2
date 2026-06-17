package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        System.out.println("=== WHILE ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteración while: " + i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        System.out.println("\n=== DO-WHILE ===");
        int i = 1;
        do {
            System.out.println("Iteración do-while: " + i);
            i++;
        } while (i <= 5);

        // Se ejecuta al menos una vez aunque la condición sea false
        int x = 100;
        do {
            System.out.println("Do-while ejecutado aunque x=" + x + " > 5");
        } while (x <= 5);
    }

    public static void ejemploForClasico() {
        System.out.println("\n=== FOR CLÁSICO ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For clásico i=" + i);
        }

        // Cuenta regresiva
        System.out.print("Cuenta regresiva: ");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ejemploForAnidado() {
        System.out.println("\n=== FOR ANIDADO (tabla de multiplicar 3x3) ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%2d x %2d = %2d    ", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void ejemploBreakContinue() {
        System.out.println("\n=== BREAK Y CONTINUE ===");

        System.out.print("Break (detener en 4): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) break;
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Continue (saltar pares): ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ejemploEtiquetas() {
        System.out.println("\n=== ETIQUETAS (break/continue con label) ===");

        externo:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Break externo en i=" + i + ", j=" + j);
                    break externo; // sale de ambos bucles
                }
                System.out.println("  i=" + i + ", j=" + j);
            }
        }

        System.out.println("Continúa con continue label:");
        bucleExterno:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) continue bucleExterno; // salta al siguiente i
                System.out.println("  i=" + i + ", j=" + j);
            }
        }
    }
}