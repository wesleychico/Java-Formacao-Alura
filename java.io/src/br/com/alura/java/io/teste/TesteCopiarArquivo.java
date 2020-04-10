package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        //InputStream fis = new FileInputStream("lorem"); //Leitura de um arquivo
        InputStream fis = System.in; // Leitura no console
        Reader isr = new InputStreamReader(fis); // Leitura do console
        BufferedReader br = new BufferedReader(isr);

        // OutputStream fos = new FileOutputStream("Lorem-saida"); // Gerando saida no arquivo

        OutputStream fos = System.out; // Gerando saida no console
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        OutputStream fos2 = new FileOutputStream("Lorem-saida"); //Gerar saida no arquivo tambem
        Writer osw2 = new OutputStreamWriter(fos2); // Transformando caracteres em byte
        BufferedWriter bw2 = new BufferedWriter(osw2);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            bw2.write(linha);
            bw2.newLine();
            bw2.flush();
            linha = br.readLine();
        }
        br.close();
        bw.close();
        bw2.close();
    }
}
