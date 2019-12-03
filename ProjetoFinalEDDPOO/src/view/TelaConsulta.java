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
import java.awt.FlowLayout;
import java.awt.Color;

public class TelaConsulta extends JPanel {
	private JTextField fieldCpf;
	private JButton btnBuscar;
	private JButton btnLimpar;
	private JLabel lblResultadoBusca;
	private JButton btnConfirmacao;
	private JLabel lblMsg;

	public TelaConsulta() {
		setBounds(100, 100, 600, 500);
		setLayout(new BorderLayout(0, 0));

		JPanel painelCentro = new JPanel();
		painelCentro.setBackground(new Color(255, 204, 153));
		add(painelCentro, BorderLayout.CENTER);
		painelCentro.setLayout(new MigLayout("", "[grow]", "10[]40[]80[]25[]40[]25[]"));
		
				JPanel painelNorte = new JPanel();
				painelNorte.setBackground(new Color(51, 102, 153));
				painelCentro.add(painelNorte, "cell 0 0,growx");
						painelNorte.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
						JLabel lblTituloBusca = new JLabel("Busca de Paciente");
						lblTituloBusca.setForeground(Color.WHITE);
						lblTituloBusca.setFont(new Font("Tahoma", Font.BOLD, 25));
						painelNorte.add(lblTituloBusca);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblCpf, "flowx,cell 0 1");

		fieldCpf = new JTextField();
		fieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		painelCentro.add(fieldCpf, "cell 0 1,growx");
		fieldCpf.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		painelCentro.add(btnBuscar, "flowx,cell 0 2,alignx center");

		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		painelCentro.add(btnLimpar, "cell 0 2,alignx center");

		lblResultadoBusca = new JLabel("Paciente encontrado");
		lblResultadoBusca.setForeground(Color.WHITE);
		lblResultadoBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoBusca.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblResultadoBusca, "cell 0 3,alignx center");
		lblResultadoBusca.setVisible(false);

		btnConfirmacao = new JButton("Iniciar Atendimento?");
		btnConfirmacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		painelCentro.add(btnConfirmacao, "cell 0 4,alignx center");
		btnConfirmacao.setVisible(false);
		btnConfirmacao.setActionCommand("Confirmar");
		

		lblMsg = new JLabel("Paciente encaminhado para fila de atendimento");
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setForeground(Color.WHITE);
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblMsg, "cell 0 5,alignx center");
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
	
	public void limparFields() {
		fieldCpf.setText("");
		lblResultadoBusca.setVisible(false);
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
