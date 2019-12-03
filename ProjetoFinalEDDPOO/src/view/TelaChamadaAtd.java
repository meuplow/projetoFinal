package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class TelaChamadaAtd extends JPanel {
	
	// Declaracao global dos componentes da tela
	private JLabel lblQnt1;
	private JLabel lblQnt2;
	private JLabel lblQnt3;
	private JLabel lblQnt4;
	private JLabel lblQnt5;
	private JLabel lblChamada;
	private JButton btnChamarPaciente;

	// Construtor do JPanel
	public TelaChamadaAtd() {
		setBounds(100, 100, 600, 500);
		setLayout(new BorderLayout(0, 0));

		JPanel painelCentro = new JPanel();
		painelCentro.setBackground(new Color(255, 204, 153));
		add(painelCentro, BorderLayout.CENTER);
		painelCentro.setLayout(new MigLayout("", "[grow]", "10[]40[]20[]20[]20[]20[]30[]30[]"));

		JPanel painelNorte = new JPanel();
		painelNorte.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		painelNorte.setBackground(new Color(51, 102, 153));
		painelCentro.add(painelNorte, "cell 0 0,growx");

		JLabel lblAtendimento = new JLabel("Atendimento");
		lblAtendimento.setForeground(Color.WHITE);
		painelNorte.add(lblAtendimento);
		lblAtendimento.setFont(new Font("Tahoma", Font.BOLD, 25));

		JLabel lblFila1 = new JLabel("Pacientes na Fila de Prioridade 1: ");
		lblFila1.setForeground(Color.WHITE);
		lblFila1.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblFila1, "flowx,cell 0 1");

		JLabel lblFila2 = new JLabel("Pacientes na Fila de Prioridade 2: ");
		lblFila2.setForeground(Color.WHITE);
		lblFila2.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblFila2, "flowx,cell 0 2");

		JLabel lblFila3 = new JLabel("Pacientes na Fila de Prioridade 3: ");
		lblFila3.setForeground(Color.WHITE);
		lblFila3.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblFila3, "flowx,cell 0 3");

		JLabel lblFila4 = new JLabel("Pacientes na Fila de Prioridade 4: ");
		lblFila4.setForeground(Color.WHITE);
		lblFila4.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblFila4, "flowx,cell 0 4");

		JLabel lblFila5 = new JLabel("Pacientes na Fila de Prioridade 5: ");
		lblFila5.setForeground(Color.WHITE);
		lblFila5.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblFila5, "flowx,cell 0 5");

		lblQnt1 = new JLabel("0");
		lblQnt1.setForeground(Color.WHITE);
		lblQnt1.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblQnt1, "cell 0 1");

		lblQnt2 = new JLabel("0");
		lblQnt2.setForeground(Color.WHITE);
		lblQnt2.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblQnt2, "cell 0 2");

		lblQnt3 = new JLabel("0");
		lblQnt3.setForeground(Color.WHITE);
		lblQnt3.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblQnt3, "cell 0 3");

		lblQnt4 = new JLabel("0");
		lblQnt4.setForeground(Color.WHITE);
		lblQnt4.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblQnt4, "cell 0 4");

		lblQnt5 = new JLabel("0");
		lblQnt5.setForeground(Color.WHITE);
		lblQnt5.setFont(new Font("Tahoma", Font.BOLD, 17));
		painelCentro.add(lblQnt5, "cell 0 5");

		lblChamada = new JLabel("senha");
		lblChamada.setVisible(false);
		lblChamada.setFont(new Font("Tahoma", Font.PLAIN, 35));
		painelCentro.add(lblChamada, "cell 0 6,alignx center");

		btnChamarPaciente = new JButton("Chamar paciente");
		btnChamarPaciente.setActionCommand("ChamarPaciente");
		btnChamarPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		painelCentro.add(btnChamarPaciente, "cell 0 7,alignx center");
		btnChamarPaciente.setVisible(true);

	}

	// Getters e Setters dos componentes da tela
	public JLabel getLblQnt1() {
		return lblQnt1;
	}

	public void setLblQnt1(JLabel lblQnt1) {
		this.lblQnt1 = lblQnt1;
	}

	public JLabel getLblQnt2() {
		return lblQnt2;
	}

	public void setLblQnt2(JLabel lblQnt2) {
		this.lblQnt2 = lblQnt2;
	}

	public JLabel getLblQnt3() {
		return lblQnt3;
	}

	public void setLblQnt3(JLabel lblQnt3) {
		this.lblQnt3 = lblQnt3;
	}

	public JLabel getLblQnt4() {
		return lblQnt4;
	}

	public void setLblQnt4(JLabel lblQnt4) {
		this.lblQnt4 = lblQnt4;
	}

	public JLabel getLblQnt5() {
		return lblQnt5;
	}

	public void setLblQnt5(JLabel lblQnt5) {
		this.lblQnt5 = lblQnt5;
	}

	public JLabel getLblChamada() {
		return lblChamada;
	}

	public void setLblChamada(JLabel lblChamada) {
		this.lblChamada = lblChamada;
	}

	public JButton getBtnChamarPaciente() {
		return btnChamarPaciente;
	}

	public void setBtnChamarPaciente(JButton btnChamarPaciente) {
		this.btnChamarPaciente = btnChamarPaciente;
	}
}
