package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import model.Atendimento;
import model.FilaAtendimentos;
import model.ListaPaciente;
import model.Paciente;
import view.JanelaPrincipal;

public class PacienteControl implements ActionListener {
	private JanelaPrincipal j;
	private Paciente p;
	private ListaPaciente lista;
	private FilaAtendimentos filaAtd;
	private Atendimento atd;
	private PacienteDAO pdao;
	private int cnt;
	
	public PacienteControl(JanelaPrincipal j, Paciente p) {
		super();
		this.j = j;
		this.p = p;
		this.j.getMntmCadastrar().addActionListener(this);
		this.j.getMntmConsultar().addActionListener(this);
		this.j.getMntmAtendimento().addActionListener(this);
		this.j.getTcad().getBtnCadastrar().addActionListener(this);
		this.j.getTcon().getBtnBuscar().addActionListener(this);
		this.j.getTcon().getBtnLimpar().addActionListener(this);
		this.j.getTcad().getBtnLimpar().addActionListener(this);
		pdao = new PacienteDAO();
		lista = new ListaPaciente();
		cnt = 0;
	}
	
	public ListaPaciente getLista() {
		return lista;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("menuCad")){
			this.j.setContentPane(this.j.getTcad());
			this.j.revalidate();
			this.j.repaint();
		}	
		if(e.getActionCommand().equals("menuCon")){
			this.j.setContentPane(this.j.getTcon());
			this.j.revalidate();
			this.j.repaint();
		}
		if(e.getActionCommand().equals("menuAtd")){
			this.j.setContentPane(this.j.getTatd());
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
				this.lista.adiciona(p);
			}
		}
		if(e.getActionCommand().equals("Buscar")){		
			if(this.lista.buscarPaciente(this.j.getTcon().getFieldCpf().getText())!=null) {		
				String cpfP = this.lista.buscarPaciente(this.j.getTcon().getFieldCpf().getText()).getCpf();
				atd = new Atendimento(cpfP, cnt);
				filaAtd.enqueue(atd);
				this.j.getTcon().getLblMsg().setVisible(true);
			}else {
				this.j.setContentPane(this.j.getTcad());
				this.j.revalidate();
				this.j.repaint();
			}
		}
		if(e.getActionCommand().equals("Limpar")){
			this.j.getTcad().limparTela();
			this.j.getTcon().limparTela();
		}
	}

}
