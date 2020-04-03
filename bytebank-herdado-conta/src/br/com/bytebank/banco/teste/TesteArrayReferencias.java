package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Conta[] contas = new ContaCorrente[5];

        ContaCorrente conta1 = new ContaCorrente(22,11);
        contas[0] = conta1;

        ContaPoupanca conta2 = new ContaPoupanca(22, 22);
        contas[1] = conta2;


        System.out.println("Numero da primeira conta = " + contas[1].getNumero());

        // Forma literal de criar Array

        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(conta2.getNumero());
        System.out.println(ref.getNumero());

    }
}
