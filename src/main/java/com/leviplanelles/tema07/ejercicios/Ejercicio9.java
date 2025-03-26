package com.leviplanelles.tema07.ejercicios;

import java.util.Arrays;

public class Ejercicio9 {
    private static class DivisionByZeroException extends ArithmeticException {
        private DivisionByZeroException(String msg) {
            super(msg);
        }
    }
    private static class OutOfBoundsException extends IndexOutOfBoundsException {
        private OutOfBoundsException(String msg) {
            super(msg);
        }
    }
    private static class NullPointerInStringArray extends NullPointerException {
        private NullPointerInStringArray(String msg) {
            super(msg);
        }
    }
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
            }catch (OutOfBoundsException obe) {
                throw new OutOfBoundsException("El array se ha desbordado");
            }
        }
        return copia;
    }
    public static String[] cantidadCaracteresArray(String[] arr) {
        String[] copia = new String[arr.length];

        for (int i = 0; i < copia.length; i++) {
            try {
                copia[i] = String.valueOf(arr[i].length());
            }catch (NullPointerInStringArray npe) {
                throw new NullPointerInStringArray("Se ha encontrado un null en el array de Strings");
            }
        }
        return copia;
    }

    public static void dividirEntreArray(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(num + " / " + arr[i] + " = " + num / arr[i]);
            }catch (DivisionByZeroException ae) {
                throw new DivisionByZeroException("Division entre cero detectada");
            }
        }
    }
}
