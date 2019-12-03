package dao;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import model.Paciente;

public class PacienteDAO {
	public PacienteDAO() {
	}
	
	// Metodo recebe um objeto paciente e grava em arquivo suas informacoes
	public boolean cadPaciente(Paciente p) {
		File arq = new File("ListaDePacientes.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);
			bw.write(p.getNome() + "#" + p.getCpf() + "#" + p.getData()); // Retorno e escrita das informacoes do paciente
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
