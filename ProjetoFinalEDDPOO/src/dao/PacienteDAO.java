package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.ListaPaciente;
import model.Paciente;

public class PacienteDAO {
	public PacienteDAO(){}
	
	public boolean cadPaciente(Paciente p){
		File arq = new File("ListaDePacientes.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		ListaPaciente lista = new ListaPaciente();
		try {
			lista.adiciona(p);
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);
			bw.write(p.getNome()+"#"+p.getCpf()+"#"+p.getData());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally{
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		return true;		
	}
}
