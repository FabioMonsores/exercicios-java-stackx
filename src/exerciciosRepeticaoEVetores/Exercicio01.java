//Programa em Java que mostra os números ímpares de 1 a 100.

package exerciciosRepeticaoEVetores;

public class Exercicio01 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}


// OUTRA FORMA DE RESOLVER

/*
 * for (int i = 0; i < 100; i++) { 
 * if((i%2) == 0) {
 *  continue; 
 *  }
 * 
 * System.out.println(i); }
 */