package aula00revisao;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo a concessionária Quatro Rodas!");
		System.out.println("Digite sua idade para que possamos te apresentar nossas ofertas:");
		
		int idade = scanner.nextInt();
		
		if (idade <= 17) {
			System.out.println("Parabéns! Você acaba de ganhar 40% de desconto em qualquer bicicleta!");
		} else {
			System.out.println("Parabéns! Você acaba de ganhar 20% de desconto em qualquer carro!");
		}
	}

}
