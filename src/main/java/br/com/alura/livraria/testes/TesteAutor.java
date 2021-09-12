package br.com.alura.livraria.testes;

import java.time.LocalDate;

import br.com.alura.livraria.modelo.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		
		// Cria um objeto do tipo "Autor".
		Autor autor = new Autor(
				"Antonio Eloy", 
				"antonioeloy14@gmail.com", 
				LocalDate.of(1989, 6, 13),
				"Meu currículo");
		
		// Imprime o autor.
		System.out.println(autor);

	}

}
