package com.bewise.challenges.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    /**
     * Se debe ordenar primero por puntuación de manera descendente, luego por nombre de manera ascendente.
     *
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
    public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores) {
        return jugadores.parallelStream()
                .sorted(Comparator.comparing(Jugador::getPuntuacion, Comparator.reverseOrder())
                        .thenComparing(Jugador::getNombre))
                .collect(Collectors.toList());
    }

    /**
     * Se debe ordenar primero por puntuación de manera descendente. Cuando 2 jugadores tienen igual cantidad de puntos,
     * el que tiene menos perdidas se lo considerara el mayor. Luego a igual puntos y perdidas se segxxuirá usando el
     * nombre de manera ascendente.
     *
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
    public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores) {
        return jugadores.parallelStream()
                .sorted(Comparator.comparing(Jugador::getPuntuacion, Comparator.reverseOrder())
                        .thenComparing(Jugador::getPerdidas))
                .collect(Collectors.toList());
    }
}
