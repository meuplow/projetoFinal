package model;

public class ListaPaciente {
	NoPaciente primeiro;

	public ListaPaciente() {
		this.primeiro = null;
	}

	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

//	public void adicionar(Paciente objeto) {
//		NoPaciente novo = new NoPaciente(objeto);
//		if (estaVazia()) {
//			this.primeiro = novo;
//		}
//		else {
//			NoPaciente aux = this.primeiro;
//			while (aux.getProximo() != null) {
//				aux = aux.getProximo();
//			}
//			aux.setProximo(novo);
//		}
//	}

//	public void adiciona(Paciente objeto) {
//		NoPaciente novo = new NoPaciente(objeto);
//		if (estaVazia()) {
//			this.primeiro = novo;
//		} else {
//			NoPaciente aux = this.primeiro.
//			NoPaciente anterior = null;
//			while (aux.getProximo() != null) {
//				if(aux.getObjeto() > novo.getObjeto()) {
//					break;
//				}
//			}
//		}
//
//	}

}
