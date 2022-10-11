package resposta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Faça uma janela (JFrame) com três campos de texto (inputs) - que representam os lados de um
//triângulo - e apenas um botão. Programe o botão para que, quando clicado, verifique que tipo de
//triângulo é representado pelos lados inseridos - triângulo equilátero (três lados iguais), isósceles
//(dois lados iguais) ou escaleno (três lados diferentes).

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 173);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num1 = new JTextField();
		num1.setForeground(new Color(54, 54, 58));
		num1.setBackground(new Color(255, 255, 255));
		num1.setBounds(27, 48, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setForeground(new Color(54, 54, 58));
		num2.setBackground(new Color(255, 255, 255));
		num2.setBounds(123, 48, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		num3 = new JTextField();
		num3.setForeground(new Color(54, 54, 58));
		num3.setBackground(new Color(255, 255, 255));
		num3.setBounds(219, 48, 86, 20);
		contentPane.add(num3);
		num3.setColumns(10);
		
		JButton btnNewButton = new JButton("VERIFICAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String txt1 = num1.getText();	
			String txt2 = num2.getText();	
			String txt3 = num3.getText();	
			
			Integer n1 = Integer.valueOf(txt1);
			Integer n2 = Integer.valueOf(txt2);
			Integer n3 = Integer.valueOf(txt3);
			
			if((n1 == n2) && (n1 == n3)){
				JOptionPane.showMessageDialog(null,"EQUILATERO");
			} else if((n1 != n2) && (n1 != n3)){
				JOptionPane.showMessageDialog(null,"ESCALENO");
			}else {
				JOptionPane.showMessageDialog(null,"ISOSCELES");
			}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(54, 54, 58));
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnNewButton.setBounds(117, 89, 102, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("LADO 1");
		lblNewLabel.setForeground(new Color(54, 54, 58));
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 27, 86, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("LADO 2");
		lblNewLabel_1.setForeground(new Color(54, 54, 58));
		lblNewLabel_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(123, 27, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("LADO 3");
		lblNewLabel_2.setForeground(new Color(54, 54, 58));
		lblNewLabel_2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(219, 27, 86, 14);
		contentPane.add(lblNewLabel_2);
	}
}
