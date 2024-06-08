package CaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ATM_BankTransfer extends ATM_Main {

	JFrame frmBankTransfer;
	private JTextField accountNumber;
	private JTextField amountField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_BankTransfer window = new ATM_BankTransfer();
					window.frmBankTransfer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_BankTransfer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankTransfer = new JFrame();
		frmBankTransfer.setTitle("Bank Transfer");
		frmBankTransfer.getContentPane().setBackground(new Color(51, 51, 51));
		frmBankTransfer.setBounds(100, 100, 403, 463);
		frmBankTransfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankTransfer.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
	                
	                if (focusedComponent instanceof JTextField) {
	                	JTextField focusedTextField = (JTextField) focusedComponent;
	                    focusedTextField.setText(focusedTextField.getText() + "1");
	                }
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(84, 186, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "2");
                }
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(158, 186, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "4");
                }
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setFocusable(false);
		btnNewButton_1_4.setBounds(84, 227, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "5");
                }
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setFocusable(false);
		btnNewButton_1_3.setBounds(158, 227, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_5 = new JButton("7");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "7");
                }
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_5.setFocusable(false);
		btnNewButton_1_5.setBounds(84, 270, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("8");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "8");
                }
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_6.setFocusable(false);
		btnNewButton_1_6.setBounds(158, 270, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "0");
                }
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_8.setFocusable(false);
		btnNewButton_1_8.setBounds(84, 311, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_10 = new JButton("00");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "00");
                }
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_10.setFocusable(false);
		btnNewButton_1_10.setBounds(158, 311, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_10);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.setFocusPainted(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setOpaque(true);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAtmMain.setVisible(true);
				frmBankTransfer.dispose();
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setFocusPainted(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setBackground(new Color(204, 0, 0));
		btnCancel.setBounds(84, 352, 64, 30);
		frmBankTransfer.getContentPane().add(btnCancel);
		
		JButton btnDel = new JButton("Clear");
		btnDel.setForeground(new Color(255, 255, 255));
		btnDel.setFocusPainted(false);
		btnDel.setContentAreaFilled(false);
		btnDel.setOpaque(true);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountNumber.setText("");
				amountField.setText("");
			 }
			}
		);
		btnDel.setOpaque(true);
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDel.setFocusPainted(false);
		btnDel.setContentAreaFilled(false);
		btnDel.setBackground(new Color(51, 153, 204));
		btnDel.setBounds(232, 352, 64, 30);
		frmBankTransfer.getContentPane().add(btnDel);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int acc = 0, amnt = 0;
				
				try {
					if(accountNumber.getText().equals("")) {
						acc = 1;
						throw new Exception("Missing Account Recipient!");
					}
					else if(ATM_Main.balance < Double.parseDouble(amountField.getText())) {
						amnt = 1;
						throw new Exception("Transfer failed! Insufficient funds.");
					}
					else {
						acc = 0; amnt = 0;
						ATM_Main.setData(ATM_Main.balance - Double.parseDouble(amountField.getText()));
			            ATM_Main.setTextArea("You've transferred ₱" + Double.parseDouble(amountField.getText()) + " to the Account: " + accountNumber.getText());
						 JOptionPane.showMessageDialog(frmBankTransfer, "Transfer Successfully!", "Succcess!", JOptionPane.INFORMATION_MESSAGE);
						 frmAtmMain.setVisible(true);
						 frmBankTransfer.dispose();
					}
				}
				catch (Exception ex) {
					if(acc == 0) {
						 JOptionPane.showMessageDialog(frmBankTransfer, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
					}
					
					if(amnt == 0) {
						 JOptionPane.showMessageDialog(frmBankTransfer, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.setBounds(158, 352, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_9 = new JButton(".");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + ".");
                }
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_9.setFocusable(false);
		btnNewButton_1_9.setBounds(232, 311, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_7 = new JButton("9");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "9");
                }
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_7.setFocusable(false);
		btnNewButton_1_7.setBounds(232, 270, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_2 = new JButton("6");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "6");
                }
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBounds(232, 227, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component focusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if (focusedComponent instanceof JTextField) {
                	JTextField focusedTextField = (JTextField) focusedComponent;
                    focusedTextField.setText(focusedTextField.getText() + "3");
                }
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBounds(232, 186, 64, 30);
		frmBankTransfer.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblAccount = new JLabel("Account Number");
		lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount.setForeground(Color.GREEN);
		lblAccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAccount.setBounds(84, 26, 112, 30);
		frmBankTransfer.getContentPane().add(lblAccount);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setForeground(Color.GREEN);
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAmount.setBounds(78, 89, 70, 30);
		frmBankTransfer.getContentPane().add(lblAmount);
		
		accountNumber = new JTextField();
		accountNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		accountNumber.setEditable(false);
		accountNumber.setBounds(84, 59, 212, 30);
		frmBankTransfer.getContentPane().add(accountNumber);
		accountNumber.setColumns(10);
		
		amountField = new JTextField();
		amountField.setFont(new Font("Tahoma", Font.BOLD, 11));
		amountField.setEditable(false);
		amountField.setColumns(10);
		amountField.setBounds(84, 119, 212, 30);
		frmBankTransfer.getContentPane().add(amountField);
	}
}
