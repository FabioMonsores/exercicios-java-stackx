//Criar um programa que leia o nome de uma pessoa, a sua idade e o seu sal�rio e mostre na tela.

package exerc�ciosBasicosTelaScanner;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.println("Digite o nome:");
		nome = ler.nextLine();
		
		System.out.println("Digeite a idade:");
		idade = ler.nextInt();
		
		System.out.println("Digite o sal�rio:");
		salario = ler.nextDouble();
		
		ler.close();
		
		System.out.printf("%s, de %d anos, recebe um sal�rio de R$ %.2f ", nome, idade, salario);
	}

}
