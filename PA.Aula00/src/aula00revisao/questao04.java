package aula00revisao;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		double salarioBruto = scanner.nextDouble();
		
		double ir = salarioBruto * 0.1;
		double inss = salarioBruto * 0.15 - ir;
		double salarioFinal = salarioBruto - inss - ir;
		
		System.out.println("Você receberá R$" + salarioFinal + " de salário.");

	}

}