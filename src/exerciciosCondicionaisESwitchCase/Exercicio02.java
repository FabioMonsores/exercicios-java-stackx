/*Criar um algoritmo que receba a idade de um nadador e informe a sua categoria: 
infantil (at� 10anos), juvenil (at� 17 anos) ou s�nior (acima de 17 anos).*/

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
			System.out.println("Voc� est� na classe infantil!");
		}

		else if (idade <= 17) {
			System.out.println("Voc� est� na classe juvenil!");
		}

		else {
			System.out.println("Voc� est� na classe s�nior!");
		}

	}

}
