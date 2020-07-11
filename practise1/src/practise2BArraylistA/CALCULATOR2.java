package practise2BArraylistA;
import javax.swing.JTextArea;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CALCULATOR2 {

	private JFrame CALCULATOR;
	private JTextField textfield;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALCULATOR2 window = new CALCULATOR2();
					window.CALCULATOR.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CALCULATOR2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CALCULATOR = new JFrame();
		CALCULATOR.setTitle("CHOTU_CALSI");
		CALCULATOR.setBounds(500, 500, 332, 597);
		CALCULATOR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CALCULATOR.getContentPane().setLayout(null);
		textfield = new JTextField();
		textfield.setBounds(10, 10, 292, 100);
		CALCULATOR.getContentPane().add(textfield);
		textfield.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				actionRecieved.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 175, 67, 68);
		CALCULATOR.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 253, 67, 68);
		CALCULATOR.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(87, 253, 67, 68);
		CALCULATOR.getContentPane().add(btnNewButton_2);
		
		JButton button = new JButton("3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(164, 253, 67, 68);
		CALCULATOR.getContentPane().add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(10, 331, 67, 68);
		CALCULATOR.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(87, 331, 67, 68);
		CALCULATOR.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(164, 331, 67, 68);
		CALCULATOR.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(10, 409, 67, 68);
		CALCULATOR.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(87, 409, 67, 68);
		CALCULATOR.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(164, 409, 67, 68);
		CALCULATOR.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("0");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(241, 409, 63, 68);
		CALCULATOR.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("%");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecieved.setText("mod");
				value2.setText(null);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(241, 331, 63, 68);
		CALCULATOR.getContentPane().add(button_8);
		
		JButton btnBc = new JButton("BC");
		btnBc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBc.setBounds(10, 487, 67, 68);
		CALCULATOR.getContentPane().add(btnBc);
		
		JButton button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecieved.setText("div");
				value2.setText(null);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(87, 175, 67, 68);
		CALCULATOR.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecieved.setText("mul");
				value2.setText(null);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(164, 175, 67, 68);
		CALCULATOR.getContentPane().add(button_11);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecieved.setText("add");
				value2.setText(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(241, 253, 63, 68);
		CALCULATOR.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("-");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecieved.setText("sub");
				value2.setText(null);
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(241, 178, 63, 65);
		CALCULATOR.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("=");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one = Integer.parseInt(value1.getText());
				int two = Integer.parseInt(value2.getText());
				
				
				if(actionRecieved.getText().equals("sub"))
				{
					int sub  = one-two;
					value2.setText(String.valueOf(sub));
				}
				if(actionRecieved.getText().equals("add"))
				{
					int add  = one+two;
					value2.setText(String.valueOf(add));
				}
				if(actionRecieved.getText().equals("mul"))
				{
					int mul  = one*two;
					value2.setText(String.valueOf(mul));
				}
				if(actionRecieved.getText().equals("div"))
				{
					int div  = one/two;
					value2.setText(String.valueOf(div));
				}
				if(actionRecieved.getText().equals("mod"))
				{
					int mod = one%two;
					value2.setText(String.valueOf(mod));
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(87, 484, 217, 71);
		CALCULATOR.getContentPane().add(btnNewButton_5);
		
		value2 = new JTextField();
		value2.setBounds(20, 50, 271, 50);
		CALCULATOR.getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setBounds(145, 22, 146, 40);
		CALCULATOR.getContentPane().add(value1);
		value1.setColumns(10);
		
		actionRecieved = new JLabel("");
		actionRecieved.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		actionRecieved.setBounds(206, 120, 96, 20);
		CALCULATOR.getContentPane().add(actionRecieved);
	}
	private JLabel actionRecieved; 
}
