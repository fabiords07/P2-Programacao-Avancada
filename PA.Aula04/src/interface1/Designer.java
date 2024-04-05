package interface1;

public class Designer implements Funcionario {
    private String nome;
    private int id;
    private double salarioBase;

    // Construtor
    public Designer(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.3; // Exemplo simples de cÃ¡lculo de salÃ¡rio para um designer
    }

    @Override
    public String obterCargo() {
        return "Designer";
    }
}