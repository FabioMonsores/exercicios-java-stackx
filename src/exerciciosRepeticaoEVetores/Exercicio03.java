/*Escreva um programa que pe�a para o usu�rio informar qual tabuada 
 * o mesmo deseja ver e armazene o n�mero em uma vari�vel.
 *  Em seguida, imprima a tabuada na tela se utilizando da instru��o FOR.*/

package exerciciosRepeticaoEVetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o n�mero de qual tabuada deseja ver: ");
		Integer num = ler.nextInt();
		ler.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + " = " + (i * num));

		}
	}
}
