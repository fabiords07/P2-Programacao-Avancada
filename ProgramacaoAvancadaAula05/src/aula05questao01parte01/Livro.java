package aula05questao01parte01;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private boolean emprestado;

	public Livro (String titulo, String autor, int anoPublicacao, boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.emprestado = emprestado;
	}
	
	public void emprestar() {
		emprestado = true;
		System.out.println("O livro foi emprestado. Cuide dele.");
	}
	
	public boolean isEmprestado() {
	    return emprestado;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void devolver() {
		emprestado = false;
		System.out.println("O livro foi devolvido. Espero que esteja em bom estado");
	}

}
