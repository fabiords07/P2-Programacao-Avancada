package questao02;

import java.util.Scanner;

public class questao02 {
//	Uma empresa está concedendo crédito extra para os seus clientes especiais, 
//	sabendo que 1.000 clientes fazem parte deste seleto grupo, escreva um algoritmo 
//	para ler o salário desses clientes e, de acordo com a tabela (a seguir), 
//	calcular e exibir o valor do crédito de cada cliente.
//	Faixa salarial 						Crédito
//	Até R$ 800,00  						5% do salário
//	Entre R$ 800,01 e R$ 2.000,00  		10% do salário 
//	Acima de R$ 2.000,00 				15% do salário 
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeClientes = 1000;

        for (int i = 1; i <= quantidadeClientes; i++) {
            System.out.println("Informe o salário do cliente " + i + ":");
            double salario = scanner.nextDouble();

            double credito;

            if (salario <= 800.00) {
                credito = salario * 0.05;
            } else if (salario <= 2000.00) {
                credito = salario * 0.10;
            } else {
                credito = salario * 0.15;
            }

            System.out.println("O crédito do cliente " + i + " é de: R$" + credito);
        }

        scanner.close();
    }
}
