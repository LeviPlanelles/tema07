package com.leviplanelles.tema07.ejercicios;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {5,3,54,4,3};
        System.out.println(Arrays.toString(copiaArray(numeros)));
        System.out.println();

        String[] nombres = {"levi",null,"marcoas","pobes"};
        System.out.println(Arrays.toString(cantidadCaracteresArray(nombres)));
        System.out.println();

        int num = 2;
        int[] arr = {-2,-1,0,1,2};
        dividirEntreArray(num,arr);
    }
    public static int[] copiaArray(int[] arr) {
        int[] copia = new int[arr.length];

        for (int i = 0; i <= copia.length; i++) {
            try {
                copia[i] = arr[i];
            }catch (IndexOutOfBoundsException iobe) {
                System.out.println("El array se ha salido de los indices");
            }
        }
        return copia;
    }
    public static String[] cantidadCaracteresArray(String[] arr) {
        String[] copia = new String[arr.length];

        for (int i = 0; i < copia.length; i++) {
            try {
                copia[i] = String.valueOf(arr[i].length());
            }catch (NullPointerException npe) {
                System.out.println("Ha encontrado un valor nulo");
            }
        }
        return copia;
    }

    public static void dividirEntreArray(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(num + " / " + arr[i] + " = " + num / arr[i]);
            }catch (ArithmeticException ae) {
                System.out.println("Division entre cero detectada");
            }
        }
    }

}
