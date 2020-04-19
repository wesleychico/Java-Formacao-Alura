package br.com.alura;

public class TestaBuscaMatriculaAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Wesley Francisco", 34672);
        Aluno a2 = new Aluno("Tauany Zanca", 5617);
        Aluno a3 = new Aluno("Raphaela Costa", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem eh o aluno da matricula 34672");
        Aluno aluno = javaColecoes.buscaMatricula(34672);
        System.out.println("Aluno: " + aluno);
    }
}
