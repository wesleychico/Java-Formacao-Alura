package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
			
		ContaCorrente cc = new ContaCorrente(111, 00001);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 00002);
		cp.deposita(200.0);
		
		cc.transfere(90.0, cp);
		
		System.out.println("******** Saldo Final após transferência ********");
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		
		
	}
}
