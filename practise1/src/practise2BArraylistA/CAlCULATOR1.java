package practise2BArraylistA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
public class CAlCULATOR1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CAlCULATOR1 window = new CAlCULATOR1();
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
	public CAlCULATOR1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 382, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 339, 164);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 184, 147, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBc_1 = new JButton("BC");
		btnBc_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBc_1.setBounds(191, 184, 158, 53);
		frame.getContentPane().add(btnBc_1);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0 )
			{
				JTextArea txtDisplay = new JTextArea();
				String EnterNumber = txtDisplay.getText() + button_1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(89, 247, 69, 53);
		frame.getContentPane().add(button_1);
		
		JButton btnBc = new JButton("+");
		btnBc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBc.setBounds(280, 247, 69, 53);
		frame.getContentPane().add(btnBc);
		
		JButton button_3 = new JButton("2");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(10, 247, 69, 53);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(88, 310, 69, 53);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(191, 247, 69, 53);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(280, 306, 69, 53);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(10, 313, 69, 53);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(89, 369, 69, 53);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("7");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(191, 310, 69, 53);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(280, 369, 69, 53);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("8");
		button_11.setBackground(SystemColor.inactiveCaption);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(10, 376, 69, 53);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("9");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(95, 432, 69, 53);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("0\t\t");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_13.setBounds(191, 373, 69, 53);
		frame.getContentPane().add(button_13);
		
		JButton btnC = new JButton("/");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(280, 432, 69, 53);
		frame.getContentPane().add(btnC);
		
		JButton button_14 = new JButton("%");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.setBounds(10, 439, 69, 53);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("^");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.setBounds(10, 499, 69, 53);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("(");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_16.setBounds(191, 436, 69, 53);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton(")\r\n");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.setBounds(282, 495, 69, 53);
		frame.getContentPane().add(button_17);
		
		JButton button = new JButton(".");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(191, 499, 69, 53);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("=");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(95, 499, 69, 53);
		frame.getContentPane().add(button_2);
	}
}
