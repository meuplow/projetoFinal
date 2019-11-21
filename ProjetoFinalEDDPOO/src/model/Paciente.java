package model;

public class Paciente {
	private String nome;
	private String cpf;
	private String data;
	
	public Paciente(String nome, String cpf, String data) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}
	
	public Paciente() {}
	
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
