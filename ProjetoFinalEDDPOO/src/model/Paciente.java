package model;

public class Paciente {
	// Atributos da Classe Paciente
	private String nome;
	private String cpf;
	private String data;

	// Construtor da Classe que recebe os devidos parâmetros
	public Paciente(String nome, String cpf, String data) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	// Construtor sem parâmetro
	public Paciente() {
	}

	// Métodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
