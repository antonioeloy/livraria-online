package br.com.alura.livraria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {

		try {
			String url = "jdbc:mysql://localhost:3306/livraria";
			String usuario = "root";
			String senha = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			return conexao;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Erro ao estabelecer conexão com o banco de dados.");
			throw new RuntimeException(e);
		}
		
	}

}
