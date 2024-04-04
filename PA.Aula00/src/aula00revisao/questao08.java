package aula00revisao;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao Ingresso.com!");
		
		//quantidade de ingressos
		System.out.println("Digite a quantidade de invressos (máximo 3 por pessoa): ");
		int quantidadeIngressos = scanner.nextInt();
		
		if (quantidadeIngressos <= 0 || quantidadeIngressos > 3) {
			System.out.println("Quantidade de ingressos inválida. Cada pessoa pode escolher entre 1 e 3 ingressos.");
			scanner.close();
			return;
		}
		
		//solicitando o setor
		System.out.println("Escolha o setor: VIP, Cadeiras, Arquibancada");
		System.out.println("Digite o setor desejado: ");
		String setor = scanner.next();
		//tipo de ingresso
		System.out.println("Escolha o tipo de ingresso: Estudante ou Inteira");
		System.out.println("Digite o tipo de ingresso desejado: ");
		String tipoIngresso = scanner.next();
		
		//valor total
		double valorTotal = calcularValorTotal(quantidadeIngressos, setor, tipoIngresso);
		
		//resultado
		System.out.println("O valor total da compra é: R$ " + valorTotal + " .");
		
		scanner.close();
	}
	
	public static double calcularValorTotal(int quantidadeIngressos, String setor, String tipoIngresso) {
		double precoUnitario = 0;
		
		switch (setor.toLowerCase()) {
		case "vip":
			precoUnitario = 350.0;
			break;
		case "cadeiras":
			precoUnitario = 200.0;
			break;
		case "arquibancada":
			precoUnitario = 100.0;
			break;
		default:
			System.out.println("Setor inválido.");
			System.exit(0);
		}
		
		//verifica se o tipo de ingresso é estudante e se o setor é VIP
		if (tipoIngresso.equalsIgnoreCase("estudante") && setor.equalsIgnoreCase("vip")) {
			System.out.println("Não é possível comprar pista VIP com ingresso de estudante. Selecione uma opção válida.");
			System.exit(0);
		}
		
		//calculo do valor total
		double valorTotal = quantidadeIngressos * precoUnitario;
		
		//aplica o desconto se o tipo de ingresso for estudante
		if (tipoIngresso.equalsIgnoreCase("estudante")) {
			valorTotal *= 0.5;
		}
		
		return valorTotal;
	}

}