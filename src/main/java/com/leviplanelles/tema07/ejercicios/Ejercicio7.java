package com.leviplanelles.tema07.ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] letras = {"ab","ba","cd",null,"ef","dc"};
        mostrarCadenasArray(letras);
    }
    public static void mostrarCadenasArray(String[] cadenaCaracteres) {
        StringBuilder sb = new StringBuilder();
        for (String cadena : cadenaCaracteres) {
            if (cadena != null) {
                System.out.print(sb.append(cadena.charAt(0)).append(" "));
                sb.setLength(0);
            }
        }
    }
}
