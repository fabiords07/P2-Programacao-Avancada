package aula00revisao;

public class questao12 {
	public class RegistroAcademico {
	    private String nomeDoAluno;
	    private int numeroDeMatricula;
	    private String dataDeNascimento;
	    private boolean ehBolsista;
	    private int anoDeMatricula;
	    
	    public RegistroAcademico(String nome, int matricula, String data, boolean bolsa, int ano) {
	        this.nomeDoAluno = nome;
	        this.numeroDeMatricula = matricula;
	        this.dataDeNascimento = data;
	        this.ehBolsista = bolsa;
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
}
