package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

import java.util.*;

public class TesteSortString {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22,33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22,44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Wesley");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22,11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Tauany");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22,22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Raphaela");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.sort(new TitularDaContaComparator());
        //Collections.sort(lista, new TitularDaContaComparator());

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }

    static class TitularDaContaComparator implements Comparator<Conta>{

        @Override
        public int compare(Conta c1, Conta c2) {
            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        }
    }
}
