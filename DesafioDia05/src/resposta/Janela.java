package resposta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
//ListaExtra03-SwingBasico-I5  (Exercício 3)
//3.1. Quatro campos de texto (JTextField): um campo de texto representa o nome do estudante e
//outros três representam as notas de um(a) estudante;
//3.2. Quatro JLabels para cada campo de texto, representando o que cada campo de texto é,
//respectivamente (nome, nota 1, nota 2, nota 3);
//3.3. Um botão (JButton) com texto “CALCULAR”
//3.4. Ao clicar no botão, o seu sistema deve calcular a média do estudante e exibir o resultado em
//uma caixa de diálogo com o showMessageDialog (JOptionPane)

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;

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
		setBounds(100, 100, 210, 220);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 199, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setForeground(new Color(25, 25, 25));
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 23, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NOTA 1:");
		lblNewLabel_1.setForeground(new Color(25, 25, 25));
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(24, 48, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("NOTA 2:");
		lblNewLabel_2.setForeground(new Color(25, 25, 25));
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(24, 73, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("NOTA 3:");
		lblNewLabel_3.setForeground(new Color(25, 25, 25));
		lblNewLabel_3.setBackground(new Color(50, 44, 39));
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(24, 98, 46, 14);
		contentPane.add(lblNewLabel_3);

		name = new JTextField();
		name.setBounds(80, 20, 86, 20);
		contentPane.add(name);
		name.setColumns(10);

		num1 = new JTextField();
		num1.setBounds(80, 45, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);

		num2 = new JTextField();
		num2.setBounds(80, 70, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);

		num3 = new JTextField();
		num3.setBounds(80, 95, 86, 20);
		contentPane.add(num3);
		num3.setColumns(10);

		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(45, 45, 45));
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = name.getText();
				String texto2 = num1.getText();
				String texto3 = num2.getText();
				String texto4 = num3.getText();

				Float n1 = Float.valueOf(texto2);
				Float n2 = Float.valueOf(texto3);
				Float n3 = Float.valueOf(texto4);

				float media = (n1 + n2 + n3) / 3;
				JOptionPane.showMessageDialog(null, "A média final do aluno " + texto1 + " é: " + media);
			}
		});
		btnNewButton.setBounds(80, 126, 86, 23);
		contentPane.add(btnNewButton);
	}
}
