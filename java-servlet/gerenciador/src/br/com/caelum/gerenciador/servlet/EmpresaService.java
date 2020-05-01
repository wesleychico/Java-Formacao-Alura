package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

import br.com.caelum.gerenciador.modelo.Banco;
import br.com.caelum.gerenciador.modelo.Empresa;

@WebServlet("/empresas")
public class EmpresaService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
	
//	--> Repondendo no Formato XML para aplicacao chamadora
		XStream xstream = new XStream();
		xstream.alias("empresaTeste", Empresa.class);
		String xml = xstream.toXML(empresas);
		
		response.setContentType("application/xml");
		response.getWriter().print(xml);
		
//	--> Repondendo no Formato Json para aplicacao chamadora		
//		Gson gson = new Gson();arg0
//		String json = gson.toJson(empresas);
//		
//		response.setContentType("application/json");
//		response.getWriter().print(json);
		
	}

}
