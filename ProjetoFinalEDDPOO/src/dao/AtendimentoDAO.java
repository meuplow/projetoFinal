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
			fw = new FileWriter("Médias de Atendimentos.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(a.getPaciente().getNome() + "#" + a.getSenha() + "# Hora de entrada na Fila de Atendimento: "
					+ a.getDataHoraEntrada() + "# Hora de chamada para a consulta: " + a.getDataHoraChamada()
					+ "# Tempo de consulta: " + a.getTempoConsulta());
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
