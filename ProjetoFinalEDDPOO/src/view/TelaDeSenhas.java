package view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class TelaDeSenhas extends JPanel {
	private JTextField fieldSenha;
	private JButton btnChamarProx;

	public TelaDeSenhas() {
		setBounds(100, 100, 600, 500);
		setLayout(new MigLayout("", "[grow]", "100[]50[]"));

		fieldSenha = new JTextField();
		fieldSenha.setEditable(false);
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(fieldSenha, "cell 0 0,growx,alignx center");
		fieldSenha.setColumns(10);

		btnChamarProx = new JButton("Chamar pr\u00F3xima senha");
		btnChamarProx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(btnChamarProx, "cell 0 1,alignx center");
		btnChamarProx.setActionCommand("ChamarProx");
	}

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
