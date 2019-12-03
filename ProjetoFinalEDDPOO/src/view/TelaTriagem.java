package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;

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
	private JLabel lblInformeOsSeguintes;
	private JLabel lblFrequenciaCardiaca;
	private JLabel lblFrequenciaRespiratoria;
	private JLabel lblTemperaturaCorporal;
	private JLabel lblOximetriaDoPulso;
	private JLabel lblIndiceDePico;

	public void limparTela() {
//		chckbxEntubado.setSelected(false);
//		chckbxApneia.setSelected(false);
//		chckbxPulso.setSelected(false);
//		chckbxSituacaoDeRisco.setSelected(false);
//		chckbxConfuso.setSelected(false);
//		chckbxDesorientado.setSelected(false);
//		chckbxLetargico.setSelected(false);
//		chckbxDor.setSelected(false);
//		chckbxMaisProcedimentos.setSelected(false);
//		chckbxUmProcedimento.setSelected(false);
//		chckbxEstavel.setSelected(false);
//		fieldFrequenciaCardiaca.setText("");
//		fieldFrequenciaRespiratoria.setText("");
//		fieldTemperatura.setText("");
//		fieldOximetria.setText("");
//		fieldIndice.setText("");
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
		setBackground(new Color(255, 204, 153));
		setBounds(100, 100, 650, 500);
		setLayout(new MigLayout("", "[grow]", "[][]10[][][]10[][][][]10[]10[]20[][]"));

		painelNorte = new JPanel();
		painelNorte.setBackground(new Color(51, 102, 153));
		painelNorte.setForeground(new Color(51, 102, 153));
		add(painelNorte, "cell 0 0,grow");

		lblTriagem = new JLabel("Triagem");
		lblTriagem.setForeground(Color.WHITE);
		lblTriagem.setFont(new Font("Tahoma", Font.BOLD, 25));
		painelNorte.add(lblTriagem);

		lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblNome, "cell 0 1");
		lblNome.setVisible(false);

		JLabel lblPri1 = new JLabel("O paciente se encontra:");
		lblPri1.setForeground(Color.WHITE);
		lblPri1.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblPri1, "flowx,cell 0 2");

		lblInformeOsSeguintes = new JLabel(
				"Informe os seguintes dados:");
		lblInformeOsSeguintes.setForeground(Color.WHITE);
		lblInformeOsSeguintes.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblInformeOsSeguintes, "cell 0 6");
		lblInformeOsSeguintes.setVisible(false);

		lblFrequenciaCardiaca = new JLabel("Frequ\u00EAncia card\u00EDaca");
		lblFrequenciaCardiaca.setForeground(Color.WHITE);
		lblFrequenciaCardiaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblFrequenciaCardiaca, "flowx,cell 0 7,growx");
		lblFrequenciaCardiaca.setVisible(false);

		fieldFrequenciaCardiaca = new JTextField();
		fieldFrequenciaCardiaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldFrequenciaCardiaca, "cell 0 7,growx");
		fieldFrequenciaCardiaca.setColumns(10);
		fieldFrequenciaCardiaca.setVisible(false);

		lblFrequenciaRespiratoria = new JLabel("Frequ\u00EAncia respirat\u00F3ria");
		lblFrequenciaRespiratoria.setForeground(Color.WHITE);
		lblFrequenciaRespiratoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblFrequenciaRespiratoria, "cell 0 7,growx");
		lblFrequenciaRespiratoria.setVisible(false);

		fieldFrequenciaRespiratoria = new JTextField();
		fieldFrequenciaRespiratoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldFrequenciaRespiratoria, "cell 0 7,growx");
		fieldFrequenciaRespiratoria.setColumns(10);
		fieldFrequenciaRespiratoria.setVisible(false);

		lblTemperaturaCorporal = new JLabel("Temperatura corporal");
		lblTemperaturaCorporal.setForeground(Color.WHITE);
		lblTemperaturaCorporal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblTemperaturaCorporal, "cell 0 7,growx");
		lblTemperaturaCorporal.setVisible(false);

		fieldTemperatura = new JTextField();
		fieldTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldTemperatura, "cell 0 7,growx");
		fieldTemperatura.setColumns(10);
		fieldTemperatura.setVisible(false);
		
		lblOximetriaDoPulso = new JLabel("Oximetria do pulso");
		lblOximetriaDoPulso.setForeground(Color.WHITE);
		lblOximetriaDoPulso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblOximetriaDoPulso, "flowx,cell 0 8,growx");
		lblOximetriaDoPulso.setVisible(false);

		fieldOximetria = new JTextField();
		fieldOximetria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldOximetria, "cell 0 8,growx");
		fieldOximetria.setColumns(10);
		fieldOximetria.setVisible(false);

		lblIndiceDePico = new JLabel("\u00CDndice de pico do fluxo respirat\u00F3rio");
		lblIndiceDePico.setForeground(Color.WHITE);
		lblIndiceDePico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblIndiceDePico, "cell 0 8,growx");
		lblIndiceDePico.setVisible(false);

		fieldIndice = new JTextField();
		fieldIndice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldIndice, "cell 0 8,growx");
		fieldIndice.setColumns(10);
		fieldIndice.setVisible(false);

		btnDirecionar = new JButton("Direcionar atendimento");
		btnDirecionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btnDirecionar, "cell 0 11,alignx center");
		btnDirecionar.setActionCommand("Direcionar");

		lblMsg = new JLabel("Paciente direcionado para sua Fila de Prioridade adequada");
		lblMsg.setForeground(Color.WHITE);
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblMsg, "cell 0 12,alignx center");
		lblMsg.setVisible(false);

		chckbxEntubado = new JCheckBox("entubado");
		chckbxEntubado.setForeground(Color.WHITE);
		chckbxEntubado.setBackground(new Color(255, 204, 153));
		chckbxEntubado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxEntubado, "flowx,cell 0 3,growx");

		chckbxApneia = new JCheckBox("com apneia");
		chckbxApneia.setForeground(Color.WHITE);
		chckbxApneia.setBackground(new Color(255, 204, 153));
		chckbxApneia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxApneia, "cell 0 3,growx");

		chckbxPulso = new JCheckBox("sem pulso ou sem rea\u00E7\u00E3o");
		chckbxPulso.setForeground(Color.WHITE);
		chckbxPulso.setBackground(new Color(255, 204, 153));
		chckbxPulso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxPulso, "cell 0 3,growx");

		chckbxSituacaoDeRisco = new JCheckBox("situa\u00E7\u00E3o de risco");
		chckbxSituacaoDeRisco.setForeground(Color.WHITE);
		chckbxSituacaoDeRisco.setBackground(new Color(255, 204, 153));
		chckbxSituacaoDeRisco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxSituacaoDeRisco, "flowx,cell 0 4,growx");

		chckbxConfuso = new JCheckBox("confuso");
		chckbxConfuso.setForeground(Color.WHITE);
		chckbxConfuso.setBackground(new Color(255, 204, 153));
		chckbxConfuso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxConfuso, "cell 0 4,growx");

		chckbxDesorientado = new JCheckBox("desorientado");
		chckbxDesorientado.setForeground(Color.WHITE);
		chckbxDesorientado.setBackground(new Color(255, 204, 153));
		chckbxDesorientado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxDesorientado, "cell 0 4,growx");

		chckbxLetargico = new JCheckBox("let\u00E1rgico");
		chckbxLetargico.setForeground(Color.WHITE);
		chckbxLetargico.setBackground(new Color(255, 204, 153));
		chckbxLetargico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxLetargico, "cell 0 4,growx");

		chckbxDor = new JCheckBox("com dor ou sofrimento agudo");
		chckbxDor.setForeground(Color.WHITE);
		chckbxDor.setBackground(new Color(255, 204, 153));
		chckbxDor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxDor, "cell 0 4,growx");

		chckbxMaisProcedimentos = new JCheckBox("O paciente precisa realizar m\u00FAltiplos procedimentos");
		chckbxMaisProcedimentos.setForeground(Color.WHITE);
		chckbxMaisProcedimentos.setBackground(new Color(255, 204, 153));
		chckbxMaisProcedimentos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxMaisProcedimentos, "cell 0 5,growx");

		chckbxUmProcedimento = new JCheckBox("O paciente precisa realizar APENAS um outro procedimento");
		chckbxUmProcedimento.setForeground(Color.WHITE);
		chckbxUmProcedimento.setBackground(new Color(255, 204, 153));
		chckbxUmProcedimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxUmProcedimento, "cell 0 9");

		chckbxEstavel = new JCheckBox("O paciente se encontra est\u00E1vel");
		chckbxEstavel.setForeground(Color.WHITE);
		chckbxEstavel.setBackground(new Color(255, 204, 153));
		chckbxEstavel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(chckbxEstavel, "cell 0 10,growx");
	}

	public JLabel getLblInformeOsSeguintes() {
		return lblInformeOsSeguintes;
	}

	public void setLblInformeOsSeguintes(JLabel lblInformeOsSeguintes) {
		this.lblInformeOsSeguintes = lblInformeOsSeguintes;
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

	public JLabel getLblFrequenciaCardiaca() {
		return lblFrequenciaCardiaca;
	}

	public void setLblFrequenciaCardiaca(JLabel lblFrequenciaCardiaca) {
		this.lblFrequenciaCardiaca = lblFrequenciaCardiaca;
	}

	public JLabel getLblFrequenciaRespiratoria() {
		return lblFrequenciaRespiratoria;
	}

	public void setLblFrequenciaRespiratoria(JLabel lblFrequenciaRespiratoria) {
		this.lblFrequenciaRespiratoria = lblFrequenciaRespiratoria;
	}

	public JLabel getLblTemperaturaCorporal() {
		return lblTemperaturaCorporal;
	}

	public void setLblTemperaturaCorporal(JLabel lblTemperaturaCorporal) {
		this.lblTemperaturaCorporal = lblTemperaturaCorporal;
	}

	public JLabel getLblOximetriaDoPulso() {
		return lblOximetriaDoPulso;
	}

	public void setLblOximetriaDoPulso(JLabel lblOximetriaDoPulso) {
		this.lblOximetriaDoPulso = lblOximetriaDoPulso;
	}

	public JLabel getLblIndiceDePico() {
		return lblIndiceDePico;
	}

	public void setLblIndiceDePico(JLabel lblIndiceDePico) {
		this.lblIndiceDePico = lblIndiceDePico;
	}
}
