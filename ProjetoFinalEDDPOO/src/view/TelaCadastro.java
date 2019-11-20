package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCadastro extends JPanel {
	private JTextField fieldCpf;
	private JTextField fieldEndereco;
	private JButton btnCadastrar; 
	private JButton btnLimpar; 
	private JLabel lblNome;
	private JTextField fieldNome;
	

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


	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}


	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
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
		fieldEndereco.setText("");
	}

	/**
	 * Create the panel.
	 */
	public TelaCadastro() {
		setBackground(new Color(211, 211, 211));
		setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][]"));
		
		JLabel lblTelaCadastro = new JLabel("Cadastro de Pacientes");
		lblTelaCadastro.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblTelaCadastro, "cell 0 0");
		
		lblNome = new JLabel("Nome");
		add(lblNome, "flowx,cell 0 2");
		
		JLabel lblCpf = new JLabel("CPF");
		add(lblCpf, "flowx,cell 0 3");
		
		JLabel lblData = new JLabel("Endere\u00E7o");
		add(lblData, "flowx,cell 0 4");
		
		fieldEndereco = new JTextField();
		add(fieldEndereco, "cell 0 4,grow");
		fieldEndereco.setColumns(10);
		
		fieldCpf = new JTextField();
		add(fieldCpf, "cell 0 3,grow");
		fieldCpf.setColumns(10);
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 2,growx");
		fieldNome.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		add(btnCadastrar, "flowx,cell 0 6,grow");
		
		btnLimpar = new JButton("Limpar");
		add(btnLimpar, "cell 0 6,grow");

	}

}

