package model;

public class NoAtendimentos {
	private Atendimento objeto;
	private NoAtendimentos proximo;

	public NoAtendimentos(Atendimento objeto, NoAtendimentos proximo) {
		this.objeto = objeto;
		this.proximo = proximo;
	}

	public NoAtendimentos(Atendimento objeto) {
		this.objeto = objeto;
		this.proximo = null;
	}

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
