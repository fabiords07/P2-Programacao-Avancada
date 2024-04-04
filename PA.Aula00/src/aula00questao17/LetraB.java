package aula00questao17;

import java.util.*;

public class LetraB {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        while (true) {
            System.out.println("Digite o código do produto (ou 0 para sair):");
            String codigo = scanner.nextLine();
            if (codigo.equals("0")) {
                break;
            }
            
            System.out.println("Digite a quantidade:");
            int quantidade = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Digite o valor unitário:");
            double valorUnitario = Double.parseDouble(scanner.nextLine());
            
            total += quantidade * valorUnitario;
        }
        
        System.out.println("Valor total: R$ " + total);
    }
}
