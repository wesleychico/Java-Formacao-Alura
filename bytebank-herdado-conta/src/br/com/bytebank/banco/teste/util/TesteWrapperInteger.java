package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer idadeRef = 29; //autoboxing, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); //que locura!! unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); //OK
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0); //unboxing
        Integer i2 = lista.get(1); //OK

        System.out.println(i1);
        System.out.println(i2);

        Integer valorRef = Integer.valueOf(33); //delegando a criacao para o metodo valueOf
        int valorPri = valorRef.intValue();//desembrulhando, pega o valor primitivo do objeto wrapper

        System.out.println(valorPri);

        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44");//parseando e devolvendo primitivo
        System.out.println(iParseado1);
        System.out.println(iParseado2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

    }
}
