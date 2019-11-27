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
		private JLabel lblMsg;
		private JPanel painelNorte;
		
		
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
		

		public JLabel getLblMsg() {
			return lblMsg;
		}


		public void setLblMsg(JLabel lblMsg) {
			this.lblMsg = lblMsg;
		}


		public void limparTela(){
			fieldNome.setText("");
			fieldCpf.setText("");
			fieldData.setText("");
			lblMsg.setVisible(false);
		}

		/**
		 * Create the panel.
		 */
		public TelaCadastro() {
			setLayout(new MigLayout("", "[grow]", "[][]20[]20[]20[][]30[]30[]"));
			
			painelNorte = new JPanel();
			add(painelNorte, "cell 0 0,growx");
			
			lblCadPacientes = new JLabel("Cadastro de Pacientes");
			painelNorte.add(lblCadPacientes);
			lblCadPacientes.setFont(new Font("Tahoma", Font.BOLD, 20));
			
			lblNome = new JLabel("Nome");
			lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblNome, "flowx,cell 0 1,growy");
			
			fieldNome = new JTextField();
			add(fieldNome, "cell 0 1,growx");
			fieldNome.setColumns(10);
			
			lblCpf = new JLabel("CPF");
			lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblCpf, "flowx,cell 0 2");
			
			fieldCpf = new JTextField();
			add(fieldCpf, "cell 0 2,growx");
			fieldCpf.setColumns(10);
			
			lblData = new JLabel("Data de Nascimento");
			lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
			add(lblData, "flowx,cell 0 3,alignx left");
			
			fieldData = new JTextField();
			add(fieldData, "cell 0 3,growx");
			fieldData.setColumns(10);
			
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			add(btnCadastrar, "flowx,cell 0 5,alignx center,growy");
			
			btnLimpar = new JButton("Limpar");
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			add(btnLimpar, "cell 0 5,alignx center,growy");
			
			lblMsg = new JLabel("Paciente cadastrado com sucesso");
			lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 13));
			add(lblMsg, "cell 0 6,alignx center,aligny center");
			lblMsg.setVisible(false);

		}

	}