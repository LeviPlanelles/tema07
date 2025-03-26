package com.leviplanelles.tema07.prueba;

import java.util.Scanner;

public class MainExcepciones {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean valido;
        do {
            try {
                System.out.print("Introduce una matricula porfavor: ");
                String matricula = scanner.nextLine();
                validarMatricula(matricula);
                valido = true;
            } catch (InvalidPlateException ipe) {
                System.out.println(ipe.getMessage());
                valido = false;
            }
        }while (!valido);
    }

    /**
     *
     * @param mensaje
     * @param min
     * @param max
     * @return
     * @throws NumberFormatException
     */
    public static int leerEnteroPasandoLaPelota(String mensaje, int min, int max) {
        boolean valido;
        int numero;
        System.out.println(mensaje);
        numero = Integer.parseInt(scanner.nextLine());
        valido = numero >= min && numero <= max;
        if (!valido) {
            System.err.println("El número debe estar entre " + min + " y " + max);
        }
        return numero;
    }


    public static int leerEntero(String mensaje, int min, int max) {
        boolean valido = false;
        int numero = Integer.MIN_VALUE;
        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                valido = numero >= min && numero <= max;
                if (!valido) {
                    System.err.println("El número debe estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Sólo números por favor");
            }
        } while (!valido);
        return numero;
    }

    public static void validarMatricula(String matricula) throws InvalidPlateException {
        int i;
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) throw new InvalidPlateException("Los cuatro primeros caracteres tienen que ser numeros");
        }
        if (!Character.isWhitespace(matricula.charAt(i++)) && matricula.length() == 7) throw new InvalidPlateException("Tienes que poner un espacio entre medias de los números y las letras");
        if (matricula.length() < 8) throw new InvalidPlateException("La matricula tiene que tener 4 números, un espacio y 3 letras");
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) throw new InvalidPlateException("Los tres últimos caracteres tienen que ser letras");
        }
    }
}
