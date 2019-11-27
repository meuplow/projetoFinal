package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

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
	
	public PacienteControl(JanelaPrincipal j, Paciente p) {
		super();
		this.j = j;
		this.p = p;
		this.j.getMntmCadastrar().addActionListener(this);
		this.j.getMntmConsultar().addActionListener(this);
		this.j.getMntmSenhas().addActionListener(this);
		this.j.getTcad().getBtnCadastrar().addActionListener(this);
		this.j.getTcon().getBtnBuscar().addActionListener(this);
		this.j.getTcon().getBtnLimpar().addActionListener(this);
		this.j.getTcad().getBtnLimpar().addActionListener(this);
		this.j.getTcon().getBtnConfirmacao().addActionListener(this);
		this.j.getTsenhas().getBtnChamarProx().addActionListener(this);
		pdao = new PacienteDAO();
		lista = new ListaPaciente();
		filaAtd = new FilaAtendimentos();
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
		if(e.getActionCommand().equals("menuSen")){
			this.j.setContentPane(this.j.getTsenhas());
			this.j.revalidate();
			this.j.repaint();
		}
		if(e.getActionCommand().equals("Cadastrar")){
			this.p.setNome(this.j.getTcad().getFieldNome().getText());
			this.p.setCpf(this.j.getTcad().getFieldCpf().getText());
			this.p.setData(this.j.getTcad().getFieldData().getText());
			pdao.cadPaciente(p);
			this.j.getTcad().getLblMsg().setVisible(true);
			this.lista.adiciona(p);
		}
		if(e.getActionCommand().equals("Buscar")){		
			if(this.lista.buscarPaciente(this.j.getTcon().getFieldCpf().getText())!=null) {
				this.j.getTcon().getLblResultadoBusca().setVisible(true);
				this.j.getTcon().getBtnConfirmacao().setVisible(true);
			}else {
				this.j.setContentPane(this.j.getTcad());
				this.j.revalidate();
				this.j.repaint();
			}
		}
		if(e.getActionCommand().equals("Confirmar")) {
			Random rand = new Random();
			atd = new Atendimento(this.lista.buscarPaciente(this.j.getTcon().getFieldCpf().getText()), rand.nextInt(100000));
			filaAtd.enqueue(atd);
			this.j.getTcon().getLblMsg().setVisible(true);
		}
		if(e.getActionCommand().equals("ChamarProx")) {
			if(filaAtd.isEmpty()) {
				this.j.getTsenhas().getFieldSenha().setText("Não há nenhum paciente");
			}else {
				this.j.getTsenhas().getFieldSenha().setText(Integer.toString(filaAtd.head().getObjeto().getSenha()));
			}
		}
		if(e.getActionCommand().equals("Limpar")){
			this.j.getTcad().limparTela();
			this.j.getTcon().limparTela();
		}
	}

}
