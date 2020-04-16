package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        List<Aula> TesteAulas = javaColecoes.getAulas();
        System.out.println(TesteAulas);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        System.out.println(TesteAulas);

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes);

    }
}
