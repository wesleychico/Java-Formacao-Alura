package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];
        
        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idades4 = idades[3];

        System.out.println("Posicao 4 do array= " + idades4);
        System.out.println("Tamanho do array= " + idades.length);

    }
}
