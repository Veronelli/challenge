package com.bewise.challenges.strings;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedCharacters {

    /**
     * El metodo debe retornar un booleano indicando si el parametro `cadena` cumple con alguna de las siguientes propiedades:
     * 1- Todos los caracteres aparecen la misma cantidad de veces.
     * Ejemplos: "aabbcc", "abcdef", "aaaaaa"
     * 2- Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece un vez mas o una vez menos.
     * Ejemplos: "aabbccc", "aabbc", "aaaaccccc"
     *
     * @param cadena la cadena a evaluar
     * @return booleano indicando si la cadena cumple con las propiedades
     */
    public Boolean isValid(String cadena) {
        Map<Character, Integer> letras = setMapCadena(cadena);
        Set<Integer> match = setMapMatch(letras);
        if(match.size() <= 2){
            return true;
        }
        return false;
    }

    private Map<Character,Integer> setMapCadena(String cadena){
        Map<Character, Integer> letras = new HashMap<>();

        for(int i = 0; i < cadena.length(); i++){
            Character letra = cadena.charAt(i);
            letras.put(letra, 0);

        }
        for(int i = 0; i < cadena.length(); i++){
            Character letra = cadena.charAt(i);
            Integer valor = ((Integer)letras.get(letra)) +1;
            letras.put(letra, valor);

        }
        return letras;

    }

    private Set<Integer> setMapMatch(Map<Character,Integer> letras){
        Set<Integer> set = new HashSet<>();
        int i = 0;

        for(Integer valor: letras.values()){
            set.add(valor);

        }
        return set;

    }
}



