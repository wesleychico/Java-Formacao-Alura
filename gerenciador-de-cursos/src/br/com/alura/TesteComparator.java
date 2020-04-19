package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteComparator {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Tauany", 27);
        Funcionario f2 = new Funcionario("Wesley", 29);
        Funcionario f3 = new Funcionario("Raphaela", 22);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterator = funcionarios.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getNome());
        }

    }
}
