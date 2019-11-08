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

	public void adiciona(Paciente objeto) {
		NoPaciente novo = new NoPaciente(objeto);
		if (estaVazia()) {
			this.primeiro = novo;
		} else {
			int comparacao = this.primeiro.getObjeto().getNome().compareTo(novo.getObjeto().getNome());
			if (comparacao >= 0) { 	/* A condicao esta ">= 0", pois o retorno do metodo � em relacao ao primeiro
									termo!! */
				novo.setProximo(this.primeiro);
				this.primeiro = novo;
			} else {
				NoPaciente aux = this.primeiro;
				while (aux.getProximo() != null) {
					comparacao = aux.getProximo().getObjeto().getNome().compareToIgnoreCase(novo.getObjeto().getNome());
					if (comparacao >= 0) {
						novo.setProximo(aux.getProximo());
						aux.setProximo(novo);
						break;
					} else {
						aux = aux.getProximo();
					}
				}
				if (aux.getProximo() == null) {
					aux.setProximo(novo);
				}
			}
		}
	}

	public void imprimirListaNome() {
		NoPaciente aux = this.primeiro;
		while (aux != null) {
			System.out.println(aux.getObjeto().getNome());
			aux = aux.getProximo();
		}
	}

	public void imprimirPrimeiro() {
		System.out.println(this.primeiro.getObjeto().getNome());
	}

}
