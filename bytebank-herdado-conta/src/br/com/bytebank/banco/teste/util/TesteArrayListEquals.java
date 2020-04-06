package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);
        Conta cc3 = new ContaCorrente(22, 44);

        lista.add(cc1);


        boolean igual = cc1.equals(cc2);
        System.out.println("Ja existe? " +igual);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
