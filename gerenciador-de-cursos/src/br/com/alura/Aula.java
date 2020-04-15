package br.com.alura;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    //Reescrevendo o metodo toString
    @Override
    public String toString() {
        return "Aula {" +
                "titulo= '" + this.titulo + '\'' +
                ", tempo= " + this.tempo +
                '}';
    }
    //Definido criterio de comparacao
    @Override
    public int compareTo(Aula outrAula) {
        return this.titulo.compareTo(outrAula.getTitulo());
    }
}
