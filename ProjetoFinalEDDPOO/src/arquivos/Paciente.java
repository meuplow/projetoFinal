package arquivos;

public class Paciente {
	private String nome;
	private long cpf;
	private String data;
	
	public Paciente(String nome, long cpf, String data) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
