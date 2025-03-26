package com.leviplanelles.tema07.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

    }
    public static int[] leerNumerosMeterEnArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        if (arr == null) {

        }

        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            array[i] = num;
        }

    }
}
