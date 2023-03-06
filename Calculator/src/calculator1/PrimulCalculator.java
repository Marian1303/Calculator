package calculator1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class PrimulCalculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimulCalculator window = new PrimulCalculator();
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
	public PrimulCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.BOLD, 9));
		frame.setBounds(100, 100, 304, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(97, 10, 164, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 54, 270, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnR.setBounds(10, 161, 52, 41);
		frame.getContentPane().add(btnR);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnx.setBounds(10, 199, 52, 41);
		frame.getContentPane().add(btnx);
		
		JButton btnX_1 = new JButton("X^3");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnX_1.setBounds(10, 279, 52, 41);
		frame.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("X^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnX.setBounds(10, 317, 52, 41);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact =1;
				while(a != 0) {
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnN.setBounds(10, 357, 52, 41);
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlusMinus.setBounds(10, 398, 52, 41);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(67, 357, 52, 41);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(67, 317, 52, 41);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(67, 279, 52, 41);
		frame.getContentPane().add(btn7);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnLog.setBounds(67, 199, 52, 41);
		frame.getContentPane().add(btnLog);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnEx.setBounds(67, 161, 52, 41);
		frame.getContentPane().add(btnEx);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(67, 398, 108, 41);
		frame.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(123, 357, 52, 41);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(123, 317, 52, 41);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(123, 279, 52, 41);
		frame.getContentPane().add(btn8);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSin.setBounds(123, 161, 52, 41);
		frame.getContentPane().add(btnSin);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDot.setBounds(177, 398, 52, 41);
		frame.getContentPane().add(btnDot);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(177, 357, 52, 41);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(177, 317, 52, 41);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(177, 279, 52, 41);
		frame.getContentPane().add(btn9);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() -1);
					backSpace=str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnBackSpace.setBounds(177, 239, 52, 41);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second= Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation=="-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation=="*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
			    }else if(operation=="/") {
				    result = first / second;
				    answer = String.format("%.2f", result);
				    textField.setText(answer);
				}else if(operation=="%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation=="X^Y") {
					
					double resultt=1;
					for(int i = 0; i<second;i++) {
						resultt = first * resultt;
					}
					
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
				
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEqual.setBounds(232, 398, 52, 41);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDivide.setBounds(232, 357, 52, 41);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMul.setBounds(232, 317, 52, 41);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSub.setBounds(232, 279, 52, 41);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(232, 239, 52, 41);
		frame.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(123, 239, 52, 41);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPercent.setBounds(67, 239, 52, 41);
		frame.getContentPane().add(btnPercent);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
				
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnXy.setBounds(10, 239, 52, 41);
		frame.getContentPane().add(btnXy);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCos.setBounds(177, 161, 52, 41);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTan.setBounds(232, 161, 52, 41);
		frame.getContentPane().add(btnTan);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnSinh.setBounds(123, 199, 52, 41);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCosh.setBounds(177, 199, 52, 41);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTanh.setBounds(232, 199, 52, 41);
		frame.getContentPane().add(btnTanh);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnN.setEnabled(true);
				btnX.setEnabled(true);
				btnX_1.setEnabled(true);
				btnx.setEnabled(true);
				btnXy.setEnabled(true);
				btnEx.setEnabled(true);
				btnLog.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnClear.setEnabled(true);
				btnPercent.setEnabled(true);
				btnEqual.setEnabled(true);
				btnR.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(6, 134, 45, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnN.setEnabled(false);
				btnX.setEnabled(false);
				btnX_1.setEnabled(false);
				btnx.setEnabled(false);
				btnXy.setEnabled(false);
				btnEx.setEnabled(false);
				btnLog.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnClear.setEnabled(false);
				btnPercent.setEnabled(false);
				btnEqual.setEnabled(false);
				btnR.setEnabled(false);
				textField.setEnabled(false);
				
				
				
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnOff.setBounds(53, 134, 45, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
