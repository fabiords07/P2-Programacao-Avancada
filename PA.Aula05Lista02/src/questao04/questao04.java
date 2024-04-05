package questao04;

import java.util.Scanner;

public class questao04 {
//	4. Um mercadinho está precisando de um software para calcular o valor 
//	da compra realizada por um determinado cliente. A venda é composta por 
//	diversos produtos (vários!), para cada produto é informada a quantidade 
//	e o valor unitário. Escreva um algoritmo para calcular e exibir o valor 
//	de uma venda. O algoritmo deverá encerrar quando for informado um valor 
//	inválido para a quantidade de produtos, ou seja, um valor inferior ou igual a zero. 
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;

        while (true) {
            System.out.println("Informe a quantidade do produto (digite 0 para encerrar):");
            int quantidade = scanner.nextInt();

            // Verifica se a quantidade é válida
            if (quantidade <= 0) {
                break; // Encerra o loop
            }

            System.out.println("Informe o valor unitário do produto:");
            double valorUnitario = scanner.nextDouble();

            // Calcula o valor total do produto
            double totalProduto = quantidade * valorUnitario;

            // Adiciona o valor total do produto ao total da compra
            totalCompra += totalProduto;
        }

        // Exibe o total da compra
        System.out.println("O valor total da compra é: R$" + totalCompra);

        scanner.close();
    }
}
