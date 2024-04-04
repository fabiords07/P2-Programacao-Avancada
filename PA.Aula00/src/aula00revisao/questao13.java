package aula00revisao;

public class questao13 {
	    private String nomeDoAluno;
	    private int numeroDeMatricula;
	    private String dataDeNascimento;
	    private boolean ehBolsista;
	    private int anoDeMatricula;
	    
	    public questao13(String nome, int matricula, String data, boolean bolsa, int ano) {
	        this.nomeDoAluno = nome;
	        this.numeroDeMatricula = matricula;
	        this.dataDeNascimento = data;
	        this.ehBolsista = bolsa;
	        this.anoDeMatricula = ano;
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
	    
	    public void calculaMensalidade(double valorBase) {
	        double mensalidade = valorBase;
	        if (ehBolsista) {
	            mensalidade *= 0.5; // Se o aluno for bolsista, paga apenas 50% da mensalidade
	        }
	        System.out.println("A mensalidade para o aluno " + nomeDoAluno + " é de R$" + mensalidade);
	    }
	    
	    public void mostraRegistro() {
	        System.out.println("Nome: " + nomeDoAluno);
	        System.out.println("Número de Matrícula: " + numeroDeMatricula);
	        System.out.println("Data de Nascimento: " + dataDeNascimento);
	        System.out.println("É Bolsista: " + (ehBolsista ? "Sim" : "Não"));
	        System.out.println("Ano de Matrícula: " + anoDeMatricula);
	    }
}
