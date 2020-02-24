package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		Conta conta = new ContaCorrente (123,321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch (Exception ex) {
			System.out.println("Exception: " +ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
	}
}
