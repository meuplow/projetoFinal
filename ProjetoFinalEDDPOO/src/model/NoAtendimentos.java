package model;

public class NoAtendimentos {
	private Atendimento objeto;
	private NoAtendimentos proximo;

	// Construtor da Classe que recebe um objeto Atendimento e um
	// objeto NoAtendimento
	public NoAtendimentos(Atendimento objeto, NoAtendimentos proximo) {
		this.objeto = objeto;
		this.proximo = proximo;
	}

	// Segundo Construtor que recebe apenas um obejto Atendimento
	public NoAtendimentos(Atendimento objeto) {
		this.objeto = objeto;
		this.proximo = null;
	}

	// Getters e Setters da classe
	public Atendimento getObjeto() {
		return objeto;
	}

	public void setObjeto(Atendimento objeto) {
		this.objeto = objeto;
	}

	public NoAtendimentos getProximo() {
		return proximo;
	}

	public void setProximo(NoAtendimentos proximo) {
		this.proximo = proximo;
	}
}
