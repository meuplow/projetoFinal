package model;

import java.text.DecimalFormat;

public class Relatorios {
	private int cnt;
	private long mediaEspera;
	
	public Relatorios() {
		this.mediaEspera = 0;
		this.cnt = 0;
	}
	
	public long novaMediaEspera(long tempoEspera) {
		this.cnt++;
		this.mediaEspera = this.mediaEspera+tempoEspera/this.cnt;
		return this.mediaEspera;
	}
	
	public void imprimirMediaEspera() {
		DecimalFormat df = new DecimalFormat("00");
		long hora = this.mediaEspera/3600;
		long minuto = (this.mediaEspera - (hora*3600))/60;
		long segundo = this.mediaEspera - (hora*3600) - (minuto*60);
		System.out.println(df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
	}
	
	
}
