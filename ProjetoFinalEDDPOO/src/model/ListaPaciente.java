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
			if (comparacao >= 0) { /*
									 * A condicao esta ">= 0", pois o retorno do metodo é em relacao ao primeiro
									 * elemento!!
									 */
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

	public Paciente buscarPaciente(String cpf) {
		if(!estaVazia()){
			NoPaciente aux = this.primeiro;
			while(aux.getProximo()!=null) {
				if(aux.getObjeto().getCpf().equalsIgnoreCase(cpf)){
					return aux.getObjeto();
				}aux = aux.getProximo();
			}/*
			if (this.primeiro.getObjeto().getCpf().equals(cpf)) {
				return this.primeiro.getObjeto();
			} else {
				NoPaciente auxP = this.primeiro;
				while (auxP.getProximo() != null) {
					if (auxP.getObjeto().getCpf().equals(cpf)) {
						return auxP.getObjeto();
					} else {
						auxP = auxP.getProximo();
					}
				}
			}*/
		}	
		return null;
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
