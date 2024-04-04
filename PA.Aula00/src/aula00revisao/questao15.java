package aula00revisao;

public class questao15 {
	private String nomeDoAluno;
    private int numeroDeMatricula;
    private String dataDeNascimento;
    private int tipoBolsa; // 0: Sem bolsa, 1: 30% de desconto, 2: 70% de desconto, 3: Bolsa integral
    private int anoDeMatricula;
    private int codigoDoCurso;
    
    public questao15(String nome, int matricula, String data, int tipoBolsa, int ano, int codigoCurso) {
        this.nomeDoAluno = nome;
        this.numeroDeMatricula = matricula;
        this.dataDeNascimento = data;
        this.tipoBolsa = tipoBolsa;
        this.anoDeMatricula = ano;
        this.codigoDoCurso = codigoCurso;
    }
    
    // Getters e setters para o novo campo tipoBolsa
    public int getTipoBolsa() {
        return tipoBolsa;
    }
    
    public void setTipoBolsa(int tipoBolsa) {
        this.tipoBolsa = tipoBolsa;
    }
    
    // Método modificado para calcular a mensalidade com base no tipo de bolsa
    public void calculaMensalidade(double valorBase) {
        double mensalidade = valorBase;
        switch (tipoBolsa) {
            case 1:
                mensalidade *= 0.7; // 30% de desconto
                break;
            case 2:
                mensalidade *= 0.3; // 70% de desconto
                break;
            case 3:
                mensalidade = 0; // Bolsa integral
                break;
            default:
                // Sem bolsa, a mensalidade permanece inalterada
        }
        System.out.println("A mensalidade para o aluno " + nomeDoAluno + " é de R$" + mensalidade);
    }
    
    // Métodos restantes permanecem os mesmos
}
