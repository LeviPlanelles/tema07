package com.leviplanelles.tema07.ejercicios;

import com.leviplanelles.tema07.lib.IO;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeros = solicitarNumeros("Pon númeritos anda:");
        System.out.println(numeros);
    }
    public static int solicitarNumeros(String mensaje) {
        int nGrande = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (nGrande < num) nGrande = num;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        return nGrande;
    }
}
