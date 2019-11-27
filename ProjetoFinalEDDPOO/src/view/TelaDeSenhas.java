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


	/**
	 * Create the panel.
	 */
	public TelaDeSenhas() {
		setLayout(new MigLayout("", "[grow]", "[][][][][][][]"));	
		fieldSenha = new JTextField();
		fieldSenha.setEditable(false);
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(fieldSenha, "cell 0 2,growx");
		fieldSenha.setColumns(10);
		
		btnChamarProx = new JButton("Chamar pr\u00F3xima senha");
		add(btnChamarProx, "cell 0 6,alignx center");
		btnChamarProx.setActionCommand("ChamarProx");
		
	}
}
