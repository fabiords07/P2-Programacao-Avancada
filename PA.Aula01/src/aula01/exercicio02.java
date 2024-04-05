package aula01;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String num1 = scanner.next();
		
		System.out.println("Digite mais um número: ");
		String num2 = scanner.next();
		
		int num1s = Integer.parseInt(num1);
		int num2s = Integer.parseInt(num2);
		
		int resultado = num1s + num2s;
		
		System.out.println("O primeiro número digitado foi " + num1 + ".");
		System.out.println("O segundo número digitado foi " + num2 + ".");
		System.out.println("O resultado é: " + resultado + ".");
	}

}