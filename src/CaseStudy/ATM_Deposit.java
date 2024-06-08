package CaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ATM_Deposit extends ATM_Main{
	
	JFrame frmDeposit;
	private JTextField depositAmount;
	protected Object frmDeposit1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_3;
	private JButton btnNewButton_1_4;
	private JButton btnNewButton_1_5;
	private JButton btnNewButton_1_6;
	private JButton btnNewButton_1_7;
	private JButton btnNewButton_1_8;
	private JButton btnDel;
	private JLabel lblDeposit;
	private JButton btnNewButton_1_9;
	private JButton btnNewButton_1_10;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Deposit window = new ATM_Deposit();
					window.frmDeposit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_Deposit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeposit = new JFrame();
		frmDeposit.setResizable(false);
		frmDeposit.setType(Type.POPUP);
		frmDeposit.setTitle("ATM Deposit");
		frmDeposit.getContentPane().setBackground(new Color(51, 51, 51));
		frmDeposit.setBounds(100, 100, 403, 463);
		frmDeposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeposit.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					   if (depositAmount.getText().equals("")) {
					        throw new Exception("Cannot deposit, zero amount");
					    } else {
					        ATM_Main.setData(ATM_Main.balance += Double.parseDouble(depositAmount.getText()));
					        ATM_Main.setTextArea("You've deposited ₱" + Double.parseDouble(depositAmount.getText()));
					        JOptionPane.showMessageDialog(frmDeposit, "Deposit successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);
					        frmAtmMain.setVisible(true);
					        frmDeposit.dispose();
					    }
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(frmDeposit, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
				}
			 
			}
		});
		
        
		btnNewButton.setBounds(160, 344, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton);
		depositAmount = new JTextField();
		depositAmount.setFont(new Font("Tahoma", Font.BOLD, 30));
		depositAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		depositAmount.setCaretColor(new Color(255, 255, 255));
		depositAmount.setEditable(false);
		depositAmount.setBounds(86, 94, 212, 41);
		frmDeposit.getContentPane().add(depositAmount);
		depositAmount.setColumns(10);
		
		btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "1");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(86, 178, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(160, 178, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "2");
			}
		});
		
		btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBounds(234, 178, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "3");
			}
		});
		
		btnNewButton_1_2 = new JButton("6");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBounds(234, 219, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "6");
			}
		});
		
		btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setFocusable(false);
		btnNewButton_1_3.setBounds(160, 219, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "5");
			}
		});
		
		btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setFocusable(false);
		btnNewButton_1_4.setBounds(86, 219, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_4);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "4");
			}
		});
		
		btnNewButton_1_5 = new JButton("7");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_5.setFocusable(false);
		btnNewButton_1_5.setBounds(86, 262, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_5);
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "7");
			}
		});
		
		btnNewButton_1_6 = new JButton("8");
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_6.setFocusable(false);
		btnNewButton_1_6.setBounds(160, 262, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_6);
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "8");
			}
		});
		
		btnNewButton_1_7 = new JButton("9");
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_7.setFocusable(false);
		btnNewButton_1_7.setBounds(234, 262, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_7);
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "9");
			}
		});
		
		btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_8.setFocusable(false);
		btnNewButton_1_8.setBounds(86, 303, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_8);
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "0");
			}
		});
		
		btnDel = new JButton("Del");
		btnDel.setForeground(new Color(255, 255, 255));
		btnDel.setFocusPainted(false);
		btnDel.setContentAreaFilled(false);
		btnDel.setOpaque(true);
		btnDel.setBackground(new Color(0, 153, 204));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = depositAmount.getText();
                if (!text.isEmpty()) {
                    // Remove the last character from the text
                    text = text.substring(0, text.length() - 1);
                    depositAmount.setText(text);
                }
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDel.setBounds(234, 344, 64, 30);
		frmDeposit.getContentPane().add(btnDel);
		
		lblDeposit = new JLabel("Deposit");
		lblDeposit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeposit.setForeground(Color.GREEN);
		lblDeposit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDeposit.setBounds(97, 42, 187, 30);
		frmDeposit.getContentPane().add(lblDeposit);
		
		btnNewButton_1_9 = new JButton(".");
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_9.setFocusable(false);
		btnNewButton_1_9.setBounds(234, 303, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_9);
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + ".");
			}
		});
		
		btnNewButton_1_10 = new JButton("00");
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_10.setFocusable(false);
		btnNewButton_1_10.setBounds(160, 303, 64, 30);
		frmDeposit.getContentPane().add(btnNewButton_1_10);
		
		btnCancel = new JButton("Exit");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFocusPainted(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setOpaque(true);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frmAtmMain.setVisible(true);
			     frmDeposit.dispose();
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setFocusPainted(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setBackground(new Color(204, 0, 0));
		btnCancel.setBounds(86, 344, 64, 30);
		frmDeposit.getContentPane().add(btnCancel);
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount.setText(depositAmount.getText() + "00");
			}
		});
		
	}

}
