package model;

import java.text.DecimalFormat;

public class Relatorios {
	private int cnt;
	private int mediaEspera;
	private int mediaAtendimento;

	// Construtor da classe 
	public Relatorios() {
		this.mediaAtendimento = 0;
		this.mediaEspera = 0;
		this.cnt = 0;
	}

	// M�todo utilizado para atualizar as m�dias de tempos
	public boolean atualizaMedias(int tempoEspera, int tempoAtendimento) {
		this.cnt++;
		this.mediaEspera = (this.mediaEspera + tempoEspera) / this.cnt;
		this.mediaAtendimento = (this.mediaAtendimento + tempoAtendimento) / this.cnt;
		return true;
	}

	// M�todo que retorna o tempo m�dio de espera para ser atendido de forma adequada
	public String retornaMediaEspera() {
		DecimalFormat df = new DecimalFormat("00");
		int hora = this.mediaEspera / 3600;
		int minuto = (this.mediaEspera - (hora * 3600)) / 60;
		int segundo = this.mediaEspera - (hora * 3600) - (minuto * 60);
		String aux = df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo);
		return aux;
	}

	// M�todo que retorna o tempo m�dio das consulta de forma adequada
	public String retornaMediaAtendimento() {
		DecimalFormat df = new DecimalFormat("00");
		int hora = this.mediaAtendimento / 3600;
		int minuto = (this.mediaAtendimento - (hora * 3600)) / 60;
		int segundo = this.mediaAtendimento - (hora * 3600) - (minuto * 60);
		String aux = df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo);
		return aux;
	}

}
