//Programa em Java que calcula a m�dia das notas de uma turma
package exerciciosRepeticaoEVetores;

public class Exercicio02 {
	public static void main(String[] args) {

		double media, nota[] = new double[] { 10.0, 7.0, 8.5, 9.2 };

		System.out.println("Nota 01: " + nota[0]);
		System.out.println("Nota 02: " + nota[1]);
		System.out.println("Nota 03: " + nota[2]);
		System.out.println("Nota 04: " + nota[3]);

		media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;

		System.out.println(" "); // Poderia ter usado "\n" ou "%n" antes de "M�dia" mas n�o quis poluir o c�digo.
		System.out.printf("M�dia: %.2f ", media);
	}
}
