package model;

public class FilaAtendimentos {
	private NoAtendimentos topo;

	// Construtor da Classe atribuindo null ao "topo" da fila
	public FilaAtendimentos() {
		this.topo = null;
	}

	// Metodo que verifica se a fila esta vazia
	public boolean isEmpty() {
		if (this.topo == null) {
			return true;
		}
		return false;
	}

	// Metodo que retorna o tamanho da fila
	public int size() {
		if (!isEmpty()) {
			int cnt = 1;
			for (NoAtendimentos aux = this.topo; aux.getProximo() != null; aux = aux.getProximo()) {
				cnt++;
			}
			return cnt;
		}
		return 0;
	}

	// Metodo que adiciona um novo objeto Atendimento no final da fila 
	public void enqueue(Atendimento objeto) {
		NoAtendimentos novo = new NoAtendimentos(objeto);
		if (isEmpty()) {
			this.topo = novo;
		} else {
			NoAtendimentos aux = this.topo;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	// Metodo que retira o primeiro objeto Atendimento da fila
	public NoAtendimentos dequeue() {
		if (!isEmpty()) {
			if (size() > 1) {
				NoAtendimentos aux = this.topo;
				this.topo = topo.getProximo();
				return aux;
			} else {
				clear();
				return null;
			}
		}
		return null;
	}

	// Metodo que retorna o primeiro elemento da fila, "topo"
	public NoAtendimentos head() {
		if (!isEmpty()) {
			return this.topo;
		}
		return null;
	}

	// Metodo que seta o "topo" como nulo
	public void clear() {
		this.topo = null;
	}
	
	// Metodo que apresenta os objetos da fila
	public void imprimirFilaAtendimento() {
		NoAtendimentos aux = this.topo;
		while (aux != null) {
			System.out.println(aux.getObjeto().getSenha() + " - " + aux.getObjeto().getPaciente());
			aux = aux.getProximo();
		}
	}
}