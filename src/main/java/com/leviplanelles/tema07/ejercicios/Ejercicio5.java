package com.leviplanelles.tema07.ejercicios;

import com.leviplanelles.tema07.lib.IO;

import java.util.Scanner;

public class Ejercicio5 {
    private static class Alumno {
        private final String nombre;
        private final int edad;
        private final double altura;

        private Alumno(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Alumno: " +
                    "nombre = " + nombre +
                    ", edad = " + edad +
                    ", altura = " + altura + ".";
        }
    }

    public static void main(String[] args) {
        Alumno alumno1 = crearAlumno();
        Alumno alumno2 = crearAlumno();
        System.out.println(alumno1);
        System.out.println(alumno2);
    }
    public static Alumno crearAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String nombre = scanner.nextLine();
        int edad = 0;
        double altura = 0;
        boolean valido;
        do {
            try {
                System.out.print("Edad: ");
                edad = Integer.parseInt(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Intentalo de nuevo.");;
                valido = false;
            }
        }while(!valido);

        do {
            try {
                System.out.print("Altura: ");
                altura = Double.parseDouble(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Intentalo de nuevo.");;
                valido = false;
            }
        }while(!valido);
        return new Alumno(nombre,edad,altura);
    }
}
