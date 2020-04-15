package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String curso1 = "Docker: Criando containers sem dor de cabeça";
        String curso2 = "Kafka: introducao a streams em microserviços";
        String curso3 = "Java parte 3: Entendendo henrença e interface";
        String curso4 = "Git: Controle e compartilhe seu código";

        ArrayList<String> cursos =  new ArrayList<>();

        //Adicionando elemento em uma lista
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //Removendo um elemento de uma lista
        cursos.remove(2);
        System.out.println(cursos);

        //Acessando elemento da lista
        System.out.println("O primeiro curso da lista eh o -> " + cursos.get(0));

        //Acessando os elementos
        for (int i = 0; i < cursos.size(); i++){
            System.out.println("Aulas: " + cursos.get(i));
        }

        //Ordenando a lista
        Collections.sort(cursos);

        System.out.println("******** Lista Ordenada **********");
        System.out.println(cursos);
    }
}
