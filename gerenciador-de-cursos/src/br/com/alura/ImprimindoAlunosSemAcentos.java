package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //Adicionando alunos
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");
        alunos.add("Chico");

        //Imprimir o tamanho da colecao
        System.out.println("Tamanho da colecao: " + alunos.size());

        //Adicionando um aluno ja existente na colecao
        boolean adicionou = alunos.add("Chico");
        System.out.println("Chico foi adicionado ao Set? " + adicionou);

        //Imprimir o tamanho da colecao
        System.out.println("Tamanho da colecao: " + alunos.size());

        // imprimir os alunos da colecao
        for (String aluno: alunos) {
            System.out.println(aluno);
        }


    }
}
