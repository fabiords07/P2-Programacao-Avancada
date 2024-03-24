package aula02;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seja bem-vindo a Loja de Revelações do João Klaber!");
		System.out.println("Informe a quantidade de fotos que você gostaria de revelar: ");
		
		int quantFotos = scanner.nextInt();
		double valorTotal = 0;
		
		if (quantFotos <= 30) {
			valorTotal = quantFotos * 0.5;
		} else if (quantFotos > 30 && quantFotos <= 50) {
			valorTotal = quantFotos * 0.3;
		} else if (quantFotos > 50 && quantFotos <= 100) {
			valorTotal = quantFotos * 0.2;
		} else {
			valorTotal = quantFotos * 0.1;
		}
		
		System.out.println("O valor total pela revelação de " + quantFotos + " fotos é de " + valorTotal + ".");

	}

}
