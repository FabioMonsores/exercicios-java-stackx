//Criar um programa que leia dois números inteiros, efetue as quatro operações e mostre os resultados.

package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double number1, number2, soma, subt, mult, divi;

		System.out.println("Digite o primeiro número:");
		number1 = ler.nextInt();

		System.out.println("Digite o segundo número:");
		number2 = ler.nextInt();

		ler.close();

		soma = number1 + number2;
		subt = number1 - number2;
		mult = number1 * number2;
		divi = number1 / number2;

		System.out.printf("Soma: %.0f%n", soma);

		System.out.printf("Subtração: %.0f%n", subt);

		System.out.printf("Multiplicação: %.0f%n", mult);

		System.out.printf("Divisão: %.2f", divi);

	}

}
