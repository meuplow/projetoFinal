package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Atendimento {
	private int senha;
	private String paciente;
	private Date data;
	private Date hora;
	
	public Atendimento(String cpf, int senha) {
		Date dataAtual = new Date();
		this.senha = senha;
		this.paciente = cpf;
		this.data = dataAtual;
		this.hora = dataAtual;
	}
	
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
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
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm");	
		System.out.println(horaFormatada.format(this.hora));
	}
}
