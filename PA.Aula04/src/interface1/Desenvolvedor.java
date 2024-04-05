package interface1;

public class Desenvolvedor implements Funcionario {
    private String nome;
    private int id;
    private double salarioBase;

    // Construtor
    public Desenvolvedor(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.5; // Exemplo simples de cÃ¡lculo de salÃ¡rio para um desenvolvedor
    }

    @Override
    public String obterCargo() {
        return "Desenvolvedor";
    }
}