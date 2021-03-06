package br.pucrs.alpro2.calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class JCalculaFrameApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCalculaFrameApp frame = new JCalculaFrameApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JCalculaFrameApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 291);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setBounds(12, 12, 322, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("0");
		
		final Operador op = new Operador();
		
		JButton button = new JButton("7");
		button.setBounds(22, 45, 65, 32);
		contentPane.add(button);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "7");
            }
        });
		
		JButton button_1 = new JButton("8");
		button_1.setBounds(99, 45, 65, 32);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "8");
            }
        });
		
		JButton button_2 = new JButton("9");
		button_2.setBounds(176, 45, 65, 32);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "9");
            }
        });
		
		JButton button_3 = new JButton("/");
		button_3.setBounds(176, 171, 65, 32);
		contentPane.add(button_3);
		button_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	Double result = 0.0;
            	if(op.getA() == null){
            		op.setOperacacao("/");
            		op.setA(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		textField.setText("0");
            	}
            	else{
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.divisor();
            		textField.setText(String.valueOf(result));
            		op.Anulador();
            	}
            }
        });
		
		JButton button_8 = new JButton("1");
		button_8.setBounds(22, 127, 65, 32);
		contentPane.add(button_8);
		button_8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "1");
            }
        });
		
		JButton button_9 = new JButton("2");
		button_9.setBounds(99, 127, 65, 32);
		contentPane.add(button_9);
		button_9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "2");
            }
        });
		
		JButton button_10 = new JButton("3");
		button_10.setBounds(176, 127, 65, 32);
		contentPane.add(button_10);
		button_10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "3");
            }
        });
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(254, 127, 65, 32);
		contentPane.add(button_11);
		button_11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	Double result = 0.0;
            	if(op.getA() == null){
            		op.setOperacacao("-");
            		op.setA(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		textField.setText("0");
            	}
            	else{
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.subtrair();
            		textField.setText(String.valueOf(result));
            		op.Anulador();
            	}
            }
        });
		
		JButton button_12 = new JButton("0");
		button_12.setBounds(22, 171, 65, 32);
		contentPane.add(button_12);
		button_12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "0");
            }
        });
		
		JButton button_14 = new JButton("=");
		button_14.setBounds(22, 214, 297, 32);
		contentPane.add(button_14);
		button_14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	Double result = 0.0;
            	if(op.getOperacacao() == "+"){
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.somador();
            	}
            	else if(op.getOperacacao() == "-"){
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.subtrair();
            	}		
            	else if(op.getOperacacao() == "x"){
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.multiplicador();
            	}
            	else if(op.getOperacacao() == "/"){
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.divisor();
            	}
        		textField.setText(String.valueOf(result));
            	op.Anulador();
            }
		});
		
		JButton button_15 = new JButton("+");
		button_15.setBounds(254, 171, 65, 32);
		contentPane.add(button_15);
		button_15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	Double result = 0.0;
            	if(op.getA() == null){
            		op.setOperacacao("+");
            		op.setA(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		textField.setText("0");
            	}
            	else{
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.somador();
            		textField.setText(String.valueOf(result));
            		op.Anulador();
            	}
            }
        });
		
		JButton button_4 = new JButton("4");
		button_4.setForeground(Color.BLACK);
		button_4.setBounds(22, 83, 65, 32);
		contentPane.add(button_4);
		button_4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "4");
            }
        });
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(99, 83, 65, 32);
		contentPane.add(button_5);
		button_5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "5");
            }
        });
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(176, 83, 65, 32);
		contentPane.add(button_6);
		button_6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
            	if(textField.getText().equals("0") == false)
            		valor = textField.getText();
            	
            	textField.setText(valor + "6");
            }
        });
		
		JButton btnX = new JButton("x");
		btnX.setBounds(254, 83, 65, 32);
		contentPane.add(btnX);
		btnX.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	Double result = 0.0;
            	if(op.getA() == null){
            		op.setOperacacao("x");
            		op.setA(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		textField.setText("0");
            	}
            	else{
            		op.setB(Double.parseDouble(textField.getText().replaceAll(",", ".")));
            		result = op.multiplicador();
            		textField.setText(String.valueOf(result));
            		op.Anulador();
            	}
            }
        });
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(253, 45, 65, 32);
		contentPane.add(btnCe);
		btnCe.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	textField.setText("0");
            	op.Anulador();
            }
        });
		
		JButton button_7 = new JButton(",");
		button_7.setBounds(99, 171, 65, 32);
		contentPane.add(button_7);
		button_7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	String valor = "";
        		valor = textField.getText();
            	if(valor.indexOf(",") == -1){
            		textField.setText(valor + ",");
            	}
            }
        });
	}
}
