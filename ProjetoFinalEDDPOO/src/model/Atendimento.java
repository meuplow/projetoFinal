package model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Atendimento {
	private int senha;
	private Paciente paciente;
	private Date dataHoraEntrada;
	private Date dataHoraChamada;
	private int tempoAtendimento;

	// Construtor da Classe atendimento que recebe um objeto Paciente e a senha
	public Atendimento(Paciente cpf, int senha) {
		Date dataAtual = new Date();
		this.senha = senha;
		this.paciente = cpf;
		this.dataHoraEntrada = dataAtual;
	}

	public Atendimento() {
	}

	// Metodo que retorna a hora atual do sistema
	public Date retornaHoraAtual() {
		Date dateSaida = new Date();
		return dateSaida;
	}

	// Metodo que retorna a diferença em segundos entre a hora de entrada e a hora de chamada 
	// para atendimento do paciente
	public int comparaHora() {
		long aux = Math.abs(this.dataHoraChamada.getTime() - this.dataHoraEntrada.getTime());
		long diff = TimeUnit.SECONDS.convert(aux, TimeUnit.MILLISECONDS);
		int diferenca = (int) diff;
		return diferenca;
	}
	
	// Metodo que gera e retorna uma duracao de tempo de atendimento aleatoria
	public int retornaDuracaoAtendimento() {
		Random rnd = new Random();
		int acresc = rnd.nextInt(10800) + 600;
		int diferenca = comparaHora();
		diferenca = diferenca + acresc;
		return diferenca;
	}

	// Metodo que imprime a diferenca entre a hora de chegada e hora de chamada de atendimento
	// no formato hh:mm:ss
	public void imprimeComparacao() {
		DecimalFormat df = new DecimalFormat("00");
		int hora = comparaHora() / 3600;
		int minuto = (comparaHora() - (hora * 3600)) / 60;
		int segundo = comparaHora() - (hora * 3600) - (minuto * 60);
		System.out.println(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
	}

	// Metodo que imprime o tempo de duracao do atendimento no formato hh:mm:ss
	public void imprimeDuracaoAtendimento() {
		DecimalFormat df = new DecimalFormat("00");
		int chs = this.tempoAtendimento;
		int hora = chs / 3600;
		int minuto = (chs - (hora * 3600)) / 60;
		int segundo = chs - (hora * 3600) - (minuto * 60);
		System.out.println(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
	}

	// Metodo que retorna a duracao do atendimento no formato de hh:mm:ss
	public String retornaDuracaoAtendimentoFormatado() {
		DecimalFormat df = new DecimalFormat("00");
		int chs = this.tempoAtendimento;
		int hora = chs / 3600;
		int minuto = (chs - (hora * 3600)) / 60;
		int segundo = chs - (hora * 3600) - (minuto * 60);
		String aux = df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo);
		return aux;
	}

	// Getters e Setters dos atributos da classe
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

	public Date getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public void setDataHoraEntrada(Date dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}

	public Date getDataHoraChamada() {
		return dataHoraChamada;
	}

	public void setDataHoraChamada(Date dataHoraChamada) {
		this.dataHoraChamada = dataHoraChamada;
	}

	public int getTempoAtendimento() {
		return tempoAtendimento;
	}

	public void setTempoAtendimento(int tempoAtendimento) {
		this.tempoAtendimento = tempoAtendimento;
	}

	// Metodo que imprime a data com o formato adequado
	public void imprimeDataFormatada(Date data) {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(dataFormatada.format(data));
	}
	// Metodo que imprime a hora com o formato adequado
	public void imprimeHoraFormatada(Date hora) {
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		System.out.println(horaFormatada.format(hora));
	}

	// Metodo que retorna a data com o formato adequado
	public String retornaDataFormatada(Date data) {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-YYYY");
		String aux = dataFormatada.format(data);
		return aux;
	}

	// Metodo que retorna a hora com o formato adequado
	public String retornaHoraFormatada(Date hora) {
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		String aux = horaFormatada.format(hora);
		return aux;
	}
}
