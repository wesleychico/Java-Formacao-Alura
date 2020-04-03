package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] arrayContas = new ContaCorrente[5];

        ContaCorrente conta1 = new ContaCorrente(22,11);
        ContaCorrente conta2 = new ContaCorrente(22,22);

        arrayContas[0] = conta1;
        arrayContas[1] = conta2;

        System.out.println("Primeira posicoes do Array = " + arrayContas[0]);
        System.out.println("Numero da primeira conta = " + arrayContas[0].getNumero());

        // Forma literal de criar Array

        int[] contas = {22,33,44};

        System.out.println("Array forma literal = " + contas[1]);

    }
}
