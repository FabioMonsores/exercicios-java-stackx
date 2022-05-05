/*Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana
correspondente, por exemplo, se a entrada for: 1, mostre Domingo; 2, exiba Segunda;*/

package exerciciosCondicionaisESwitchCase;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um número de 1 à 7");
		num = ler.nextInt();
		ler.close();

		switch (num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Erro: Digite um número de 1 à 7");
				
		}

	}
}
