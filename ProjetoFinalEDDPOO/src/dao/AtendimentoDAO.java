package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Atendimento;

public class AtendimentoDAO {
	public AtendimentoDAO() {

	}

	// Metodo recebe um objeto atendimento e grava em arquivo informações sobre o
	// atendimento do paciente
	public boolean historicoAtendimento(Atendimento a) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("HistoricoDeAtendimentos.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(a.getPaciente().getNome() + "#" + a.getPaciente().getCpf() + "#" + "Entrada do paciente: "
					+ a.retornaDataFormatada(a.getDataHoraEntrada()) + " " // Retorno da data de entrada do paciente
					+ a.retornaHoraFormatada(a.getDataHoraEntrada()) + "#" + "Chamada para atendimento: " // Retorno da hora de entrada do paciente
					+ a.retornaDataFormatada(a.getDataHoraChamada()) + " " // Retorno da data de chamada para atendimento do paciente 
					+ a.retornaHoraFormatada(a.getDataHoraChamada()) + "#" + "Tempo de atendimento: " // Retorno da hora de chamada para atendimento do paciente
					+ a.retornaDuracaoAtendimentoFormatado()); // Retorno da duracao do atendimento entre a chamada e a saida do paciente
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
