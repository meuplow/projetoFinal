package control;

import model.Paciente;
import view.JanelaPrincipal;

public class App {
	public static void main(String[] args) {
		JanelaPrincipal j = new JanelaPrincipal();
		j.setVisible(true);
		Paciente p = new Paciente();
		PacienteControl pcon = new PacienteControl(j, p);
		pcon.getLista();
	}
}
