package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmCadastrar;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmSenhas;
	private TelaCadastro tcad;
	private TelaConsulta tcon;
	private TelaDeSenhas tsenhas;
	
	public JMenuItem getMntmCadastrar() {
		return mntmCadastrar;
	}

	public void setMntmCadastrar(JMenuItem mntmCadastrar) {
		this.mntmCadastrar = mntmCadastrar;
	}

	public JMenuItem getMntmConsultar() {
		return mntmConsultar;
	}

	public void setMntmConsultar(JMenuItem mntmConsultar) {
		this.mntmConsultar = mntmConsultar;
	}
	
	public JMenuItem getMntmSenhas() {
		return mntmSenhas;
	}

	public void setMntmSenhas(JMenuItem mntmSenhas) {
		this.mntmSenhas = mntmSenhas;
	}

	public TelaCadastro getTcad() {
		return tcad;
	}

	public void setTcad(TelaCadastro tcad) {
		this.tcad = tcad;
	}

	public TelaConsulta getTcon() {
		return tcon;
	}

	public void setTcon(TelaConsulta tcon) {
		this.tcon = tcon;
	}
	
	public TelaDeSenhas getTsenhas() {
		return tsenhas;
	}

	public void setTsenhas(TelaDeSenhas tsenhas) {
		this.tsenhas = tsenhas;
	}
	

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.setActionCommand("menuCad");
		mnArquivo.add(mntmCadastrar);
		
		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.setActionCommand("menuCon");
		mnArquivo.add(mntmConsultar);
		
		mntmSenhas = new JMenuItem("Painel de senhas");
		mntmSenhas.setActionCommand("menuSen");
		mnArquivo.add(mntmSenhas);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[]"));
		
		tcad = new TelaCadastro();
		tcon = new TelaConsulta();
		tsenhas = new TelaDeSenhas();
	}

}
