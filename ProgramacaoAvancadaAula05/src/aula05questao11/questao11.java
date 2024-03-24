package aula05questao11;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Insira 10 números:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 40) {
                count++;
            }
        }

        System.out.println("Quantidade de números no intervalo entre 10 e 40: " + count);

        scanner.close();
    }
}