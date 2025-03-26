package com.leviplanelles.tema07.ejercicios;



import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = solicitarNumeros("Pon númeritos anda:");
        System.out.println(numeros);
    }
    public static ArrayList<Double> solicitarNumeros(String mensaje) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                if (numero >= 0) numeros.add(numero);
            } catch (NumberFormatException nfe) {
                System.out.println("Solo números por favor!");
                numero = 1;
            }
        } while (numero >= 0);

        return numeros;

    }
}
