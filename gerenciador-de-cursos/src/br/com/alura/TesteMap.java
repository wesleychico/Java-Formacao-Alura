package br.com.alura;

import java.util.*;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...

        System.out.println("******** Imprimir Lista de Chaves *********");
        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome : chaves) {
            System.out.println(nome);
        }

        System.out.println("******* Imprimir Lista de Valores *******");

        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer valor : valores) {
            System.out.println(valor);
        }

        System.out.println("******* Imprimir Associacoes *******");

        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Map.Entry<String, Integer> associacao : associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
