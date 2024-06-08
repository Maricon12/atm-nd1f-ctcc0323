package CaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ATM_Main {

	JFrame frmAtmMain;
	public Window frmAtMain;
	static double balance = 100000D;
	private static JTextField balanceDisplay;
	private static JTextArea transact;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Main window = new ATM_Main();
					window.frmAtmMain.setVisible(true);
					window.frmAtmMain.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frmAtmMain = new JFrame();
		frmAtmMain.setResizable(false);
		frmAtmMain.setTitle("ATM Dashboard");
		frmAtmMain.getContentPane().setBackground(new Color(51, 51, 51));
		frmAtmMain.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATM_Deposit dep = new ATM_Deposit();
				dep.frmDeposit.setVisible(true);
				frmAtmMain.dispose();
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(275, 48, 117, 32);
		frmAtmMain.getContentPane().add(btnNewButton);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATM_Withdraw wd = new ATM_Withdraw();
				wd.frame.setVisible(true);
				frmAtmMain.dispose();
			}
		});
		btnWithdraw.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWithdraw.setFocusable(false);
		btnWithdraw.setBounds(275, 91, 117, 32);
		frmAtmMain.getContentPane().add(btnWithdraw);
		
		JButton btnExit = new JButton("Logout");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATM_Login login = new ATM_Login();
				login.frmAtmMachine.setVisible(true);
				frmAtmMain.dispose();
			}
		});
		btnExit.setFocusable(false);
		btnExit.setBounds(275, 273, 117, 32);
		frmAtmMain.getContentPane().add(btnExit);
		
		balanceDisplay = new JTextField();
		balanceDisplay.setText("₱" + balance);
		balanceDisplay.setCaretColor(new Color(255, 255, 255));
		balanceDisplay.setFont(new Font("Tahoma", Font.PLAIN, 35));
		balanceDisplay.setEditable(false);
		balanceDisplay.setBounds(22, 48, 243, 75);
		frmAtmMain.getContentPane().add(balanceDisplay);
		balanceDisplay.setColumns(10);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalance.setForeground(Color.GREEN);
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBalance.setBounds(22, 11, 118, 30);
		frmAtmMain.getContentPane().add(lblBalance);
		
		transact = new JTextArea();
		transact.setWrapStyleWord(true);
		transact.setLineWrap(true);
		transact.setEditable(false);
		transact.setBounds(22, 172, 243, 133);
		frmAtmMain.getContentPane().add(transact);
		
		JLabel lblTransactionHistory = new JLabel("Transaction History");
		lblTransactionHistory.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransactionHistory.setForeground(Color.GREEN);
		lblTransactionHistory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTransactionHistory.setBounds(22, 142, 199, 30);
		frmAtmMain.getContentPane().add(lblTransactionHistory);
		
		JButton btnBankTransfer = new JButton("Bank Transfer");
		btnBankTransfer.setFocusable(false);
		btnBankTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATM_BankTransfer bt = new ATM_BankTransfer();
				bt.frmBankTransfer.setVisible(true);
				frmAtmMain.dispose();
			}
		});
		btnBankTransfer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBankTransfer.setFocusable(false);
		btnBankTransfer.setBounds(275, 134, 117, 32);
		frmAtmMain.getContentPane().add(btnBankTransfer);
		
		
		frmAtmMain.setBounds(100, 100, 427, 366);
		frmAtmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// Setter method to receive data from FirstFrame
    public static void setData(double data) {
        balanceDisplay.setText("₱" + data);
    }
    
    // Setter method to add message to textare
    public static void setTextArea(String message) {
    	transact.append(message + "\n");
    }
}
