package resposta;
import java.util.Scanner;
import javax.swing.JOptionPane;
//ListaExtra02-Algoritmos-I5  (Exerc�cio 16)
//Fa�a um m�todo que receba como par�metro um vetor de Integer. O m�todo deve contar quantos
//n�meros s�o pares e retornar esta quantidade.

public class Main {
	public static void main(String[] args) {
		Integer vetor[] = new Integer[5];

		for (int i = 0; i < vetor.length; i++) {
			String x = JOptionPane.showInputDialog(null, "Digite o N�mero: ");
			Integer num = Integer.valueOf(x);
			vetor[i] = num;
		}	
		int n_par = func_par(vetor);
		JOptionPane.showMessageDialog(null, "A quantidade de numeros par �: " + n_par);
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
