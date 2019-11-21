package model;

public class Aplicacao {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Maico", 03020305207, "19-04-01");
		
		ListaPaciente l1 = new ListaPaciente() ;
		
		Paciente p2 = new Paciente("Andre", 03020505207, "20-04-01");
		l1.adiciona(p1);
		l1.adiciona(p2);
		
		Paciente p3 = new Paciente("Tobias", 02220505207, "20-06-01");
		l1.adiciona(p3);
		
		Paciente p4 = new Paciente("Rosa", 2020505207, "20-10-01");
		l1.adiciona(p4);
		
		Paciente p5 = new Paciente("Ana", 2020505207, "20-10-01");
		l1.adiciona(p5);
		
		l1.imprimirListaNome();
		l1.imprimirPrimeiro();
		
		Atendimento a1 = new Atendimento(p3.getNome(), p3.getCpf());
		
		FilaAtendimentos fa1 = new FilaAtendimentos();
		fa1.enqueue(a1);
		
		fa1.imprimirFilaAtendimento();

	}
}
