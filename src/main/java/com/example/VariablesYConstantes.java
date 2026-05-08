package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        
        // TODO
        int edad = 18;
        double estatura = 1.75;
        System.out.println(edad); 
        System.out.println(estatura); 

    }

    public static void demostrarConvencionesNombres() {
        // TODO
         int edadPermitida = 20;
         int edadNoPermitida = -15;
         System.out.println("La edad permitida es:" + edadPermitida);
         System.out.println("La edad no permitida es:" + edadNoPermitida);
    }

    public static void demostrarConstantes() {
        // TODO
        final double PI = 3.14159265358979323846;
        
        double PI = 3.1899;

        // Este es el error que aparece a la hora de asignarle otro valor:
        //Exception in thread "main" java.lang.Error: Unresolved compilation problem: Duplicate local variable PI
  
    }
}