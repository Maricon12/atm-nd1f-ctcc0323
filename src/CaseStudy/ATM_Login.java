package CaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class ATM_Login {

	JFrame frmAtmMachine;
	private JPasswordField pin;
	//initial pin
    private int initialPin = 2468;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Login window = new ATM_Login();
					window.frmAtmMachine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmAtmMachine = new JFrame();
		frmAtmMachine.setType(Type.POPUP);
		frmAtmMachine.setResizable(false);
		frmAtmMachine.setTitle("ATM Machine Login");
		frmAtmMachine.getContentPane().setBackground(new Color(51, 51, 51));
		frmAtmMachine.getContentPane().setLayout(null);
		frmAtmMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pin = new JPasswordField();
		pin.setCaretColor(new Color(255, 255, 255));
		pin.setEditable(false);
		pin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		pin.setHorizontalAlignment(SwingConstants.CENTER);
		pin.setBounds(87, 114, 205, 39);
		frmAtmMachine.getContentPane().add(pin);
		
		JLabel lblNewLabel = new JLabel("ATM Machine");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBounds(98, 43, 187, 30);
		frmAtmMachine.getContentPane().add(lblNewLabel);
		
		JButton loginBtn = new JButton("Enter");
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setFocusPainted(false);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setOpaque(true);
		loginBtn.setBackground(new Color(51, 153, 0));
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
			    String pinText = pin.getText();
			    int warning = 0, error = 0;
			    
			    try {
			    	  if (pinText.equals("")) {
			    		   warning = 1;
					       throw new Exception( "Missing PIN code!");
					    } else {
					        int uPin = Integer.parseInt(pinText);
					        if (uPin != initialPin) {
					        	error = 1;
					        	pin.setText("");
					           throw new Exception("Invalid PIN code!");
					        } else {
					        	warning	= 0;
					        	error = 0;
					            JOptionPane.showMessageDialog(frmAtmMachine, "Welcome User!");
					            ATM_Main men = new ATM_Main();
					            men.frmAtmMain.setVisible(true);
					            frmAtmMachine.dispose();;
					        }
					    }
			    }
			    catch(Exception ex) {
			    	if(warning == 1) {
			    		JOptionPane.showMessageDialog(frmAtmMachine, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
			    	}
			    	if (error == 1) {
			    		JOptionPane.showMessageDialog(frmAtmMachine, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			    	}
			    }
			}
		});
		
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		loginBtn.setBounds(235, 319, 64, 30);
		loginBtn.setFocusable(false);
		frmAtmMachine.getContentPane().add(loginBtn);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "1");
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(87, 194, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "2");
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(161, 194, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBounds(235, 194, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "3");
			}
		});
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBounds(87, 235, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "4");
			}
		});
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setFocusable(false);
		btnNewButton_1_3.setBounds(161, 235, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "5");
			}
		});
		
		JButton btnNewButton_1_4 = new JButton("6");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setFocusable(false);
		btnNewButton_1_4.setBounds(235, 235, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_4);
		btnNewButton_1_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "6");
			}
		});
		
		JButton btnNewButton_1_5 = new JButton("7");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_5.setFocusable(false);
		btnNewButton_1_5.setBounds(87, 278, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_5);
		btnNewButton_1_5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "7");
			}
		});
		
		JButton btnNewButton_1_6 = new JButton("8");
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_6.setFocusable(false);
		btnNewButton_1_6.setBounds(161, 278, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_6);
		btnNewButton_1_6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "8");
			}
		});
		
		JButton btnNewButton_1_7 = new JButton("9");
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_7.setFocusable(false);
		btnNewButton_1_7.setBounds(235, 278, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_7);
		btnNewButton_1_7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "9");
			}
		});
		
		JButton btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_8.setFocusable(false);
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pin.setText(pin.getText() + "0");
			}
		});
		
		btnNewButton_1_8.setBounds(87, 319, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_8_1 = new JButton("Del");
		btnNewButton_1_8_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_8_1.setFocusPainted(false);
		btnNewButton_1_8_1.setContentAreaFilled(false);
		btnNewButton_1_8_1.setOpaque(true);
		btnNewButton_1_8_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = pin.getText();
                if (!text.isEmpty()) {
                    // Remove the last character from the text
                    text = text.substring(0, text.length() - 1);
                    pin.setText(text);
                }
			}
		});
		btnNewButton_1_8_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_8_1.setFocusable(false);
		btnNewButton_1_8_1.setBounds(161, 319, 64, 30);
		frmAtmMachine.getContentPane().add(btnNewButton_1_8_1);
		
		JLabel lbldigitPin = new JLabel("6-digit PIN");
		lbldigitPin.setHorizontalAlignment(SwingConstants.CENTER);
		lbldigitPin.setForeground(Color.GREEN);
		lbldigitPin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbldigitPin.setBounds(97, 153, 187, 30);
		frmAtmMachine.getContentPane().add(lbldigitPin);
		frmAtmMachine.setBackground(new Color(0, 0, 0));
		frmAtmMachine.setBounds(100, 100, 402, 459);
		frmAtmMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
