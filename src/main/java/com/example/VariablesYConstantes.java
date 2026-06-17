package com.example;

public class VariablesYConstantes {
<<<<<<< HEAD

    public static void demostrarDeclaracionAsignacion() {
        int edad = 18;
        double estatura = 1.75;
        String nombre = "Juan";

        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Nombre: " + nombre);

        // Reasignación
        edad = 21;
        System.out.println("Edad actualizada: " + edad);
    }

    public static void demostrarConvencionesNombres() {
        // camelCase para variables
        int edadPermitida = 20;
        int edadNoPermitida = -15;
        double salarioMensual = 2500000.0;
        boolean esMayorDeEdad = true;

        System.out.println("Edad permitida: " + edadPermitida);
        System.out.println("Edad no permitida: " + edadNoPermitida);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
    }

    public static void demostrarConstantes() {
        // final = constante, no se puede reasignar
        final double PI = 3.14159265358979323846;
        final int DIAS_SEMANA = 7;
        final String PAIS = "Colombia";

        System.out.println("PI: " + PI);
        System.out.println("Días en la semana: " + DIAS_SEMANA);
        System.out.println("País: " + PAIS);

        // PI = 3.1899; // ERROR: no se puede reasignar una constante final
        System.out.println("(Intentar reasignar 'final' genera error de compilación)");
=======
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

         System.out.println("La edad permitida es" + edadPermitida);
         System.out.println("La edad no permitida es" + edadNoPermitida);
      
    }

    public static void demostrarConstantes() {
        // TODO
        final double PI = 3.14159265358979323846;
        
        PI = 3.1899;

        System.out.println("El valor de PI es:" + PI);

        // Este es el error que aparece a la hora de asignarle otro valor:
        //Exception in thread "main" java.lang.Error: Unresolved compilation problem: Duplicate local variable PI
  
>>>>>>> 91f4b12783edb2ea8d3dcc67a0174c46fc8ae5cc
    }
}