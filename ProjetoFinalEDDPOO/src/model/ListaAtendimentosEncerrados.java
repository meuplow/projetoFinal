package model;

public class ListaAtendimentosEncerrados {
	NoAtendimentos primeiro;

	public ListaAtendimentosEncerrados() {
		this.primeiro = null;
	}

	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

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

	public void imprimirListaAtendimentosEncerrados() {
		NoAtendimentos aux = this.primeiro;
		while (aux != null) {
			System.out.println(aux.getObjeto());
			aux = aux.getProximo();
		}
	}

}
