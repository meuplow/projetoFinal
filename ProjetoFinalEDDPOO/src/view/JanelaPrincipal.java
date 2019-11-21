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
	private JMenuItem mntmAtendimento;
	private TelaCadastro tcad;
	private TelaConsulta tcon;
	private TelaAtendimento tatd;
	
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
	
	public JMenuItem getMntmAtendimento() {
		return mntmAtendimento;
	}

	public void setMntmAtendimento(JMenuItem mntmAtendimento) {
		this.mntmAtendimento = mntmAtendimento;
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
	
	public TelaAtendimento getTatd() {
		return tatd;
	}

	public void setTatd(TelaAtendimento tatd) {
		this.tatd = tatd;
	}
	

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
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
		
		mntmAtendimento = new JMenuItem("Atendimento");
		mntmAtendimento.setActionCommand("menuAtd");
		mnArquivo.add(mntmAtendimento);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[]"));
		
		tcad = new TelaCadastro();
		tcon = new TelaConsulta();
		tatd = new TelaAtendimento();
	}

}
