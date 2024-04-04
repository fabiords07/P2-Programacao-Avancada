package aula00revisao;

public class questao14 {
	private String nomeDoAluno;
    private int numeroDeMatricula;
    private String dataDeNascimento;
    private boolean ehBolsista;
    private int anoDeMatricula;
    private int codigoDoCurso;
    
    public questao14(String nome, int matricula, String data, boolean bolsa, int ano, int codigoCurso) {
        this.nomeDoAluno = nome;
        this.numeroDeMatricula = matricula;
        this.dataDeNascimento = data;
        this.ehBolsista = bolsa;
        this.anoDeMatricula = ano;
        this.codigoDoCurso = codigoCurso;
    }
    
    public String getNomeDoAluno() {
        return nomeDoAluno;
    }
    
    public void setNomeDoAluno(String nome) {
        this.nomeDoAluno = nome;
    }
    
    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }
    
    public void setNumeroDeMatricula(int matricula) {
        this.numeroDeMatricula = matricula;
    }
    
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    
    public void setDataDeNascimento(String data) {
        this.dataDeNascimento = data;
    }
    
    public boolean isEhBolsista() {
        return ehBolsista;
    }
    
    public void setEhBolsista(boolean bolsa) {
        this.ehBolsista = bolsa;
    }
    
    public int getAnoDeMatricula() {
        return anoDeMatricula;
    }
    
    public void setAnoDeMatricula(int ano) {
        this.anoDeMatricula = ano;
    }
    
    // Getters e setters para o novo campo codigoDoCurso
    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }
    
    public void setCodigoDoCurso(int codigoCurso) {
        this.codigoDoCurso = codigoCurso;
    }
    
    // Método para obter o nome do curso a partir do código
    public String getNomeDoCurso() {
        String nomeCurso;
        switch (codigoDoCurso) {
            case 1:
                nomeCurso = "Engenharia Civil";
                break;
            case 2:
                nomeCurso = "Administração";
                break;
            case 3:
                nomeCurso = "Medicina";
                break;
            case 4:
                nomeCurso = "Ciência da Computação";
                break;
            // Adicione mais casos conforme necessário
            default:
                nomeCurso = "Curso não especificado";
        }
        return nomeCurso;
    }
    
    public void calculaMensalidade(double valorBase) {
        double mensalidade = valorBase;
        if (ehBolsista) {
            mensalidade *= 0.5; // Se o aluno for bolsista, paga apenas 50% da mensalidade
        }
        System.out.println("A mensalidade para o aluno " + nomeDoAluno + " é de R$" + mensalidade);
    }
    
    // Método modificado para imprimir o nome do curso em vez do código
    public void mostraRegistro() {
        System.out.println("Nome: " + nomeDoAluno);
        System.out.println("Número de Matrícula: " + numeroDeMatricula);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("É Bolsista: " + (ehBolsista ? "Sim" : "Não"));
        System.out.println("Ano de Matrícula: " + anoDeMatricula);
        System.out.println("Nome do Curso: " + getNomeDoCurso());
    }
}