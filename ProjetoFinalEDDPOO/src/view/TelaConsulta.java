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
	private JLabel lblMsg;
	private JButton btnConfirmacao;
	private JLabel lblResultadoBusca;

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
	
	public JButton getBtnConfirmacao() {
		return btnConfirmacao;
	}

	public void setBtnConfirmacao(JButton btnConfirmacao) {
		this.btnConfirmacao = btnConfirmacao;
	}
	
	public void limparTela(){
		fieldCpf.setText("");
	}

	
	public JLabel getLblMsg() {
		return lblMsg;
	}


	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}
	
	public JLabel getLblResultadoBusca() {
		return lblResultadoBusca;
	}

	public void setLblResultadoBusca(JLabel lblResultadoBusca) {
		this.lblResultadoBusca = lblResultadoBusca;
	}

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[]", "[][][][][][][][][]"));
		
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
		
		btnConfirmacao = new JButton("Iniciar atendimento?");
		btnConfirmacao.setVisible(false);
		btnConfirmacao.setActionCommand("Confirmar");
		add(btnConfirmacao, "cell 0 7,alignx center,aligny center");
		
		lblResultadoBusca = new JLabel("Paciente encontrado");
		add(lblResultadoBusca, "cell 0 6,alignx center");
		lblResultadoBusca.setVisible(false);
		
		lblMsg = new JLabel("Paciente encaminhado para fila de atendimento");
		add(lblMsg, "cell 0 8");
		lblMsg.setVisible(false);
	}

}
