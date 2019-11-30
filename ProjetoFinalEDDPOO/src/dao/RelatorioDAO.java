package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Relatorios;


public class RelatorioDAO {
	public RelatorioDAO() {

	}

	public boolean relatorioAdm(Relatorios relatorio, Relatorios r1, Relatorios r2, Relatorios r3, Relatorios r4, Relatorios r5) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("RelatoriosAdministrativos.txt", true);
			bw = new BufferedWriter(fw);
			bw.write("M�dia de espera: " + relatorio.retornaMediaEspera() + "#" 
			+ "M�dia de atendimento geral: " + relatorio.retornaMediaAtendimento() + "#"
			+ "M�dia de atendimento fila de prioridade 1: " + r1.retornaMediaAtendimento() + "#"
			+ "M�dia de atendimento fila de prioridade 2: " + r2.retornaMediaAtendimento() + "#"
			+ "M�dia de atendimento fila de prioridade 3: " + r3.retornaMediaAtendimento() + "#"
			+ "M�dia de atendimento fila de prioridade 4: " + r4.retornaMediaAtendimento() + "#"
			+ "M�dia de atendimento fila de prioridade 5: " + r5.retornaMediaAtendimento());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}finally {
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
