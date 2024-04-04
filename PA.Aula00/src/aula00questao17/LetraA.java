package aula00questao17;

import java.util.*;

public class LetraA {
	public static void main(String[] args) {
        Pedido pedido1 = new Pedido(0000, "João");
        Pedido pedido2 = new Pedido(0001, "Maria");
        
        if (pedido1.getCliente().getNome().equals(pedido2.getCliente().getNome())) {
            System.out.println("Os pedidos foram realizados para o mesmo cliente.");
        } else {
            System.out.println("Os pedidos não foram realizados para o mesmo cliente.");
        }
    }
}
