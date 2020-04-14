package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("loram-PrintStream", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.print("Testando classe PrintStream");
        ps.close();

        PrintWriter pw = new PrintWriter("loram-PrintWriter", "UTF-8");

        pw.println("Testando classes PrintWriter, usar println para pular de linha");
        pw.print("o print serve para imprimir as informacoes no arquivo sem pular de linha");

        ps.close();
        pw.close();
    }
}
