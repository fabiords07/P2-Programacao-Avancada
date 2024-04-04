package aula00revisao;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade <= 15) {
            System.out.println("Não pode votar");
        } else if (idade > 65) {
            System.out.println("Voto não obrigatório");
        } else if (idade >= 18) {
            System.out.println("Voto obrigatório");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto não obrigatório");
        } else {
            System.out.println("Opção inválida");
        }
		
		

	}

}