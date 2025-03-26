package com.leviplanelles.tema07.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        System.out.println(Arrays.toString(leerNumerosMeterEnArray(numeros)));

        int[] nums = null;
        System.out.println(Arrays.toString(leerNumerosMeterEnArray(nums)));

    }
    public static int[] leerNumerosMeterEnArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        boolean full = false;
        int index = 0;
        try {
            System.out.println("Mete números: ");
            do {
                try {
                    int num = Integer.parseInt(scanner.nextLine());
                    arr[index] = num;
                    index++;
                } catch (NumberFormatException nfe) {
                    System.err.println("Solo números enteros. ");
                    ;
                } catch (ArrayIndexOutOfBoundsException aiobe) {
                    System.err.println("Te has salido maquinote. ");
                    full = true;
                }
            } while (!full);
        }catch (NullPointerException npe) {
            System.out.println("El array esta vacio, saliendo. Desde excepción.");

        }
        return arr;
    }
}
