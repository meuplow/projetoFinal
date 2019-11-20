package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import model.ListaPaciente;
import model.Paciente;
import view.JanelaPrincipal;

public class PacienteControl implements ActionListener {
	private JanelaPrincipal j;
	private Paciente p;
	private ListaPaciente lista;
	private PacienteDAO pdao;
	
	public PacienteControl(JanelaPrincipal j, Paciente p) {
		super();
		this.j = j;
		this.p = p;
		this.j.getMntmCadastrar().addActionListener(this);
		this.j.getMntmConsultar().addActionListener(this);
		this.j.getTcad().getBtnCadastrar().addActionListener(this);
		this.j.getTcad().getBtnLimpar().addActionListener(this);
		pdao = new PacienteDAO();
		lista = new ListaPaciente();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("menuCad")){
			this.j.setContentPane(this.j.getTcad());
			this.j.revalidate();
			this.j.repaint();
		}
		if(e.getActionCommand().equals("Cadastrar")){
			this.p.setNome(this.j.getTcad().getFieldNome().getText());
			this.p.setCpf(this.j.getTcad().getFieldCpf().getText());
			this.p.setData(this.j.getTcad().getFieldData().getText());
			boolean aux = pdao.cadPaciente(p);
			if(aux == true) {
				this.j.getTcad().getLblMsg().setVisible(true);
				lista.adiciona(p);
			}
		}
		if(e.getActionCommand().equals("Limpar")){
			this.j.getTcad().limparTela();
		}
	}

}
