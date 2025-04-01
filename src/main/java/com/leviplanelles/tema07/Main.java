package com.leviplanelles.tema07;

import com.leviplanelles.tema07.clase.GenericDynamicArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        System.out.println(numeros.add(1));
        System.out.println(numeros.add(2));
        System.out.println(numeros.add(3));
        System.out.println(numeros.add(3));
        /*
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
        */

    }
}
