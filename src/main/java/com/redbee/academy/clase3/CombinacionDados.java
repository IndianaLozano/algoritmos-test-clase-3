package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinacionDados {

    /**
     * Cuando tiramos 2 dados y sumamos los valores es posible generar un resultado comprendido entre 2 y 12.
     *
     * Generar un algoritmo que diga con cuantas combinaciones posibles se puede generar un valor dado.
     *
     * Por ej:
     * Para sacar 4 hay 3 combinaciones posibles: 1+3, 2+2 y 3+1
     * Para sacar 3 hay 2 combinaciones posibles: 1+2 y 2+1
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon2Dados(Integer valor) {

        List<Integer> dado1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> dado2 = Arrays.asList(1,2,3,4,5,6);
        Integer cantCombinacionesPosibles = 0;

        for(int i = 0; i < dado1.size(); i++){

            for(int j = 0; j < dado2.size(); j++){

                if(dado1.get(i) + dado2.get(j) == valor){
                    cantCombinacionesPosibles++;
                }

            }
        }

        return cantCombinacionesPosibles;

    }

    /**
     * Lo mismo pero con 3 dados
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon3Dados(Integer valor) {

        List<Integer> dado1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> dado2 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> dado3 = Arrays.asList(1,2,3,4,5,6);

        Integer cantCombinacionesPosibles = 0;

        for(int i = 0; i < dado1.size(); i++){

            for(int j = 0; j < dado2.size(); j++){

                for(int k = 0; k < dado3.size(); k++){

                    if(dado1.get(i) + dado2.get(j) + dado3.get(k) == valor){
                        cantCombinacionesPosibles++;
                    }
                }
            }
        }

        return cantCombinacionesPosibles;

    }
}
