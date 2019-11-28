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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmCadastrar;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmSenhas;
	private JMenuItem mntmTriagem;
	private TelaCadastro tcad;
	private TelaConsulta tcon;
	private TelaDeSenhas tsenhas;
	private TelaTriagem ttriagem;
	private TelaChamadaAtd tcha;
	private JPanel painelCentro;
	private JLabel lblBemVindo;
	private JMenuItem mntmInicio;
	private JLabel lblAviso;
	private JLabel lblAviso2;
	private JButton btnEncerrar;
	private JMenuItem mntmAtendimento;

	public JMenuItem getMntmCadastrar() {
		return mntmCadastrar;
	}

	public JMenuItem getMntmAtendimento() {
		return mntmAtendimento;
	}

	public void setMntmAtendimento(JMenuItem mntmAtendimento) {
		this.mntmAtendimento = mntmAtendimento;
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

	public JMenuItem getMntmTriagem() {
		return mntmTriagem;
	}

	public void setMntmTriagem(JMenuItem mntmTriagem) {
		this.mntmTriagem = mntmTriagem;
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

	public TelaTriagem getTtriagem() {
		return ttriagem;
	}

	public void setTtriagem(TelaTriagem ttriagem) {
		this.ttriagem = ttriagem;
	}

	public JButton getBtnEncerrar() {
		return btnEncerrar;
	}

	public TelaChamadaAtd getTcha() {
		return tcha;
	}

	public void setTcha(TelaChamadaAtd tcha) {
		this.tcha = tcha;
	}

	public void setBtnEncerrar(JButton btnEncerrar) {
		this.btnEncerrar = btnEncerrar;
	}

	public JMenuItem getMntmInicio() {
		return mntmInicio;
	}

	public void setMntmInicio(JMenuItem mntmInicio) {
		this.mntmInicio = mntmInicio;
	}

	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArquivo = new JMenu("Opera\u00E7\u00F5es");
		menuBar.add(mnArquivo);

		mntmInicio = new JMenuItem("In\u00EDcio");
		mntmInicio.setActionCommand("inicio");
		mnArquivo.add(mntmInicio);

		mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.setActionCommand("menuCad");
		mnArquivo.add(mntmCadastrar);

		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.setActionCommand("menuCon");
		mnArquivo.add(mntmConsultar);

		mntmSenhas = new JMenuItem("Painel de senhas");
		mntmSenhas.setActionCommand("menuSen");
		mnArquivo.add(mntmSenhas);

		mntmTriagem = new JMenuItem("Triagem");
		mntmTriagem.setActionCommand("menuTriagem");
		mnArquivo.add(mntmTriagem);

		mntmAtendimento = new JMenuItem("Atendimento");
		mntmAtendimento.setActionCommand("menuAtd");
		mnArquivo.add(mntmAtendimento);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		painelCentro = new JPanel();
		contentPane.add(painelCentro, BorderLayout.CENTER);
		painelCentro.setLayout(new MigLayout("", "[grow]", "[][][][]50[][]"));

		lblBemVindo = new JLabel("Bem-vindo ao HSCI");
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 25));
		painelCentro.add(lblBemVindo, "cell 0 0,alignx center");

		lblAviso = new JLabel("Utilize o menu \"Opera\u00E7\u00F5es\", no canto superior esquerdo,");
		lblAviso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(lblAviso, "cell 0 2,alignx center");

		lblAviso2 = new JLabel(" para realizar as tarefas do dia");
		lblAviso2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCentro.add(lblAviso2, "cell 0 3,alignx center");

		btnEncerrar = new JButton("Encerrar");
		btnEncerrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		painelCentro.add(btnEncerrar, "cell 0 5,alignx right");
		setTitle("Hospital Santa Casa dos Informatas");

		tcad = new TelaCadastro();
		tcon = new TelaConsulta();
		tsenhas = new TelaDeSenhas();
		ttriagem = new TelaTriagem();
		tcha = new TelaChamadaAtd();
	}

}
