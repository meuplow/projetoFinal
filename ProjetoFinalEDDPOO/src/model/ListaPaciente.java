package model;

public class ListaPaciente {
	NoPaciente primeiro;

	// Construtor da Classe atribuindo null ao "primeiro" da lista
	public ListaPaciente() {
		this.primeiro = null;
	}

	// Método que verifica se a lista está vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	// Método que adiciona um objeto Paciente em ordem alfabética
	/* Foi utilizado a função CompareTo, a qual compara o primeiro caracter
	*  de um elemento com o primeiro caracter do segundo elemento. Caso o 
	*  caracter do primeiro elemento seja menor, logo venha antes no alfabeto,
	*  a função retorna -1. Caso sejam iguais, retorna 0, e maior retorna 1
	*/
	public void adiciona(Paciente objeto) {
		NoPaciente novo = new NoPaciente(objeto);
		if (estaVazia()) {
			this.primeiro = novo;
		} else {
			int comparacao = this.primeiro.getObjeto().getNome().compareTo(novo.getObjeto().getNome());
			if (comparacao >= 0) { /*
									 * A condicao esta ">= 0", pois o retorno do metodo é em relação ao primeiro
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

	// Método que busca um Paciente através de seu CPF
	public Paciente buscarPaciente(String cpf) {
		if (!estaVazia()) {
			if (this.primeiro.getObjeto().getCpf().equalsIgnoreCase(cpf)) {
				return this.primeiro.getObjeto();
			} else {
				NoPaciente aux = this.primeiro;
				while (aux != null) {
					if (aux.getObjeto().getCpf().equalsIgnoreCase(cpf)) {
						return aux.getObjeto();
					}
					aux = aux.getProximo();
				}
			}
		}
		return null;
	}

	// Método que imprime os objetos da lista em ordem alfabética
	public void imprimirListaNome() {
		NoPaciente aux = this.primeiro;
		while (aux != null) {
			System.out.println(aux.getObjeto().getNome());
			aux = aux.getProximo();
		}
	}
	// Método que imprime o primeiro elemento da lista
	public void imprimirPrimeiro() {
		System.out.println(this.primeiro.getObjeto().getNome());
	}

}
