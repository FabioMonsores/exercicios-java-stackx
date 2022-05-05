/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, 
 * e R$ 1,00 se forem compradas pelo menos 12. 
 * Crie um programa que receba a quantidade de maçãs compradas, 
 * calcule e escreva o custo total da compra.*/

package exerciciosCondicionaisESwitchCase;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor;
		int qtdMaca;

		System.out.println("Qual a quantidade de maçãs? ");
		qtdMaca = ler.nextInt();
		ler.close();

		if (qtdMaca < 12) {
			valor = qtdMaca * 1.30;
			System.out.printf("%d maçãs custam R$%.2f", qtdMaca, valor);
		}

		else {
			valor = qtdMaca * 1.00;
			System.out.printf("%d maçãs custam R$%.2f", qtdMaca, valor);
		}

	}
}
