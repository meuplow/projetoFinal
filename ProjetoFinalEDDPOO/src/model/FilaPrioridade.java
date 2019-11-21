package model;

public class FilaPrioridade {
	private NoAtendimentos topo;
	
	public FilaPrioridade(){
		this.topo = null;
	}

	public boolean isEmpty(){
		if(this.topo == null){
			return true;
		}
		return false;
	}
	
	public int size(){
		if(!isEmpty()){
			int cnt = 1;
			for(NoAtendimentos aux = this.topo; aux.getProximo() != null; aux = aux.getProximo()){
				cnt++;
			}
			return cnt;
		}return 0;
	}
	
	public void enqueue(Atendimento objeto){
		NoAtendimentos novo = new NoAtendimentos(objeto);
		if(isEmpty()){
			this.topo = novo;
		}else{
			NoAtendimentos aux = this.topo;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
	
	public NoAtendimentos dequeue(){
		if(!isEmpty()){
			if(size()>1){
				NoAtendimentos aux = this.topo;
				this.topo = topo.getProximo();
				return aux;
			}else{
				clear();
				return null;
			}
		}
		return null;
	}
	
	public NoAtendimentos head(){
		if(!isEmpty()){
			return this.topo;		
		}
		return null;
	}
	
	public void clear(){
		this.topo = null;
	}
	
	public void imprimirFila() {
		NoAtendimentos aux = this.topo;
		while (aux != null) {
			System.out.println(aux.getObjeto().getSenha()+" - "+aux.getObjeto().getPaciente());
			aux = aux.getProximo();
		}
	}
}
