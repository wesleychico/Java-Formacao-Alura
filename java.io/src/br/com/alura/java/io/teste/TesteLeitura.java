package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("lorem"); // Transformar Bytes em Caracteres
        InputStreamReader isr = new InputStreamReader(fis); // Transformar Bytes em Caracteres
        BufferedReader br = new BufferedReader(isr); // Ler a linha toda

        String linha = br.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
