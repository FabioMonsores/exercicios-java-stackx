//Criar um programa que leia dois n�meros inteiros, efetue as quatro opera��es e mostre os resultados.

package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double number1, number2, soma, subt, mult, divi;

		System.out.println("Digite o primeiro n�mero:");
		number1 = ler.nextInt();

		System.out.println("Digite o segundo n�mero:");
		number2 = ler.nextInt();

		ler.close();

		soma = number1 + number2;
		subt = number1 - number2;
		mult = number1 * number2;
		divi = number1 / number2;

		System.out.printf("Soma: %.0f%n", soma);

		System.out.printf("Subtra��o: %.0f%n", subt);

		System.out.printf("Multiplica��o: %.0f%n", mult);

		System.out.printf("Divis�o: %.2f", divi);

	}

}
