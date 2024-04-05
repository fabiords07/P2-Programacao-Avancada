package questao05;

import java.util.Scanner;

public class questao05 {

//	5. Jogo do “Menor Maior”. O jogo consiste em obter, do usuário, 
//	vários pares de números (dois números), para cada par de número 
//	informado no qual o primeiro valor é inferior ao segundo contabiliza 
//	1 ponto. 
//	O jogo encerra quando é informado um par de números no qual o primeiro
//	valor é um número positivo e o segundo é um número negativo. 
//	Escreva um algoritmo para implementar esse jogo, calcule e exiba: 
//		• Total de pontos do jogador; 
//		• Para cada 10 pontos o usuário recebe R$ 1,00, exiba o valor do prêmio. 
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        double premio = 0;

        while (true) {
            System.out.print("Digite dois números (positivo e negativo para sair): ");
            int primeiroNumero = scanner.nextInt();
            int segundoNumero = scanner.nextInt();

            if (primeiroNumero > 0 && segundoNumero < 0) {
                break;
            }

            if (primeiroNumero < segundoNumero) {
                pontos++;
            }
        }

        if (pontos > 0) {
            premio = pontos / 10.0;
        }

        System.out.println("Total de pontos do jogador: " + pontos);
        System.out.println("Valor do prêmio: R$" + premio);
    }
}
