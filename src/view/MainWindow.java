package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.UserManager;

public class MainWindow {
	private JFrame frame;
	private JTextField nameTx;
	private JTextField lNameTx;
	private JTextField unTx;
	private JTextField passwordTx;
	private JTextField loginUnTx;
	private JTextField pwTx;
	private UserManager um;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		um = new UserManager();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 284, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final CardLayout cLayout = new CardLayout(0,0);
		frame.getContentPane().setLayout(cLayout);
		

//		startPanel ---- 
		JPanel startPanel = new JPanel();
		startPanel.setForeground(new Color(0, 0, 0));
		startPanel.setBounds(0, 0, 284, 573);
		frame.getContentPane().add(startPanel,"name_startPanel");
		startPanel.setLayout(null);
		
		JButton addUserBt = new JButton("ADD USER");
		addUserBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cLayout.show(frame.getContentPane(), "name_addPanel");
				
			}
		});
		addUserBt.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		addUserBt.setBounds(46, 119, 197, 97);
		startPanel.add(addUserBt);
		
		JButton loginBt = new JButton("LOGIN");
		loginBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cLayout.show(frame.getContentPane(), "name_loginPanel");

			}
		});
		loginBt.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		loginBt.setBounds(46, 231, 197, 97);
		startPanel.add(loginBt);

		
		
//		createPanel ---- 
		JPanel createPanel = new JPanel();
		createPanel.setForeground(new Color(0, 0, 0));
		createPanel.setBounds(0, 0, 284, 573);
		frame.getContentPane().add(createPanel,"name_addPanel");
		createPanel.setLayout(null);
		
		JLabel nameLb = new JLabel("Name:");
		nameLb.setBounds(30, 43, 61, 16);
		createPanel.add(nameLb);
		
		nameTx = new JTextField();
		nameTx.setBounds(30, 61, 212, 26);
		createPanel.add(nameTx);
		nameTx.setColumns(10);
		
		JLabel lNameLb = new JLabel("Last Name:");
		lNameLb.setBounds(30, 99, 148, 16);
		createPanel.add(lNameLb);
		
		lNameTx = new JTextField();
		lNameTx.setColumns(10);
		lNameTx.setBounds(30, 114, 212, 26);
		createPanel.add(lNameTx);
		
		JLabel usernameLb = new JLabel("Username:");
		usernameLb.setBounds(30, 152, 148, 16);
		createPanel.add(usernameLb);
		
		unTx = new JTextField();
		unTx.setColumns(10);
		unTx.setBounds(30, 169, 212, 26);
		createPanel.add(unTx);
		
		JLabel passwordLb = new JLabel("Password:");
		passwordLb.setBounds(30, 207, 148, 16);
		createPanel.add(passwordLb);
		
		passwordTx = new JTextField();
		passwordTx.setColumns(10);
		passwordTx.setBounds(30, 224, 212, 26);
		createPanel.add(passwordTx);
		
		JButton addBt = new JButton("Add User");
		addBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTx.getText();
				String lname = lNameTx.getText();
				String un = unTx.getText();
				String pw = passwordTx.getText();
				
				um.addNewUser(name, lname, un, pw);
				cLayout.show(frame.getContentPane(), "name_startPanel");
				
			}
		});
		addBt.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		addBt.setBounds(30, 273, 212, 37);
		createPanel.add(addBt);
		
		
		
		
//		loginPanel
		JPanel loginPanel = new JPanel();
		loginPanel.setForeground(new Color(0, 0, 0));
		loginPanel.setBounds(0, 0, 284, 573);
		frame.getContentPane().add(loginPanel,"name_loginPanel");
		loginPanel.setLayout(null);
		
		JLabel unLb = new JLabel("Username:");
		unLb.setBounds(30, 61, 129, 16);
		loginPanel.add(unLb);
		
		loginUnTx = new JTextField();
		loginUnTx.setBounds(30, 77, 212, 26);
		loginPanel.add(loginUnTx);
		loginUnTx.setColumns(10);
		
		JLabel pwLb = new JLabel("Password:");
		pwLb.setBounds(30, 115, 129, 16);
		loginPanel.add(pwLb);
		
		pwTx = new JTextField();
		pwTx.setColumns(10);
		pwTx.setBounds(30, 135, 212, 26);
		loginPanel.add(pwTx);
		
		JButton loginLoginPw = new JButton("Login");
		loginLoginPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String un = loginUnTx.getText();
//				String pw = pwTx.getText();
////				boolean check = um.checkUserNameAndPass(un, pw);
//				if (check == true) {
//					cLayout.show(frame.getContentPane(), "name_startPanel");
//					System.out.println("final" +check);
//				}
			}
		});
		loginLoginPw.setBounds(30, 173, 212, 29);
		loginPanel.add(loginLoginPw);
	}
	
}
