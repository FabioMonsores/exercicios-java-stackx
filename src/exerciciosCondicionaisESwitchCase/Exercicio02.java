/*Criar um algoritmo que receba a idade de um nadador e informe a sua categoria: 
infantil (até 10anos), juvenil (até 17 anos) ou sênior (acima de 17 anos).*/

package exerciciosCondicionaisESwitchCase;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		ler.close();

		if (idade <= 10) {
			System.out.println("Você está na classe infantil!");
		}

		else if (idade <= 17) {
			System.out.println("Você está na classe juvenil!");
		}

		else {
			System.out.println("Você está na classe sênior!");
		}

	}

}
