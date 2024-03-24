package aula01;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String num1 = scanner.next();
		
		System.out.println("Digite mais um número: ");
		String num2 = scanner.next();
		
		double num1s = Double.parseDouble(num1);
		double num2s = Double.parseDouble(num2);
		
		double resultado = (num1s + num2s) / 2;
		String resultadoFormatado = String.format("%.5f", resultado);
		
		System.out.println("O primeiro número digitado foi " + num1 + ".");
		System.out.println("O segundo número digitado foi " + num2 + ".");
		System.out.println("O resultado é: " + resultadoFormatado + ".");
		// system.out.printf("MEDIA = %.5f\n", resultado);

	}

}
