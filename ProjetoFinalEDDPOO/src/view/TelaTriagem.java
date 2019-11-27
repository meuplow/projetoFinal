package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaTriagem extends JPanel {
	private JTextField fieldFrequenciaCardiaca;
	private JTextField fieldFrequenciaRespiratoria;
	private JTextField fieldTemperatura;
	private JTextField fieldOximetria;
	private JTextField fieldIndice;
	private JRadioButton checkEntubado;
	private JRadioButton checkApneia;
	private JRadioButton checkPulso;
	private JRadioButton checkSitRis;
	private JRadioButton checkConfuso;
	private JRadioButton checkDesorientado;
	private JRadioButton checkLetargico;
	private JRadioButton checkDor;
	private JRadioButton checkOutrosProcedimentos;
	private JRadioButton checkEstavel;
	private JButton btnDirecionar;
	private JLabel lblMsg;
	private JPanel painelNorte;
	private JLabel lblTriagem;

	/**
	 * Create the panel.
	 */
	public TelaTriagem() {
		setBounds(100, 100, 600, 400);
		setLayout(new MigLayout("", "[grow]", "[]10[][][]20[][][][]15[]20[][]"));
		
		painelNorte = new JPanel();
		add(painelNorte, "cell 0 0,grow");
		
		lblTriagem = new JLabel("Triagem");
		lblTriagem.setFont(new Font("Tahoma", Font.BOLD, 20));
		painelNorte.add(lblTriagem);

		JLabel lblPri1 = new JLabel("O paciente se encontra:");
		lblPri1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblPri1, "cell 0 1");
		
		checkEntubado = new JRadioButton("entubado");
		checkEntubado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkEntubado, "flowx,cell 0 2,growx");

		checkApneia = new JRadioButton("com apneia");
		checkApneia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkApneia, "cell 0 2,growx");

		checkPulso = new JRadioButton("sem pulso ou sem rea\u00E7\u00E3o");
		checkPulso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkPulso, "cell 0 2,growx");

		checkSitRis = new JRadioButton("situa\u00E7\u00E3o de risco");
		checkSitRis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkSitRis, "flowx,cell 0 3,growx");

		checkConfuso = new JRadioButton("confuso");
		checkConfuso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkConfuso, "cell 0 3,growx");

		checkDesorientado = new JRadioButton("desorientado");
		checkDesorientado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkDesorientado, "cell 0 3,growx");

		checkLetargico = new JRadioButton("let\u00E1rgico");
		checkLetargico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkLetargico, "cell 0 3,growx");

		checkDor = new JRadioButton("com dor ou sofrimento agudo");
		checkDor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkDor, "cell 0 3,growx");

		checkOutrosProcedimentos = new JRadioButton("O paciente precisa realizar outros procedimentos");
		checkOutrosProcedimentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkOutrosProcedimentos, "cell 0 4");

		JLabel lblInformeOsSeguintes = new JLabel("Informe os seguintes dados:");
		lblInformeOsSeguintes.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(lblInformeOsSeguintes, "cell 0 5");

		JLabel lblFrequenciaCardiaca = new JLabel("Frequ\u00EAncia card\u00EDaca");
		lblFrequenciaCardiaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblFrequenciaCardiaca, "flowx,cell 0 6,growx");

		fieldFrequenciaCardiaca = new JTextField();
		fieldFrequenciaCardiaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldFrequenciaCardiaca, "cell 0 6,growx");
		fieldFrequenciaCardiaca.setColumns(10);

		JLabel lblFrequenciaRespiratoria = new JLabel("Frequ\u00EAncia respirat\u00F3ria");
		lblFrequenciaRespiratoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblFrequenciaRespiratoria, "cell 0 6,growx");

		fieldFrequenciaRespiratoria = new JTextField();
		fieldFrequenciaRespiratoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldFrequenciaRespiratoria, "cell 0 6,growx");
		fieldFrequenciaRespiratoria.setColumns(10);

		JLabel lblTemperaturaCorporal = new JLabel("Temperatura corporal");
		lblTemperaturaCorporal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblTemperaturaCorporal, "cell 0 6,growx");

		fieldTemperatura = new JTextField();
		fieldTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldTemperatura, "cell 0 6,growx");
		fieldTemperatura.setColumns(10);

		JLabel lblOximetriaDoPulso = new JLabel("Oximetria do pulso");
		lblOximetriaDoPulso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblOximetriaDoPulso, "flowx,cell 0 7,growx");

		fieldOximetria = new JTextField();
		fieldOximetria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldOximetria, "cell 0 7,growx");
		fieldOximetria.setColumns(10);

		JLabel lblIndiceDePico = new JLabel("\u00CDndice de pico do fluxo respirat\u00F3rio");
		lblIndiceDePico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblIndiceDePico, "cell 0 7,growx");

		fieldIndice = new JTextField();
		fieldIndice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldIndice, "cell 0 7,growx");
		fieldIndice.setColumns(10);

		checkEstavel = new JRadioButton("O paciente se encontra est\u00E1vel");
		checkEstavel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(checkEstavel, "cell 0 8");

		btnDirecionar = new JButton("Direcionar atendimento");
		btnDirecionar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btnDirecionar, "cell 0 9,alignx center");

		lblMsg = new JLabel("Paciente direcionado para sua Fila de Prioridade adequada");
		lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblMsg, "cell 0 10,alignx center");
		lblMsg.setVisible(false);

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

	public JRadioButton getCheckEntubado() {
		return checkEntubado;
	}

	public void setCheckEntubado(JRadioButton checkEntubado) {
		this.checkEntubado = checkEntubado;
	}

	public JRadioButton getCheckApneia() {
		return checkApneia;
	}

	public void setCheckApneia(JRadioButton checkApneia) {
		this.checkApneia = checkApneia;
	}

	public JRadioButton getCheckPulso() {
		return checkPulso;
	}

	public void setCheckPulso(JRadioButton checkPulso) {
		this.checkPulso = checkPulso;
	}

	public JRadioButton getCheckSitRis() {
		return checkSitRis;
	}

	public void setCheckSitRis(JRadioButton checkSitRis) {
		this.checkSitRis = checkSitRis;
	}

	public JRadioButton getCheckConfuso() {
		return checkConfuso;
	}

	public void setCheckConfuso(JRadioButton checkConfuso) {
		this.checkConfuso = checkConfuso;
	}

	public JRadioButton getCheckDesorientado() {
		return checkDesorientado;
	}

	public void setCheckDesorientado(JRadioButton checkDesorientado) {
		this.checkDesorientado = checkDesorientado;
	}

	public JRadioButton getCheckLetargico() {
		return checkLetargico;
	}

	public void setCheckLetargico(JRadioButton checkLetargico) {
		this.checkLetargico = checkLetargico;
	}

	public JRadioButton getCheckDor() {
		return checkDor;
	}

	public void setCheckDor(JRadioButton checkDor) {
		this.checkDor = checkDor;
	}

	public JRadioButton getCheckOutrosProcedimentos() {
		return checkOutrosProcedimentos;
	}

	public void setCheckOutrosProcedimentos(JRadioButton checkOutrosProcedimentos) {
		this.checkOutrosProcedimentos = checkOutrosProcedimentos;
	}

	public JRadioButton getCheckEstavel() {
		return checkEstavel;
	}

	public void setCheckEstavel(JRadioButton checkEstavel) {
		this.checkEstavel = checkEstavel;
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
}
