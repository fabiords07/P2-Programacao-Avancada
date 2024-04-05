package aula02;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe um número: ");
		int numero = scanner.nextInt();
		if (numero <= 0) {
			System.out.println("Número inválido.");
		}
		int soma = 0;
		
		for (int i = 0; i <= numero; i++) {
			soma += i ;
		}
		
		System.out.println("A soma entre os números entre " + numero + " é de: " + soma + ".");		

	}

}