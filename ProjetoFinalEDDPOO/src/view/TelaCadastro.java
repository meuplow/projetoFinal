package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCadastro extends JPanel {
	private JLabel lblCadPacientes;
	private JLabel lblNome;
	private JTextField fieldNome;
	private JLabel lblCpf;
	private JTextField fieldCpf;
	private JLabel lblData;
	private JTextField fieldData;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	

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

	public void limpaTela(){
		fieldNome.setText("");
		fieldCpf.setText("");
		fieldData.setText("");
	}

	/**
	 * Create the panel.
	 */
	public TelaCadastro() {
		setLayout(new MigLayout("", "[]", "[][][][][][][][][][]"));
		
		lblCadPacientes = new JLabel("Cadastro de Pacientes");
		lblCadPacientes.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblCadPacientes, "cell 0 0,grow");
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNome, "flowx,cell 0 2,growy");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 2,grow");
		fieldNome.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblCpf, "flowx,cell 0 4");
		
		fieldCpf = new JTextField();
		add(fieldCpf, "cell 0 4,grow");
		fieldCpf.setColumns(10);
		
		lblData = new JLabel("Data de Nascimento");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblData, "flowx,cell 0 6,alignx left");
		
		fieldData = new JTextField();
		add(fieldData, "cell 0 6,grow");
		fieldData.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		add(btnCadastrar, "flowx,cell 0 9,alignx center,growy");
		
		btnLimpar = new JButton("Limpar");
		add(btnLimpar, "cell 0 9,alignx center,growy");

	}

}

