//Criar um programa que leia um n�mero real e imprima o seu dobro.

package exerc�ciosBasicosTelaScanner;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double number;
		
		System.out.println("Digite um n�mero real:");
		number = ler.nextDouble();		
		ler.close();
		
		System.out.println("O n�mero digitado foi: " + number);
		System.out.println("Seu dobreo �: " + number*2);

	}

}


