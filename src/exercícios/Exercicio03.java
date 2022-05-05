//Criar um programa que leia um número real e imprima o seu dobro.

package exercíciosBasicosTelaScanner;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double number;
		
		System.out.println("Digite um número real:");
		number = ler.nextDouble();		
		ler.close();
		
		System.out.println("O número digitado foi: " + number);
		System.out.println("Seu dobreo é: " + number*2);

	}

}


