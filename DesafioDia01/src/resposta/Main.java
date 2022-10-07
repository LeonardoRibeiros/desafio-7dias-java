package resposta;
import java.util.Scanner;
import javax.swing.JOptionPane;
//ListaExtra02-Algoritmos-I5  (Exercício 12)
//Faça um método que recebe como parâmetro um vetor de números inteiros ℤ, realiza a soma de
//todos os elementos do vetor e retorna esta soma.

public class Main {
	public static void main(String[] args) {
		Integer vetor[] = new Integer[5];

		for (int i = 0; i < vetor.length; i++) {
			String x = JOptionPane.showInputDialog(null, "Digite o Número: ");
			Integer num = Integer.valueOf(x);
			vetor[i] = num;
		}
		int resultado = conta(vetor);
		JOptionPane.showMessageDialog(null, "A soma dos numeros digitados é: " + resultado);
	}

	public static int conta(Integer vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

}
