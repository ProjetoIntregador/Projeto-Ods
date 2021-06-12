package ProgramaCalculadoraIMC;

import java.util.Scanner;

public class ImpressaoImc {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		ClasseCadastro cad1 = new ClasseCadastro();
		calculadoraImc Imc = new calculadoraImc();
		
		
		System.out.println("Digite o Nome: ");
		cad1.setNome(scan.nextLine());
		
		System.out.println("Digite o Gênero:");
		cad1.setGênero(scan.nextLine());
		
		System.out.println("Digite a Idade:");
		cad1.setIdade(scan.nextInt());
		
		cad1.Impressao();
        
		System.out.println("Digite o peso em kg e a altura em metros: ");
		Imc.setCalculoImc(scan.nextDouble(),scan.nextDouble());
		
		
		Thread.sleep(1000);
		System.out.println("aguarde enquanto fazemos o cálculo do IMC...........");
		Thread.sleep(3000);
		
		System.out.println("\nO seu IMC é: " + Imc.getCalculoImc());
	    System.out.println();
	    System.out.println("=======================================================================================");
	    System.out.println("LEIA À SEGUIR AS RECOMENDAÇÕES NUTRICIONAIS BASEADAS NO RESULTADO DO CÁLCULO DO SEU IMC");
	    System.out.println("=======================================================================================");

	    if (Imc.getCalculoImc() < 18.5) {
			System.out.println("Usuario está abaixo do peso ideal (IMC < 18.5)");
			System.out.println("Procurar ajuda nutricional para dar início a uma dieta rica em vitaminas, \nnutrientes e sais minerais.");
			
		}else if(Imc.getCalculoImc() >= 18.5 && Imc.getCalculoImc() <25 ) {
			System.out.println("Usuario está dentro do peso ideal (IMC >= 18.5 e < 25)");
			System.out.println("Para manter-se com o IMC saudável, é importante investir também em atividades físicas diárias e \nno consumo de todos os nutrientes necessários para o corpo manter-se em equilíbrio.");

			
		}else if(Imc.getCalculoImc() >=25 && Imc.getCalculoImc() <30 ) {
			System.out.println("Usuario está em sobrepeso (IMC >= 25 e <30)");
			System.out.println("Converse com uma nutricionista e adote uma prática de exercícios aeróbicos");

			
			
		}else if(Imc.getCalculoImc() >=30 && Imc.getCalculoImc() <35 ) {
			System.out.println("Usuario está com Obesidade Grau I (IMC >=30 e <35)");
			System.out.println("Isso se deve ao excesso de gordura que leva à falta de preparo físico \ne que acaba otimizando os fatores sedentários e aumentando a obesidade. \nÉ preciso procurar ajuda médica com urgência (Tratamentos de Obesidade) \npara que o quadro não se agrave.");
			
			
		}else if(Imc.getCalculoImc() >=35 && Imc.getCalculoImc() <40 ) {
			System.out.println("Usuario está com Obesidade Grau II (IMC >= 35 e <40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenças, dentre elas a \ndiabetes, a hipertensão, ataques do coração, infarto, derrames cerebrais, \nartrite, má circulação e muitas outras.");
			
			
		}else if(Imc.getCalculoImc() >=40 ) {
			System.out.println("Usuario está com Obesidade Grau III (IMC >= 40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenças, dentre elas a \ndiabetes, a hipertensão, ataques do coração, infarto, derrames cerebrais, \nartrite, má circulação e muitas outras.");
		}
	    scan.close();
	    }
	}

