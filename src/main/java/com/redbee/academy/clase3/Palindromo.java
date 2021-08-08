package com.redbee.academy.clase3;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindromo.
     * <p>
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        String word = palabra;
        Boolean palindromo = false;
        word = word.replace(" ", "");
        while (word.length() > 0) {
            char c1 = Character.toUpperCase(word.charAt(0));
            char c2 = Character.toUpperCase(word.charAt(word.length() - 1));
            if (c1 == c2) {
                palindromo = true;
            }
            word = word.substring(1, word.length() - 2);
        }
        return palindromo;
    }
}
