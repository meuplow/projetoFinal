package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import dao.AtendimentoDAO;
import dao.PacienteDAO;
import dao.RelatorioDAO;
import model.Atendimento;
import model.FilaAtendimentos;
import model.FilaPrioridade;
import model.ListaAtendimentosEncerrados;
import model.ListaPaciente;
import model.Paciente;
import model.Relatorios;
import view.JanelaPrincipal;

public class PacienteControl implements ActionListener {
	private JanelaPrincipal j;
	private Paciente p;
	private ListaPaciente lista;
	private FilaAtendimentos filaAtd;
	private Atendimento atd;
	private PacienteDAO pdao;
	private AtendimentoDAO atddao;
	private RelatorioDAO rdao;
	private FilaPrioridade filaPri1;
	private FilaPrioridade filaPri2;
	private FilaPrioridade filaPri3;
	private FilaPrioridade filaPri4;
	private FilaPrioridade filaPri5;
	private ListaAtendimentosEncerrados listaAtdEncerrados;
	private Relatorios relatorio;
	private Relatorios r1;
	private Relatorios r2;
	private Relatorios r3;
	private Relatorios r4;
	private Relatorios r5;
	private boolean auxTriagem;

	public PacienteControl(JanelaPrincipal j, Paciente p) {
		super();
		this.j = j;
		this.p = p;
		this.j.getMntmCadastrar().addActionListener(this);
		this.j.getMntmConsultar().addActionListener(this);
		this.j.getMntmSenhas().addActionListener(this);
		this.j.getMntmTriagem().addActionListener(this);
		this.j.getMntmAtendimento().addActionListener(this);
		this.j.getMntmInicio().addActionListener(this);
		this.j.getBtnEncerrar().addActionListener(this);
		this.j.getTcad().getBtnCadastrar().addActionListener(this);
		this.j.getTcon().getBtnBuscar().addActionListener(this);
		this.j.getTcon().getBtnLimpar().addActionListener(this);
		this.j.getTcad().getBtnLimpar().addActionListener(this);
		this.j.getTcon().getBtnConfirmacao().addActionListener(this);
		this.j.getTsenhas().getBtnChamarProx().addActionListener(this);
		this.j.getTtriagem().getBtnDirecionar().addActionListener(this);
		this.j.getTcha().getBtnChamarPaciente().addActionListener(this);
		this.j.getTtriagem().getChckbxMaisProcedimentos().addActionListener(this);
		pdao = new PacienteDAO();
		atddao = new AtendimentoDAO();
		rdao = new RelatorioDAO();
		lista = new ListaPaciente();
		filaAtd = new FilaAtendimentos();
		filaPri1 = new FilaPrioridade();
		filaPri2 = new FilaPrioridade();
		filaPri3 = new FilaPrioridade();
		filaPri4 = new FilaPrioridade();
		filaPri5 = new FilaPrioridade();
		listaAtdEncerrados = new ListaAtendimentosEncerrados();
		relatorio = new Relatorios();
		r1 = new Relatorios();
		r2 = new Relatorios();
		r3 = new Relatorios();
		r4 = new Relatorios();
		r5 = new Relatorios();
		auxTriagem = false;
	}

	public ListaPaciente getLista() {
		return lista;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("inicio")) {
			this.j.setContentPane(this.j.getJanelaPrincipal());
			this.j.revalidate();
			this.j.repaint();
		}
		if (e.getActionCommand().equals("menuCad")) {
			this.j.getTcad().limparTela();
			this.j.setContentPane(this.j.getTcad());
			this.j.revalidate();
			this.j.repaint();
		}
		if (e.getActionCommand().equals("menuCon")) {
			this.j.getTcon().limparTela();
			this.j.setContentPane(this.j.getTcon());
			this.j.revalidate();
			this.j.repaint();
		}
		if (e.getActionCommand().equals("menuSen")) {
			this.j.setContentPane(this.j.getTsenhas());
			this.j.revalidate();
			this.j.repaint();
		}
		if (e.getActionCommand().equals("menuTriagem")) {
			this.j.setContentPane(this.j.getTtriagem());
			this.j.revalidate();
			this.j.repaint();
		}
		if (e.getActionCommand().equals("menuAtd")) {
			this.j.getTcha().getLblChamada().setVisible(false);
			this.j.setContentPane(this.j.getTcha());
			this.j.revalidate();
			this.j.repaint();
		}
		if (e.getActionCommand().equals("Cadastrar")) {
			if (this.j.getTcad().getFieldNome().getText().equals("")
					|| this.j.getTcad().getFieldCpf().getText().equals("")
					|| this.j.getTcad().getFieldData().getText().equals("")) {
				this.j.getTcad().getLblMsg().setText("Campos em branco");
				this.j.getTcad().getLblMsg().setVisible(true);
			}else if(this.lista.buscarPaciente(this.j.getTcad().getFieldCpf().getText())!=null) {
				this.j.getTcad().getLblMsg().setText("CPF já cadastrado");
				this.j.getTcad().getLblMsg().setVisible(true);
			}else {
				p = new Paciente(this.j.getTcad().getFieldNome().getText(), this.j.getTcad().getFieldCpf().getText(),
						this.j.getTcad().getFieldData().getText());
				pdao.cadPaciente(p);
				this.j.getTcad().getLblMsg().setText("Paciente cadastrado com sucesso");
				this.j.getTcad().getLblMsg().setVisible(true);
				this.lista.adiciona(p);
				this.j.getTcad().limparFields();
			}
		}
		if (e.getActionCommand().equals("Buscar")) {
			if (this.lista.buscarPaciente(this.j.getTcon().getFieldCpf().getText()) != null) {
				this.j.getTcon().getLblResultadoBusca().setVisible(true);
				this.j.getTcon().getBtnConfirmacao().setVisible(true);
				this.j.getTcad().limparFields();
			} else {
				this.j.getTcon().limparFields();
				this.j.getTcad().limparTela();
				this.j.setContentPane(this.j.getTcad());
				this.j.revalidate();
				this.j.repaint();
			}
		}
		if (e.getActionCommand().equals("Confirmar")) {
			Random rand = new Random();
			atd = new Atendimento(this.lista.buscarPaciente(this.j.getTcon().getFieldCpf().getText()),
					rand.nextInt(100000));
			filaAtd.enqueue(atd);
			this.j.getTcon().getLblMsg().setVisible(true);
			this.j.getTcon().getBtnConfirmacao().setVisible(false);
			this.j.getTcon().limparFields();
			this.j.getTtriagem().getBtnDirecionar().setVisible(false);
		}
		if (e.getActionCommand().equals("ChamarProx")) {
			if (filaAtd.isEmpty()) {
				this.j.getTsenhas().getFieldSenha().setText("Não há nenhum paciente");
			} else {
				this.j.getTsenhas().getFieldSenha().setText(Integer.toString(filaAtd.head().getObjeto().getSenha()));
				this.j.getTtriagem().getLblNome()
						.setText("Nome do paciente: " + filaAtd.head().getObjeto().getPaciente().getNome());
				this.j.getTtriagem().getLblNome().setVisible(true);
			}
			this.j.getTtriagem().limparTela();
		}
		if (e.getActionCommand().equals("Direcionar")) {
			if (!filaAtd.isEmpty()) {
				if (this.j.getTtriagem().getChckbxEntubado().isSelected()
						|| this.j.getTtriagem().getChckbxApneia().isSelected()
						|| this.j.getTtriagem().getChckbxPulso().isSelected()) {
					filaPri1.enqueue(filaAtd.head().getObjeto());
					filaAtd.dequeue();
					this.j.getTcha().getLblQnt1().setText(String.valueOf(filaPri1.size()));
					this.j.getTtriagem().getLblMsg().setVisible(true);
					//auxTriagem = false;
				} else if (this.j.getTtriagem().getChckbxSituacaoDeRisco().isSelected()
						|| this.j.getTtriagem().getChckbxConfuso().isSelected()
						|| this.j.getTtriagem().getChckbxDesorientado().isSelected()
						|| this.j.getTtriagem().getChckbxLetargico().isSelected()
						|| this.j.getTtriagem().getChckbxDor().isSelected()) {
					filaPri2.enqueue(filaAtd.head().getObjeto());
					filaAtd.dequeue();
					this.j.getTcha().getLblQnt2().setText(String.valueOf(filaPri2.size()));
					this.j.getTtriagem().getLblMsg().setVisible(true);
					//auxTriagem = false;
				} else if (this.j.getTtriagem().getChckbxMaisProcedimentos().isSelected()) {
					if (this.j.getTtriagem().getFieldFrequenciaCardiaca().getText().equals("")
							|| (this.j.getTtriagem().getFieldFrequenciaRespiratoria().getText().equals(""))
							|| (this.j.getTtriagem().getFieldTemperatura().getText().equals(""))
							|| (this.j.getTtriagem().getFieldOximetria().getText().equals(""))
							|| (this.j.getTtriagem().getFieldIndice().getText().equals(""))) {
						//auxTriagem = true;
					} else {
						float cardAux = Float.parseFloat(this.j.getTtriagem().getFieldFrequenciaCardiaca().getText());
						float respAux = Float
								.parseFloat(this.j.getTtriagem().getFieldFrequenciaRespiratoria().getText());
						float tempAux = Float.parseFloat(this.j.getTtriagem().getFieldTemperatura().getText());
						float oxiAux = Float.parseFloat(this.j.getTtriagem().getFieldOximetria().getText());
						float fluxRespAux = Float.parseFloat(this.j.getTtriagem().getFieldIndice().getText());
						if (cardAux > 90 || respAux > 20 || tempAux < 36 || tempAux > 38 || oxiAux < 90
								|| fluxRespAux < 200) {
							filaPri2.enqueue(filaAtd.head().getObjeto());
							filaAtd.dequeue();
							this.j.getTcha().getLblQnt2().setText(String.valueOf(filaPri2.size()));
							this.j.getTtriagem().getLblMsg().setVisible(true);
						} else {
							filaPri3.enqueue(filaAtd.head().getObjeto());
							filaAtd.dequeue();
							this.j.getTcha().getLblQnt3().setText(String.valueOf(filaPri3.size()));
							this.j.getTtriagem().getLblMsg().setVisible(true);
						}//auxTriagem = false;
					}
				} else if (this.j.getTtriagem().getChckbxUmProcedimento().isSelected()) {
					filaPri4.enqueue(filaAtd.head().getObjeto());
					filaAtd.dequeue();
					this.j.getTcha().getLblQnt4().setText(String.valueOf(filaPri4.size()));
					this.j.getTtriagem().getLblMsg().setVisible(true);
					//auxTriagem = false;
				} else if (this.j.getTtriagem().getChckbxEstavel().isSelected()) {
					filaPri5.enqueue(filaAtd.head().getObjeto());
					filaAtd.dequeue();
					this.j.getTcha().getLblQnt5().setText(String.valueOf(filaPri5.size()));
					this.j.getTtriagem().getLblMsg().setVisible(true);
					//auxTriagem = false;
				}else {
					auxTriagem = true;
				}
				if (!auxTriagem) {
					this.j.getTtriagem().getLblNome().setVisible(false);
					this.j.getTtriagem().limparCampos();
					auxTriagem = false;
				}
			} else {
				this.j.setContentPane(this.j.getTcad());
				this.j.revalidate();
				this.j.repaint();
			}
		}
		if (this.j.getTtriagem().getChckbxMaisProcedimentos().isSelected()) {
			this.j.getTtriagem().getLblInformeOsSeguintes().setVisible(true);
			this.j.getTtriagem().getLblFrequenciaCardiaca().setVisible(true);
			this.j.getTtriagem().getFieldFrequenciaCardiaca().setVisible(true);
			this.j.getTtriagem().getLblFrequenciaRespiratoria().setVisible(true);
			this.j.getTtriagem().getFieldFrequenciaRespiratoria().setVisible(true);
			this.j.getTtriagem().getLblTemperaturaCorporal().setVisible(true);
			this.j.getTtriagem().getFieldTemperatura().setVisible(true);
			this.j.getTtriagem().getLblOximetriaDoPulso().setVisible(true);
			this.j.getTtriagem().getFieldOximetria().setVisible(true);
			this.j.getTtriagem().getLblIndiceDePico().setVisible(true);
			this.j.getTtriagem().getFieldIndice().setVisible(true);
		}
		if (!(this.j.getTtriagem().getChckbxMaisProcedimentos().isSelected())) {
			auxTriagem = false;
			this.j.getTtriagem().getLblInformeOsSeguintes().setVisible(false);
			this.j.getTtriagem().getLblFrequenciaCardiaca().setVisible(false);
			this.j.getTtriagem().getFieldFrequenciaCardiaca().setVisible(false);
			this.j.getTtriagem().getLblFrequenciaRespiratoria().setVisible(false);
			this.j.getTtriagem().getFieldFrequenciaRespiratoria().setVisible(false);
			this.j.getTtriagem().getLblTemperaturaCorporal().setVisible(false);
			this.j.getTtriagem().getFieldTemperatura().setVisible(false);
			this.j.getTtriagem().getLblOximetriaDoPulso().setVisible(false);
			this.j.getTtriagem().getFieldOximetria().setVisible(false);
			this.j.getTtriagem().getLblIndiceDePico().setVisible(false);
			this.j.getTtriagem().getFieldIndice().setVisible(false);
		}

		if (e.getActionCommand().equals("ChamarPaciente")) {
			if ((filaPri1.size() > 0) || (filaPri2.size() > 0) || (filaPri3.size() > 0) || (filaPri4.size() > 0)
					|| (filaPri5.size() > 0)) {
				if (!filaPri1.isEmpty()) {
					filaPri1.head().getObjeto().setDataHoraChamada(filaPri1.head().getObjeto().retornaHoraAtual());
					filaPri1.head().getObjeto()
							.setTempoAtendimento(filaPri1.head().getObjeto().retornaDuracaoAtendimento());
					atddao.historicoAtendimento(filaPri1.head().getObjeto());
					relatorio.atualizaMedias(filaPri1.head().getObjeto().comparaHora(),
							filaPri1.head().getObjeto().getTempoAtendimento());
					r1.atualizaMedias(filaPri1.head().getObjeto().comparaHora(),
							filaPri1.head().getObjeto().getTempoAtendimento());
					listaAtdEncerrados.adiciona(filaPri1.head().getObjeto());
					this.j.getTcha().getLblChamada().setText(Integer.toString(filaPri1.head().getObjeto().getSenha()));
					this.j.getTcha().getLblChamada().setVisible(true);
					filaPri1.dequeue();
					this.j.getTcha().getLblQnt1().setText(Integer.toString(filaPri1.size()));
				} else if (!filaPri2.isEmpty()) {
					filaPri2.head().getObjeto().setDataHoraChamada(filaPri2.head().getObjeto().retornaHoraAtual());
					filaPri2.head().getObjeto()
							.setTempoAtendimento(filaPri2.head().getObjeto().retornaDuracaoAtendimento());
					atddao.historicoAtendimento(filaPri2.head().getObjeto());
					relatorio.atualizaMedias(filaPri2.head().getObjeto().comparaHora(),
							filaPri2.head().getObjeto().getTempoAtendimento());
					r2.atualizaMedias(filaPri2.head().getObjeto().comparaHora(),
							filaPri2.head().getObjeto().getTempoAtendimento());
					listaAtdEncerrados.adiciona(filaPri2.head().getObjeto());
					this.j.getTcha().getLblChamada().setText(Integer.toString(filaPri2.head().getObjeto().getSenha()));
					this.j.getTcha().getLblChamada().setVisible(true);
					filaPri2.dequeue();
					this.j.getTcha().getLblQnt2().setText(Integer.toString(filaPri2.size()));
				} else if (!filaPri3.isEmpty()) {
					filaPri3.head().getObjeto().setDataHoraChamada(filaPri3.head().getObjeto().retornaHoraAtual());
					filaPri3.head().getObjeto()
							.setTempoAtendimento(filaPri3.head().getObjeto().retornaDuracaoAtendimento());
					atddao.historicoAtendimento(filaPri3.head().getObjeto());
					relatorio.atualizaMedias(filaPri3.head().getObjeto().comparaHora(),
							filaPri3.head().getObjeto().getTempoAtendimento());
					r3.atualizaMedias(filaPri3.head().getObjeto().comparaHora(),
							filaPri3.head().getObjeto().getTempoAtendimento());
					listaAtdEncerrados.adiciona(filaPri3.head().getObjeto());
					this.j.getTcha().getLblChamada().setText(Integer.toString(filaPri3.head().getObjeto().getSenha()));
					this.j.getTcha().getLblChamada().setVisible(true);
					filaPri3.dequeue();
					this.j.getTcha().getLblQnt3().setText(Integer.toString(filaPri3.size()));
				} else if (!filaPri4.isEmpty()) {
					filaPri4.head().getObjeto().setDataHoraChamada(filaPri4.head().getObjeto().retornaHoraAtual());
					filaPri4.head().getObjeto()
							.setTempoAtendimento(filaPri4.head().getObjeto().retornaDuracaoAtendimento());
					atddao.historicoAtendimento(filaPri4.head().getObjeto());
					relatorio.atualizaMedias(filaPri4.head().getObjeto().comparaHora(),
							filaPri4.head().getObjeto().getTempoAtendimento());
					r4.atualizaMedias(filaPri4.head().getObjeto().comparaHora(),
							filaPri4.head().getObjeto().getTempoAtendimento());
					listaAtdEncerrados.adiciona(filaPri4.head().getObjeto());
					this.j.getTcha().getLblChamada().setText(Integer.toString(filaPri4.head().getObjeto().getSenha()));
					this.j.getTcha().getLblChamada().setVisible(true);
					filaPri4.dequeue();
					this.j.getTcha().getLblQnt4().setText(Integer.toString(filaPri4.size()));
				} else if (!filaPri5.isEmpty()) {
					filaPri5.head().getObjeto().setDataHoraChamada(filaPri5.head().getObjeto().retornaHoraAtual());
					filaPri5.head().getObjeto()
							.setTempoAtendimento(filaPri5.head().getObjeto().retornaDuracaoAtendimento());
					atddao.historicoAtendimento(filaPri5.head().getObjeto());
					relatorio.atualizaMedias(filaPri5.head().getObjeto().comparaHora(),
							filaPri5.head().getObjeto().getTempoAtendimento());
					r5.atualizaMedias(filaPri5.head().getObjeto().comparaHora(),
							filaPri5.head().getObjeto().getTempoAtendimento());
					listaAtdEncerrados.adiciona(filaPri5.head().getObjeto());
					this.j.getTcha().getLblChamada().setText(Integer.toString(filaPri5.head().getObjeto().getSenha()));
					this.j.getTcha().getLblChamada().setVisible(true);
					filaPri5.dequeue();
					this.j.getTcha().getLblQnt5().setText(Integer.toString(filaPri5.size()));
				}
				rdao.relatorioAdm(relatorio, r1, r2, r3, r4, r5);
			} else {
				this.j.getTcha().getLblChamada().setText("Não há pacientes");
				this.j.getTcha().getLblChamada().setVisible(true);
			}
		}
		if (e.getActionCommand().equals("Limpar")) {
			this.j.getTcad().limparTela();
			this.j.getTcon().limparTela();
		}
		if (e.getActionCommand().equals("Encerrar")) {
			System.exit(0);
		}
	}
}
