//Fa�a um programa que mostre a soma de todos os n�meros no intervalo de 1 at� 100.
package exerciciosRepeticaoEVetores;

public class Exercicio04 {
	public static void main(String[] args) {
		int soma = 0;

		System.out.print("A soma dos 100 primeiros n�meros �: ");
		for (int i = 1; i <= 100; i++)
			soma += 1;	// soma = soma + i
		System.out.println(soma);

		System.out.print("A soma utilizando a instru��o WHILE: ");
		int soma2 = 0, i2 = 0;
		while (i2 <= 100) {
			soma2 += i2; // soma2 = soma2 + i2;
			i2++; 
		}
		System.out.println(soma2);
	}
}
