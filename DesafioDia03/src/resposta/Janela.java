package resposta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//ListaExtra03-SwingBasico-I5  (Exercício 1)
//Faça uma janela (JFrame) com dois campos de texto (inputs). Você deve criar quatro botões com os
//operadores de soma, subtração, divisão e multiplicação. Programe cada botão para realizar uma
//operação de acordo com o que foi clicado, e exiba o resultado em uma caixa de diálogo com o
//showMessageDialog (JOptionPane).

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() {
		setBackground(new Color(124, 156, 143));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 173);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00DAMERO 1:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lblNewLabel.setBounds(24, 31, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00DAMERO 2:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lblNewLabel_1.setBounds(24, 80, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		num1 = new JTextField();
		num1.setForeground(new Color(0, 0, 0));
		num1.setBounds(102, 28, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(102, 77, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		JButton soma = new JButton("+");
		soma.setForeground(new Color(64, 128, 128));
		soma.setBackground(new Color(255, 255, 255));
		soma.setFont(new Font("Tahoma", Font.BOLD, 13));
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Float n1 = Float.valueOf(texto1);
				Float n2 = Float.valueOf(texto2);
				Float soma = n1 + n2;
				JOptionPane.showMessageDialog(null, "SOMA: " + soma);
			}
		});
		soma.setBounds(209, 27, 75, 23);
		contentPane.add(soma);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Float n1 = Float.valueOf(texto1);
				Float n2 = Float.valueOf(texto2);
				Float sub = n1 - n2;
				JOptionPane.showMessageDialog(null, "SUBTRACAO: " + sub);
			}
		});
		sub.setForeground(new Color(64, 128, 128));
		sub.setBackground(new Color(255, 255, 255));
		sub.setFont(new Font("Tahoma", Font.BOLD, 18));
		sub.setBounds(294, 27, 75, 23);
		contentPane.add(sub);
		
		JButton mult = new JButton("x");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Float n1 = Float.valueOf(texto1);
				Float n2 = Float.valueOf(texto2);
				Float mul = n1 * n2;
				JOptionPane.showMessageDialog(null, "MULTIPLICACAO: " + mul);	
			}
		});
		mult.setForeground(new Color(64, 128, 128));
		mult.setBackground(new Color(255, 255, 255));
		mult.setFont(new Font("Tahoma", Font.BOLD, 13));
		mult.setBounds(209, 76, 75, 23);
		contentPane.add(mult);
		
		JButton div = new JButton("\u00F7");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Float n1 = Float.valueOf(texto1);
				Float n2 = Float.valueOf(texto2);
				Float div = n1 / n2;
				JOptionPane.showMessageDialog(null, "DIVISAO: " + div);
			}
		});
		div.setForeground(new Color(64, 128, 128));
		div.setBackground(new Color(255, 255, 255));
		div.setFont(new Font("Tahoma", Font.BOLD, 13));
		div.setBounds(294, 76, 75, 23);
		contentPane.add(div);
	}
}
