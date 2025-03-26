package com.leviplanelles.tema07.prueba;

import java.util.InputMismatchException;

public class InvalidPlateException extends InputMismatchException {
    public InvalidPlateException(String mensaje) {
        super(mensaje);
    }
}
