package br.com.generation.cadastro;
import br.com.generation.cadastro.ClasseCadastro;
import java.util.Scanner;

public class ImpressãoCadastro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClasseCadastro cad1 = new ClasseCadastro();

		System.out.println("Digite o Nome: ");
		cad1.setNome(scan.nextLine());
		
		System.out.println("Digite o Gênero:");
		cad1.setGênero(scan.nextLine());
		
		System.out.println("Digite a Idade:");
		cad1.setIdade(scan.nextInt());

		System.out.println("Digite a Peso:");
		cad1.setPeso(scan.nextDouble());

		System.out.println("Digite a Altura:");
		cad1.setAltura(scan.nextDouble());
		
		cad1.Impressao(); 
		/*Metodo que contém a impressão dos dados aqui em baixo:
-------------------------------------------------------------------------------
		Essa parte vai no código:
		 cad1.Impressao(); 
----------------------------------------------------------------------------
		 Essa parte aqui vai na classe:
	 	public void Impressao() {
		System.out.println("\t=============IMC da Criança============\n"
				+ "\n\tNome: " + nome + "\n\tIdade: " + idade
				+ "\n\tGênero: " + gênero + "\n\tPeso: " + peso
				+ "\n\tAltura: " + altura 
				+ "\n\t======================================="); 
				*/
		
	}
}
