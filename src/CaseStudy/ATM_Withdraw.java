package CaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ATM_Withdraw extends ATM_Main{
	 ATM_Main fr = new ATM_Main();
	JFrame frame;
	private JTextField withdrawAmount;
	protected Window frmAtmMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Withdraw window = new ATM_Withdraw();
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
	public ATM_Withdraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.setBackground(new Color(51, 51, 51));
		frame.setBounds(100, 100, 402, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWithdraw = new JLabel("Withdraw");
		lblWithdraw.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithdraw.setForeground(Color.GREEN);
		lblWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWithdraw.setBounds(88, 46, 187, 30);
		frame.getContentPane().add(lblWithdraw);
		
		withdrawAmount = new JTextField();
		withdrawAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		withdrawAmount.setFont(new Font("Tahoma", Font.BOLD, 30));
		withdrawAmount.setEditable(false);
		withdrawAmount.setColumns(10);
		withdrawAmount.setCaretColor(Color.WHITE);
		withdrawAmount.setBounds(77, 98, 212, 41);
		frame.getContentPane().add(withdrawAmount);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "1");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(77, 182, 64, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "2");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(151, 182, 64, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "3");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBounds(225, 182, 64, 30);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "4");
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setFocusable(false);
		btnNewButton_1_4.setBounds(77, 223, 64, 30);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "5");
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setFocusable(false);
		btnNewButton_1_3.setBounds(151, 223, 64, 30);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_5 = new JButton("7");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "7");
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_5.setFocusable(false);
		btnNewButton_1_5.setBounds(77, 266, 64, 30);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("8");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "8");
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_6.setFocusable(false);
		btnNewButton_1_6.setBounds(151, 266, 64, 30);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_8.setFocusable(false);
		btnNewButton_1_8.setBounds(77, 307, 64, 30);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_10 = new JButton("00");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "00");
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_10.setFocusable(false);
		btnNewButton_1_10.setBounds(151, 307, 64, 30);
		frame.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 if (withdrawAmount.getText().equals("")) {
				        	throw new Exception("Withdrawal amount should not be zero");
				        }
					 else if (ATM_Main.balance < Double.parseDouble(withdrawAmount.getText())) {
				           throw new Exception("Insufficient balance :(");
				        } else {
				            ATM_Main.setData(ATM_Main.balance - Double.parseDouble(withdrawAmount.getText()));
				            ATM_Main.setTextArea("You've withdraw ₱" + Double.parseDouble(withdrawAmount.getText()));
				            JOptionPane.showMessageDialog(frame, "Withdrawal successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);
				            fr.frmAtmMain.setVisible(true);
				            frame.dispose();
				        }
				 }
				 catch(Exception ex) {
					 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
				 }
			        
			    }
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.setBounds(151, 348, 64, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDel = new JButton("Del");
		btnDel.setForeground(new Color(255, 255, 255));
		btnDel.setFocusPainted(false);
		btnDel.setContentAreaFilled(false);
		btnDel.setOpaque(true);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = withdrawAmount.getText();
                if (!text.isEmpty()) {
                    // Remove the last character from the text
                    text = text.substring(0, text.length() - 1);
                    withdrawAmount.setText(text);
                }
			}
		});
		btnDel.setOpaque(true);
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDel.setFocusPainted(false);
		btnDel.setContentAreaFilled(false);
		btnDel.setBackground(new Color(51, 153, 204));
		btnDel.setBounds(225, 348, 64, 30);
		frame.getContentPane().add(btnDel);
		
		JButton btnNewButton_1_9 = new JButton(".");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + ".");
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_9.setFocusable(false);
		btnNewButton_1_9.setBounds(225, 307, 64, 30);
		frame.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_7 = new JButton("9");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "9");
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_7.setFocusable(false);
		btnNewButton_1_7.setBounds(225, 266, 64, 30);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_2 = new JButton("6");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawAmount.setText(withdrawAmount.getText() + "6");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBounds(225, 223, 64, 30);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.setOpaque(true);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setFocusPainted(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fr.frmAtmMain.setVisible(true);
				frame.dispose();
			}
		});
		btnCancel.setOpaque(true);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setFocusPainted(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setBackground(new Color(204, 0, 0));
		btnCancel.setBounds(77, 348, 64, 30);
		frame.getContentPane().add(btnCancel);
	}

}
