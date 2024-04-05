package interface1;

public class Gerente implements Funcionario {
    private String nome;
    private int id;
    private double salarioBase;

    // Construtor
    public Gerente(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 2.0; // Exemplo simples de cÃ¡lculo de salÃ¡rio para um gerente
    }

    @Override
    public String obterCargo() {
        return "Gerente";
    }
}