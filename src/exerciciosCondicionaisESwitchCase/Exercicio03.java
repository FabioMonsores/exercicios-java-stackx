//Criar um programa que leia pelo teclado um valor inteiro e diga se � par ou �mpar.

package exerciciosCondicionaisESwitchCase;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextInt();
		ler.close();
		
		if (valor % 2 == 0) {
			System.out.printf("%d � par!", valor);
		} else {
			System.out.printf("%d � �mpar!", valor);
		}
	}

}
