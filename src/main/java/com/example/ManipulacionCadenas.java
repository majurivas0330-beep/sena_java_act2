package com.example;

public class ManipulacionCadenas {
<<<<<<< HEAD

    /**
     * Demuestra distintas formas de concatenar cadenas en Java.
     */
    public static void demostrarConcatenacion() {
        String nombre = "Ana";
        String apellido = "Gómez";

        // Forma 1: usando el operador +
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Con operador +: " + nombreCompleto);

        // Forma 2: usando el método concat()
        String nombreCompleto2 = nombre.concat(" ").concat(apellido);
        System.out.println("Con concat(): " + nombreCompleto2);

        // Forma 3: usando String.format() para combinar texto y variables
        int edad = 28;
        String presentacion = String.format("%s tiene %d años", nombreCompleto, edad);
        System.out.println("Con String.format(): " + presentacion);

        // Forma 4: concatenando con otros tipos de datos (Java convierte automáticamente)
        String mensaje = "El resultado es: " + 42 + ", y es " + true;
        System.out.println("Concatenación con otros tipos: " + mensaje);

        // Cuidado con el orden al mezclar + con números
        String resultadoCurioso = "Suma: " + 2 + 3; // concatena "2" y "3" como texto
        String resultadoCorrecto = "Suma: " + (2 + 3); // primero suma, luego concatena
        System.out.println(resultadoCurioso + "  <-- concatenación de texto, no suma");
        System.out.println(resultadoCorrecto + "  <-- con paréntesis se suma primero");
    }
    
    public static void demostrarMetodosUtiles() {
        String texto = "  Hola Mundo desde Java  ";

        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("length(): " + texto.length());
        System.out.println("trim(): \"" + texto.trim() + "\"");
        System.out.println("toUpperCase(): \"" + texto.toUpperCase() + "\"");
        System.out.println("toLowerCase(): \"" + texto.toLowerCase() + "\"");

        String textoLimpio = texto.trim();
        System.out.println("\ncontains(\"Mundo\"): " + textoLimpio.contains("Mundo"));
        System.out.println("indexOf(\"Mundo\"): " + textoLimpio.indexOf("Mundo"));
        System.out.println("replace(\"Mundo\", \"Planeta\"): "
                + textoLimpio.replace("Mundo", "Planeta"));
        System.out.println("substring(5): \"" + textoLimpio.substring(5) + "\"");
        System.out.println("substring(0, 4): \"" + textoLimpio.substring(0, 4) + "\"");
        System.out.println("charAt(0): " + textoLimpio.charAt(0));

        String[] palabras = textoLimpio.split(" ");
        System.out.println("\nsplit(\" \") produce " + palabras.length + " partes:");
        for (String palabra : palabras) {
            System.out.println(" -> " + palabra);
        }

        System.out.println("\nequals(\"hola mundo desde java\"): "
                + textoLimpio.equals("hola mundo desde java"));
        System.out.println("equalsIgnoreCase(\"hola mundo desde java\"): "
                + textoLimpio.equalsIgnoreCase("hola mundo desde java"));
        System.out.println("isEmpty(): " + textoLimpio.isEmpty());
        System.out.println("startsWith(\"Hola\"): " + textoLimpio.startsWith("Hola"));
        System.out.println("endsWith(\"Java\"): " + textoLimpio.endsWith("Java"));
    }

    public static void demostrarInmutabilidad() {
        String original = "Hola";
        String referencia = original;

        System.out.println("original: " + original);
        System.out.println("referencia (apunta al mismo objeto): " + referencia);

        // Esta operación NO modifica "original"; crea un nuevo String
        // y lo asigna a la variable "original".
        original = original.concat(" Mundo");

        System.out.println("\nDespués de original.concat(\" Mundo\"):");
        System.out.println("original (ahora es un nuevo objeto): " + original);
        System.out.println("referencia (sigue intacta, apunta al String original): " + referencia);

        // Demostración con identidad de objetos (==) vs igualdad de contenido (equals)
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("\na == b (mismo literal, mismo pool de Strings): " + (a == b));
        System.out.println("a == c (c creado con 'new', objeto distinto): " + (a == c));
        System.out.println("a.equals(c) (mismo contenido): " + a.equals(c));

        System.out.println("\nConclusión: cada vez que 'modificamos' un String, " +
                "en realidad se crea un nuevo objeto en memoria. El String original " +
                "nunca cambia mientras existan referencias hacia él.");
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");
        System.out.println("Después de varios append(): " + sb.toString());

        sb.insert(5, " hermoso"); // inserta texto en una posición específica
        System.out.println("Después de insert(5, \" hermoso\"): " + sb.toString());

        sb.replace(0, 4, "Adiós"); // reemplaza un rango de caracteres
        System.out.println("Después de replace(0, 4, \"Adiós\"): " + sb.toString());

        sb.reverse();
        System.out.println("Después de reverse(): " + sb.toString());
        sb.reverse(); // lo regresamos a su estado anterior para seguir el ejemplo

        sb.deleteCharAt(0);
        System.out.println("Después de deleteCharAt(0): " + sb.toString());

        System.out.println("length() actual: " + sb.length());

        long inicio = System.nanoTime();
        String resultadoString = "";
        for (int i = 0; i < 10_000; i++) {
            resultadoString += i; // ineficiente: crea un nuevo String cada vez
        }
        long finString = System.nanoTime();

        StringBuilder resultadoBuilder = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            resultadoBuilder.append(i); // eficiente: modifica el mismo buffer interno
        }
        long finBuilder = System.nanoTime();

        System.out.println("\nTiempo con String (+=): " + (finString - inicio) / 1_000_000.0 + " ms");
        System.out.println("Tiempo con StringBuilder: " + (finBuilder - finString) / 1_000_000.0 + " ms");
        System.out.println("StringBuilder suele ser notablemente más rápido en bucles grandes.");
=======
    public static void demostrarConcatenacion() {
        // TODO
    }

    public static void demostrarMetodosUtiles() {
        // TODO
    }

    public static void demostrarInmutabilidad() {
        // TODO
    }

    public static void usarStringBuilder() {
        // TODO
>>>>>>> 91f4b12783edb2ea8d3dcc67a0174c46fc8ae5cc
    }
}