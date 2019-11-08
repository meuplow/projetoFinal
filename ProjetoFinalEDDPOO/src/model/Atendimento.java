package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Atendimento {
	private String senha;
	private long paciente;
	private Date data;
	private Date hora;
	
	public Atendimento(String senha, long paciente) {
		Date dataAtual = new Date();
		this.senha = senha;
		this.paciente = paciente;
		this.data = dataAtual;
		this.hora = dataAtual;
		//SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-YYYY");
		//SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm");	
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getPaciente() {
		return paciente;
	}

	public void setPaciente(long paciente) {
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
