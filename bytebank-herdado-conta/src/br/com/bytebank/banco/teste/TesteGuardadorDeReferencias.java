package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc1 = new ContaCorrente(22,22);
        guardador.adiciona(cc1);

        int tamanho = guardador.getPosicaoArray();
        System.out.println("Tamanho do Array: " +tamanho);

        Conta ref = (Conta) guardador.getReferencias(0);
        System.out.println(ref);
    }
}
