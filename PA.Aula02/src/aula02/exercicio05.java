package aula02;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Informe mais um número: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Informe um número entre 1 a 4 para uma operação misteriosa: ");
		int operacao = scanner.nextInt();
		
		double resultado = 0;
		
		switch (operacao) {
			case (1):
				if (num1 > num2) {
					resultado = num1 - num2;
					System.out.println("O " + num1 + " é maior que o " + num2 + ", e a subtração entre eles é: " + resultado + ".");
				} else if (num2 > num1) {
					resultado = num2 - num1;
					System.out.println("O " + num2 + " é maior que o " + num1 + ", e a subtração entre eles é: " + resultado + ".");
				} else {
					resultado = num1 - num2;
					System.out.println("O " + num1 + " é igual a " + num2 + ", e a subtração entre eles é: " + resultado + ".");
				}
				break;
			case (2):
				resultado = num1 / num2;
				System.out.println("A divisão entre " + num1 + " e " + num2 + " é " + resultado + ".");
				break;
			case (3):
				resultado = num1 * num2;
				System.out.println("O produto entre " + num1 + " e " + num2 + " é " + resultado + ".");
				break;
			case (4):
				resultado = (num1 + num2) / 2;
				System.out.println("A média entre " + num1 + " e " + num2 + " é " + resultado + ".");
				break;
			default:
				System.out.println("Operação inválida.");
		}
	}

}