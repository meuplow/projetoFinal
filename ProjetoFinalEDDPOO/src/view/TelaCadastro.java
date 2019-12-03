package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class TelaCadastro extends JPanel {

	// Declaracao global dos componentes da tela
	private JLabel lblCadPacientes;
	private JLabel lblNome;
	private JTextField fieldNome;
	private JLabel lblCpf;
	private JTextField fieldCpf;
	private JLabel lblData;
	private JTextField fieldData;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JLabel lblMsg;
	private JPanel painelNorte;

	// Getters e Setters dos componentes da tela
	public JTextField getFieldCpf() {
		return fieldCpf;
	}

	public void setFieldCpf(JTextField fieldCpf) {
		this.fieldCpf = fieldCpf;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldData() {
		return fieldData;
	}

	public void setFieldData(JTextField fieldData) {
		this.fieldData = fieldData;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JLabel getLblMsg() {
		return lblMsg;
	}

	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}

	// Metodo para limpar toda a tela 
	public void limparTela() {
		fieldNome.setText("");
		fieldCpf.setText("");
		fieldData.setText("");
		lblMsg.setVisible(false);
	}

	// Metodo para limpar somente os JTextFields na tela
	public void limparFields() {
		fieldNome.setText("");
		fieldCpf.setText("");
		fieldData.setText("");
	}

	// Construtor do JPanel
	public TelaCadastro() {
		setBackground(new Color(255, 204, 153));
		setBounds(100, 100, 600, 500);
		setLayout(new MigLayout("", "[grow]", "10[]40[]20[]20[]70[][]30[]30[]"));

		painelNorte = new JPanel();
		painelNorte.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		painelNorte.setBackground(new Color(0, 102, 153));
		add(painelNorte, "cell 0 0,growx");

		lblCadPacientes = new JLabel("Cadastro de Pacientes");
		lblCadPacientes.setForeground(Color.WHITE);
		painelNorte.add(lblCadPacientes);
		lblCadPacientes.setFont(new Font("Tahoma", Font.BOLD, 25));

		lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblNome, "flowx,cell 0 1,growy");

		fieldNome = new JTextField();
		fieldNome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(fieldNome, "cell 0 1,growx");
		fieldNome.setColumns(10);

		lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblCpf, "flowx,cell 0 2");

		fieldCpf = new JTextField();
		fieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(fieldCpf, "cell 0 2,growx");
		fieldCpf.setColumns(10);

		lblData = new JLabel("Data de Nascimento");
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblData, "flowx,cell 0 3,alignx left");

		fieldData = new JTextField();
		fieldData.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(fieldData, "cell 0 3,growx");
		fieldData.setColumns(10);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(btnCadastrar, "flowx,cell 0 5,alignx center,growy");

		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(btnLimpar, "cell 0 5,alignx center,growy");

		lblMsg = new JLabel("Paciente cadastrado com sucesso!");
		lblMsg.setForeground(Color.WHITE);
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblMsg, "cell 0 6,alignx center,aligny center");
		lblMsg.setVisible(false);

	}

}