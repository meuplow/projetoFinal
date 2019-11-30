package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Atendimento;

public class AtendimentoDAO {
	public AtendimentoDAO() {

	}

	public boolean historicoAtendimento(Atendimento a) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("HistoricoDeAtendimentos.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(a.getPaciente().getNome() + "#" + a.getPaciente().getCpf() + "#" + "Entrada do paciente: "
					+ a.retornaDataFormatada(a.getDataHoraEntrada()) + " " + a.retornaHoraFormatada(a.getDataHoraEntrada()) 
					+ "#" + "Chamada para a consulta: " + a.retornaDataFormatada(a.getDataHoraChamada()) + " " 
					+ a.retornaHoraFormatada(a.getDataHoraChamada()) + "#" + "Tempo de consulta: " + a.retornaDuracaoConsultaFormatada());
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
