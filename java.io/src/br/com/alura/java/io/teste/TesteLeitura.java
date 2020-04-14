package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("lorem"); // Ler arquivo de entrada (Byte)
        Reader isr = new InputStreamReader(fis, "UTF-8"); // Transformar Bytes em Caracteres
        BufferedReader br = new BufferedReader(isr); // Ler a linha toda

        String linha = br.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
