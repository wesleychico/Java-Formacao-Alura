package br.com.caelum.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.gerenciador.modelo.Banco;

public class RemoveEmpresa {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Acao Removendo empresa");
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		//response.sendRedirect("entrada?acao=ListaEmpresas");
		
		return "redirect:entrada?acao=ListaEmpresas";
		
	}
}