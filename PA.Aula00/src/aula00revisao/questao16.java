package aula00revisao;

public class questao16 {
	private String nomeDoAluno;
    private int numeroDeMatricula;
    private String dataDeNascimento;
    private int tipoBolsa; // 0: Sem bolsa, 1: 30% de desconto, 2: 70% de desconto, 3: Bolsa integral
    private int anoDeMatricula;
    private int codigoDoCurso;
    private String turnoDeEstudos; // "Diurno" ou "Noturno"
    
    public questao16(String nome, int matricula, String data, int tipoBolsa, int ano, int codigoCurso, String turno) {
        this.nomeDoAluno = nome;
        this.numeroDeMatricula = matricula;
        this.dataDeNascimento = data;
        this.tipoBolsa = tipoBolsa;
        this.anoDeMatricula = ano;
        this.codigoDoCurso = codigoCurso;
        this.turnoDeEstudos = turno;
    }
    
    // Getters e setters para o novo campo turnoDeEstudos
    public String getTurnoDeEstudos() {
        return turnoDeEstudos;
    }
    
    public void setTurnoDeEstudos(String turno) {
        this.turnoDeEstudos = turno;
    }
    
    // Método modificado para aplicar o desconto de 20% no turno da manhã
    public void calculaMensalidade(double valorBase) {
        double mensalidade = valorBase;
        if (turnoDeEstudos.equalsIgnoreCase("Diurno")) {
            mensalidade *= 0.8; // 20% de desconto no turno da manhã
        }
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
