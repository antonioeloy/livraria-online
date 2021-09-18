package br.com.alura.livraria.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.livraria.modelo.Autor;

public class AutorDao {
	
	private Connection conexao;
	
	public AutorDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Autor autor) {
		
		try {
			
			// Monta o comando SQL (parametrizado).
			String sql = "insert into autores(nome,email,data_nascimento,mini_curriculo) values(?, ?, ?, ?);";
			
			// Prepara o comando SQL (substitui os parâmetros).
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ps.setString(1, autor.getNome());
			ps.setString(2, autor.getEmail());
			ps.setDate(3, Date.valueOf(autor.getDataNascimento()));
			ps.setString(4, autor.getMiniCurriculo());
			
			// Executa o comando SQL.
			ps.execute();
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar um autor no banco de dados.");
			e.printStackTrace();
		}
		
	}
	
	public List<Autor> listar() {
		
		try {
			
			// Monta o comando SQL.
			String sql = "select * from autores;";
			
			// Prepara o comando SQL.
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			
			// Executa o comando SQL.
			ResultSet rs = ps.executeQuery();
			
			// Cria uma lista de autores.
			List<Autor> autores = new ArrayList<>();
			
			// Percorre o conjunto de resultados provenientes da consulta ao banco de dados e monta a lista de autores.
			while (rs.next()) {
				Autor autor = new Autor();
				
				autor.setNome(rs.getString("nome"));
				autor.setEmail(rs.getString("email"));
				autor.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
				autor.setMiniCurriculo(rs.getString("mini_curriculo"));
				
				autores.add(autor);
			}
			
			// Retorna a lista de autores.
			return autores;
			
		} catch (SQLException e) {
			System.out.println("Erro ao listar autores.");
			throw new RuntimeException(e);
		}
		
	}

}
