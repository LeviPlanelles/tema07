package com.leviplanelles.tema07.ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 2;
        int[] arr = {-2,-1,0,1,2};
        dividirEntreArray(num,arr);
    }
    public static void dividirEntreArray(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] != 0) {
                    System.out.println(num + " / " + arr[i] + " = " + num / arr[i]);
                }
            }catch (ArithmeticException ae) {
                System.out.println("Division entre cero detectada");
            }
        }
    }

}
