package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Agencia;
import bean.Aviao;
import bean.Cliente;
import bean.Funcionario;
import bean.Internacional_piloto;
import bean.Passagem;
import bean.Pilota;
import bean.Piloto;
import bean.Telefones_cli;
import dao.AgenciaDAO;
import dao.AviaoDAO;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.Internacional_pilotoDAO;
import dao.PassagemDAO;
import dao.PilotaDAO;
import dao.PilotoDAO;
import dao.Telefones_cliDAO;

import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JCheckBoxMenuItem;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JTextField cep;
	private JTextField estado;
	private JTextField pais;
	private JTextField rua;
	private JTextField numero;
	private JTextField cpf;
	private JTextField nome;
	private JTextField email;
	private JTextField passaporte;
	private JTextField idade;
	private JTextField inf;
	private JTable table;
	private JTextField cli_cu;
	private JTextField cli_cn;
	private JTextField cli_cp;
	private JTextField cli_cid;
	private JTextField cli_cif;
	private JTextField cli_ce;
	private JTextField cli_d;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JTextField partida;
	private JTextField chegada;
	private JTextField dp;
	private JTextField hp;
	private JTextField dc;
	private JTextField hc;
	protected JPanel panel_8;
	private JTextField lp_v;
	private JTextField ld_v;
	private JTextField dp_v;
	private JTextField hp_v;
	private JTextField dc_v;
	private JTextField hc_v;
	private JTextField cpf1;
	private JTextField cpf2;
	private JTextField cod_av;
	private JMenuItem mntmNewMenuItem_17;
	private JTable table_1;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_12;
	protected JPanel panel_8_1;
	private JLabel lblNewLabel_8;
	private JTextField cpf_f;
	private JTextField nome_f;
	private JTextField salario_f;
	private JTextField cma_f;
	private JTextField cod_af;
	protected JPanel panel_7;
	private JTextField num_av;
	private JTextField cap_av;
	private JTextField fb_av;
	private JTextField modelo_av;
	private JTextField ano_av;
	private JTextField cm_av;
	private JTextField cod_agv;
	private JTable table_2;
	private JPanel panel_17;
	private JPanel panel_16;
	private JPanel panel_15;
	private JPanel panel_11;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField cpf_cp;
	private JTextField b_cp;
	private JMenuItem mntmNewMenuItem_16;
	private JTable table_4;
	private JScrollPane scrollPane_4;
	private JMenuItem mntmNewMenuItem_13;
	private JLabel lblNewLabel_14;
	private JTextField del_func;
	private JLabel lblNewLabel_15;
	private JTextField av_del;
	private JButton btnNewButton_13;
	private JLabel lblNewLabel_17;
	private JTextField vo_del;
	private JButton btnNewButton_14;
	private JLabel lblNewLabel_11;
	private JTable table_3;
	private JScrollPane scrollPane_3;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_20;
	private JPanel panel_19;
	private JPanel panel_18;
	private JLabel lblNewLabel_18;
	private JTextField ic_cpf;
	private JButton btnNewButton_15;
	private JTextField ic_pais;
	private JTextField ic_lingua;
	private JTextField ic_moeda;
	private JButton btnNewButton_16;
	private JLabel lblNewLabel_19;
	private JTable table_5;
	private JTable table_6;
	private JTextField a_dele;
	private JLabel lblNewLabel_22;
	private JTextField ag_codm;
	private JTextField ag_cepm;
	private JTextField ag_em;
	private JTextField ag_rm;
	private JTextField ag_nm;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JMenuItem mntmNewMenuItem_26;
	private JTextField ag_pam;
	private JTextField av_codm;
	private JTextField av_nm;
	private JTextField av_fm;
	private JTextField av_mom;
	private JTextField av_anom;
	private JTextField av_cam;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JPanel panel_26;
	private JPanel panel_27;
	private JPanel panel_28;
	private JPanel panel_29;
	private JTextField av_capm;
	private JTextField av_fkm;
	private JLabel lblNewLabel_24;
	private JTextField f_cpfm;
	private JTextField f_nm;
	private JTextField f_sm;
	private JTextField f_cmam;
	private JTextField f_agm;
	private JButton btnNewButton_22;
	private JButton btnNewButton_23;
	private JTextField p_cpfm;
	private JTextField p_bm;
	private JTextField p_nm;
	private JTextField p_sm;
	private JTextField p_cmam;
	private JTextField p_cm;
	private JTextField pi_cpfm;
	private JTextField pi_pm;
	private JTextField pi_lm;
	private JTextField pi_mm;
	private JTextField pi_nm;
	private JTextField pi_sm;
	private JTextField pi_cmam;
	private JTextField pi_cm;
	private JTextField pi_bm;
	private JButton btnNewButton_25;
	private JButton btnNewButton_26;
	private JLabel lblNewLabel_27;
	private JTextField v_id;
	private JTextField v_pm;
	private JTextField v_dm;
	private JTextField v_dpm;
	private JTextField v_hpm;
	private JTextField v_dcm;
	private JTextField v_hcm;
	private JTextField v_c1m;
	private JTextField v_c2m;
	private JTextField v_codm;
	private JButton btnNewButton_27;
	private JButton btnNewButton_28;
	private JMenuItem mntmNewMenuItem_28;
	private JLabel lblNewLabel_28;
	private JMenuItem mntmNewMenuItem_29;
	private JTextField av_ve;
	private JButton btnNewButton_29;
	private JTable table_7;
	private JLabel lblNewLabel_29;
	private JTextField ce_cpf;
	private JButton btnNewButton_30;
	private JTable table_8;
	private JScrollPane scrollPane_8;
	private JPanel panel_32;
	private JPanel panel_34;
	private JPanel panel_33;
	private JPanel panel_31;
	private JPanel panel_30;
	private JTextField age_cod;
	private JTable table_9;
	private JTextField fe_cpf;
	private JTable table_10;
	private JMenuItem mntmNewMenuItem_32;
	private JLabel lblNewLabel_32;
	private JTextField pe_cpf;
	private JButton btnNewButton_33;
	private JTable table_11;
	private JScrollPane scrollPane_11;
	private JTextField cp_num;
	private JTextField cp_valor;
	private JTextField cp_coda;
	private JTextField cp_cpf;
	private JTextField cp_id;
	private JLabel lblNewLabel_34;
	private JTextField del_pp;
	private JButton btnNewButton_35;
	private JTable table_12;
	private JPanel panel_35;
	private JPanel panel_36;
	private JPanel panel_38;
	private JPanel panel_39;
	private JPanel panel_40;
	private JLabel lblNewLabel_36;
	private JTextField mp_cod;
	private JTextField mp_num;
	private JTextField mp_valor;
	private JTextField mp_agen;
	private JTextField mp_cpf;
	private JTextField mp_id;
	private JButton btnNewButton_36;
	private JButton btnNewButton_37;
	private JMenu mnNewMenu_9;
	private JTextField pse_cod;
	private JTable table_13;
	private JTable table_14;
	private JLabel lblNewLabel_39;
	private JTextField ct_cpf;
	private JTextField ct_tel;
	private JTextField ctel_cpf;
	private JTextField ctel_tel;
	private JPanel panel_37;
	private JTextField vpi_cpf;
	private JTable table_15;
	private JTable table_16;
	private JTextField v_est;
	private JPanel panel_42;
	private JPanel panel_43;
	private JLabel lblNewLabel_43;
	private JMenuItem mntmNewMenuItem_43;
	private JTable table_17;
	private JScrollPane scrollPane_16;
	private JMenuItem mntmNewMenuItem_44;
	private JPanel panel_44;
	private JLabel lblNewLabel_44;
	private JTextField qnt_c;
	private JButton btnNewButton_44;
	private JTable table_18;
	private JScrollPane scrollPane_17;
	private JButton btnNewButton_39;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 657);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Agência");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("cadastrar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen1(panel_1);
			}
		});

		mntmNewMenuItem_17 = new JMenuItem("ver agências");
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_8_1);

				DefaultTableModel dm = (DefaultTableModel) table_1.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();

				AgenciaDAO adao = new AgenciaDAO();
				ArrayList<Agencia> agencias = new ArrayList<>();
				agencias = adao.getLista();

				for (int i = 0; i < agencias.size(); i++) {
					int cod = agencias.get(i).getCod();
					String cep = agencias.get(i).getCep();
					String estado = agencias.get(i).getEstado();
					String pais = agencias.get(i).getPais();
					String rua = agencias.get(i).getRua();
					String num = agencias.get(i).getNum();

					model.addRow(new Object[] { cod, cep, estado, pais, rua, num });
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("ver agência");
		mntmNewMenuItem_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_30);
				age_cod.setText("");
			}
		});
		mnNewMenu.add(mntmNewMenuItem_30);
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_25 = new JMenuItem("deletar");
		mntmNewMenuItem_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_21);
				a_dele.setText("");
			}
		});

		mntmNewMenuItem_26 = new JMenuItem("modificar");
		mntmNewMenuItem_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_22);
				ag_codm.setEnabled(true);
				ag_cepm.setEnabled(false);
				ag_em.setEnabled(false);
				ag_rm.setEnabled(false);
				ag_nm.setEnabled(false);
				ag_pam.setEnabled(false);
				
				ag_codm.setText("");
				ag_cepm.setText("");
				ag_em.setText("");
				ag_rm.setText("");
				ag_nm.setText("");
				ag_pam.setText("");
			}
		});
		mnNewMenu.add(mntmNewMenuItem_26);
		mnNewMenu.add(mntmNewMenuItem_25);

		JMenu mnNewMenu_1 = new JMenu("Avião");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_21 = new JMenuItem("cadastrar");
		mntmNewMenuItem_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_10);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_21);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("ver aviões");
		mntmNewMenuItem_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_12);

				DefaultTableModel dm = (DefaultTableModel) table_2.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_2.getModel();

				AviaoDAO adao = new AviaoDAO();
				ArrayList<Aviao> avioes = new ArrayList<>();
				avioes = adao.getLista();

				for (int i = 0; i < avioes.size(); i++) {
					int cod = avioes.get(i).getCod();
					int num = avioes.get(i).getNum_a();
					int cap = avioes.get(i).getCapacidade();
					String fab = avioes.get(i).getFabricante();
					String modelo = avioes.get(i).getModelo();
					int ano = avioes.get(i).getAno();
					String com = avioes.get(i).getCompanhia();
					int cda = avioes.get(i).getAgencia_fk();

					model.addRow(new Object[] { cod, num, cap, fab, modelo, ano, com, cda });
				}

			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_20);

		JMenuItem mntmNewMenuItem_19 = new JMenuItem("modificar");
		mntmNewMenuItem_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_23);
				
				av_codm.setText("");
				av_nm.setText("");
				av_cam.setText("");
				av_mom.setText("");
				av_capm.setText("");
				av_fm.setText("");
				av_anom.setText("");
				av_fkm.setText("");
				
				av_nm.setEnabled(false);
				av_cam.setEnabled(false);
				av_capm.setEnabled(false);
				av_mom.setEnabled(false);
				av_fm.setEnabled(false);
				av_anom.setEnabled(false);
				av_fkm.setEnabled(false);
			}
		});
		
		mntmNewMenuItem_29 = new JMenuItem("ver avião");
		mntmNewMenuItem_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_28);
				av_ve.setText("");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_29);
		mnNewMenu_1.add(mntmNewMenuItem_19);

		JMenuItem mntmNewMenuItem_18 = new JMenuItem("deletar");
		mntmNewMenuItem_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_16);
				av_del.setText("");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_18);

		JMenu mnNewMenu_2 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Ver clientes");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Switch_screen3(panel_3);

				DefaultTableModel dm = (DefaultTableModel) table.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				ClienteDAO cdao = new ClienteDAO();
				ArrayList<Cliente> clientes = new ArrayList<>();
				clientes = cdao.getLista();
				for (int i = 0; i < clientes.size(); i++) {
					String cpf = clientes.get(i).getCpf();
					String nome = clientes.get(i).getNome();
					String email = clientes.get(i).getEmail();
					String passaporte = clientes.get(i).getPassaporte();
					int idade = clientes.get(i).getIdade();
					String inf = clientes.get(i).getInf();

					model.addRow(new Object[] { cpf, nome, email, passaporte, idade, inf });
				}

			}
		});
		
		mnNewMenu_9 = new JMenu("Telefones");
		mnNewMenu_2.add(mnNewMenu_9);
		
		JMenuItem mntmNewMenuItem_40 = new JMenuItem("cadastrar");
		mntmNewMenuItem_40.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_37);
				ctel_cpf.setText("");
				ctel_tel.setText("");
			}
		});
		mnNewMenu_9.add(mntmNewMenuItem_40);
		
		JMenuItem mntmNewMenuItem_39 = new JMenuItem("ver");
		mntmNewMenuItem_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_39);
				
				DefaultTableModel dm = (DefaultTableModel) table_14.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_14.getModel();
				
				Telefones_cliDAO tdao = new Telefones_cliDAO();
				ClienteDAO cdaao = new ClienteDAO();
				
				ArrayList<Telefones_cli> ts = new ArrayList<>();
				ts = tdao.getLista();
				
				ArrayList<Cliente> cs = new ArrayList<>();
				
				for(int i=0; i< ts.size();i++) {
					String cpf = ts.get(i).getCpf_cliente();
					String telefone = ts.get(i).getTelefone();
					cs = cdaao.esp(cpf);
					for(int j = 0; j<cs.size(); j++) {
						String  nome = cs.get(j).getNome();
						model.addRow(new Object[] { nome,telefone});
					}
				}
				
			}
		});
		mnNewMenu_9.add(mntmNewMenuItem_39);
		
		JMenuItem mntmNewMenuItem_38 = new JMenuItem("deletar");
		mntmNewMenuItem_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_40);
				ct_cpf.setText("");
				ct_tel.setText("");
			}
		});
		mnNewMenu_9.add(mntmNewMenuItem_38);
		mnNewMenu_2.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Modificar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen4(panel_4);
			}
		});
		
		mntmNewMenuItem_28 = new JMenuItem("Ver cliente");
		mntmNewMenuItem_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_29);
				ce_cpf.setText("");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_28);
		mnNewMenu_2.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Deletar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen6(panel_6);
				cli_d.setText("");

			}
		});
		/*
		 * mntmNewMenuItem_2.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { Switch_screen(panel); } });
		 */
		mnNewMenu_2.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cadastrar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen2(panel_2);
				nome.setText("");
				cpf.setText("");
				email.setText("");
				idade.setText("");
				passaporte.setText("");
				inf.setText("");
				nome.setEnabled(false);
				email.setEnabled(false);
				idade.setEnabled(false);
				passaporte.setEnabled(false);
				inf.setEnabled(false);

			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_3 = new JMenu("");
		menuBar.add(mnNewMenu_3);

		JMenu mnNewMenu_4 = new JMenu("Funcionário");
		menuBar.add(mnNewMenu_4);

		mntmNewMenuItem_16 = new JMenuItem("cadastrar");
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_9);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_16);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("modificar");
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_24);
				f_cpfm.setText("");
				f_nm.setText("");
				f_sm.setText("");
				f_cmam.setText("");
				f_agm.setText("");
				
				f_cpfm.setEnabled(true);
				f_nm.setEnabled(false);
				f_sm.setEnabled(false);
				f_cmam.setEnabled(false);
				f_agm.setEnabled(false);
				
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_15);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("deletar");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_15);

			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_14);

		mntmNewMenuItem_13 = new JMenuItem("ver funcionários");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_13);

				DefaultTableModel dm = (DefaultTableModel) table_4.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_4.getModel();

				FuncionarioDAO fdao = new FuncionarioDAO();
				ArrayList<Funcionario> funcionarios = new ArrayList<>();
				funcionarios = fdao.getLista();

				for (int j = 0; j < funcionarios.size(); j++) {
					String cpff = funcionarios.get(j).getCpf();
					String nome = funcionarios.get(j).getNome();
					double salario = funcionarios.get(j).getSalario();
					String cma = funcionarios.get(j).getCma();
					int cod = funcionarios.get(j).getCod_agencia();

					model.addRow(new Object[] { cpff, nome, salario, cma, cod });
				}
			}
		});
		
		JMenuItem mntmNewMenuItem_31 = new JMenuItem("ver funcionário");
		mntmNewMenuItem_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_31);
				fe_cpf.setText("");
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_31);
		mnNewMenu_4.add(mntmNewMenuItem_13);

		JMenu mnNewMenu_5 = new JMenu("Viagem");
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("adicionar");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_7);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("ver voos");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_11);
				DefaultTableModel dm = (DefaultTableModel) table_3.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_3.getModel();

				FuncionarioDAO fdao = new FuncionarioDAO();
				PilotaDAO pdao = new PilotaDAO();
				ArrayList<Pilota> voos = new ArrayList<>();
				ArrayList<Funcionario> funcs = new ArrayList<>();
				funcs = fdao.getLista();

				voos = pdao.getLista();

				for (int i = 0; i < voos.size(); i++) {
					int id = voos.get(i).getId();
					String partida = voos.get(i).getPartida();
					String chegada = voos.get(i).getChegada();
					Date data_p = voos.get(i).getData_p();
					Date data_c = voos.get(i).getData_c();
					Time hora_p = voos.get(i).getHora_p();
					Time hora_c = voos.get(i).getHora_c();
					int cod_a = voos.get(i).getCod_a();
					String cpf_p1 = voos.get(i).getCpf_p1();
					String cpf_p2 = voos.get(i).getCpf_p2();
					String nome1 = "";
					String nome2 = "";

					for (int j = 0; j < funcs.size(); j++) {
						String cpf = funcs.get(j).getCpf();
						if (cpf.equals(cpf_p1)) {
							nome1 = funcs.get(j).getNome();
						} else {
							if (cpf.equals(cpf_p2)) {
								nome2 = funcs.get(j).getNome();
							}
						}
					}

					model.addRow(
							new Object[] { id, partida, chegada, data_p, data_c, hora_p, hora_c, cod_a, nome1, nome2 });
				}

			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("modificar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_27);
				
				v_id.setText("");
				v_pm.setText("");
				v_dm.setText("");
				v_dpm.setText("");
				v_hpm.setText("");
				v_dcm.setText("");
				v_hcm.setText("");
				v_codm.setText("");
				v_c1m.setText("");
				v_c2m.setText("");
				
				v_id.setEnabled(true);
				v_pm.setEnabled(false);
				v_dm.setEnabled(false);
				v_dpm.setEnabled(false);
				v_hpm.setEnabled(false);
				v_dcm.setEnabled(false);
				v_hcm.setEnabled(false);
				v_codm.setEnabled(false);
				v_c1m.setEnabled(false);
				v_c2m.setEnabled(false);
				
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("deletar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_17);
				vo_del.setText("");
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_6 = new JMenu("Piloto");
		menuBar.add(mnNewMenu_6);

		/*
		 * JMenuItem mntmNewMenuItem_11 = new JMenuItem("ver");
		 * mntmNewMenuItem_11.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { Switch_screen(panel_13);
		 * 
		 * DefaultTableModel dm = (DefaultTableModel)table_4.getModel();
		 * dm.getDataVector().removeAllElements(); dm.fireTableDataChanged();
		 * DefaultTableModel model = (DefaultTableModel) table_4.getModel();
		 * 
		 * 
		 * 
		 * 
		 * FuncionarioDAO fdao = new FuncionarioDAO(); ArrayList<Funcionario>
		 * funcionarios = new ArrayList<>(); funcionarios = fdao.getLista();
		 * 
		 * 
		 * for(int j =0; j< funcionarios.size();j++) { String cpff =
		 * funcionarios.get(j).getCpf(); String nome = funcionarios.get(j).getNome();
		 * double salario = funcionarios.get(j).getSalario(); String cma =
		 * funcionarios.get(j).getCma(); int cod = funcionarios.get(j).getCod_agencia();
		 * 
		 * model.addRow(new Object[] {cpff,nome,salario,cma,cod}); }
		 * 
		 * 
		 * } });
		 */

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("cadastrar");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_14);
			}
		});

		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu_6.add(menuBar_1);

		JMenu mnNewMenu_7 = new JMenu("Internacional");
		mnNewMenu_6.add(mnNewMenu_7);

		JMenuItem mntmNewMenuItem_23 = new JMenuItem("cadastrar");
		mntmNewMenuItem_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_18);
				ic_cpf.setText("");
				ic_pais.setText("");
				ic_moeda.setText("");
				ic_lingua.setText("");

				ic_pais.setEnabled(false);
				ic_moeda.setEnabled(false);
				ic_lingua.setEnabled(false);

			}
		});
		mnNewMenu_7.add(mntmNewMenuItem_23);

		JMenuItem mntmNewMenuItem_22 = new JMenuItem("ver pilotos internacionais");
		mntmNewMenuItem_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_19);

				DefaultTableModel dm = (DefaultTableModel) table_5.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_5.getModel();

				Internacional_pilotoDAO idao = new Internacional_pilotoDAO();
				PilotoDAO pdao = new PilotoDAO();
				FuncionarioDAO fdao = new FuncionarioDAO();

				ArrayList<Internacional_piloto> is = new ArrayList<>();
				ArrayList<Piloto> ps = new ArrayList<>();
				ArrayList<Funcionario> fs = new ArrayList<>();

				is = idao.getLista();
				ps = pdao.getLista();
				fs = fdao.getLista();

				for (int i = 0; i < is.size(); i++) {
					String cpf = is.get(i).getCpf_pi();
					String idioma = is.get(i).getIdioma();
					String moeda = is.get(i).getMoeda();
					String pais = is.get(i).getPais();
					String breve = "";
					double salario = 00;
					String nome = "";
					String cma = "";
					int cod = 0;

					for (int j = 0; j < ps.size(); j++) {
						if (cpf.equals(ps.get(j).getCpf_func())) {
							breve = ps.get(j).getBreve();
						}
					}

					for (int y = 0; y < fs.size(); y++) {
						if (cpf.equals(fs.get(y).getCpf())) {
							nome = fs.get(y).getNome();
							salario = fs.get(y).getSalario();
							cod = fs.get(y).getCod_agencia();
							cma = fs.get(y).getCma();
						}
					}
					model.addRow(new Object[] { cpf, nome, cma, salario, cod, breve, idioma, pais, moeda });
				}

			}
		});
		mnNewMenu_7.add(mntmNewMenuItem_22);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("modificar");
		mntmNewMenuItem_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_26);
				
				pi_cpfm.setText("");
				pi_bm.setText("");
				pi_cm.setText("");
				pi_cmam.setText("");
				pi_sm.setText("");
				pi_nm.setText("");
				pi_mm.setText("");
				pi_pm.setText("");
				pi_lm.setText("");
				
				pi_cpfm.setEnabled(true);
				pi_bm.setEnabled(false);
				pi_pm.setEnabled(false);
				pi_lm.setEnabled(false);
				pi_sm.setEnabled(false);
				pi_nm.setEnabled(false);
				pi_mm.setEnabled(false);
				pi_cmam.setEnabled(false);
				pi_cm.setEnabled(false);
			}
		});
		mnNewMenu_7.add(mntmNewMenuItem_27);
		mnNewMenu_6.add(mntmNewMenuItem_12);
		/* mnNewMenu_6.add(mntmNewMenuItem_11); */

		JMenuItem mntmNewMenuItem_24 = new JMenuItem("ver pilotos");
		mntmNewMenuItem_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_20);

				DefaultTableModel dm = (DefaultTableModel) table_6.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_6.getModel();

				PilotoDAO pdao = new PilotoDAO();
				FuncionarioDAO fdao = new FuncionarioDAO();

				ArrayList<Piloto> ps = new ArrayList<>();
				ArrayList<Funcionario> fs = new ArrayList<>();

				ps = pdao.getLista();
				fs = fdao.getLista();

				for (int i = 0; i < ps.size(); i++) {
					String cpf = ps.get(i).getCpf_func();
					String breve = ps.get(i).getBreve();
					String cma = "";
					double salario = 00;
					int cod = 0;
					String nome = "";

					for (int j = 0; j < fs.size(); j++) {
						if (cpf.equals(fs.get(j).getCpf())) {
							nome = fs.get(j).getNome();
							cma = fs.get(j).getCma();
							salario = fs.get(j).getSalario();
							cod = fs.get(j).getCod_agencia();
						}
					}

					model.addRow(new Object[] { cpf, nome, salario, cma, cod, breve });
				}

			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_24);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("modificar");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_25);
				p_nm.setText("");
				p_cpfm.setText("");
				p_sm.setText("");
				p_cmam.setText("");
				p_cm.setText("");
				p_bm.setText("");
				
				p_cpfm.setEnabled(true);
				p_nm.setEnabled(false);
				p_sm.setEnabled(false);
				p_cmam.setEnabled(false);
				p_bm.setEnabled(false);
				p_cm.setEnabled(false);
			}
		});
		
		mntmNewMenuItem_32 = new JMenuItem("ver piloto");
		mntmNewMenuItem_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_32);
				pe_cpf.setText("");
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_32);
		mnNewMenu_6.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_8 = new JMenu("Passagem");
		menuBar.add(mnNewMenu_8);
		
		JMenuItem mntmNewMenuItem_37 = new JMenuItem("cadastrar");
		mntmNewMenuItem_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_33);
				
				cp_id.setText("");
				cp_cpf.setText("");
				cp_coda.setText("");
				cp_valor.setText("");
				cp_num.setText("");
			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_37);
		
		JMenuItem mntmNewMenuItem_36 = new JMenuItem("modificar");
		mntmNewMenuItem_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_36);
				
				mp_cod.setText("");
				mp_num.setText("");
				mp_valor.setText("");
				mp_agen.setText("");
				mp_cpf.setText("");
				mp_id.setText("");
				
				mp_cod.setEnabled(true);
				mp_num.setEnabled(false);
				mp_valor.setEnabled(false);
				mp_agen.setEnabled(false);
				mp_cpf.setEnabled(false);
				mp_id.setEnabled(false);
				
			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_36);
		
		JMenuItem mntmNewMenuItem_35 = new JMenuItem("ver passagens");
		mntmNewMenuItem_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_35);
				DefaultTableModel dm = (DefaultTableModel) table_12.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_12.getModel();
				
				PassagemDAO pdao = new PassagemDAO();
				ArrayList<Passagem> ps = new ArrayList<>();
				ps = pdao.getLista();
				for(int i =0 ; i<ps.size();i++) {
					int cod = ps.get(i).getCod();
					String num = ps.get(i).getNum();
					float valor = ps.get(i).getValor();
					int agen = ps.get(i).getCod_agen();
					String cpf = ps.get(i).getCpf_cli();
					int id = ps.get(i).getId_pilota();
					
					model.addRow(new Object[] {cod,num,valor,agen,cpf,id });
				}
				
			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_35);
		
		JMenuItem mntmNewMenuItem_34 = new JMenuItem(" ver passagem");
		mntmNewMenuItem_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_38);
				pse_cod.setText("");			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_34);
		
		JMenuItem mntmNewMenuItem_33 = new JMenuItem("deletar");
		mntmNewMenuItem_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_34);
				del_pp.setText("");
			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_33);
		
		JMenu mnNewMenu_10 = new JMenu("Relatórios");
		menuBar.add(mnNewMenu_10);
		
		JMenuItem mntmNewMenuItem_42 = new JMenuItem("Relatório 1");
		mntmNewMenuItem_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_42);
				v_est.setText("");
				
			}
		});
		mnNewMenu_10.add(mntmNewMenuItem_42);
		
		mntmNewMenuItem_43 = new JMenuItem("Relatório 2");
		mntmNewMenuItem_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_43);
				DefaultTableModel dm = (DefaultTableModel) table_17.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_17.getModel();
				FuncionarioDAO fdao= new FuncionarioDAO();
				ArrayList<Funcionario> fs = new ArrayList<>();
				fs = fdao.ret2();
				for(int i =0; i< fs.size(); i++) {
					String cpf = fs.get(i).getCpf();
					String nome = fs.get(i).getNome();
					double salario = fs.get(i).getSalario();
					String cma = fs.get(i).getCma();
					int cod = fs.get(i).getCod_agencia();
					model.addRow(new Object[] {cpf,nome,salario,cma,cod});
				}
			}
		});
		mnNewMenu_10.add(mntmNewMenuItem_43);
		
		mntmNewMenuItem_44 = new JMenuItem("Relatório 3");
		mntmNewMenuItem_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_44);
				qnt_c.setText("");
				
				DefaultTableModel dm = (DefaultTableModel) table_18.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_18.getModel();
			}
		});
		mnNewMenu_10.add(mntmNewMenuItem_44);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(242, 225, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1043, 598);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
																																		
																																				panel_9 = new JPanel();
																																				panel_9.setBounds(0, 0, 1043, 598);
																																				layeredPane.add(panel_9);
																																				panel_9.setLayout(null);
																																				
																																						JButton btnNewButton_8 = new JButton("Enviar");
																																						btnNewButton_8.addActionListener(new ActionListener() {
																																							public void actionPerformed(ActionEvent e) {
																																								AgenciaDAO adao = new AgenciaDAO();
																																								FuncionarioDAO fdao = new FuncionarioDAO();
																																								String cpf = cpf_f.getText();
																																								int existe = fdao.existe(cpf);
																																								if(existe !=1) {
																																									String nome = nome_f.getText();
																																									double salario = Double.parseDouble(salario_f.getText());
																																									String cma = cma_f.getText();
																																									int cod_a = Integer.parseInt(cod_af.getText());
																																									Funcionario f = new Funcionario(cpf, nome, salario, cma, cod_a);
																																									int ex1 = adao.existe(cod_a);
																																									if(ex1 ==1) {
																																										int inseriu = fdao.insert(f);
																																										if (inseriu == 1) {
																																											JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
																																										} else {
																																											JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
																																										}
																																									}else {
																																										JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
																																									}
																																								}
																																								else {
																																									JOptionPane.showMessageDialog(null, "O piloto já foi cadastrado anteriormente!");
																																								}
																																								
																																								
																																							}
																																						});
																																						btnNewButton_8.setBounds(280, 513, 85, 21);
																																						panel_9.add(btnNewButton_8);
																																						
																																								cod_af = new JTextField();
																																								cod_af.setBounds(486, 436, 96, 19);
																																								panel_9.add(cod_af);
																																								cod_af.setColumns(10);
																																								
																																										cma_f = new JTextField();
																																										cma_f.setBounds(284, 382, 96, 19);
																																										panel_9.add(cma_f);
																																										cma_f.setColumns(10);
																																										
																																												salario_f = new JTextField();
																																												salario_f.setBounds(326, 332, 96, 19);
																																												panel_9.add(salario_f);
																																												salario_f.setColumns(10);
																																												
																																														nome_f = new JTextField();
																																														nome_f.setBounds(309, 278, 96, 19);
																																														panel_9.add(nome_f);
																																														nome_f.setColumns(10);
																																														
																																																cpf_f = new JTextField();
																																																cpf_f.setBounds(284, 227, 96, 19);
																																																panel_9.add(cpf_f);
																																																cpf_f.setColumns(10);
																																																
																																																		lblNewLabel_8 = new JLabel("");
																																																		lblNewLabel_8.setIcon(new ImageIcon(Principal.class.getResource("/imagens/cc_f.png")));
																																																		lblNewLabel_8.setBounds(0, 0, 1043, 598);
																																																		panel_9.add(lblNewLabel_8);
																																		
																																		panel_40 = new JPanel();
																																		panel_40.setBounds(0, 0, 1043, 598);
																																		layeredPane.add(panel_40);
																																		panel_40.setLayout(null);
																																		
																																		btnNewButton_39 = new JButton("enviar");
																																		btnNewButton_39.addActionListener(new ActionListener() {
																																			public void actionPerformed(ActionEvent e) {
																																				String cpf = ct_cpf.getText();
																																				String tel = ct_tel.getText();
																																				Telefones_cliDAO tdao = new Telefones_cliDAO();
																																				int existe = tdao.existe(cpf, tel);
																																				if(existe ==1) {
																																					int  del = tdao.excluir(cpf, tel);
																																					if(del ==1) {
																																						JOptionPane.showMessageDialog(null, "Telefone deletado com sucesso!");
																																					}
																																				}else {
																																					JOptionPane.showMessageDialog(null, "O telefone não foi encontrado no banco de dados!");
																																				}
																																				
																																			}
																																		});
																																		btnNewButton_39.setBounds(670, 437, 85, 21);
																																		panel_40.add(btnNewButton_39);
																																		
																																		ct_tel = new JTextField();
																																		ct_tel.setBounds(749, 359, 96, 19);
																																		panel_40.add(ct_tel);
																																		ct_tel.setColumns(10);
																																		
																																		ct_cpf = new JTextField();
																																		ct_cpf.setBounds(712, 308, 96, 19);
																																		panel_40.add(ct_cpf);
																																		ct_cpf.setColumns(10);
																																		
																																		lblNewLabel_39 = new JLabel("");
																																		lblNewLabel_39.setIcon(new ImageIcon(Principal.class.getResource("/imagens/del_tel.png")));
																																		lblNewLabel_39.setBounds(0, 0, 1043, 598);
																																		panel_40.add(lblNewLabel_39);
																																		
																																		
																																		
																																		panel_37 = new JPanel();
																																		panel_37.setBounds(0, 0, 1043, 598);
																																		layeredPane.add(panel_37);
																																		panel_37.setLayout(null);
																																		
																																		ctel_cpf = new JTextField();
																																		ctel_cpf.setBounds(263, 248, 96, 19);
																																		panel_37.add(ctel_cpf);
																																		ctel_cpf.setColumns(10);
																																		
																																		ctel_tel = new JTextField();
																																		ctel_tel.setBounds(326, 301, 96, 19);
																																		panel_37.add(ctel_tel);
																																		ctel_tel.setColumns(10);
																																		
																																		JButton btnNewButton_40 = new JButton("enviar");
																																		btnNewButton_40.addActionListener(new ActionListener() {
																																			public void actionPerformed(ActionEvent e) {
																																				Telefones_cliDAO tdao = new Telefones_cliDAO();
																																				ClienteDAO cdao = new ClienteDAO();
																																				
																																				String cpf = ctel_cpf.getText();
																																				String tel = ctel_tel.getText();
																																				
																																				int ex1 = cdao.existe(cpf);
																																				int ex2 = tdao.existe(cpf, tel);
																																				
																																				if(ex1 == 1 && ex2!=1) {
																																					Telefones_cli t = new Telefones_cli(cpf,tel);
																																					int inseriu = tdao.insert(t);
																																					if(inseriu ==1) {
																																						JOptionPane.showMessageDialog(null, "Telefone cadastrado com sucesso!");
																																					}
																																				} else if (ex1 == 1 && ex2 ==1){
																																					JOptionPane.showMessageDialog(null, "O telefone já existe no banco de dados!");
																																				}else if(ex1!=1) {
																																					JOptionPane.showMessageDialog(null, "O cliente não foi encontrado no banco de dados!");
																																				}
																																				
																																			}
																																		});
																																		btnNewButton_40.setBounds(210, 375, 85, 21);
																																		panel_37.add(btnNewButton_40);
																																		
																																		JLabel lblNewLabel_40 = new JLabel("");
																																		lblNewLabel_40.setIcon(new ImageIcon(Principal.class.getResource("/imagens/c_tel.png")));
																																		lblNewLabel_40.setBounds(0, 0, 1043, 598);
																																		panel_37.add(lblNewLabel_40);
																																		
																																		panel_34 = new JPanel();
																																		panel_34.setBounds(0, 0, 1043, 598);
																																		layeredPane.add(panel_34);
																																		panel_34.setLayout(null);
																																		
																																		btnNewButton_35 = new JButton("enviar");
																																		btnNewButton_35.addActionListener(new ActionListener() {
																																			public void actionPerformed(ActionEvent e) {
																																				int cod = Integer.parseInt(del_pp.getText());
																																				PassagemDAO pdao = new PassagemDAO();
																																				int existe = pdao.existe(cod);
																																				
																																				if(existe == 1) {
																																					int excluiu = pdao.excluir(cod);
																																					if(excluiu == 1) {
																																						JOptionPane.showMessageDialog(null, "Passagem excluida com sucesso!");
																																					}
																																				}else {
																																					JOptionPane.showMessageDialog(null, "Passagem não encontrada no banco de dados!");
																																				}
																																			}
																																		});
																																		btnNewButton_35.setBounds(670, 436, 85, 21);
																																		panel_34.add(btnNewButton_35);
																																		
																																		del_pp = new JTextField();
																																		del_pp.setBounds(735, 345, 96, 19);
																																		panel_34.add(del_pp);
																																		del_pp.setColumns(10);
																																		
																																		lblNewLabel_34 = new JLabel("");
																																		lblNewLabel_34.setIcon(new ImageIcon(Principal.class.getResource("/imagens/del_pass.png")));
																																		lblNewLabel_34.setBounds(0, 0, 1043, 598);
																																		panel_34.add(lblNewLabel_34);
																																		
																																		panel_27 = new JPanel();
																																		panel_27.setBounds(0, 0, 1043, 598);
																																		layeredPane.add(panel_27);
																																		panel_27.setLayout(null);
																																		
																																		btnNewButton_28 = new JButton("verificar");
																																		btnNewButton_28.addActionListener(new ActionListener() {
																																			public void actionPerformed(ActionEvent e) {
																																				PilotaDAO pdao = new PilotaDAO();
																																				int id = Integer.parseInt(v_id.getText());
																																				int existe = pdao.existe(id);
																																				
																																				if(existe == 1) {
																																					v_id.setEnabled(false);
																																					v_pm.setEnabled(true);
																																					v_dm.setEnabled(true);
																																					v_dpm.setEnabled(true);
																																					v_hpm.setEnabled(true);
																																					v_dcm.setEnabled(true);
																																					v_hcm.setEnabled(true);
																																					v_codm.setEnabled(true);
																																					v_c1m.setEnabled(true);
																																					v_c2m.setEnabled(true);
																																					
																																					ArrayList<Pilota> ps = new ArrayList<>();
																																					ps = pdao.esp(id);
																																					
																																					for(int i =0; i< ps.size(); i++) {
																																						v_pm.setText(ps.get(i).getPartida());
																																						v_dm.setText(ps.get(i).getChegada());
																																						Date dp = ps.get(i).getData_p();
																																						String dpm = String.valueOf(dp);
																																						v_dpm.setText(dpm);
																																						Time hp = ps.get(i).getHora_p();
																																						String hpm = String.valueOf(hp);
																																						v_hpm.setText(hpm);
																																						Date dc = ps.get(i).getData_c();
																																						String dcm = String.valueOf(dc);
																																						v_dcm.setText(dcm);
																																						Time hc = ps.get(i).getHora_c();
																																						String hcm = String.valueOf(hc);
																																						v_hcm.setText(hcm);
																																						int cod = ps.get(i).getCod_a();
																																						String c = String.valueOf(cod);
																																						v_codm.setText(c);
																																						v_c1m.setText(ps.get(i).getCpf_p1());
																																						v_c2m.setText(ps.get(i).getCpf_p2());
																																					}
																																				}
																																				else {
																																					JOptionPane.showMessageDialog(null, "Voo não encontrado no banco de dados");
																																				}
																																			}
																																		});
																																		btnNewButton_28.setBounds(705, 172, 85, 21);
																																		panel_27.add(btnNewButton_28);
																																		
																																		v_id = new JTextField();
																																		v_id.setBounds(584, 173, 96, 19);
																																		panel_27.add(v_id);
																																		v_id.setColumns(10);
																																		
																																		v_pm = new JTextField();
																																		v_pm.setBounds(651, 209, 96, 19);
																																		panel_27.add(v_pm);
																																		v_pm.setColumns(10);
																																		
																																		v_dm = new JTextField();
																																		v_dm.setBounds(651, 249, 96, 19);
																																		panel_27.add(v_dm);
																																		v_dm.setColumns(10);
																																		
																																		v_dpm = new JTextField();
																																		v_dpm.setBounds(651, 289, 96, 19);
																																		panel_27.add(v_dpm);
																																		v_dpm.setColumns(10);
																																		
																																		v_hpm = new JTextField();
																																		v_hpm.setBounds(651, 331, 96, 19);
																																		panel_27.add(v_hpm);
																																		v_hpm.setColumns(10);
																																		
																																		v_dcm = new JTextField();
																																		v_dcm.setBounds(651, 370, 96, 19);
																																		panel_27.add(v_dcm);
																																		v_dcm.setColumns(10);
																																		
																																		v_hcm = new JTextField();
																																		v_hcm.setBounds(661, 408, 96, 19);
																																		panel_27.add(v_hcm);
																																		v_hcm.setColumns(10);
																																		
																																		v_c1m = new JTextField();
																																		v_c1m.setBounds(636, 451, 96, 19);
																																		panel_27.add(v_c1m);
																																		v_c1m.setColumns(10);
																																		
																																		v_c2m = new JTextField();
																																		v_c2m.setBounds(636, 491, 96, 19);
																																		panel_27.add(v_c2m);
																																		v_c2m.setColumns(10);
																																		
																																		v_codm = new JTextField();
																																		v_codm.setBounds(651, 526, 96, 19);
																																		panel_27.add(v_codm);
																																		v_codm.setColumns(10);
																																		
																																		btnNewButton_27 = new JButton("enviar");
																																		btnNewButton_27.addActionListener(new ActionListener() {
																																			public void actionPerformed(ActionEvent e) {
																																				PilotaDAO pdao = new PilotaDAO();
																																				PilotoDAO ppdao = new PilotoDAO();
																																				AgenciaDAO adao = new AgenciaDAO();
																																				int id = Integer.parseInt(v_id.getText());
																																				String partida = v_pm.getText();
																																				String chegada = v_dm.getText();
																																				Date dp = Date.valueOf(v_dpm.getText());
																																				Time hp = Time.valueOf(v_hpm.getText());
																																				Date dc = Date.valueOf(v_dcm.getText());
																																				Time hc = Time.valueOf(v_hcm.getText());
																																				String cpf1 = v_c1m.getText();
																																				String cpf2 = v_c2m.getText();
																																				int cod = Integer.parseInt(v_codm.getText());
																																				
																																				int e1 = ppdao.existe(cpf1);
																																				int e2 = ppdao.existe(cpf2);
																																				if(e1 == 1 && e2 ==1) {
																																					int ex3 = adao.existe(cod);
																																						if(ex3==1){
																																							int deu = pdao.update(id, partida, chegada, dp, dc, hp, hc, cod, cpf1, cpf2);
																																							if(deu ==1 ) {
																																								JOptionPane.showMessageDialog(null, "Voo editado com sucesso!");
																																							}
																																						}else {
																																							JOptionPane.showMessageDialog(null, "Avião não encontrada no banco de dados");
																																						}
																									
																																					
																																				}else if (e1 != 1 && e2 !=1) {
																																					JOptionPane.showMessageDialog(null, "Nenhum dos pilotos foi encontrado no banco de daods!");
																																				} else if(e1 == 1 && e2 != 1) {
																																					JOptionPane.showMessageDialog(null, "Pilot 2 não encontrado no banco de dados!");
																																					
																																				}else if(e1 != 1 && e2 == 1) {
																																					JOptionPane.showMessageDialog(null, "Piloto 1 não encontrado no banco de dados!");
																																				}
																																				
																																			}
																																		});
																																		btnNewButton_27.setBounds(677, 556, 85, 21);
																																		panel_27.add(btnNewButton_27);
																																		
																																		lblNewLabel_27 = new JLabel("");
																																		lblNewLabel_27.setIcon(new ImageIcon(Principal.class.getResource("/imagens/mod_voos.png")));
																																		lblNewLabel_27.setBounds(0, 0, 1043, 598);
																																		panel_27.add(lblNewLabel_27);
																																
																																		panel_7 = new JPanel();
																																		panel_7.setBounds(0, 0, 1043, 598);
																																		layeredPane.add(panel_7);
																																		panel_7.setLayout(null);
																																		
																																				cod_av = new JTextField();
																																				cod_av.setBounds(333, 476, 96, 19);
																																				panel_7.add(cod_av);
																																				cod_av.setColumns(10);
																																				
																																						cpf2 = new JTextField();
																																						cpf2.setBounds(333, 433, 96, 19);
																																						panel_7.add(cpf2);
																																						cpf2.setColumns(10);
																																						
																																								cpf1 = new JTextField();
																																								cpf1.setBounds(333, 394, 96, 19);
																																								panel_7.add(cpf1);
																																								cpf1.setColumns(10);
																																								
																																										hc_v = new JTextField();
																																										hc_v.setBounds(333, 348, 96, 19);
																																										panel_7.add(hc_v);
																																										hc_v.setColumns(10);
																																										
																																												dc_v = new JTextField();
																																												dc_v.setBounds(333, 309, 96, 19);
																																												panel_7.add(dc_v);
																																												dc_v.setColumns(10);
																																												
																																														hp_v = new JTextField();
																																														hp_v.setBounds(333, 268, 96, 19);
																																														panel_7.add(hp_v);
																																														hp_v.setColumns(10);
																																														
																																																dp_v = new JTextField();
																																																dp_v.setBounds(333, 228, 96, 19);
																																																panel_7.add(dp_v);
																																																dp_v.setColumns(10);
																																																
																																																		JButton btnNewButton_7 = new JButton("enviar");
																																																		btnNewButton_7.addActionListener(new ActionListener() {
																																																			public void actionPerformed(ActionEvent e) {
																																																				PilotaDAO pdao = new PilotaDAO();
																																																				AviaoDAO adao = new AviaoDAO();
																																																				String partida = lp_v.getText();
																																																				String chegada = ld_v.getText();
																																																				Date datac = Date.valueOf(dc_v.getText());
																																																				Date datap = Date.valueOf(dp_v.getText());
																																																				Time horac = Time.valueOf(hc_v.getText());
																																																				Time horap = Time.valueOf(hp_v.getText());
																																																				String cpfp1 = cpf1.getText();
																																																				String cpfp2 = cpf2.getText();
																																																				PilotoDAO ppdao = new PilotoDAO();
																																																				int cod = Integer.parseInt(cod_av.getText());
																																																				String formato = "yyyy-MM-dd";
																																																				int existe1 = ppdao.existe(cpfp2);
																																																				int ex2 = ppdao.existe(cpfp1);
																																																				if (existe1 == 1) {
																																																					if (ex2 == 1) {
																																																						int ex3 = adao.existe(cod);
																																																						if (ex3 == 1) {
																																																							Pilota p = new Pilota(partida, chegada, datac, datac, horap, horac, cod, cpfp1, cpfp2);
																																																							int inseriu = pdao.insert(p);
																																																							if (inseriu >= 1) {
																																																								JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
																																																							} else {
																																																								JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
																																																							}
																																																						} else {
																																																							JOptionPane.showMessageDialog(null, "Avião não cadastrado");
																																																						}
																																																					} else {
																																																						JOptionPane.showMessageDialog(null, " Piloto 2 não cadastrado");
																																																					}
																																																				} else {
																																																					JOptionPane.showMessageDialog(null, "Piloto 1 não cadastrado");
																																																				}

																																																			}
																																																		});
																																																		btnNewButton_7.setBounds(346, 532, 85, 21);
																																																		panel_7.add(btnNewButton_7);
																																																		
																																																				ld_v = new JTextField();
																																																				ld_v.setBounds(333, 188, 96, 19);
																																																				panel_7.add(ld_v);
																																																				ld_v.setColumns(10);
																																																				
																																																						lp_v = new JTextField();
																																																						lp_v.setBounds(333, 148, 96, 19);
																																																						panel_7.add(lp_v);
																																																						lp_v.setColumns(10);
																																																						
																																																								JLabel lblNewLabel_6 = new JLabel("");
																																																								lblNewLabel_6.setBounds(0, 0, 1043, 598);
																																																								lblNewLabel_6.setIcon(new ImageIcon(Principal.class.getResource("/imagens/voos.jpeg")));
																																																								panel_7.add(lblNewLabel_6);
																														
																																panel_5 = new JPanel();
																																panel_5.setBounds(0, 0, 1043, 598);
																																layeredPane.add(panel_5);
																																panel_5.setLayout(null);
																																
																																		JButton btnNewButton_6 = new JButton("enviar");
																																		btnNewButton_6.addActionListener(new ActionListener() {
																																			public void actionPerformed(ActionEvent e) {
																																				/*
																																				 * String p = partida.getText(); String c = chegada.getText(); Date datap =
																																				 * Date.valueOf(dp.getText()); Date datac = Date.valueOf(dc.getText()); Time tp
																																				 * = Time.valueOf(hp.getText()); Time tc = Time.valueOf(hc.getText());
																																				 */

																																			}
																																		});
																																		btnNewButton_6.setBounds(328, 505, 85, 21);
																																		panel_5.add(btnNewButton_6);
																																		
																																				hc = new JTextField();
																																				hc.setBounds(402, 427, 96, 19);
																																				panel_5.add(hc);
																																				hc.setColumns(10);
																																				
																																						dc = new JTextField();
																																						dc.setBounds(402, 384, 96, 19);
																																						panel_5.add(dc);
																																						dc.setColumns(10);
																																						
																																								hp = new JTextField();
																																								hp.setBounds(390, 337, 96, 19);
																																								panel_5.add(hp);
																																								hp.setColumns(10);
																																								
																																										dp = new JTextField();
																																										dp.setBounds(390, 292, 96, 19);
																																										panel_5.add(dp);
																																										dp.setColumns(10);
																																										
																																												chegada = new JTextField();
																																												chegada.setBounds(390, 240, 96, 19);
																																												panel_5.add(chegada);
																																												chegada.setColumns(10);
																																												
																																														partida = new JTextField();
																																														partida.setBounds(390, 191, 96, 19);
																																														panel_5.add(partida);
																																														partida.setColumns(10);
																																														
																																																lblNewLabel_5 = new JLabel("");
																																																lblNewLabel_5.setBounds(0, 0, 1043, 598);
																																																panel_5.add(lblNewLabel_5);
																														
																														panel_33 = new JPanel();
																														panel_33.setBounds(0, 0, 1043, 598);
																														layeredPane.add(panel_33);
																														panel_33.setLayout(null);
																														
																														JButton btnNewButton_34 = new JButton("enviar");
																														btnNewButton_34.addActionListener(new ActionListener() {
																															public void actionPerformed(ActionEvent e) {
																																PassagemDAO pdao = new PassagemDAO();
																																ClienteDAO cdao = new ClienteDAO();
																																PilotaDAO ppdao = new PilotaDAO();
																																
																																String cpf = cp_cpf.getText();
																																int id = Integer.parseInt(cp_id.getText());
																																int cod_agen = Integer.parseInt(cp_coda.getText());
																																float valor = Float.valueOf(cp_valor.getText());
																																String num = cp_num.getText();
																																
																																int ex1 = cdao.existe(cpf);
																																int ex2 = ppdao.existe(id);
																																
																																if(ex1 == 1 && ex2==1) {
																																	Passagem p = new Passagem(num,valor,cod_agen,cpf,id);
																																	int inseriu = pdao.insert(p);
																																	if(inseriu == 1) {
																																		JOptionPane.showMessageDialog(null, "Passagem cadastrada com sucesso!");
																																	}
																																}else if(ex1 == 1 && ex2!=1) {
																																	JOptionPane.showMessageDialog(null, "O cliente não está no banco de dados!");
																																}else if(ex1 !=1 && ex2 ==1) {
																																	JOptionPane.showMessageDialog(null, "O voo não existe no banco de dados");
																																}
																																
																															}
																														});
																														btnNewButton_34.setBounds(694, 525, 85, 21);
																														panel_33.add(btnNewButton_34);
																														
																														cp_id = new JTextField();
																														cp_id.setBounds(683, 366, 96, 19);
																														panel_33.add(cp_id);
																														cp_id.setColumns(10);
																														
																														cp_cpf = new JTextField();
																														cp_cpf.setBounds(734, 318, 96, 19);
																														panel_33.add(cp_cpf);
																														cp_cpf.setColumns(10);
																														
																														cp_coda = new JTextField();
																														cp_coda.setBounds(713, 270, 96, 19);
																														panel_33.add(cp_coda);
																														cp_coda.setColumns(10);
																														
																														cp_valor = new JTextField();
																														cp_valor.setBounds(800, 229, 96, 19);
																														panel_33.add(cp_valor);
																														cp_valor.setColumns(10);
																														
																														cp_num = new JTextField();
																														cp_num.setBounds(734, 189, 96, 19);
																														panel_33.add(cp_num);
																														cp_num.setColumns(10);
																														
																														JLabel lblNewLabel_33 = new JLabel("");
																														lblNewLabel_33.setIcon(new ImageIcon(Principal.class.getResource("/imagens/c_pass.png")));
																														lblNewLabel_33.setBounds(0, 0, 1043, 598);
																														panel_33.add(lblNewLabel_33);
																														
																														panel_24 = new JPanel();
																														panel_24.setBounds(0, 0, 1044, 598);
																														layeredPane.add(panel_24);
																														panel_24.setLayout(null);
																														
																														btnNewButton_23 = new JButton("verificar");
																														btnNewButton_23.addActionListener(new ActionListener() {
																															public void actionPerformed(ActionEvent e) {
																																String cpf = f_cpfm.getText();
																																FuncionarioDAO fdao = new FuncionarioDAO();
																																int existe = fdao.existe(cpf);
																																
																																if(existe == 1) {
																																	ArrayList<Funcionario> func = new ArrayList<>();
																																	func = fdao.esp(cpf);
																																	f_cpfm.setEnabled(false);
																																	f_nm.setEnabled(true);
																																	f_sm.setEnabled(true);
																																	f_cmam.setEnabled(true);
																																	f_agm.setEnabled(true);
																																	
																																	for(int i =0; i < func.size(); i++) {
																																		double sal = func.get(i).getSalario();
																																		String s = String.valueOf(sal);
																																		int agen = func.get(i).getCod_agencia();
																																		String a = String.valueOf(agen);
																																		f_nm.setText(func.get(i).getNome());
																																		f_sm.setText(s);
																																		f_cmam.setText(func.get(i).getCma());
																																		f_agm.setText(a);
																																	}
																																	
																																}
																																else {
																																	JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados");
																																}
																															}
																														});
																														btnNewButton_23.setBounds(362, 226, 85, 21);
																														panel_24.add(btnNewButton_23);
																														
																														f_cpfm = new JTextField();
																														f_cpfm.setBounds(243, 227, 96, 19);
																														panel_24.add(f_cpfm);
																														f_cpfm.setColumns(10);
																														
																														f_nm = new JTextField();
																														f_nm.setBounds(278, 280, 96, 19);
																														panel_24.add(f_nm);
																														f_nm.setColumns(10);
																														
																														f_sm = new JTextField();
																														f_sm.setBounds(303, 332, 96, 19);
																														panel_24.add(f_sm);
																														f_sm.setColumns(10);
																														
																														f_cmam = new JTextField();
																														f_cmam.setBounds(267, 384, 96, 19);
																														panel_24.add(f_cmam);
																														f_cmam.setColumns(10);
																														
																														f_agm = new JTextField();
																														f_agm.setBounds(459, 440, 96, 19);
																														panel_24.add(f_agm);
																														f_agm.setColumns(10);
																														
																														btnNewButton_22 = new JButton("enviar");
																														btnNewButton_22.addActionListener(new ActionListener() {
																															public void actionPerformed(ActionEvent e) {
																																AgenciaDAO adao = new AgenciaDAO();
																																String cpf = f_cpfm.getText();
																																int cod = Integer.parseInt(f_agm.getText());
																																String nome = f_nm.getText();
																																String cma = f_cmam.getText();
																																double salario = Double.parseDouble(f_sm.getText());
																																
																																FuncionarioDAO fdao = new FuncionarioDAO();
																																int ex1 = adao.existe(cod);
																																if(ex1 ==1) {
																																	int deu = fdao.update(cpf, nome, salario, cma, cod);
																																	if(deu == 1) {
																																		JOptionPane.showMessageDialog(null, "Funcionário modificado com sucesso");
																																	}
																																}else {
																																	JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
																																}
																																
																																
																															}
																														});
																														btnNewButton_22.setBounds(254, 492, 85, 21);
																														panel_24.add(btnNewButton_22);
																														
																														lblNewLabel_24 = new JLabel("");
																														lblNewLabel_24.setIcon(new ImageIcon(Principal.class.getResource("/imagens/mod_func.png")));
																														lblNewLabel_24.setBounds(0, 0, 1044, 598);
																														panel_24.add(lblNewLabel_24);
																										
																												panel_4 = new JPanel();
																												panel_4.setBounds(0, 0, 1043, 598);
																												layeredPane.add(panel_4);
																												panel_4.setLayout(null);
																												
																														JButton btnNewButton_4 = new JButton("verifica");
																														btnNewButton_4.addActionListener(new ActionListener() {
																															public void actionPerformed(ActionEvent e) {
																																String cpf = cli_cu.getText();
																																ClienteDAO cdao = new ClienteDAO();
																																int inseriu = cdao.existe(cpf);
																																if (inseriu == 1) {
																																	ArrayList<Cliente> cs = new ArrayList<>();
																																	cs = cdao.esp(cpf);
																																	cli_cu.setEnabled(false);
																																	cli_cn.setEnabled(true);
																																	cli_cp.setEnabled(true);
																																	cli_cid.setEnabled(true);
																																	cli_ce.setEnabled(true);
																																	cli_cif.setEnabled(true);
																																	
																																	
																																	
																																	for(int i =0; i< cs.size(); i++) {
																																		
											
																																		cli_cn.setText(cs.get(i).getNome());
																																		cli_cp.setText(cs.get(i).getPassaporte());
																																		cli_ce.setText(cs.get(i).getEmail());
																																		cli_cif.setText(cs.get(i).getInf());
																																		int ida = cs.get(i).getIdade();
																																		String id = String.valueOf(ida);
																																		cli_cid.setText(id);
																																	}
																																} else {
																																	JOptionPane.showMessageDialog(null, "CPF não encontrado no bdd");
																																}
																															}
																														});
																														btnNewButton_4.setBounds(729, 240, 85, 21);
																														panel_4.add(btnNewButton_4);
																														
																																cli_cu = new JTextField();
																																cli_cu.setBounds(602, 241, 96, 19);
																																panel_4.add(cli_cu);
																																cli_cu.setColumns(10);
																																
																																		cli_cn = new JTextField();
																																		cli_cn.setText("");
																																		cli_cn.setBounds(631, 287, 96, 19);
																																		panel_4.add(cli_cn);
																																		cli_cn.setColumns(10);
																																		cli_cn.setEnabled(false);
																																		
																																				cli_cp = new JTextField();
																																				cli_cp.setBounds(705, 380, 96, 19);
																																				panel_4.add(cli_cp);
																																				cli_cp.setColumns(10);
																																				cli_cp.setEnabled(false);
																																				
																																						cli_cid = new JTextField();
																																						cli_cid.setBounds(631, 420, 96, 19);
																																						panel_4.add(cli_cid);
																																						cli_cid.setColumns(10);
																																						cli_cid.setEnabled(false);
																																						
																																								cli_cif = new JTextField();
																																								cli_cif.setBounds(741, 470, 96, 19);
																																								panel_4.add(cli_cif);
																																								cli_cif.setColumns(10);
																																								cli_cif.setEnabled(false);
																																								
																																										JButton btnNewButton_2 = new JButton("Enviar");
																																										btnNewButton_2.addActionListener(new ActionListener() {
																																											public void actionPerformed(ActionEvent e) {
																																												String cpf = cli_cu.getText();
																																												String nome = cli_cn.getText();
																																												String email = cli_ce.getText();
																																												String passaporte = cli_cp.getText();
																																												int idade = Integer.parseInt(cli_cid.getText());
																																												String inf = cli_cif.getText();
																																												ClienteDAO cdao = new ClienteDAO();
																																												// if(cdao.existe())
																																												int inseriu = cdao.update(nome, email, passaporte, idade, inf, cpf);
																																												if (inseriu == 1) {
																																													JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
																																												}
																																											}
																																										});
																																										btnNewButton_2.setBounds(646, 528, 85, 21);
																																										panel_4.add(btnNewButton_2);
																																										
																																												cli_ce = new JTextField();
																																												cli_ce.setBounds(631, 332, 96, 19);
																																												panel_4.add(cli_ce);
																																												cli_ce.setColumns(10);
																																												cli_ce.setEnabled(false);
																																												
																																														JLabel lblNewLabel_4 = new JLabel("");
																																														lblNewLabel_4.setIcon(new ImageIcon(Principal.class.getResource("/imagens/8.png")));
																																														lblNewLabel_4.setBounds(0, 0, 1043, 598);
																																														panel_4.add(lblNewLabel_4);
																										
																										panel_23 = new JPanel();
																										panel_23.setBounds(0, 0, 1044, 597);
																										layeredPane.add(panel_23);
																										panel_23.setLayout(null);
																										
																										JButton btnNewButton_21 = new JButton("verificar");
																										btnNewButton_21.addActionListener(new ActionListener() {
																											public void actionPerformed(ActionEvent e) {
																												int cod = Integer.parseInt(av_codm.getText());
																												AviaoDAO adao = new AviaoDAO();
																												int existe = adao.existe(cod);
																												
																												if(existe == 1) {
																													ArrayList<Aviao> aviao = new ArrayList<>();
																													aviao = adao.esp(cod);
																													av_nm.setEnabled(true);
																													av_cam.setEnabled(true);
																													av_capm.setEnabled(true);
																													av_mom.setEnabled(true);
																													av_fm.setEnabled(true);
																													av_anom.setEnabled(true);
																													av_fkm.setEnabled(true);
																													
																													for(int i =0; i < aviao.size();i++) {
																														int num = aviao.get(i).getNum_a();
																														String n = String.valueOf(num);
																														int cap = aviao.get(i).getCapacidade();
																														String c = String.valueOf(cap);
																														int ano = aviao.get(i).getAno();
																														String a = String.valueOf(ano);
																														int agen = aviao.get(i).getAgencia_fk();
																														String ag = String.valueOf(agen);
																														
																														av_nm.setText(n);
																														av_cam.setText(aviao.get(i).getCompanhia());
																														av_capm.setText(c);
																														av_mom.setText(aviao.get(i).getModelo());
																														av_fm.setText(aviao.get(i).getFabricante());
																														av_anom.setText(a);
																														av_fkm.setText(ag);
																														
																													}
																													
																												}
																												else {
																													JOptionPane.showMessageDialog(null, "Avião não encontrado no banco de dados!");
																												}
																											}
																										});
																										
																										av_fkm = new JTextField();
																										av_fkm.setBounds(360, 484, 96, 19);
																										panel_23.add(av_fkm);
																										av_fkm.setColumns(10);
																										btnNewButton_21.setBounds(343, 203, 85, 21);
																										panel_23.add(btnNewButton_21);
																										
																										av_capm = new JTextField();
																										av_capm.setBounds(435, 287, 96, 19);
																										panel_23.add(av_capm);
																										av_capm.setColumns(10);
																										
																										av_codm = new JTextField();
																										av_codm.setBounds(220, 204, 96, 19);
																										panel_23.add(av_codm);
																										av_codm.setColumns(10);
																										
																										av_nm = new JTextField();
																										av_nm.setBounds(377, 245, 96, 19);
																										panel_23.add(av_nm);
																										av_nm.setColumns(10);
																										
																										av_fm = new JTextField();
																										av_fm.setBounds(377, 332, 96, 19);
																										panel_23.add(av_fm);
																										av_fm.setColumns(10);
																										
																										av_mom = new JTextField();
																										av_mom.setBounds(332, 372, 96, 19);
																										panel_23.add(av_mom);
																										av_mom.setColumns(10);
																										
																										av_anom = new JTextField();
																										av_anom.setBounds(461, 410, 96, 19);
																										panel_23.add(av_anom);
																										av_anom.setColumns(10);
																										
																										av_cam = new JTextField();
																										av_cam.setBounds(529, 452, 96, 19);
																										panel_23.add(av_cam);
																										av_cam.setColumns(10);
																										
																										JButton btnNewButton_20 = new JButton("enviar");
																										btnNewButton_20.addActionListener(new ActionListener() {
																											public void actionPerformed(ActionEvent e) {
																												AgenciaDAO aadao = new AgenciaDAO();
																												int cod = Integer.parseInt(av_codm.getText());
																												int num = Integer.parseInt(av_nm.getText());
																												int ag = Integer.parseInt(av_fkm.getText());
																												int ano = Integer.parseInt(av_anom.getText());
																												int cap = Integer.parseInt(av_capm.getText());
																												String com = av_cam.getText();
																												String fab = av_fm.getText();
																												String m = av_mom.getText();
																												
																												AviaoDAO adao = new AviaoDAO();
																												int ex1 = aadao.existe(ag);
																												if(ex1 ==1) {
																													int deu = adao.update(num, cap, fab, m, ano, com, ag, cod)	;
																													
																													if(deu == 1) {
																														JOptionPane.showInternalMessageDialog(null, "Avião modificado com sucesso");
																													}
																												}else {
																													JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
																												}
					
																											}
																										});
																										btnNewButton_20.setBounds(353, 528, 85, 21);
																										panel_23.add(btnNewButton_20);
																										
																										JLabel lblNewLabel_23 = new JLabel("");
																										lblNewLabel_23.setIcon(new ImageIcon(Principal.class.getResource("/imagens/av_mod.png")));
																										lblNewLabel_23.setBounds(2, -1, 1040, 600);
																										panel_23.add(lblNewLabel_23);
																								
																										panel_22 = new JPanel();
																										panel_22.setBounds(0, 0, 1043, 598);
																										layeredPane.add(panel_22);
																										panel_22.setLayout(null);
																										
																												btnNewButton_18 = new JButton("enviar");
																												btnNewButton_18.addActionListener(new ActionListener() {
																													public void actionPerformed(ActionEvent e) {
																														String rua = ag_rm.getText();
																														int num = Integer.parseInt(ag_nm.getText());
																														int cod = Integer.parseInt(ag_codm.getText());
																														String estado = ag_em.getText();
																														String pais = ag_pam.getText();
																														String cep = ag_cepm.getText();
																														
																														AgenciaDAO adao = new AgenciaDAO();
																														int deu = adao.update(cod, cep, rua, estado, pais, cep);
																														if(deu == 1) {
																															JOptionPane.showMessageDialog(null, "agência modificada com sucesso");
																														}
																														
																													}
																												});
																												btnNewButton_18.setBounds(644, 528, 85, 21);
																												panel_22.add(btnNewButton_18);
																										
																										ag_pam = new JTextField();
																										ag_pam.setBounds(616, 383, 96, 19);
																										panel_22.add(ag_pam);
																										ag_pam.setColumns(10);
																										
																												btnNewButton_19 = new JButton("verificar");
																												btnNewButton_19.addActionListener(new ActionListener() {
																													public void actionPerformed(ActionEvent e) {
																														int cod = Integer.parseInt(ag_codm.getText());
																														AgenciaDAO adao = new AgenciaDAO();
																														int existe = adao.existe(cod);
																														if(existe == 1) {
																															ag_cepm.setEnabled(true);
																															ag_pam.setEnabled(true);
																															ag_nm.setEnabled(true);
																															ag_rm.setEnabled(true);
																															ag_em.setEnabled(true);
																															ArrayList<Agencia> agencia = new ArrayList<>();
																															agencia = adao.esp(cod);
																															for(int i = 0; i < agencia.size(); i++) {
																																ag_cepm.setText(agencia.get(i).getCep());
																																ag_pam.setText(agencia.get(i).getPais());
																																ag_nm.setText(agencia.get(i).getNum());
																																ag_rm.setText(agencia.get(i).getRua());
																																ag_em.setText(agencia.get(i).getEstado());
																															}
																														}else {
																															JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
																														}
																														
																													}
																												});
																												btnNewButton_19.setBounds(786, 239, 85, 21);
																												panel_22.add(btnNewButton_19);
																														
																																ag_nm = new JTextField();
																																ag_nm.setBounds(671, 481, 96, 19);
																																panel_22.add(ag_nm);
																																ag_nm.setColumns(10);
																																
																																		ag_rm = new JTextField();
																																		ag_rm.setBounds(616, 432, 96, 19);
																																		panel_22.add(ag_rm);
																																		ag_rm.setColumns(10);
																																		
																																				ag_em = new JTextField();
																																				ag_em.setBounds(661, 334, 96, 19);
																																				panel_22.add(ag_em);
																																				ag_em.setColumns(10);
																																				
																																						ag_cepm = new JTextField();
																																						ag_cepm.setBounds(616, 289, 96, 19);
																																						panel_22.add(ag_cepm);
																																						ag_cepm.setColumns(10);
																																						
																																								ag_codm = new JTextField();
																																								ag_codm.setBounds(661, 240, 96, 19);
																																								panel_22.add(ag_codm);
																																								ag_codm.setColumns(10);
																																								
																																										lblNewLabel_22 = new JLabel("");
																																										lblNewLabel_22.setIcon(new ImageIcon(Principal.class.getResource("/imagens/mod_ag.png")));
																																										lblNewLabel_22.setBounds(0, 0, 1043, 598);
																																										panel_22.add(lblNewLabel_22);
																						
																								panel_10 = new JPanel();
																								panel_10.setBounds(0, 0, 1043, 598);
																								layeredPane.add(panel_10);
																								panel_10.setLayout(null);
																								
																										cod_agv = new JTextField();
																										cod_agv.setBounds(692, 462, 96, 19);
																										panel_10.add(cod_agv);
																										cod_agv.setColumns(10);
																										
																												cm_av = new JTextField();
																												cm_av.setBounds(947, 415, 96, 19);
																												panel_10.add(cm_av);
																												cm_av.setColumns(10);
																												
																														ano_av = new JTextField();
																														ano_av.setBounds(884, 368, 96, 19);
																														panel_10.add(ano_av);
																														ano_av.setColumns(10);
																														
																																fb_av = new JTextField();
																																fb_av.setBounds(795, 278, 96, 19);
																																panel_10.add(fb_av);
																																fb_av.setColumns(10);
																																
																																		modelo_av = new JTextField();
																																		modelo_av.setBounds(765, 326, 96, 19);
																																		panel_10.add(modelo_av);
																																		modelo_av.setColumns(10);
																																		
																																				cap_av = new JTextField();
																																				cap_av.setBounds(870, 235, 96, 19);
																																				panel_10.add(cap_av);
																																				cap_av.setColumns(10);
																																				
																																						num_av = new JTextField();
																																						num_av.setBounds(808, 186, 96, 19);
																																						panel_10.add(num_av);
																																						num_av.setColumns(10);
																																						
																																								JButton btnNewButton_10 = new JButton("Enviar");
																																								btnNewButton_10.addActionListener(new ActionListener() {
																																									public void actionPerformed(ActionEvent e) {
																																										AviaoDAO adao = new AviaoDAO();
																																										AgenciaDAO agdao = new AgenciaDAO();
																																										int cod = Integer.parseInt(cod_agv.getText());
																																										int ano = Integer.parseInt(ano_av.getText());
																																										int num = Integer.parseInt(num_av.getText());
																																										int capacidade = Integer.parseInt(cap_av.getText());
																																										String fabricante = fb_av.getText();
																																										String modelo = modelo_av.getText();
																																										String com = cm_av.getText();
																																										int existe = agdao.existe(cod);
																																								
																																										if (existe == 1) {
																																											Aviao a = new Aviao(num, capacidade, fabricante, modelo, ano, com, cod);
																																											int inseriu = adao.insert(a);
																																											if (inseriu == 1) {
																																												JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
																																											} else {
																																												JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
																																											}
																																										} else {
																																											JOptionPane.showMessageDialog(null, "Agência não encontrada!");
																																										}

																																									}
																																								});
																																								btnNewButton_10.setBounds(703, 528, 85, 21);
																																								panel_10.add(btnNewButton_10);
																																								
																																										JLabel lblNewLabel_9 = new JLabel("");
																																										lblNewLabel_9.setIcon(new ImageIcon(Principal.class.getResource("/imagens/avioes.png")));
																																										lblNewLabel_9.setBounds(0, 0, 1043, 598);
																																										panel_10.add(lblNewLabel_9);
																						
																						panel_43 = new JPanel();
																						panel_43.setBounds(0, 0, 1044, 598);
																						layeredPane.add(panel_43);
																						panel_43.setLayout(null);
																						
																						scrollPane_16 = new JScrollPane();
																						scrollPane_16.setBounds(184, 198, 657, 260);
																						panel_43.add(scrollPane_16);
																						
																						table_17 = new JTable();
																						scrollPane_16.setViewportView(table_17);
																						table_17.setModel(new DefaultTableModel(
																							new Object[][] {
																							},
																							new String[] {
																								"cpf", "nome", "sal\u00E1rio", "cma", "c\u00F3digo da ag\u00EAncia"
																							}
																						) {
																							Class[] columnTypes = new Class[] {
																								String.class, String.class, Double.class, String.class, Integer.class
																							};
																							public Class getColumnClass(int columnIndex) {
																								return columnTypes[columnIndex];
																							}
																						});
																						
																						lblNewLabel_43 = new JLabel("");
																						lblNewLabel_43.setIcon(new ImageIcon(Principal.class.getResource("/imagens/r_2.png")));
																						lblNewLabel_43.setBounds(0, 0, 1044, 598);
																						panel_43.add(lblNewLabel_43);
																						
																						panel_26 = new JPanel();
																						panel_26.setBounds(0, 0, 1043, 598);
																						layeredPane.add(panel_26);
																						panel_26.setLayout(null);
																						
																						btnNewButton_26 = new JButton("verificar");
																						btnNewButton_26.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								PilotoDAO pdao = new PilotoDAO();
																								FuncionarioDAO fdao = new FuncionarioDAO();
																								Internacional_pilotoDAO idao = new Internacional_pilotoDAO();
																								
																								String cpf = pi_cpfm.getText();
																								int existe = idao.existe(cpf);
																								
																								if(existe == 1) {
																									ArrayList<Internacional_piloto> is = new ArrayList<>();
																									is= idao.esp(cpf);
																									ArrayList<Piloto> ps = new ArrayList<>();
																									ps = pdao.esp(cpf);
																									ArrayList<Funcionario> fs = new ArrayList<>();
																									fs = fdao.esp(cpf);
																									
																									pi_cpfm.setEnabled(false);
																									pi_pm.setEnabled(true);
																									pi_bm.setEnabled(true);
																									pi_cm.setEnabled(true);
																									pi_sm.setEnabled(true);
																									pi_mm.setEnabled(true);
																									pi_cmam.setEnabled(true);
																									pi_nm.setEnabled(true);
																									pi_lm.setEnabled(true);
																									
																									for(int i = 0; i< is.size(); i++) {
																										
																										pi_pm.setText(is.get(i).getPais());
																										pi_mm.setText(is.get(i).getMoeda());
																										pi_lm.setText(is.get(i).getIdioma());
																										pi_nm.setText(fs.get(i).getNome());
																										pi_cmam.setText(fs.get(i).getCma());
																										double sal = fs.get(i).getSalario();
																										String s = String.valueOf(sal);
																										pi_sm.setText(s);
																										int cod = fs.get(i).getCod_agencia();
																										String c = String.valueOf(cod);
																										pi_cm.setText(c);
																										pi_bm.setText(ps.get(i).getBreve());
																										
																									}
																									
																								}else {
																									JOptionPane.showMessageDialog(null, "Piloto internacional não encontrado no banco de dados!");
																								}
																							}
																						});
																						btnNewButton_26.setBounds(413, 206, 85, 21);
																						panel_26.add(btnNewButton_26);
																						
																						pi_bm = new JTextField();
																						pi_bm.setBounds(231, 536, 96, 19);
																						panel_26.add(pi_bm);
																						pi_bm.setColumns(10);
																						
																						pi_cm = new JTextField();
																						pi_cm.setBounds(364, 497, 96, 19);
																						panel_26.add(pi_cm);
																						pi_cm.setColumns(10);
																						
																						pi_cmam = new JTextField();
																						pi_cmam.setBounds(220, 456, 96, 19);
																						panel_26.add(pi_cmam);
																						pi_cmam.setColumns(10);
																						
																						pi_sm = new JTextField();
																						pi_sm.setBounds(253, 417, 96, 19);
																						panel_26.add(pi_sm);
																						pi_sm.setColumns(10);
																						
																						pi_nm = new JTextField();
																						pi_nm.setBounds(231, 373, 96, 19);
																						panel_26.add(pi_nm);
																						pi_nm.setColumns(10);
																						
																						pi_mm = new JTextField();
																						pi_mm.setBounds(231, 331, 96, 19);
																						panel_26.add(pi_mm);
																						pi_mm.setColumns(10);
																						
																						pi_lm = new JTextField();
																						pi_lm.setBounds(231, 289, 96, 19);
																						panel_26.add(pi_lm);
																						pi_lm.setColumns(10);
																						
																						pi_pm = new JTextField();
																						pi_pm.setBounds(209, 248, 96, 19);
																						panel_26.add(pi_pm);
																						pi_pm.setColumns(10);
																						
																						pi_cpfm = new JTextField();
																						pi_cpfm.setBounds(293, 207, 96, 19);
																						panel_26.add(pi_cpfm);
																						pi_cpfm.setColumns(10);
																						
																						btnNewButton_25 = new JButton("enviar");
																						btnNewButton_25.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								FuncionarioDAO fdao = new FuncionarioDAO();
																								Internacional_pilotoDAO idao = new Internacional_pilotoDAO();
																								PilotoDAO pdao = new PilotoDAO();
																								
																								String cpf = pi_cpfm.getText();
																								String nome = pi_nm.getText();
																								String breve = pi_bm.getText();
																								String idioma = pi_lm.getText();
																								String moeda = pi_mm.getText();
																								String pais = pi_pm.getText();
																								String cma = pi_cmam.getText();
																								double sal = Double.valueOf(pi_sm.getText());
																								int cod = Integer.parseInt(pi_cm.getText());
																								
																								int u1 = idao.update(pais, idioma, moeda, cpf);
																								int u2 = pdao.update(cpf, breve);
																								int u3 = fdao.update(cpf, nome, sal, cma, cod);
																								
																								if(u1 == 1 && u2 == 1 && u3 ==1) {
																									JOptionPane.showMessageDialog(null, "Piloto internacional editado com sucesso!");
																								}
																								
																							}
																						});
																						btnNewButton_25.setBounds(277, 577, 85, 21);
																						panel_26.add(btnNewButton_25);
																						
																						JLabel lblNewLabel_26 = new JLabel("");
																						lblNewLabel_26.setIcon(new ImageIcon(Principal.class.getResource("/imagens/mod_pi.png")));
																						lblNewLabel_26.setBounds(0, 0, 1043, 598);
																						panel_26.add(lblNewLabel_26);
																						
																						panel_25 = new JPanel();
																						panel_25.setBounds(0, 0, 1043, 598);
																						layeredPane.add(panel_25);
																						panel_25.setLayout(null);
																						
																						JButton verificar = new JButton("verificar");
																						verificar.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								String cpf = p_cpfm.getText();
																								PilotoDAO pdao = new PilotoDAO();
																								FuncionarioDAO fdao = new FuncionarioDAO();
																								int existe = pdao.existe(cpf);
																								if(existe ==1) {
																									ArrayList<Piloto> ps = new ArrayList<>();
																									ps = pdao.esp(cpf);
																									ArrayList <Funcionario> fs = new ArrayList<>();
																									fs = fdao.esp(cpf);
																									for(int i =0; i< ps.size(); i++) {
																										p_cpfm.setEnabled(false);
																										p_bm.setEnabled(true);
																										p_cmam.setEnabled(true);
																										p_cm.setEnabled(true);
																										p_nm.setEnabled(true);
																										p_sm.setEnabled(true);
																										
																										p_bm.setText(ps.get(i).getBreve());
																										
																										for(int j =0; j< fs.size(); j++) {
																											double sal = fs.get(j).getSalario();
																											String s = String.valueOf(sal);
																											p_sm.setText(s);
																											p_nm.setText(fs.get(j).getNome());
																											p_cmam.setText(fs.get(j).getCma());
																											int cod = fs.get(j).getCod_agencia();
																											String c = String.valueOf(cod);
																											p_cm.setText(c);
																										}
																									}
																								}
																								else {
																									JOptionPane.showMessageDialog(null, "Piloto não encontrado no banco de daods!");
																								}
																								
																							}
																						});
																						
																						
																						
																						
																						JButton btnNewButton_24 = new JButton("enviar");
																						btnNewButton_24.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								FuncionarioDAO fdao = new FuncionarioDAO();
																								PilotoDAO pdao = new PilotoDAO();
																								AgenciaDAO adao = new AgenciaDAO();
																								
																								String cpf = p_cpfm.getText();
																								String breve = p_bm.getText();
																								
																								String nome = p_nm.getText();
																								String cma = p_cmam.getText();
																								Double sal = Double.valueOf(p_sm.getText());
																								int cod = Integer.parseInt(p_cm.getText());
																								int a1 = adao.existe(cod);
																								if(a1 == 1) {
																									int u1 = pdao.update(cpf, breve);
																									int u2 = fdao.update(cpf, nome, u1, cma, cod);
																									
																									if(u1 == 1 && u2 ==1) {
																										JOptionPane.showMessageDialog(null, "Piloto modificado com sucesso!");
																									}
																								}
																								else {
																									JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
																								}
																								
																								
																							}
																						});
																						btnNewButton_24.setBounds(639, 527, 85, 21);
																						panel_25.add(btnNewButton_24);
																						verificar.setBounds(739, 217, 85, 21);
																						panel_25.add(verificar);
																						
																						p_nm = new JTextField();
																						p_nm.setBounds(639, 311, 96, 19);
																						panel_25.add(p_nm);
																						p_nm.setColumns(10);
																						
																						p_sm = new JTextField();
																						p_sm.setBounds(674, 357, 96, 19);
																						panel_25.add(p_sm);
																						p_sm.setColumns(10);
																						
																						p_cmam = new JTextField();
																						p_cmam.setBounds(628, 401, 96, 19);
																						panel_25.add(p_cmam);
																						p_cmam.setColumns(10);
																						
																						p_cm = new JTextField();
																						p_cm.setBounds(792, 448, 96, 19);
																						panel_25.add(p_cm);
																						p_cm.setColumns(10);
																						
																						p_bm = new JTextField();
																						p_bm.setBounds(653, 266, 96, 19);
																						panel_25.add(p_bm);
																						p_bm.setColumns(10);
																						
																						p_cpfm = new JTextField();
																						p_cpfm.setBounds(619, 218, 96, 19);
																						panel_25.add(p_cpfm);
																						p_cpfm.setColumns(10);
																						
																						JLabel lblNewLabel_25 = new JLabel("");
																						lblNewLabel_25.setIcon(new ImageIcon(Principal.class.getResource("/imagens/mod_p.png")));
																						lblNewLabel_25.setBounds(0, 0, 1043, 598);
																						panel_25.add(lblNewLabel_25);
																		
																				panel_18 = new JPanel();
																				panel_18.setBounds(0, 0, 1043, 598);
																				layeredPane.add(panel_18);
																				panel_18.setLayout(null);
																				
																						ic_lingua = new JTextField();
																						ic_lingua.setBounds(659, 360, 96, 19);
																						panel_18.add(ic_lingua);
																						ic_lingua.setColumns(10);
																						
																								ic_pais = new JTextField();
																								ic_pais.setBounds(630, 309, 96, 19);
																								panel_18.add(ic_pais);
																								ic_pais.setColumns(10);
																								
																										ic_moeda = new JTextField();
																										ic_moeda.setBounds(659, 406, 96, 19);
																										panel_18.add(ic_moeda);
																										ic_moeda.setColumns(10);
																										
																												btnNewButton_16 = new JButton("enviar");
																												btnNewButton_16.addActionListener(new ActionListener() {
																													public void actionPerformed(ActionEvent e) {
																														Internacional_pilotoDAO idao = new Internacional_pilotoDAO();
																														String cpf = ic_cpf.getText();
																														int existe = idao.existe(cpf);
																														if (existe != 1) {
																															String lingua = ic_lingua.getText();
																															String moeda = ic_moeda.getText();
																															String pais = ic_pais.getText();

																															Internacional_piloto p = new Internacional_piloto(cpf, moeda, pais, lingua);
																															int inseriu = idao.insert(p);
																															if (inseriu == 1) {
																																JOptionPane.showMessageDialog(null, "Piloto internacional cadastrado com sucesso");
																															}
																														} else {
																															JOptionPane.showMessageDialog(null, "Piloto já cadastrado anteriormente!");
																														}

																													}
																												});
																												btnNewButton_16.setBounds(689, 526, 85, 21);
																												panel_18.add(btnNewButton_16);
																												
																														btnNewButton_15 = new JButton("verificar");
																														btnNewButton_15.addActionListener(new ActionListener() {
																															public void actionPerformed(ActionEvent e) {
																																String cpf = ic_cpf.getText();
																																PilotoDAO pdao = new PilotoDAO();
																																int existe = pdao.existe(cpf);
																																if (existe == 1) {
																																	ic_lingua.setEnabled(true);
																																	ic_moeda.setEnabled(true);
																																	ic_pais.setEnabled(true);
																																} else {
																																	JOptionPane.showMessageDialog(null, "Piloto não encontrado!");
																																}
																															}
																														});
																														btnNewButton_15.setBounds(847, 264, 85, 21);
																														panel_18.add(btnNewButton_15);
																														
																																ic_cpf = new JTextField();
																																ic_cpf.setBounds(727, 265, 96, 19);
																																panel_18.add(ic_cpf);
																																ic_cpf.setColumns(10);
																																
																																		lblNewLabel_18 = new JLabel("");
																																		lblNewLabel_18.setIcon(new ImageIcon(Principal.class.getResource("/imagens/c_inter.png")));
																																		lblNewLabel_18.setBounds(0, 0, 1043, 598);
																																		panel_18.add(lblNewLabel_18);
																
																		panel_15 = new JPanel();
																		panel_15.setBounds(0, 0, 1043, 598);
																		layeredPane.add(panel_15);
																		panel_15.setLayout(null);
																		
																				JButton btnNewButton_9 = new JButton("enviar");
																				btnNewButton_9.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent e) {
																						String cpf = del_func.getText();
																						FuncionarioDAO fdao = new FuncionarioDAO();

																						int ex = fdao.existe(cpf);

																						if (ex == 1) {
																							PilotoDAO pdao = new PilotoDAO();
																							int ex2 = pdao.existe(cpf);

																							if (ex2 == 1) {
																								Internacional_pilotoDAO idao = new Internacional_pilotoDAO();
																								int ex3 = idao.existe(cpf);
																								if (ex3 == 1) {
																									int i1 = idao.excluir(cpf);
																									int i2 = pdao.excluir(cpf);
																									int i3 = fdao.excluir(cpf);
																									if (i1 == 1 && i2 == 1 && i3 == 1) {
																										JOptionPane.showMessageDialog(null, "Piloto internacional deletado com sucesso");
																									}
																								} else {
																									int i1 = pdao.excluir(cpf);
																									int i2 = fdao.excluir(cpf);
																									if (i1 == 1 && i2 == 1) {
																										JOptionPane.showMessageDialog(null, "Piloto deletado com sucesso");
																									}

																								}
																							} else {
																								int excluiu = fdao.excluir(cpf);
																								if (excluiu == 1) {
																									JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso");
																								}
																							}
																						} else {
																							JOptionPane.showMessageDialog(null, "CPF não encontrado");
																						}
																					}
																				});
																				btnNewButton_9.setBounds(670, 436, 85, 21);
																				panel_15.add(btnNewButton_9);
																				
																						del_func = new JTextField();
																						del_func.setBounds(708, 347, 96, 19);
																						panel_15.add(del_func);
																						del_func.setColumns(10);
																						
																								lblNewLabel_14 = new JLabel("");
																								lblNewLabel_14.setIcon(new ImageIcon(Principal.class.getResource("/imagens/del_func.png")));
																								lblNewLabel_14.setBounds(0, 0, 1043, 598);
																								panel_15.add(lblNewLabel_14);
														
																panel_14 = new JPanel();
																panel_14.setBounds(0, 0, 1043, 598);
																layeredPane.add(panel_14);
																panel_14.setLayout(null);
																
																		JButton btnNewButton_12 = new JButton("verificar");
																		btnNewButton_12.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				FuncionarioDAO fdao = new FuncionarioDAO();
																				String cpf = cpf_cp.getText();
																				int existe = fdao.existe(cpf);
																				if (existe == 1) {
																					b_cp.setEnabled(true);
																				} else {
																					JOptionPane.showMessageDialog(null, "CPF não encontrado");
																				}

																			}
																		});
																		btnNewButton_12.setBounds(400, 247, 85, 21);
																		panel_14.add(btnNewButton_12);
																		
																				JButton btnNewButton_11 = new JButton("enviar");
																				btnNewButton_11.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent e) {
																						PilotoDAO pdao = new PilotoDAO();
																						String cpf = cpf_cp.getText();
																						String breve = b_cp.getText();
																						Piloto p = new Piloto(cpf, breve);
																						int existe = pdao.insert(p);
																						if (existe == 1) {
																							JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
																						} else {
																							JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
																						}
																					}
																				});
																				btnNewButton_11.setBounds(209, 374, 85, 21);
																				panel_14.add(btnNewButton_11);
																				
																						b_cp = new JTextField();
																						b_cp.setBounds(294, 300, 96, 19);
																						panel_14.add(b_cp);
																						b_cp.setColumns(10);
																						b_cp.setEnabled(false);
																						
																								cpf_cp = new JTextField();
																								cpf_cp.setBounds(274, 248, 96, 19);
																								panel_14.add(cpf_cp);
																								cpf_cp.setColumns(10);
																								
																										lblNewLabel_13 = new JLabel("");
																										lblNewLabel_13.setIcon(new ImageIcon(Principal.class.getResource("/imagens/cadastro_p.png")));
																										lblNewLabel_13.setBounds(0, 0, 1043, 598);
																										panel_14.add(lblNewLabel_13);
										
												panel_6 = new JPanel();
												panel_6.setBounds(0, 0, 1043, 598);
												layeredPane.add(panel_6);
												panel_6.setLayout(null);
												
														cli_d = new JTextField();
														cli_d.setBounds(708, 345, 96, 19);
														panel_6.add(cli_d);
														cli_d.setColumns(10);
														
																JButton btnNewButton_3 = new JButton("enviar");
																btnNewButton_3.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		String cpf = cli_d.getText();
																		ClienteDAO cdao = new ClienteDAO();
																		Telefones_cliDAO tdao = new Telefones_cliDAO();
																		int i = cdao.existe(cpf);
																		if (i >= 1) {
																			int j = tdao.existe_cpf(cpf);
																			if (j >= 1) {
																				JOptionPane.showMessageDialog(null, "O cliente possui um telefone, não é possível exclui-lo");
																			} else {
																				int inseriu = cdao.excluir(cpf);
																				if (inseriu == 1) {
																					JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
																				}
																			}
																		} else {
																			JOptionPane.showMessageDialog(null, "Cliente não encontrado no bd");
																		}
																	}
																});
																btnNewButton_3.setBounds(666, 437, 85, 21);
																panel_6.add(btnNewButton_3);
																
																		lblNewLabel_3 = new JLabel("");
																		lblNewLabel_3.setIcon(new ImageIcon(Principal.class.getResource("/imagens/14.png")));
																		lblNewLabel_3.setBounds(0, 0, 1043, 598);
																		panel_6.add(lblNewLabel_3);
								
										panel_1 = new JPanel();
										layeredPane.setLayer(panel_1, 0);
										panel_1.setBounds(0, 0, 1043, 598);
										layeredPane.add(panel_1);
										panel_1.setLayout(null);
										
												cep = new JTextField();
												cep.setBounds(613, 206, 96, 19);
												panel_1.add(cep);
												cep.setColumns(10);
												
														estado = new JTextField();
														estado.setBounds(657, 256, 96, 19);
														panel_1.add(estado);
														estado.setColumns(10);
														
																pais = new JTextField();
																pais.setBounds(628, 301, 96, 19);
																panel_1.add(pais);
																pais.setColumns(10);
																
																		rua = new JTextField();
																		rua.setBounds(628, 349, 96, 19);
																		panel_1.add(rua);
																		rua.setColumns(10);
																		
																				numero = new JTextField();
																				numero.setBounds(670, 399, 96, 19);
																				panel_1.add(numero);
																				numero.setColumns(10);
																				
																						JButton btnNewButton = new JButton("Enviar");
																						btnNewButton.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								AgenciaDAO adao = new AgenciaDAO();
																								String c = cep.getText();
																								String es = estado.getText();
																								String p = pais.getText();
																								String r = rua.getText();
																								String num = numero.getText();
																								Agencia a = new Agencia(c, es, p, r, num);
																								int deu = adao.insert(a);
																								if(deu ==1) {
																									JOptionPane.showMessageDialog(null, "Agência cadastrada com sucesso!");
																								}
																							}
																						});
																						btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
																						btnNewButton.setBounds(684, 523, 106, 27);
																						panel_1.add(btnNewButton);
																						
																								JLabel lblNewLabel_2 = new JLabel("");
																								lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/imagens/agen.jpeg")));
																								lblNewLabel_2.setBounds(0, 0, 1043, 598);
																								panel_1.add(lblNewLabel_2);
						
								panel_3 = new JPanel();
								panel_3.setBounds(0, 0, 1043, 598);
								layeredPane.add(panel_3);
								panel_3.setLayout(null);
								
										JScrollPane scrollPane = new JScrollPane();
										scrollPane.setBounds(85, 136, 857, 365);
										panel_3.add(scrollPane);
										
												table = new JTable();
												scrollPane.setViewportView(table);
												table.setModel(new DefaultTableModel(new Object[][] {},
														new String[] { "cpf", "nome", "email", "passaporte", "idade", "inf banc\u00E1rias" }) {
													Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, Integer.class,
															String.class };

													public Class getColumnClass(int columnIndex) {
														return columnTypes[columnIndex];
													}
												});
												
														lblNewLabel_1 = new JLabel("");
														lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/imagens/13.png")));
														lblNewLabel_1.setBounds(0, 0, 1043, 598);
														panel_3.add(lblNewLabel_1);
		
				panel_2 = new JPanel();
				layeredPane.setLayer(panel_2, 0);
				panel_2.setBounds(0, 0, 1043, 598);
				layeredPane.add(panel_2);
				panel_2.setLayout(null);
				
						JButton btnNewButton_5 = new JButton("verificar");
						btnNewButton_5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String cpff = cpf.getText();
								ClienteDAO cdao = new ClienteDAO();
								int existe = cdao.existe(cpff);
								if (existe == 0) {
									nome.setEnabled(true);
									email.setEnabled(true);
									passaporte.setEnabled(true);
									idade.setEnabled(true);
									inf.setEnabled(true);

								} else {
									JOptionPane.showMessageDialog(null, "Cliente já cadastrado");
								}
							}
						});
						btnNewButton_5.setBounds(581, 215, 85, 21);
						panel_2.add(btnNewButton_5);
						
								cpf = new JTextField();
								cpf.setBounds(410, 216, 138, 19);
								panel_2.add(cpf);
								cpf.setColumns(10);
								
										nome = new JTextField();
										nome.setBounds(429, 260, 138, 19);
										panel_2.add(nome);
										nome.setColumns(10);
										
												email = new JTextField();
												email.setBounds(429, 301, 138, 19);
												panel_2.add(email);
												email.setColumns(10);
												
														passaporte = new JTextField();
														passaporte.setBounds(495, 346, 138, 19);
														panel_2.add(passaporte);
														passaporte.setColumns(10);
														
																idade = new JTextField();
																idade.setBounds(429, 387, 138, 19);
																panel_2.add(idade);
																idade.setColumns(10);
																
																		inf = new JTextField();
																		inf.setBounds(526, 426, 138, 19);
																		panel_2.add(inf);
																		inf.setColumns(10);
																		
																				JButton btnNewButton_1 = new JButton("enviar");
																				btnNewButton_1.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent e) {
																						ClienteDAO cdao = new ClienteDAO();
																						String cpf_c = cpf.getText();
																						String nome_c = nome.getText();
																						String email_c = email.getText();
																						int idade_c = Integer.parseInt(idade.getText());
																						String pas = passaporte.getText();
																						String inf_b = inf.getText();
																						Cliente c = new Cliente(cpf_c, nome_c, email_c, pas, idade_c, inf_b);
																						int inseriu = 0;
																						inseriu = cdao.insert(c);
																						if (inseriu == 1) {
																							JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
																						}
																					}
																				});
																				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
																				btnNewButton_1.setBounds(460, 473, 123, 19);
																				btnNewButton_1.setBackground(getBackground());
																				panel_2.add(btnNewButton_1);
																				
																						JLabel lblNewLabel = new JLabel("");
																						lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagens/2.png")));
																						lblNewLabel.setBounds(0, 0, 1043, 598);
																						panel_2.add(lblNewLabel);
		
		panel_44 = new JPanel();
		panel_44.setBounds(0, 0, 1044, 598);
		layeredPane.add(panel_44);
		panel_44.setLayout(null);
		
		scrollPane_17 = new JScrollPane();
		scrollPane_17.setBounds(185, 241, 703, 219);
		panel_44.add(scrollPane_17);
		
		table_18 = new JTable();
		scrollPane_17.setViewportView(table_18);
		table_18.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cpf", "nome", "email", "passaporte", "idade", "inf banc\u00E1rias"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		btnNewButton_44 = new JButton("enviar");
		btnNewButton_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel) table_18.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_18.getModel();
				
				int qnt = Integer.parseInt(qnt_c.getText());
				ClienteDAO cdao = new ClienteDAO();
				ArrayList<Cliente> cs = new ArrayList<>();
				cs = cdao.rl3(qnt);
				if(cs.size() > 0) {
					for(int i=0; i< cs.size(); i++) {
						String cpf = cs.get(i).getCpf();
						String nome = cs.get(i).getNome();
						String email = cs.get(i).getEmail();
						String inf= cs.get(i).getInf();
						String pas = cs.get(i).getPassaporte();
						int idade = cs.get(i).getIdade();
						
						model.addRow(new Object[] {cpf,nome,email,pas,idade,inf});
					}
				}
			}
		});
		btnNewButton_44.setBounds(541, 119, 85, 21);
		panel_44.add(btnNewButton_44);
		
		qnt_c = new JTextField();
		qnt_c.setBounds(422, 120, 96, 19);
		panel_44.add(qnt_c);
		qnt_c.setColumns(10);
		
		lblNewLabel_44 = new JLabel("");
		lblNewLabel_44.setIcon(new ImageIcon(Principal.class.getResource("/imagens/relat3.png")));
		lblNewLabel_44.setBounds(0, 0, 1044, 598);
		panel_44.add(lblNewLabel_44);
		
		panel_42 = new JPanel();
		panel_42.setBounds(0, 0, 1044, 598);
		layeredPane.add(panel_42);
		panel_42.setLayout(null);
		
		JButton btnNewButton_42 = new JButton("enviar");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel) table_16.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_16.getModel();
				
				String es = v_est.getText();
				AviaoDAO adao = new AviaoDAO();
				ArrayList<Aviao> as = new ArrayList<>();
				as = adao.rl1(es);
				for(int i=0; i< as.size(); i++) {
					
					int cod = as.get(i).getCod();
					int num = as.get(i).getNum_a();
					int cap = as.get(i).getCapacidade();
					String fab = as.get(i).getFabricante();
					String mod = as.get(i).getModelo();
					int ano = as.get(i).getAno();
					String comp = as.get(i).getCompanhia();
					int fk = as.get(i).getAgencia_fk();
					
					model.addRow(new Object[] {cod,num,cap,fab,mod,ano,comp,fk});
				}
			}
		});
		btnNewButton_42.setBounds(660, 121, 85, 21);
		panel_42.add(btnNewButton_42);
		
		v_est = new JTextField();
		v_est.setBounds(541, 122, 96, 19);
		panel_42.add(v_est);
		v_est.setColumns(10);
		
		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(144, 195, 752, 241);
		panel_42.add(scrollPane_15);
		
		table_16 = new JTable();
		scrollPane_15.setViewportView(table_16);
		table_16.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"c\u00F3digo do avi\u00E3o", "n\u00BA de assentos", "capacidade de bagagens", "fabricante", "modelo", "ano", "companhia", "c\u00F3digo da ag\u00EAncia"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, String.class, Object.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel_42 = new JLabel("");
		lblNewLabel_42.setIcon(new ImageIcon(Principal.class.getResource("/imagens/relat1.png")));
		lblNewLabel_42.setBounds(0, 0, 1044, 598);
		panel_42.add(lblNewLabel_42);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBounds(0, 0, 1044, 598);
		layeredPane.add(panel_41);
		panel_41.setLayout(null);
		
		JButton btnNewButton_41 = new JButton("enviar");
		btnNewButton_41.setBounds(466, 116, 85, 21);
		panel_41.add(btnNewButton_41);
		
		vpi_cpf = new JTextField();
		vpi_cpf.setBounds(350, 117, 96, 19);
		panel_41.add(vpi_cpf);
		vpi_cpf.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("");
		lblNewLabel_41.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_pie.png")));
		lblNewLabel_41.setBounds(0, 0, 1044, 598);
		panel_41.add(lblNewLabel_41);
		
		table_15 = new JTable();
		table_15.setBounds(169, 249, 680, 210);
		panel_41.add(table_15);
		
		
		
		panel_35 = new JPanel();
		panel_35.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_35);
		panel_35.setLayout(null);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(129, 173, 760, 301);
		panel_35.add(scrollPane_12);
		
		table_12 = new JTable();
		scrollPane_12.setViewportView(table_12);
		table_12.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"c\u00F3digo da passagem", "n\u00BA do assento", "valor", "c\u00F3digo da ag\u00EAncia", "nome do cliente", "id do voo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Float.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel_35 = new JLabel("");
		lblNewLabel_35.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_ps.png")));
		lblNewLabel_35.setBounds(4, 1, 1038, 598);
		panel_35.add(lblNewLabel_35);
		
		panel_39 = new JPanel();
		panel_39.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_39);
		panel_39.setLayout(null);
		
		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(129, 173, 764, 290);
		panel_39.add(scrollPane_14);
		
		table_14 = new JTable();
		scrollPane_14.setViewportView(table_14);
		table_14.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"nome do cliente", "n\u00FAmero do telefone"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel_38 = new JLabel("");
		lblNewLabel_38.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_tel.png")));
		lblNewLabel_38.setBounds(0, 0, 1043, 598);
		panel_39.add(lblNewLabel_38);
		
		panel_38 = new JPanel();
		panel_38.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_38);
		panel_38.setLayout(null);
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(145, 234, 747, 216);
		panel_38.add(scrollPane_13);
		
		table_13 = new JTable();
		scrollPane_13.setViewportView(table_13);
		table_13.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"c\u00F3digo da passagem", "n\u00BA do assento", "valor", "c\u00F3digo da ag\u00EAncia", "cpf do cliente", "id do voo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Float.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btnNewButton_38 = new JButton("enviar");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassagemDAO pdao = new PassagemDAO();
				int cod = Integer.parseInt(pse_cod.getText());
				int existe = pdao.existe(cod);
				
				DefaultTableModel dm = (DefaultTableModel) table_13.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_13.getModel();
				
				if(existe == 1) {
					ArrayList<Passagem> ps = new ArrayList<>();
					ps = pdao.esp(cod);
					for(int i =0 ; i<ps.size();i++) {
						String num = ps.get(i).getNum();
						float valor = ps.get(i).getValor();
						int agen = ps.get(i).getCod_agen();
						String cpf = ps.get(i).getCpf_cli();
						int id = ps.get(i).getId_pilota();
						
						model.addRow(new Object[] {cod,num,valor,agen,cpf,id });
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Passagem não encontrada no banco de dados!");
				}
				
			}
		});
		btnNewButton_38.setBounds(458, 118, 85, 21);
		panel_38.add(btnNewButton_38);
		
		pse_cod = new JTextField();
		pse_cod.setBounds(344, 119, 96, 19);
		panel_38.add(pse_cod);
		pse_cod.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("");
		lblNewLabel_37.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_pse.png")));
		lblNewLabel_37.setBounds(0, 0, 1043, 598);
		panel_38.add(lblNewLabel_37);
		
		panel_36 = new JPanel();
		panel_36.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_36);
		panel_36.setLayout(null);
		
		btnNewButton_37 = new JButton("verificar");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cod = Integer.parseInt(mp_cod.getText());
				PassagemDAO pdao = new PassagemDAO();
				int existe = pdao.existe(cod);
				if(existe == 1) {
					ArrayList<Passagem> ps = new ArrayList<>();
					ps = pdao.esp(cod);
					
					mp_cod.setEnabled(false);
					mp_num.setEnabled(true);
					mp_valor.setEnabled(true);
					mp_agen.setEnabled(true);
					mp_cpf.setEnabled(true);
					mp_id.setEnabled(true);
					
					for(int i =0; i< ps.size();i++) {
						mp_num.setText(ps.get(i).getNum());
						mp_cpf.setText(ps.get(i).getCpf_cli());
						int agen = ps.get(i).getCod_agen();
						String a = String.valueOf(agen);
						mp_agen.setText(a);
						float valor = ps.get(i).getValor();
						String v = String.valueOf(valor);
						mp_valor.setText(v);
						int idi = ps.get(i).getId_pilota();
						String id = String.valueOf(idi);
						mp_id.setText(id);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Passagem não encontrada no banco de dados!");
				}
			}
		});
		btnNewButton_37.setBounds(786, 238, 85, 21);
		panel_36.add(btnNewButton_37);
		
		mp_id = new JTextField();
		mp_id.setBounds(698, 456, 96, 19);
		panel_36.add(mp_id);
		mp_id.setColumns(10);
		
		mp_cpf = new JTextField();
		mp_cpf.setBounds(752, 412, 96, 19);
		panel_36.add(mp_cpf);
		mp_cpf.setColumns(10);
		
		mp_agen = new JTextField();
		mp_agen.setBounds(735, 369, 96, 19);
		panel_36.add(mp_agen);
		mp_agen.setColumns(10);
		
		mp_valor = new JTextField();
		mp_valor.setBounds(820, 327, 96, 19);
		panel_36.add(mp_valor);
		mp_valor.setColumns(10);
		
		mp_num = new JTextField();
		mp_num.setBounds(752, 287, 96, 19);
		panel_36.add(mp_num);
		mp_num.setColumns(10);
		
		mp_cod = new JTextField();
		mp_cod.setBounds(670, 239, 96, 19);
		panel_36.add(mp_cod);
		mp_cod.setColumns(10);
		
		btnNewButton_36 = new JButton("enviar");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassagemDAO pdao = new PassagemDAO();
				ClienteDAO cdao = new ClienteDAO();
				PilotaDAO ppdao = new PilotaDAO();
				AgenciaDAO adao = new AgenciaDAO();
				
				int cod = Integer.parseInt(mp_cod.getText());
				String num = mp_num.getText();
				float valor = Float.valueOf(mp_valor.getText());
				int agen = Integer.parseInt(mp_agen.getText());
				String cpf = mp_cpf.getText();
				int id = Integer.parseInt(mp_id.getText());
				
				int ex1 = cdao.existe(cpf);
				int ex2 = ppdao.existe(id);
				int ex3 = adao.existe(agen);
				
				if(ex1 == 1 && ex2 ==1 && ex3 ==1) {
					int deu = pdao.update(cod, num, valor, cod, cpf, id);
					if(deu == 1) {
						JOptionPane.showMessageDialog(null, "Passagem modificada com sucesso!");
					}
				}else if(ex1 == 1 && ex2!=1 && ex3 == 1) {
					JOptionPane.showMessageDialog(null, "Voo não encontrado no banco de dados!");
				}else if(ex1!=1 && ex2 == 1) {
					JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados!");
					
				}else if(ex3!=1 && ex1 == 1 && ex2!=1) {
					JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
				}else {
					JOptionPane.showMessageDialog(null, "Informações incorretas!");
				}
				
				
				
			}
		});
		btnNewButton_36.setBounds(646, 528, 85, 21);
		panel_36.add(btnNewButton_36);
		
		lblNewLabel_36 = new JLabel("");
		lblNewLabel_36.setIcon(new ImageIcon(Principal.class.getResource("/imagens/m_pass.png")));
		lblNewLabel_36.setBounds(0, 0, 1043, 598);
		panel_36.add(lblNewLabel_36);
		
		panel_32 = new JPanel();
		panel_32.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_32);
		panel_32.setLayout(null);
		
		scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(211, 247, 626, 243);
		panel_32.add(scrollPane_11);
		
		table_11 = new JTable();
		scrollPane_11.setViewportView(table_11);
		table_11.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cpf", "nome", "sal\u00E1rio", "cma", "c\u00F3digo da ag\u00EAncia", "breve"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		btnNewButton_33 = new JButton("enviar");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PilotoDAO pdao = new PilotoDAO();
				String cpf = pe_cpf.getText();
				int existe = pdao.existe(cpf);
				if(existe == 1) {
					
					DefaultTableModel dm = (DefaultTableModel) table_11.getModel();
					dm.getDataVector().removeAllElements();
					dm.fireTableDataChanged();
					DefaultTableModel model = (DefaultTableModel) table_11.getModel();

					FuncionarioDAO fdao = new FuncionarioDAO();

					ArrayList<Piloto> ps = new ArrayList<>();
					ArrayList<Funcionario> fs = new ArrayList<>();

					ps = pdao.esp(cpf);
					fs = fdao.esp(cpf);

					for (int i = 0; i < ps.size(); i++) {
						String breve = ps.get(i).getBreve();
						String cma = "";
						double salario = 00;
						int cod = 0;
						String nome = "";

						for (int j = 0; j < fs.size(); j++) {
							if (cpf.equals(fs.get(j).getCpf())) {
								nome = fs.get(j).getNome();
								cma = fs.get(j).getCma();
								salario = fs.get(j).getSalario();
								cod = fs.get(j).getCod_agencia();
							}
						}

						model.addRow(new Object[] { cpf, nome, salario, cma, cod, breve });
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Piloto não encontrado no banco de dados!");
				}
				
			}
		});
		btnNewButton_33.setBounds(418, 117, 85, 21);
		panel_32.add(btnNewButton_33);
		
		pe_cpf = new JTextField();
		pe_cpf.setBounds(294, 118, 96, 19);
		panel_32.add(pe_cpf);
		pe_cpf.setColumns(10);
		
		lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_pe.png")));
		lblNewLabel_32.setBounds(0, 0, 1043, 598);
		panel_32.add(lblNewLabel_32);
		
		panel_31 = new JPanel();
		panel_31.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_31);
		panel_31.setLayout(null);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(169, 247, 679, 246);
		panel_31.add(scrollPane_10);
		
		table_10 = new JTable();
		scrollPane_10.setViewportView(table_10);
		table_10.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cpf", "nome", "sal\u00E1rio", "cma", "c\u00F3digo da ag\u00EAncia"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btnNewButton_32 = new JButton("enviar");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dm = (DefaultTableModel) table_10.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_10.getModel();
				
				String cpf = fe_cpf.getText();
				FuncionarioDAO fdao = new FuncionarioDAO();
				int existe = fdao.existe(cpf);
				if(existe == 1) {
					ArrayList<Funcionario> fs = new ArrayList<>();
					fs = fdao.esp(cpf);
					for(int i =0; i<fs.size(); i++) {
						String nome = fs.get(i).getNome();
						double salario = fs.get(i).getSalario();
						String cma = fs.get(i).getCma();
						int cod = fs.get(i).getCod_agencia();
						
						model.addRow(new Object[] { cpf, nome, salario, cma, cod });
					}
				}else {
					JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados!");
				}
			}
		});
		btnNewButton_32.setBounds(412, 118, 85, 21);
		panel_31.add(btnNewButton_32);
		
		fe_cpf = new JTextField();
		fe_cpf.setBounds(293, 119, 96, 19);
		panel_31.add(fe_cpf);
		fe_cpf.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_fe.png")));
		lblNewLabel_31.setBounds(0, 0, 1043, 598);
		panel_31.add(lblNewLabel_31);
		
		panel_30 = new JPanel();
		panel_30.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_30);
		panel_30.setLayout(null);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(154, 252, 713, 229);
		panel_30.add(scrollPane_9);
		
		table_9 = new JTable();
		scrollPane_9.setViewportView(table_9);
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cod", "cep", "estado", "pa\u00EDs", "rua", "n\u00FAmero"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btnNewButton_31 = new JButton("enviar");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel) table_9.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_9.getModel();
				
				int cod = Integer.parseInt(age_cod.getText());
				AgenciaDAO adao = new AgenciaDAO();
				int existe = adao.existe(cod);
				if(existe == 1) {
					ArrayList<Agencia> as = new ArrayList<>();
					as = adao.esp(cod);
					for(int i =0; i< as.size(); i++) {
						String pais = as.get(i).getPais();
						String estado = as.get(i).getEstado();
						String cep = as.get(i).getCep();
						String rua = as.get(i).getRua();
						String num = as.get(i).getNum();
						
						model.addRow(new Object[] { cod,cep,estado,pais,rua,num });
					}
				}else {
					JOptionPane.showMessageDialog(null, "Agência não encontrada no banco de dados!");
				}
			}
		});
		btnNewButton_31.setBounds(461, 119, 85, 21);
		panel_30.add(btnNewButton_31);
		
		age_cod = new JTextField();
		age_cod.setBounds(337, 120, 96, 19);
		panel_30.add(age_cod);
		age_cod.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_age.png")));
		lblNewLabel_30.setBounds(0, 0, 1043, 598);
		panel_30.add(lblNewLabel_30);
		
		panel_29 = new JPanel();
		panel_29.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_29);
		panel_29.setLayout(null);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(139, 249, 759, 211);
		panel_29.add(scrollPane_8);
		
		table_8 = new JTable();
		scrollPane_8.setViewportView(table_8);
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cpf", "nome", "email", "passaporte", "idade", "inf_banc\u00E1rias"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		btnNewButton_30 = new JButton("enviar");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel) table_8.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				DefaultTableModel model = (DefaultTableModel) table_8.getModel();
				String cpf = ce_cpf.getText();
				ClienteDAO cdao = new ClienteDAO();
				int existe = cdao.existe(cpf);
				if(existe == 1) {
					ArrayList<Cliente> cs= new ArrayList<>();
					cs = cdao.esp(cpf);
					for(int i =0; i< cs.size(); i++) {
						String nome = cs.get(i).getNome();
						int idade = cs.get(i).getIdade();
						String email = cs.get(i).getEmail();
						String passaporte = cs.get(i).getPassaporte();
						String inf = cs.get(i).getInf();
								
						
						
						model.addRow(new Object[] { cpf, nome, email,passaporte,idade,inf });
					}
				}else {
					JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados!");
				}
			}
		});
		btnNewButton_30.setBounds(427, 116, 85, 21);
		panel_29.add(btnNewButton_30);
		
		ce_cpf = new JTextField();
		ce_cpf.setBounds(297, 117, 96, 19);
		panel_29.add(ce_cpf);
		ce_cpf.setColumns(10);
		
		lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_ce.png")));
		lblNewLabel_29.setBounds(0, 0, 1043, 598);
		panel_29.add(lblNewLabel_29);
		
		panel_28 = new JPanel();
		panel_28.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_28);
		panel_28.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(175, 238, 656, 215);
		panel_28.add(scrollPane_7);
		
		table_7 = new JTable();
		scrollPane_7.setViewportView(table_7);
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cod", "n\u00BA de assentos", "capacidade de bagagens", "fabricante", "modelo", "ano", "companhia", "c\u00F3digo da ag\u00EAncia"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		btnNewButton_29 = new JButton("enviar");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AviaoDAO adao = new AviaoDAO();
				int cod = Integer.parseInt(av_ve.getText());
				int existe = adao.existe(cod);
				if(existe == 1) {
					ArrayList<Aviao> as = new ArrayList<>();
					as = adao.esp(cod);
					DefaultTableModel dm = (DefaultTableModel) table_7.getModel();
					dm.getDataVector().removeAllElements();
					dm.fireTableDataChanged();
					DefaultTableModel model = (DefaultTableModel) table_7.getModel();
					
					for(int i = 0; i<as.size(); i++) {
						int num = as.get(i).getNum_a();
						int cap = as.get(i).getCapacidade();
						String modelo = as.get(i).getModelo();
						String fab = as.get(i).getFabricante();
						int ano = as.get(i).getAno();
						int fk = as.get(i).getAgencia_fk();
						String com = as.get(i).getCompanhia();
						
						model.addRow(new Object[] { cod,num,cap,fab,modelo,ano,com,fk});
						
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Avião não encontrado no banco de dados!");
				}
			}
		});
		btnNewButton_29.setBounds(458, 120, 85, 21);
		panel_28.add(btnNewButton_29);
		
		av_ve = new JTextField();
		av_ve.setBounds(334, 121, 96, 19);
		panel_28.add(av_ve);
		av_ve.setColumns(10);
		
		lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon(Principal.class.getResource("/imagens/v_ae.png")));
		lblNewLabel_28.setBounds(0, 0, 1043, 598);
		panel_28.add(lblNewLabel_28);

		panel_21 = new JPanel();
		panel_21.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_21);
		panel_21.setLayout(null);

		JButton btnNewButton_17 = new JButton("enviar");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cod = Integer.parseInt(a_dele.getText());
				AgenciaDAO adao = new AgenciaDAO();
				int ex = adao.existe(cod);
				if (ex == 1) {
					int del = adao.excluir(cod);
					if (del == 1) {
						JOptionPane.showMessageDialog(null, "Agência deletada com sucesso");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Agência não encontrada no bd");
				}
			}
		});
		btnNewButton_17.setBounds(669, 436, 85, 21);
		panel_21.add(btnNewButton_17);

		a_dele = new JTextField();

		a_dele.setBounds(841, 351, 96, 19);
		panel_21.add(a_dele);
		a_dele.setColumns(10);

		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(Principal.class.getResource("/imagens/del_ag.png")));
		lblNewLabel_21.setBounds(0, 0, 1043, 598);
		panel_21.add(lblNewLabel_21);

		panel_20 = new JPanel();
		panel_20.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_20);
		panel_20.setLayout(null);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(116, 161, 806, 328);
		panel_20.add(scrollPane_6);

		table_6 = new JTable();
		scrollPane_6.setViewportView(table_6);
		table_6.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "cpf", "nome", "sal\u00E1rio", "cma", "c\u00F3digo da ag\u00EAncia", "breve" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, Double.class, String.class, Integer.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(Principal.class.getResource("/imagens/vp.png")));
		lblNewLabel_20.setBounds(0, 0, 1043, 598);
		panel_20.add(lblNewLabel_20);

		panel_19 = new JPanel();
		panel_19.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_19);
		panel_19.setLayout(null);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(99, 158, 818, 322);
		panel_19.add(scrollPane_5);

		table_5 = new JTable();
		scrollPane_5.setViewportView(table_5);
		table_5.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "cpf", "nome", "cma", "sal\u00E1rio",
				"c\u00F3digo da ag\u00EAncia", "breve", "idiomas", "pa\u00EDs de origem", "moeda" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, Double.class, Integer.class,
					String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon(Principal.class.getResource("/imagens/ver_pin.png")));
		lblNewLabel_19.setBounds(0, 0, 1043, 598);
		panel_19.add(lblNewLabel_19);

		panel_17 = new JPanel();
		panel_17.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_17);
		panel_17.setLayout(null);

		btnNewButton_14 = new JButton("enviar");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PilotaDAO pdao = new PilotaDAO();
				int id = Integer.parseInt(vo_del.getText());
				int existe = pdao.existe(id);
				if (existe == 1) {
					int del = pdao.excluir(id);
					if (del == 1) {
						JOptionPane.showMessageDialog(null, "Voo excluido com sucesso");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Voo não encontrado no BD");
				}
			}
		});
		btnNewButton_14.setBounds(667, 436, 85, 21);
		panel_17.add(btnNewButton_14);

		vo_del = new JTextField();
		vo_del.setBounds(737, 355, 96, 19);
		panel_17.add(vo_del);
		vo_del.setColumns(10);

		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Principal.class.getResource("/imagens/del_voo.png")));
		lblNewLabel_17.setBounds(0, 0, 1043, 598);
		panel_17.add(lblNewLabel_17);

		panel_11 = new JPanel();
		panel_11.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_11);
		panel_11.setLayout(null);

		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(96, 146, 834, 359);
		panel_11.add(scrollPane_3);

		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		table_3.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "id", "local de  partida", "local de chegada", "data_p", "data_c", "hora_p", "hora_c",
						"c\u00F3digo do avi\u00E3o", "nome piloto 2", "nome piloto 2" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class, String.class,
					String.class, String.class, Integer.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Principal.class.getResource("/imagens/vv.png")));
		lblNewLabel_11.setBounds(0, 0, 1043, 598);
		panel_11.add(lblNewLabel_11);

		panel_13 = new JPanel();
		panel_13.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_13);
		panel_13.setLayout(null);

		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(103, 149, 823, 335);
		panel_13.add(scrollPane_4);

		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);
		table_4.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "cpf", "nome", "sal\u00E1rio", "cma", "c\u00F3digo da ag\u00EAncia" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, Double.class, String.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Principal.class.getResource("/imagens/vf.png")));
		lblNewLabel_12.setBounds(0, 0, 1043, 598);
		panel_13.add(lblNewLabel_12);

		panel_16 = new JPanel();
		panel_16.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_16);
		panel_16.setLayout(null);

		btnNewButton_13 = new JButton("enviar");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AviaoDAO adao = new AviaoDAO();
				int cod = Integer.parseInt(av_del.getText());
				int existe = adao.existe(cod);
				if (existe == 1) {
					int del = adao.excluir(cod);
					if (del == 1) {
						JOptionPane.showMessageDialog(null, "Avião excluido com sucesso");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Avião não encontrado no BD!");
				}

			}
		});
		btnNewButton_13.setBounds(666, 436, 85, 21);
		panel_16.add(btnNewButton_13);

		av_del = new JTextField();
		av_del.setBounds(815, 355, 96, 19);
		panel_16.add(av_del);
		av_del.setColumns(10);

		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Principal.class.getResource("/imagens/del_av.png")));
		lblNewLabel_15.setBounds(0, 0, 1043, 598);
		panel_16.add(lblNewLabel_15);

		panel_12 = new JPanel();
		panel_12.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_12);
		panel_12.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(108, 138, 811, 360);
		panel_12.add(scrollPane_2);

		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "c\u00F3digo", "n\u00BA de assentos",
				"capacidade", "fabricante", "modelo", "ano", "companhia", "ag\u00EAncia" }) {
			Class[] columnTypes = new Class[] { Integer.class, Integer.class, Integer.class, String.class, String.class,
					Integer.class, String.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Principal.class.getResource("/imagens/va.png")));
		lblNewLabel_10.setBounds(0, 0, 1043, 598);
		panel_12.add(lblNewLabel_10);

		panel_8_1 = new JPanel();
		panel_8_1.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel_8_1);
		panel_8_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(63, 106, 902, 426);
		panel_8_1.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "cod", "cep", "estado", "pa\u00EDs", "rua", "n\u00FAmero" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class, String.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Principal.class.getResource("/imagens/19.png")));
		lblNewLabel_7.setBounds(0, 0, 1043, 598);
		panel_8_1.add(lblNewLabel_7);
		/*
		 * lblNewLabel_5.setIcon(new
		 * ImageIcon(Principal.class.getResource("/imagens/4.png")));
		 */

		panel = new JPanel();
		panel.setBounds(0, 0, 1043, 598);
		layeredPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Principal.class.getResource("/imagens/1.png")));
		lblNewLabel_16.setBounds(0, 0, 1043, 598);
		panel.add(lblNewLabel_16);

		/*
		 * JLabel fundo = new JLabel(""); fundo.setIcon(new
		 * ImageIcon(Principal.class.getResource("/imagens/fundo1.jpeg")));
		 * fundo.setBounds(0, 0, 1043, 598); panel_1.add(fundo);
		 */

		Switch_screen(panel);
	}

	public void Switch_screen6(JPanel panel_6) {
		layeredPane.removeAll();
		layeredPane.add(panel_6);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_screen5(JPanel panel_5) {
		layeredPane.removeAll();
		layeredPane.add(panel_5);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_screen4(JPanel panel_4) {
		layeredPane.removeAll();
		layeredPane.add(panel_4);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_screen3(JPanel panel_3) {
		layeredPane.removeAll();
		layeredPane.add(panel_3);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_screen2(JPanel panel_2) {
		layeredPane.removeAll();
		layeredPane.add(panel_2);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_screen1(JPanel panel_1) {
		layeredPane.removeAll();
		layeredPane.add(panel_1);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_screen(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public static boolean valida(String dataString, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		sdf.setLenient(false);

		try {
			Date data = (Date) sdf.parse(dataString);

			return true;
		} catch (ParseException e) {

			return false;
		}
	}

	public static boolean horario(String horarioString, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		sdf.setLenient(false);

		try {
			Time horario = (Time) sdf.parse(horarioString);

			return true;
		} catch (ParseException e) {

			return false;
		}
	}
}
