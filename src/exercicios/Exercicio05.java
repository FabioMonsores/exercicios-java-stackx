/*Criar um programa que leia um valor em Real e a cota��o do d�lar, 
e converta esse valor em d�lares.*/

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valorReal, cotDollar, cotEuro;
		
		cotDollar = 5.04; //Cota��o do dolar no exato momento que estou fazendo esta atividade
		cotEuro = 5.30;  //Cota��o do euro no exato momento que estou fazendo esta atividade
		
		System.out.println("Cota��o do D�lar: US$ " + cotDollar);
		System.out.println("Cota��o do Euro: � " + cotEuro);

		System.out.println("\nEscreva o valor que deseja converter:");
		valorReal = ler.nextDouble();
		ler.close();
		
		System.out.printf("Real: R$ %.2f || Dolar: US$ %.2f || Euro: � %.2f", 
				valorReal, (valorReal*cotDollar), (valorReal*cotEuro));
		
	}

}
