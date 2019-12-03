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

	// Método que retorna a hora atual do sistema
	public Date retornaHoraAtual() {
		Date dateSaida = new Date();
		return dateSaida;
	}

	// Método que subtrai as hora de entrada do paciente e a hora que ele é chamado para o atendimento,
	// assim converte em segundos e retorna esse valor
	public int comparaHora() {
		long aux = Math.abs(this.dataHoraChamada.getTime() - this.dataHoraEntrada.getTime());
		long diff = TimeUnit.SECONDS.convert(aux, TimeUnit.MILLISECONDS);
		int diferenca = (int) diff;
		return diferenca;
	}
	
	// Método que adiciona um valor aleatório de até 10800, equivalente a 3 horas, mais 600
	// Esse valor representa, teoricamente, o tempo em que o paciente estava sendo atendido
	public int retornaDuracaoAtendimento() {
		Random rnd = new Random();
		int acresc = rnd.nextInt(10800) + 600;
		int diferenca = comparaHora();
		diferenca = diferenca + acresc;
		return diferenca;
	}

	// Método que apresenta a hora com o formato adequado
	public void imprimeComparacao() {
		DecimalFormat df = new DecimalFormat("00");
		int hora = comparaHora() / 3600;
		int minuto = (comparaHora() - (hora * 3600)) / 60;
		int segundo = comparaHora() - (hora * 3600) - (minuto * 60);
		System.out.println(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
	}

	// Método que apresenta o tempo de duração do atendimento com o formato adequado
	public void imprimeDuracaoAtendimento() {
		DecimalFormat df = new DecimalFormat("00");
		int chs = this.tempoAtendimento;
		int hora = chs / 3600;
		int minuto = (chs - (hora * 3600)) / 60;
		int segundo = chs - (hora * 3600) - (minuto * 60);
		System.out.println(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
	}

	// Método que formata a hora de duração do atendimento e a retorna
	public String retornaDuracaoAtendimentoFormatado() {
		DecimalFormat df = new DecimalFormat("00");
		int chs = this.tempoAtendimento;
		int hora = chs / 3600;
		int minuto = (chs - (hora * 3600)) / 60;
		int segundo = chs - (hora * 3600) - (minuto * 60);
		String aux = df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo);
		return aux;
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

	// Método que imprime a data com o formato adequado
	public void imprimeDataFormatada(Date data) {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(dataFormatada.format(data));
	}
	// Método que imprime a hora com o formato adequado
	public void imprimeHoraFormatada(Date hora) {
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		System.out.println(horaFormatada.format(hora));
	}

	// Método que retorna a data com o formato adequado
	public String retornaDataFormatada(Date data) {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-YYYY");
		String aux = dataFormatada.format(data);
		return aux;
	}

	// Método que retorna a hora com o formato adequado
	public String retornaHoraFormatada(Date hora) {
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		String aux = horaFormatada.format(hora);
		return aux;
	}
}
