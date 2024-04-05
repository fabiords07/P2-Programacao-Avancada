//package aula04Anot;
//
//public class anot {
//
//	interface Animal { 
//		void emitirSom(); }
//	
//	class Cachorro implements Animal { 
//		@Override 
//		public void emitirSom() {
//			System.out.println("latindo");
//		} 
//	}
//	
//	class Gato implements Animal { 
//		@Override 
//		public void emitirSom() {
//			System.out.println("miando");
//			} 
//	}
//	
//	public class Main { 
//		public static void main(String[] args) { 
//			Cachorro cachorro = new Cachorro(); 
//			Gato gato = new Gato(); 
//			
//			cachorro.emitirSom(); 
//			gato.emitirSom();
//			}
//		}
//	
//}



// herança
// Classe base (superclasse) 
//class Animal {
//	String nome;
//	public Animal(String nome) {
//		this.nome = nome;
//		}
//	public void emitirSom() {
//		System.out.println("O animal emite um som.");
//		}
//	}
////Classe derivada (subclasse) 
//class Cachorro extends Animal {
//	public Cachorro(String nome) {
//		// Chamando o construtor da superclasse para inicializar o nome
//		super(nome); }
//	// Sobrescrevendo o método emitirSom() da superclasse
//	@Override      
//	public void emitirSom() {
//		System.out.println(nome + " está latindo: Au Au!");
//		}
//	}
//
//public class Main {
//	public static void main(String[] args) {
//		Cachorro cachorro = new Cachorro("Bolinha");
//		cachorro.emitirSom();
//		}
//	}
package aula04Anot;

