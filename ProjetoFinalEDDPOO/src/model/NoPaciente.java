package model;

public class NoPaciente {
	Paciente objeto;
	NoPaciente proximo;

	public NoPaciente(Paciente objeto) {
		this.objeto = objeto;
		this.proximo = null;
	}

	public NoPaciente(Paciente objeto, NoPaciente proximo) {
		this.objeto = objeto;
		this.proximo = proximo;
	}

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
