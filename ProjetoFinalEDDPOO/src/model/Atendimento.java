package model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Atendimento {
	private int senha;
	private Paciente paciente;
	private Date data;
	private Date hora;
	
	public Atendimento(Paciente cpf, int senha) {
		Date dataAtual = new Date();
		this.senha = senha;
		this.paciente = cpf;
		this.data = dataAtual;
		this.hora = dataAtual;
	}
	
	public Atendimento() {
	}
	
	public Date retornaHoraAtual() {
		Date dateSaida = new Date();
		return dateSaida;
	}
	
	//Vou arrumar 
	/*
	public Date retornaHoraFimConsulta() {
		Date dateSaida = new Date();
		long aux = Math.abs(retornaHoraAtual().getTime());
		long segundosLong = TimeUnit.SECONDS.convert(aux, TimeUnit.MILLISECONDS);
		int segundos = (int) segundosLong;
		Random gerador = new Random();
		int acresc = gerador.nextInt(10800)+600;
		segundos+= acresc;
		return dateSaida;
	}
	
	public long retornaDateFimConsulta() {
		long diferenca = Math.abs(retornaHoraAtual().getTime());
		long segundos = TimeUnit.SECONDS.convert(diferenca, TimeUnit.MILLISECONDS);
		Random gerador = new Random();
		long aleatorio = gerador.nextInt(10800)+600;
		long data = segundos+aleatorio;
		return data;
	}
	
	public void teste() {
		long diferenca = Math.abs(retornaHoraAtual().getTime());
		long segundos = TimeUnit.SECONDS.convert(diferenca, TimeUnit.MILLISECONDS);
		Random gerador = new Random();
		long aleatorio = gerador.nextInt(10800)+600;
		long data = segundos+aleatorio;
		System.out.println(data);
		System.out.println(aleatorio);
	}
	
	public void imprimeDateFimConsulta() {
		DecimalFormat df = new DecimalFormat("00");
		long data = retornaDateFimConsulta();
		long hora = data/3600;
		long minuto = (data - (hora*3600))/60;
		long segundo = data - (hora*3600) - (minuto*60);
		System.out.println(df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
		System.out.println(data);
	}*/
	
	public int comparaHora(Date horaNova, Date horaAntiga) {
		long aux = Math.abs(horaNova.getTime()-horaAntiga.getTime());
		long diff = TimeUnit.SECONDS.convert(aux, TimeUnit.MILLISECONDS);
		int diferenca = (int) diff;
		return diferenca;
	}
	
	public void imprimeComparacao(Date horaNova, Date horaAntiga) {
		DecimalFormat df = new DecimalFormat("00");
		int hora = comparaHora(horaNova, horaAntiga)/3600;
		int minuto = (comparaHora(horaNova, horaAntiga) - (hora*3600))/60;
		int segundo = comparaHora(horaNova, horaAntiga) - (hora*3600) - (minuto*60);
		System.out.println(df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	public void imprimeDataFormatada() {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(dataFormatada.format(this.data));
	}
	
	public void imprimeHoraFormatada() {
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");	
		System.out.println(horaFormatada.format(this.hora));
	}
}
