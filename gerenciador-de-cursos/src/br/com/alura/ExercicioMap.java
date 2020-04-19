package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(29, "Wesley Chico");
        pessoas.put(27, "Tauany Godoy");
        pessoas.put(25, "Raphaela Silva");
        pessoas.put(11, "Gabriel Oliveira");

        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

    }
}
