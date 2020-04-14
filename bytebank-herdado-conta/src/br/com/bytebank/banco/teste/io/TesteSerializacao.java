package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Wesley Chico");
        cliente.setProfissao("DEV");
        cliente.setCpf("12345678900");

        ContaCorrente cc = new ContaCorrente(22, 11);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();





    }
}
