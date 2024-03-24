package aula05questao10;

import java.util.Scanner;

public class questao10 {
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
  }
}