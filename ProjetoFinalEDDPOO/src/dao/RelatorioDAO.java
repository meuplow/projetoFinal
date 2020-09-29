package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Relatorios;

public class RelatorioDAO {
	public RelatorioDAO() {

	}

	// Teste
	
	// Metodo recebe seis objetos relatorios (1 geral e 5 de cada fila de
	// prioridade) e grava os dados em arquivo
	public boolean relatorioAdm(Relatorios relatorio, Relatorios r1, Relatorios r2, Relatorios r3, Relatorios r4,
			Relatorios r5) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("RelatoriosAdministrativos.txt", true);
			bw = new BufferedWriter(fw);
			bw.write("M�dia de espera: " + relatorio.retornaMediaEspera() + "#" + "M�dia de atendimento geral: " // Retorno da media de espera para atendimento geral
					+ relatorio.retornaMediaAtendimento() + "#" + "M�dia de atendimento fila de prioridade 1: " // Retorno da media de duracao de atendimentos geral
					+ r1.retornaMediaAtendimento() + "#" + "M�dia de atendimento fila de prioridade 2: " // Retorno da media de duracao de atendimentos na fila de prioridade 1
					+ r2.retornaMediaAtendimento() + "#" + "M�dia de atendimento fila de prioridade 3: " // Retorno da media de duracao de atendimentos na fila de prioridade 2
					+ r3.retornaMediaAtendimento() + "#" + "M�dia de atendimento fila de prioridade 4: " // Retorno da media de duracao de atendimentos na fila de prioridade 3
					+ r4.retornaMediaAtendimento() + "#" + "M�dia de atendimento fila de prioridade 5: " // Retorno da media de duracao de atendimentos na fila de prioridade 4
					+ r5.retornaMediaAtendimento());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
