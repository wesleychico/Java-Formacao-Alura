package br.com.alura;

import sun.util.locale.provider.AuxLocaleProviderAdapter;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        //Criando lista a partir de um objeto proprio  - Classe Aula
        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        //ordenando lista no java 8
        aulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println("**** Lista Ordenada por titulo  ******");
        System.out.println(aulas);

        System.out.println("**** Lista Ordenada por tempo  ******");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);


    }
}
