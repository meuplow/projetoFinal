package model;

public class NoPaciente {
	Paciente objeto;
	NoPaciente proximo;

	// Construtor da classe que recebe um objeto Paciente
	public NoPaciente(Paciente objeto) {
		this.objeto = objeto;
		this.proximo = null;
	}

	// Segundo construtor da Classe que recebe um objeto Paciente e um
	// objeto NoPaciente
	public NoPaciente(Paciente objeto, NoPaciente proximo) {
		this.objeto = objeto;
		this.proximo = proximo;
	}

	// Métodos getters e setters
	public Paciente getObjeto() {
		return objeto;
	}

	public void setObjeto(Paciente objeto) {
		this.objeto = objeto;
	}

	public NoPaciente getProximo() {
		return proximo;
	}

	public void setProximo(NoPaciente proximo) {
		this.proximo = proximo;
	}

}
