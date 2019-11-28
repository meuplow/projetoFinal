package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class TelaTriagem extends JPanel {
	private JTextField fieldFrequenciaCardiaca;
	private JTextField fieldFrequenciaRespiratoria;
	private JTextField fieldTemperatura;
	private JTextField fieldOximetria;
	private JTextField fieldIndice;
	private JButton btnDirecionar;
	private JLabel lblMsg;
	private JPanel painelNorte;
	private JLabel lblTriagem;
	private JLabel lblNome;
	private JCheckBox chckbxEntubado;
	private JCheckBox chckbxApneia;
	private JCheckBox chckbxPulso;
	private JCheckBox chckbxSituacaoDeRisco;
	private JCheckBox chckbxConfuso;
	private JCheckBox chckbxDesorientado;
	private JCheckBox chckbxLetargico;
	private JCheckBox chckbxDor;
	private JCheckBox chckbxMaisProcedimentos;
	private JCheckBox chckbxUmProcedimento;
	private JCheckBox chckbxEstavel;
	
	public void limparTela() {/*
		chckbxEntubado.setSelected(false);
		chckbxApneia.setSelected(false);
		chckbxPulso.setSelected(false);
		chckbxSituacaoDeRisco.setSelected(false);
		chckbxConfuso.setSelected(false);
		chckbxDesorientado.setSelected(false);
		chckbxLetargico.setSelected(false);
		chckbxDor.setSelected(false);
		chckbxMaisProcedimentos.setSelected(false);
		chckbxUmProcedimento.setSelected(false);
		chckbxEstavel.setSelected(false);
		fieldFrequenciaCardiaca.setText("");
		fieldFrequenciaRespiratoria.setText("");
		fieldTemperatura.setText("");
		fieldOximetria.setText("");
		fieldIndice.setText("");*/
		lblMsg.setVisible(false);
		btnDirecionar.setVisible(true);
	}
	
	public void limparCampos() {
		chckbxEntubado.setSelected(false);
		chckbxApneia.setSelected(false);
		chckbxPulso.setSelected(false);
		chckbxSituacaoDeRisco.setSelected(false);
		chckbxConfuso.setSelected(false);
		chckbxDesorientado.setSelected(false);
		chckbxLetargico.setSelected(false);
		chckbxDor.setSelected(false);
		chckbxMaisProcedimentos.setSelected(false);
		chckbxUmProcedimento.setSelected(false);
		chckbxEstavel.setSelected(false);
		fieldFrequenciaCardiaca.setText("");
		fieldFrequenciaRespiratoria.setText("");
		fieldTemperatura.setText("");
		fieldOximetria.setText("");
		fieldIndice.setText("");
		btnDirecionar.setVisible(false);
	}

	public TelaTriagem() {
		setBounds(100, 100, 600, 500);
		setLayout(new MigLayout("", "[grow]", "[]10[]10[][][]20[][][][]15[]15[]20[][]"));

		painelNorte = new JPanel();
		add(painelNorte, "cell 0 0,grow");

		lblTriagem = new JLabel("Triagem");
		lblTriagem.setFont(new Font("Tahoma", Font.BOLD, 20));
		painelNorte.add(lblTriagem);

		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(lblNome, "cell 0 1");
		lblNome.setVisible(false);

		JLabel lblPri1 = new JLabel("O paciente se encontra:");
		lblPri1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblPri1, "flowx,cell 0 2");

		JLabel lblInformeOsSeguintes = new JLabel(
				"Informe os seguintes dados, caso o paciente necessita realizar m\u00FAltiplos procedimentos:");
		lblInformeOsSeguintes.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(lblInformeOsSeguintes, "cell 0 6");

		JLabel lblFrequenciaCardiaca = new JLabel("Frequ\u00EAncia card\u00EDaca");
		lblFrequenciaCardiaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblFrequenciaCardiaca, "flowx,cell 0 7,growx");

		fieldFrequenciaCardiaca = new JTextField();
		fieldFrequenciaCardiaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldFrequenciaCardiaca, "cell 0 7,growx");
		fieldFrequenciaCardiaca.setColumns(10);

		JLabel lblFrequenciaRespiratoria = new JLabel("Frequ\u00EAncia respirat\u00F3ria");
		lblFrequenciaRespiratoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblFrequenciaRespiratoria, "cell 0 7,growx");

		fieldFrequenciaRespiratoria = new JTextField();
		fieldFrequenciaRespiratoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldFrequenciaRespiratoria, "cell 0 7,growx");
		fieldFrequenciaRespiratoria.setColumns(10);

		JLabel lblTemperaturaCorporal = new JLabel("Temperatura corporal");
		lblTemperaturaCorporal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblTemperaturaCorporal, "cell 0 7,growx");

		fieldTemperatura = new JTextField();
		fieldTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldTemperatura, "cell 0 7,growx");
		fieldTemperatura.setColumns(10);

		JLabel lblOximetriaDoPulso = new JLabel("Oximetria do pulso");
		lblOximetriaDoPulso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblOximetriaDoPulso, "flowx,cell 0 8,growx");

		fieldOximetria = new JTextField();
		fieldOximetria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldOximetria, "cell 0 8,growx");
		fieldOximetria.setColumns(10);

		JLabel lblIndiceDePico = new JLabel("\u00CDndice de pico do fluxo respirat\u00F3rio");
		lblIndiceDePico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblIndiceDePico, "cell 0 8,growx");

		fieldIndice = new JTextField();
		fieldIndice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldIndice, "cell 0 8,growx");
		fieldIndice.setColumns(10);

		btnDirecionar = new JButton("Direcionar atendimento");
		btnDirecionar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btnDirecionar, "cell 0 11,alignx center");
		btnDirecionar.setActionCommand("Direcionar");

		lblMsg = new JLabel("Paciente direcionado para sua Fila de Prioridade adequada");
		lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblMsg, "cell 0 12,alignx center");
		lblMsg.setVisible(false);

		chckbxEntubado = new JCheckBox("entubado");
		chckbxEntubado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxEntubado, "flowx,cell 0 3,growx");

		chckbxApneia = new JCheckBox("com apneia");
		chckbxApneia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxApneia, "cell 0 3,growx");

		chckbxPulso = new JCheckBox("sem pulso ou sem rea\u00E7\u00E3o");
		chckbxPulso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxPulso, "cell 0 3,growx");

		chckbxSituacaoDeRisco = new JCheckBox("situa\u00E7\u00E3o de risco");
		chckbxSituacaoDeRisco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxSituacaoDeRisco, "flowx,cell 0 4,growx");

		chckbxConfuso = new JCheckBox("confuso");
		chckbxConfuso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxConfuso, "cell 0 4,growx");

		chckbxDesorientado = new JCheckBox("desorientado");
		chckbxDesorientado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxDesorientado, "cell 0 4,growx");

		chckbxLetargico = new JCheckBox("let\u00E1rgico");
		chckbxLetargico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxLetargico, "cell 0 4,growx");

		chckbxDor = new JCheckBox("com dor ou sofrimento agudo");
		chckbxDor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxDor, "cell 0 4,growx");

		chckbxMaisProcedimentos = new JCheckBox("O paciente precisa realizar m\u00FAltiplos procedimentos");
		chckbxMaisProcedimentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxMaisProcedimentos, "cell 0 5,growx");

		chckbxUmProcedimento = new JCheckBox("O paciente precisa realizar APENAS um outro procedimento");
		chckbxUmProcedimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxUmProcedimento, "cell 0 9");

		chckbxEstavel = new JCheckBox("O paciente se econtra est\u00E1vel");
		chckbxEstavel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(chckbxEstavel, "cell 0 10,growx");
	}

	public JCheckBox getChckbxMaisProcedimentos() {
		return chckbxMaisProcedimentos;
	}

	public void setChckbxMaisProcedimentos(JCheckBox chckbxMaisProcedimentos) {
		this.chckbxMaisProcedimentos = chckbxMaisProcedimentos;
	}

	public JCheckBox getChckbxUmProcedimento() {
		return chckbxUmProcedimento;
	}

	public void setChckbxUmProcedimento(JCheckBox chckbxUmProcedimento) {
		this.chckbxUmProcedimento = chckbxUmProcedimento;
	}

	public JCheckBox getChckbxEstavel() {
		return chckbxEstavel;
	}

	public void setChckbxEstavel(JCheckBox chckbxEstavel) {
		this.chckbxEstavel = chckbxEstavel;
	}

	public JLabel getLblNome() {
		return lblNome;
	}

	public void setLblNome(JLabel lblNome) {
		this.lblNome = lblNome;
	}

	public JTextField getFieldFrequenciaCardiaca() {
		return fieldFrequenciaCardiaca;
	}

	public void setFieldFrequenciaCardiaca(JTextField fieldFrequenciaCardiaca) {
		this.fieldFrequenciaCardiaca = fieldFrequenciaCardiaca;
	}

	public JTextField getFieldFrequenciaRespiratoria() {
		return fieldFrequenciaRespiratoria;
	}

	public void setFieldFrequenciaRespiratoria(JTextField fieldFrequenciaRespiratoria) {
		this.fieldFrequenciaRespiratoria = fieldFrequenciaRespiratoria;
	}

	public JTextField getFieldTemperatura() {
		return fieldTemperatura;
	}

	public void setFieldTemperatura(JTextField fieldTemperatura) {
		this.fieldTemperatura = fieldTemperatura;
	}

	public JTextField getFieldOximetria() {
		return fieldOximetria;
	}

	public void setFieldOximetria(JTextField fieldOximetria) {
		this.fieldOximetria = fieldOximetria;
	}

	public JTextField getFieldIndice() {
		return fieldIndice;
	}

	public void setFieldIndice(JTextField fieldIndice) {
		this.fieldIndice = fieldIndice;
	}

	public JButton getBtnDirecionar() {
		return btnDirecionar;
	}

	public void setBtnDirecionar(JButton btnDirecionar) {
		this.btnDirecionar = btnDirecionar;
	}

	public JLabel getLblMsg() {
		return lblMsg;
	}

	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}

	public JCheckBox getChckbxEntubado() {
		return chckbxEntubado;
	}

	public void setChckbxEntubado(JCheckBox chckbxEntubado) {
		this.chckbxEntubado = chckbxEntubado;
	}

	public JCheckBox getChckbxApneia() {
		return chckbxApneia;
	}

	public void setChckbxApneia(JCheckBox chckbxApneia) {
		this.chckbxApneia = chckbxApneia;
	}

	public JCheckBox getChckbxPulso() {
		return chckbxPulso;
	}

	public void setChckbxPulso(JCheckBox chckbxPulso) {
		this.chckbxPulso = chckbxPulso;
	}

	public JCheckBox getChckbxSituacaoDeRisco() {
		return chckbxSituacaoDeRisco;
	}

	public void setChckbxSituacaoDeRisco(JCheckBox chckbxSituacaoDeRisco) {
		this.chckbxSituacaoDeRisco = chckbxSituacaoDeRisco;
	}

	public JCheckBox getChckbxConfuso() {
		return chckbxConfuso;
	}

	public void setChckbxConfuso(JCheckBox chckbxConfuso) {
		this.chckbxConfuso = chckbxConfuso;
	}

	public JCheckBox getChckbxDesorientado() {
		return chckbxDesorientado;
	}

	public void setChckbxDesorientado(JCheckBox chckbxDesorientado) {
		this.chckbxDesorientado = chckbxDesorientado;
	}

	public JCheckBox getChckbxLetargico() {
		return chckbxLetargico;
	}

	public void setChckbxLetargico(JCheckBox chckbxLetargico) {
		this.chckbxLetargico = chckbxLetargico;
	}

	public JCheckBox getChckbxDor() {
		return chckbxDor;
	}

	public void setChckbxDor(JCheckBox chckbxDor) {
		this.chckbxDor = chckbxDor;
	}
}
