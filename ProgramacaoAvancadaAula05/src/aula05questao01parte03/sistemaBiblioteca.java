package aula05questao01parte03;

import aula05questao01parte01.Livro;
import aula05questao01parte02.Pessoa;

public class sistemaBiblioteca {	        
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, false);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, false);

        Pessoa pessoa1 = new Pessoa("Joao");

        pessoa1.emprestarLivro(livro1);
        pessoa1.emprestarLivro(livro2);
        pessoa1.devolverLivro(livro1);

        // Testando a devolução de um livro que não foi emprestado
        pessoa1.devolverLivro(livro1);

        // Testando empréstimo de um livro já emprestado
        pessoa1.emprestarLivro(livro2); 
        
        System.out.println("Livros emprestados por " + pessoa1.getNome() + ":");
        for (Livro livro : pessoa1.getLivrosEmprestados()) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}