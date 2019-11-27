package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class TelaConsulta extends JPanel {
	private JTextField fieldCpf;
	private JButton btnBuscar;
	private JButton btnLimpar;
	private JLabel lblResultadoBusca;
	private JButton btnConfirmacao;
	private JLabel lblMsg;

	public TelaConsulta() {
		setBounds(100, 100, 450, 300);
		setLayout(new BorderLayout(0, 0));

		JPanel painelNorte = new JPanel();
		add(painelNorte, BorderLayout.NORTH);

		JLabel lblTituloBusca = new JLabel("Busca de Paciente");
		lblTituloBusca.setFont(new Font("Tahoma", Font.BOLD, 20));
		painelNorte.add(lblTituloBusca);

		JPanel painelCentro = new JPanel();
		add(painelCentro, BorderLayout.CENTER);
		painelCentro.setLayout(new MigLayout("", "[grow]", "15[]30[]15[]30[]15[]"));

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCentro.add(lblCpf, "flowx,cell 0 0");

		fieldCpf = new JTextField();
		fieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		painelCentro.add(fieldCpf, "cell 0 0,growx");
		fieldCpf.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(btnBuscar, "flowx,cell 0 1,alignx center");

		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(btnLimpar, "cell 0 1,alignx center");

		lblResultadoBusca = new JLabel("Paciente encontrado");
		lblResultadoBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoBusca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(lblResultadoBusca, "cell 0 2,alignx center");
		lblResultadoBusca.setVisible(false);

		btnConfirmacao = new JButton("Iniciar Atendimento?");
		btnConfirmacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(btnConfirmacao, "cell 0 3,alignx center");
		btnConfirmacao.setVisible(false);
		btnConfirmacao.setActionCommand("Confirmar");
		

		lblMsg = new JLabel("Paciente encaminhado para fila de atendimento");
		lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(lblMsg, "cell 0 4,alignx center");
		lblMsg.setVisible(false);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

	}

	public void limparTela() {
		fieldCpf.setText("");
		lblResultadoBusca.setVisible(false);
		lblMsg.setVisible(false);
		btnConfirmacao.setVisible(false);
	}
	
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

	public JLabel getLblResultadoBusca() {
		return lblResultadoBusca;
	}

	public void setLblResultadoBusca(JLabel lblResultadoBusca) {
		this.lblResultadoBusca = lblResultadoBusca;
	}

	public JButton getBtnConfirmacao() {
		return btnConfirmacao;
	}

	public void setBtnConfirmacao(JButton btnConfirmacao) {
		this.btnConfirmacao = btnConfirmacao;
	}

	public JLabel getLblMsg() {
		return lblMsg;
	}

	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}
}
