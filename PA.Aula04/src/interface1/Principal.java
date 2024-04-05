package interface1;

public class Principal {
	
	public static void main(String[] args) {
	
		// Criando objetos de cada tipo de funcionario
	    Funcionario gerente = new Gerente("JoÃ£o", 1001, 5000);
	    Gerente gerente2 = new Gerente("Pedro", 1000, 5000);

	    Funcionario desenvolvedor = new Desenvolvedor("Maria", 2002, 4000);
	    Funcionario designer = new Designer("Carlos", 3003, 3500);
	    

	    // Chamando os mÃ©todos para calcular o salÃ¡rio e obter o cargo de cada funcionÃ¡rio
	    System.out.println("Salário do " + gerente.obterCargo() + " " + gerente.calcularSalario());
	    System.out.println("Salário do " + gerente2.obterCargo() + " " + gerente.calcularSalario());
	    System.out.println("Salário do " + desenvolvedor.obterCargo() + " " + desenvolvedor.calcularSalario());
	    System.out.println("Salário do " + designer.obterCargo() + " " + designer.calcularSalario());
	 }
}