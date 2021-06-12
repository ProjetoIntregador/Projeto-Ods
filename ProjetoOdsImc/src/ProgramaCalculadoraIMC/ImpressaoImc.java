package ProgramaCalculadoraIMC;

import java.util.Scanner;

public class ImpressaoImc {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		ClasseCadastro cad1 = new ClasseCadastro();
		calculadoraImc Imc = new calculadoraImc();
		
		
		System.out.println("Digite o Nome: ");
		cad1.setNome(scan.nextLine());
		
		System.out.println("Digite o G�nero:");
		cad1.setG�nero(scan.nextLine());
		
		System.out.println("Digite a Idade:");
		cad1.setIdade(scan.nextInt());
		
		cad1.Impressao();
        
		System.out.println("Digite o peso em kg e a altura em metros: ");
		Imc.setCalculoImc(scan.nextDouble(),scan.nextDouble());
		
		
		Thread.sleep(1000);
		System.out.println("aguarde enquanto fazemos o c�lculo do IMC...........");
		Thread.sleep(3000);
		
		System.out.println("\nO seu IMC �: " + Imc.getCalculoImc());
	    System.out.println();
	    System.out.println("=======================================================================================");
	    System.out.println("LEIA � SEGUIR AS RECOMENDA��ES NUTRICIONAIS BASEADAS NO RESULTADO DO C�LCULO DO SEU IMC");
	    System.out.println("=======================================================================================");

	    if (Imc.getCalculoImc() < 18.5) {
			System.out.println("Usuario est� abaixo do peso ideal (IMC < 18.5)");
			System.out.println("Procurar ajuda nutricional para dar in�cio a uma dieta rica em vitaminas, \nnutrientes e sais minerais.");
			
		}else if(Imc.getCalculoImc() >= 18.5 && Imc.getCalculoImc() <25 ) {
			System.out.println("Usuario est� dentro do peso ideal (IMC >= 18.5 e < 25)");
			System.out.println("Para manter-se com o IMC saud�vel, � importante investir tamb�m em atividades f�sicas di�rias e \nno consumo de todos os nutrientes necess�rios para o corpo manter-se em equil�brio.");

			
		}else if(Imc.getCalculoImc() >=25 && Imc.getCalculoImc() <30 ) {
			System.out.println("Usuario est� em sobrepeso (IMC >= 25 e <30)");
			System.out.println("Converse com uma nutricionista e adote uma pr�tica de exerc�cios aer�bicos");

			
			
		}else if(Imc.getCalculoImc() >=30 && Imc.getCalculoImc() <35 ) {
			System.out.println("Usuario est� com Obesidade Grau I (IMC >=30 e <35)");
			System.out.println("Isso se deve ao excesso de gordura que leva � falta de preparo f�sico \ne que acaba otimizando os fatores sedent�rios e aumentando a obesidade. \n� preciso procurar ajuda m�dica com urg�ncia (Tratamentos de Obesidade) \npara que o quadro n�o se agrave.");
			
			
		}else if(Imc.getCalculoImc() >=35 && Imc.getCalculoImc() <40 ) {
			System.out.println("Usuario est� com Obesidade Grau II (IMC >= 35 e <40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doen�as, dentre elas a \ndiabetes, a hipertens�o, ataques do cora��o, infarto, derrames cerebrais, \nartrite, m� circula��o e muitas outras.");
			
			
		}else if(Imc.getCalculoImc() >=40 ) {
			System.out.println("Usuario est� com Obesidade Grau III (IMC >= 40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doen�as, dentre elas a \ndiabetes, a hipertens�o, ataques do cora��o, infarto, derrames cerebrais, \nartrite, m� circula��o e muitas outras.");
		}
	    scan.close();
	    }
	}

