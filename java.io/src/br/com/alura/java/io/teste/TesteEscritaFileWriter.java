package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        //FileWriter fw = new FileWriter("loram-saida");
        //BufferedWriter bw = new BufferedWriter(fw);
        BufferedWriter bw = new BufferedWriter(new FileWriter("loram-saida"));

        //fw.write("Teste escrita no arquivo de saida");
        // fw.write(System.lineSeparator());
        bw.write("Teste escrita no arquivo de saida");
        bw.newLine();
        bw.write("Instanciando o arquivo em uma linha");
        bw.newLine();
        bw.write("Comentando o system.lineSeparator");
        bw.close();

    }
}
