package view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TelaDeSenhas extends JPanel {
	// Declaracao global dos componentes da tela
	private JTextField fieldSenha;
	private JButton btnChamarProx;

	// Construtor do JPanel
	public TelaDeSenhas() {
		setBackground(new Color(255, 204, 153));
		setBounds(100, 100, 600, 500);
		setLayout(new MigLayout("", "[grow]", "150[]100[]"));

		fieldSenha = new JTextField();
		fieldSenha.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSenha.setBackground(Color.WHITE);
		fieldSenha.setEditable(false);
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(fieldSenha, "cell 0 0,growx,alignx center");
		fieldSenha.setColumns(10);

		btnChamarProx = new JButton("Chamar pr\u00F3xima senha");
		btnChamarProx.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(btnChamarProx, "cell 0 1,alignx center");
		btnChamarProx.setActionCommand("ChamarProx");
	}
	
	// Getters e Setters dos componentes da tela
	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JTextField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JButton getBtnChamarProx() {
		return btnChamarProx;
	}

	public void setBtnChamarProx(JButton btnChamarProx) {
		this.btnChamarProx = btnChamarProx;
	}
}
