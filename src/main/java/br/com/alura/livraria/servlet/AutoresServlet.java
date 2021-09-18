package br.com.alura.livraria.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.livraria.dao.AutorDao;
import br.com.alura.livraria.factory.ConnectionFactory;
import br.com.alura.livraria.modelo.Autor;

@WebServlet("/autores")
public class AutoresServlet extends HttpServlet {
	
	private AutorDao autorDao;
	
	public AutoresServlet() {
		this.autorDao = new AutorDao(new ConnectionFactory().getConnection());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Obt�m a lista de autores no banco de dados e adiciona essa lista na requisi��o.
		req.setAttribute("autores", this.autorDao.listar());
		
		// Envia os dados para a p�gina JSP.
		req.getRequestDispatcher("WEB-INF/jsp/autores.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Obt�m os dados passados no formul�rio.
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		LocalDate dataNascimento = LocalDate.parse(req.getParameter("dataNascimento"));
		String miniCurriculo = req.getParameter("miniCurriculo");
		
		// Cria um objeto do tipo "Autor".
		Autor autor = new Autor(nome, email, dataNascimento, miniCurriculo);
		
		// Adiciona o autor no banco de dados.
		this.autorDao.cadastrar(autor);
		
		// Encaminha requisi��o.
		resp.sendRedirect("autores");
		
	}

}
