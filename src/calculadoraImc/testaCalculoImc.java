package calculadoraImc;

import java.util.Scanner;

public class testaCalculoImc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		calculadoraImc Imc1 = new calculadoraImc();
		
		System.out.println("Digite seu peso e altura: ");
		Imc1.setCalculoImc(scan.nextDouble(), scan.nextDouble());
	
	    System.out.println("O seu IMC é: " + Imc1.getCalculoImc());
	}
}
