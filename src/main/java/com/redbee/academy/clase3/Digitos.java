package com.redbee.academy.clase3;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        Long number = numero;
        String num = number.toString();
        return num.length();
    }
}
