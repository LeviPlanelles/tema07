package com.leviplanelles.tema07;

import com.leviplanelles.tema07.clase.GenericDynamicArray;

public class Main {
    public static void main(String[] args) {
        GenericDynamicArray<Integer> numeros = new GenericDynamicArray<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(8);
        numeros.add(7);
        numeros.add(14);

        for (int numero : numeros) {
            System.out.println(numero);
        }
        numeros.next();
    }
}
