package aula05questao01parte02;

import java.util.ArrayList;
import java.util.List;
import aula05questao01parte01.Livro;

public class Pessoa {
	
	private String nome;
	private List<Livro> livrosEmprestados;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.livrosEmprestados = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void emprestarLivro (Livro livro) {
		if (!livro.isEmprestado()) {
			livrosEmprestados.add(livro);
			livro.emprestar();
			System.out.println("Livro emprestado para "+ nome + ": " + livro.getTitulo());	
		} else {
			System.out.println("O livro " + livro.getTitulo() + " já está emprestado.");
		}
	}
	
	public void devolverLivro (Livro livro) {
		if (livrosEmprestados.remove(livro)) {
			livro.devolver();
			System.out.println("Livro devolvido por " + nome + ": " + livro.getTitulo());
		} else {
			System.out.println("O livro '" + livro.getTitulo() + "' não está emprestado para " + nome + ".");
		}
	}
}