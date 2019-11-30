package model;

import java.text.DecimalFormat;

public class Relatorios {
	private int cnt;
	private int mediaEspera;
	private int mediaConsulta;

	public Relatorios() {
		this.mediaConsulta = 0;
		this.mediaEspera = 0;
		this.cnt = 0;
	}

	public boolean atualizaMedias(int tempoEspera, int tempoConsulta) {
		this.cnt++;
		this.mediaEspera = (this.mediaEspera + tempoEspera) / this.cnt;
		this.mediaConsulta = (this.mediaConsulta + tempoConsulta) / this.cnt;
		return true;
	}

	public void imprimirMediaEspera() {
		DecimalFormat df = new DecimalFormat("00");
		long hora = this.mediaEspera / 3600;
		long minuto = (this.mediaEspera - (hora * 3600)) / 60;
		long segundo = this.mediaEspera - (hora * 3600) - (minuto * 60);
		System.out.println(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
	}
	
	public void imprimirMediaConsulta() {
		DecimalFormat df = new DecimalFormat("00");
		long hora = this.mediaEspera / 3600;
		long minuto = (this.mediaEspera - (hora * 3600)) / 60;
		long segundo = this.mediaEspera - (hora * 3600) - (minuto * 60);
		System.out.println(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
	}

}
