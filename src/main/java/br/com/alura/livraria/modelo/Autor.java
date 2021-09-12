package br.com.alura.livraria.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {

	private String nome;

	private String email;

	private LocalDate dataNascimento;

	private String miniCurriculo;

	public Autor() {

	}

	public Autor(String nome, String email, LocalDate dataNascimento, String miniCurriculo) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.miniCurriculo = miniCurriculo;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", miniCurriculo="
				+ miniCurriculo + "]";
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMiniCurriculo() {
		return this.miniCurriculo;
	}

	public void setMiniCurriculo(String miniCurriculo) {
		this.miniCurriculo = miniCurriculo;
	}

}
