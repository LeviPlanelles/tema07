package com.leviplanelles.tema07.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingresa 10 números con decimales:");
        System.out.printf("El número más grande de los introducidos es %f",solicitarNumerosDecimales(10));

    }

    public static double solicitarNumerosDecimales(int cantidad){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double[] numeros = new double[cantidad];
        double nGrande = numeros[0];
        for (int i = 0; i < cantidad;) {
            try {
                numeros[i] = Double.parseDouble(scanner.nextLine());
                if (nGrande < numeros[i]) nGrande = numeros[i];
                i++;
            } catch (NumberFormatException e) {
                contador++;
            }
        }
        System.out.printf("Has fallado %d veces.\n",contador);
        return nGrande;
    }
}
