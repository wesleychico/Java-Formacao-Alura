package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {

        //List<Conta> lista = new ArrayList<Conta>();
        //List<Conta> lista = new LinkedList<Conta>();
        //Collection<Conta> lista = new Vector<Conta>();
        List<Conta> lista = new Vector<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc1 = new ContaCorrente(22,22);
        lista.add(cc1);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33,311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33,322);
        lista.add(cc4);

        for (int i= 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("------------------------");

        for (Object oRef : lista){
            System.out.println(oRef);
        }
        System.out.println("Tamanho: " + lista.size());
    }
}
