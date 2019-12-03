package model;

public class ListaAtendimentosEncerrados {
	NoAtendimentos primeiro;

	// Construtor da Classe atribuindo null ao "primeiro" da lista
	public ListaAtendimentosEncerrados() {
		this.primeiro = null;
	}

	// M�todo que verifica se a lista est� vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	// M�todo que adiciona um novo objeto Atendimento no final da Lista
	public void adiciona(Atendimento objeto) {
		NoAtendimentos novo = new NoAtendimentos(objeto);
		if (estaVazia()) {
			this.primeiro = novo;
		} else {
			NoAtendimentos aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	// M�todo que apresenta os objetos da lista
	public void imprimirListaAtendimentosEncerrados() {
		NoAtendimentos aux = this.primeiro;
		while (aux != null) {
			System.out.println(aux.getObjeto());
			aux = aux.getProximo();
		}
	}

}
