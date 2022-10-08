package resposta;
import java.util.Scanner;
import javax.swing.JOptionPane;
//ListaExtra02-Algoritmos-I5  (Exercício 16)
//Faça um método que receba como parâmetro um vetor de Integer. O método deve contar quantos
//números são pares e retornar esta quantidade.

public class Main {
	public static void main(String[] args) {
		Integer vetor[] = new Integer[5];

		for (int i = 0; i < vetor.length; i++) {
			String x = JOptionPane.showInputDialog(null, "Digite o Número: ");
			Integer num = Integer.valueOf(x);
			vetor[i] = num;
		}	
		int n_par = func_par(vetor);
		JOptionPane.showMessageDialog(null, "A quantidade de numeros par é: " + n_par);
	}
	public static int func_par(Integer vetor[]) {
		int par = 0;
		for (int i = 0; i < vetor.length; i++) {
			int x = vetor[i]%2;
			if(x==0) {
				par++;
			}
		}
		return par;
	}
}
