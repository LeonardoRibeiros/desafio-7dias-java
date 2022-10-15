package resposta;
//ListaExtra03-SwingBasico-I5  (Exercício 5)
//Faça uma janela (JFrame) como se pede:
//5.1. Crie três campos de texto (JTextField): um campo para cadastrar um número e outros dois
//para mostrar o maior e o menor número;
//5.1.1. O campo de maior e menor não podem ser editáveis - você deve procurar a
//propriedade para desativar no menu de propriedades do WindowBuilder
//5.2. Três labels (JLabel) para identificar cada campo de texto;
//5.3. Um botão (JButton) com texto “CADASTRAR” e outro botão (JButton) com texto “EXIBIR”
//5.4. Ao clicar no botão “CADASTRAR” você deve inserir o número em uma lista (ArrayList) de Double.
//5.5. Ao clicar no botão “EXIBIR” você deve exibir o maior e o menor número - que foram
//armazenados na lista - nos respectivos campos de texto.
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField textField_1;
	private JTextField textField_2;
	private ArrayList<Integer> lista = new ArrayList<>();
	private Integer maior;
	private Integer menor;

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
		setBounds(100, 100, 301, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00DAMERO:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(32, 31, 74, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("MAIOR:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(32, 112, 74, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("MENOR:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(32, 143, 74, 14);
		contentPane.add(lblNewLabel_2);

		num = new JTextField();
		num.setBounds(103, 28, 114, 20);
		contentPane.add(num);
		num.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(103, 109, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(103, 140, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String txt1 = num.getText();
				Integer n1 = Integer.valueOf(txt1);
				lista.add(n1);
				num.setText("");
			}
		});
		btnNewButton.setBounds(103, 56, 114, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("EXIBIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maior = lista.get(0);
				menor = lista.get(0);
				for (int i = 1; i < lista.size(); i++) {

					if (lista.get(i) > maior) {
						maior = lista.get(i);
					}
					if (lista.get(i) < menor) {
						menor = lista.get(i);
					}

				}
				textField_1.setText(String.valueOf(maior));
				textField_2.setText(String.valueOf(menor));
			}
		});
		btnNewButton_1.setBounds(103, 168, 117, 23);
		contentPane.add(btnNewButton_1);
	}
}
