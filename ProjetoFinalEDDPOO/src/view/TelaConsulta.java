package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaConsulta extends JPanel {
	private JTextField fieldCpf;
	private JButton btnBuscar; 
	private JButton btnLimpar; 

	public JTextField getFieldCpf() {
		return fieldCpf;
	}

	public void setFieldCpf(JTextField fieldCpf) {
		this.fieldCpf = fieldCpf;
	}


	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}
	
	public void limparTela(){
		fieldCpf.setText("");
	}


	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[]", "[][][][][][]"));
		
		JLabel lblTituloBusca = new JLabel("Busca de Paciente");
		lblTituloBusca.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblTituloBusca, "cell 0 0");
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblCpf, "flowx,cell 0 2");
		
		fieldCpf = new JTextField();
		add(fieldCpf, "cell 0 2,grow");
		fieldCpf.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		add(btnBuscar, "flowx,cell 0 5,alignx center,aligny center");
		
		btnLimpar = new JButton("Limpar");
		add(btnLimpar, "cell 0 5,alignx center,aligny center");

	}

}
