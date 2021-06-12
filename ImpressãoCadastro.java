package br.com.generation.cadastro;
import br.com.generation.cadastro.ClasseCadastro;
import java.util.Scanner;

public class ImpressãoCadastro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClasseCadastro cad1 = new ClasseCadastro();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[3];
	
		System.out.println("Digite a data (Insira apenas números):");
		for (int i = 0; i<3; i++) {
		vetor[i] = ler.nextInt();
		}
		System.out.println("Digite o Nome: ");
		cad1.setNome(scan.nextLine());
		
		System.out.println("Digite o Gênero:");
		cad1.setGênero(scan.next());
	
		System.out.println("Digite a Idade:");
		cad1.setIdade(scan.nextInt());

		System.out.println("Digite a Peso:");
		cad1.setPeso(scan.nextDouble());

		System.out.println("Digite a Altura:");
		cad1.setAltura(scan.nextDouble());
		
		System.out.println("Digite a zona de São Paulo: ");
		cad1.setZona(scan.next());
		
		System.out.println("\t\t\t" + vetor[0] + " / " + vetor[1] + " / " + vetor[2]);
		
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
