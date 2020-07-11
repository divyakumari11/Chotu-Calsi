package practise2BArraylistA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CALCULATOR3 {

	private JFrame frmChotucalsi;
	private JTextField textfield;
//	private JTextField value2;
	private JTextField value1;
	private JTextField txtdisplay;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALCULATOR3 window = new CALCULATOR3();
					window.frmChotucalsi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CALCULATOR3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtdisplay = new JTextField();
		frmChotucalsi = new JFrame();
		frmChotucalsi.setTitle("Chotu_Calsi 2.0");
		frmChotucalsi.setBounds(200, 200, 846, 574);
		frmChotucalsi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChotucalsi.getContentPane().setLayout(null);
		
		txtdisplay = new JTextField();
		txtdisplay.setBounds(10, 10, 385, 93);
		frmChotucalsi.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				txtdisplay = new JTextField();
				if(txtdisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtdisplay.getText());
					strB.deleteCharAt(txtdisplay.getText().length() -1);
					backspace = strB.toString();
					txtdisplay.setText(backspace);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCe.setBounds(89, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(168, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnC);
		
		JButton button_2 = new JButton("+");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(247, 113, 69, 68);
		frmChotucalsi.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("-");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_3.setBounds(326, 113, 69, 68);
		frmChotucalsi.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+7);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(10, 191, 69, 68);
		frmChotucalsi.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+8);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(89, 191, 69, 68);
		frmChotucalsi.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+9);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(168, 191, 69, 68);
		frmChotucalsi.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("/");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(247, 191, 69, 68);
		frmChotucalsi.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("%");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(326, 191, 69, 68);
		frmChotucalsi.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+4);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(10, 269, 69, 68);
		frmChotucalsi.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+5);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(89, 269, 69, 68);
		frmChotucalsi.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("6");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+6);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(168, 269, 69, 68);
		frmChotucalsi.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(247, 269, 69, 68);
		frmChotucalsi.getContentPane().add(button_12);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnx.setBounds(326, 269, 69, 68);
		frmChotucalsi.getContentPane().add(btnx);
		
		JButton button_14 = new JButton("1");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+1);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.setBounds(10, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("2");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+2);
}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.setBounds(89, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("3");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+3);
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_16.setBounds(168, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("(");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.setBounds(247, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_18.setBounds(326, 347, 69, 146);
		frmChotucalsi.getContentPane().add(button_18);
		
		JButton button_19 = new JButton(")");
		button_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_19.setBounds(247, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_19);
		
		JButton button_20 = new JButton(".");
		button_20.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_20.setBounds(168, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("^");
		button_21.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_21.setBounds(10, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("0");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+0);
			}
		});
		button_22.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_22.setBounds(89, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_22);
		
		JButton btnSin = new JButton("sin");
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(418, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCos.setBounds(497, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan.setBounds(576, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnTan);
		
		JButton btnMod = new JButton("mod");
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMod.setBounds(655, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnMod);
		
		JButton btnPie = new JButton("pie");
		btnPie.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPie.setBounds(734, 113, 69, 68);
		frmChotucalsi.getContentPane().add(btnPie);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSinh.setBounds(418, 191, 69, 68);
		frmChotucalsi.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCosh.setBounds(497, 191, 69, 68);
		frmChotucalsi.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLnx.setBounds(576, 191, 69, 68);
		frmChotucalsi.getContentPane().add(btnLnx);
		
		JButton btnLog = new JButton("log");
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLog.setBounds(655, 191, 69, 68);
		frmChotucalsi.getContentPane().add(btnLog);
		
		JButton btnRund = new JButton("rund");
		btnRund.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRund.setBounds(734, 191, 69, 68);
		frmChotucalsi.getContentPane().add(btnRund);
		
		JButton btnX = new JButton("x*2");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX.setBounds(418, 269, 69, 68);
		frmChotucalsi.getContentPane().add(btnX);
		
		JButton btnX_1 = new JButton("x*3");
		btnX_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX_1.setBounds(497, 269, 69, 68);
		frmChotucalsi.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("bin");
		btnBin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBin.setBounds(576, 269, 69, 68);
		frmChotucalsi.getContentPane().add(btnBin);
		
		JButton btnDec = new JButton("dec");
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDec.setBounds(655, 269, 69, 68);
		frmChotucalsi.getContentPane().add(btnDec);
		
		JButton btnHex = new JButton("hex");
		btnHex.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHex.setBounds(734, 269, 69, 68);
		frmChotucalsi.getContentPane().add(btnHex);
		
		JButton btnOct = new JButton("oct");
		btnOct.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOct.setBounds(418, 347, 69, 68);
		frmChotucalsi.getContentPane().add(btnOct);
		
		JButton button_39 = new JButton("1");
		button_39.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_39.setBounds(418, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_39);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCbr.setBounds(497, 347, 69, 68);
		frmChotucalsi.getContentPane().add(btnCbr);
		
		JButton button_41 = new JButton("1");
		button_41.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_41.setBounds(497, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_42.setBounds(576, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("1");
		button_43.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_43.setBounds(576, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("1");
		button_44.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_44.setBounds(655, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("1");
		button_45.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_45.setBounds(655, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("1");
		button_46.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_46.setBounds(734, 347, 69, 68);
		frmChotucalsi.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("1");
		button_47.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_47.setBounds(734, 425, 69, 68);
		frmChotucalsi.getContentPane().add(button_47);
		
		JMenuBar menuBar = new JMenuBar();
		frmChotucalsi.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Standard");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmChotucalsi.setTitle("Chotu_Calsi 2.0");
				frmChotucalsi.setBounds(200, 200, 425, 665);
				Window txtDisplay = null;
				txtDisplay.setBounds(10,11,243,37);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Scientific Calculator");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmChotucalsi.setTitle(" Scientific Calculator");
				frmChotucalsi.setBounds(200, 200, 900, 665);
				Window txtDisplay = null;
				txtDisplay.setBounds(10,11,494,37);
			
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
	}
}
