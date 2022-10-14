package resposta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
//ListaExtra03-SwingBasico-I5  (Exercício 4)
//4.1. Crie dois campos de texto (JTextField): um campo para cadastrar um número e outro para
//mostrar o resultado do que for pedido
//4.1.1. O campo para mostrar o resultado deve ser impossível de editar - você deve
//procurar a propriedade para desativar no menu de propriedades do
//WindowBuilder
//4.2. Dois labels (JLabel) para identificar cada campo de texto;
//4.3. Um botão (JButton) com texto “CADASTRAR” e outro botão (JButton) com texto
//“EXIBIR”
//4.4. Ao clicar no botão “CADASTRAR” você deve inserir o número em uma lista (ArrayList)
//de Double.
//4.5. Ao clicar no botão “EXIBIR” você deve exibir no campo de resultado a quantidade de
//números pares que foram armazenados na lista

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField resultado;
	ArrayList<Double> lista = new ArrayList<>();
	int pares = 0;

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
		setBounds(100, 100, 377, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00DAMERO:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 40, 85, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PARES:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 77, 85, 14);
		contentPane.add(lblNewLabel_1);

		num = new JTextField();
		num.setBounds(104, 37, 86, 20);
		contentPane.add(num);
		num.setColumns(10);

		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(104, 74, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);

		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1 = num.getText();
				Double n1 = Double.valueOf(txt1);
				lista.add(n1);
				num.setText("");
			}
		});
		btnNewButton.setBounds(200, 36, 108, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIBIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i) % 2 == 0) {
						pares++;
					}
				}
				String txtpares = String.valueOf(pares);
				resultado.setText(txtpares);
			}
		});
		btnNewButton_1.setBounds(200, 73, 108, 23);
		contentPane.add(btnNewButton_1);
	}
}
