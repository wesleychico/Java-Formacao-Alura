package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("Lorem-saida"); //Gerar Arquivo
        Writer osw = new OutputStreamWriter(fos); // Transformar caracteres em byte
        BufferedWriter  bw = new BufferedWriter(osw); //Gravar Linha

        bw.write("Teste escrita no arquivo de saida");
        bw.newLine();
        bw.write("Teste Linha 2");
        bw.close();

    }
}
