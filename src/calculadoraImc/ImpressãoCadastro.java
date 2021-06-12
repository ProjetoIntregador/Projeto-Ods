package calculadoraImc;
import java.util.Scanner;

import calculadoraImc.calculadoraImc;
public class Impressï¿½oCadastro {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			ClasseCadastro cad1 = new ClasseCadastro();
			calculadoraImc Imc1 = new calculadoraImc();
			
			System.out.println("Digite o Nome: ");
			cad1.setNome(scan.nextLine());
			
			System.out.println("Digite o Gï¿½nero:");
			cad1.setGï¿½nero(scan.nextLine());
			
			System.out.println("Digite a Idade:");
			cad1.setIdade(scan.nextInt());
			
			cad1.Impressao();
            
			System.out.println();
			System.out.println("Insira seu peso em kg e a altura em metros para calcular seu IMC: ");
			Imc1.setCalculoImc(scan.nextDouble(), scan.nextDouble());
<<<<<<< HEAD
		    
		    System.out.println("O seu IMC é: " + Imc1.getCalculoImc());
		    System.out.println();
		    System.out.println("=======================================================================================");
		    System.out.println("LEIA À SEGUIR AS RECOMENDAÇÕES NUTRICIONAIS BASEADAS NO RESULTADO DO CÁLCULO DO SEU IMC");
		    System.out.println("=======================================================================================");
		    
		    if (Imc1.getCalculoImc() < 18.5) {
				System.out.println("Usuario está abaixo do peso ideal (IMC < 18.5)");
				System.out.println("Procurar ajuda nutricional para dar início a uma dieta rica em vitaminas, \nnutrientes e sais minerais.");
				
			}else if(Imc1.getCalculoImc() >= 18.5 && Imc1.getCalculoImc() <25 ) {
				System.out.println("Usuario está dentro do peso ideal (IMC >= 18.5 e < 25)");
				System.out.println("Para manter-se com o IMC saudável, é importante investir também em atividades físicas diárias e \nno consumo de todos os nutrientes necessários para o corpo manter-se em equilíbrio.");
	
				
			}else if(Imc1.getCalculoImc() >=25 && Imc1.getCalculoImc() <30 ) {
				System.out.println("Usuario está em sobrepeso (IMC >= 25 e <30)");
				System.out.println("Converse com uma nutricionista e adote uma prática de exercícios aeróbicos");
	
				
				
			}else if(Imc1.getCalculoImc() >=30 && Imc1.getCalculoImc() <35 ) {
				System.out.println("Usuario está com Obesidade Grau I (IMC >=30 e <35)");
				System.out.println("Isso se deve ao excesso de gordura que leva à falta de preparo físico \ne que acaba otimizando os fatores sedentários e aumentando a obesidade. \nÉ preciso procurar ajuda médica com urgência (Tratamentos de Obesidade) \npara que o quadro não se agrave.");
				
				
			}else if(Imc1.getCalculoImc() >=35 && Imc1.getCalculoImc() <40 ) {
				System.out.println("Usuario está com Obesidade Grau II (IMC >= 35 e <40)");
				System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenças, dentre elas a \ndiabetes, a hipertensão, ataques do coração, infarto, derrames cerebrais, \nartrite, má circulação e muitas outras.");
				
				
			}else if(Imc1.getCalculoImc() >=40 ) {
				System.out.println("Usuario está com Obesidade Grau III (IMC >= 40)");
				System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenças, dentre elas a \ndiabetes, a hipertensão, ataques do coração, infarto, derrames cerebrais, \nartrite, má circulação e muitas outras.");
	
			}
		    
=======
		
		    System.out.println("O seu IMC ï¿½: " + Imc1.getCalculoImc());
>>>>>>> 898563b5cb146d46bcb8e6a83264e993e032b0ab
		    
		    if (get.calculoImc < 18.5) {
				System.out.println("Usuario estÃ¡ abaixo do peso ideal.");
				System.out.println("Procurar ajuda nutricional para dar inÃ­cio a uma dieta rica em vitaminas, \nnutrientes e sais minerais.");
				
			}else if(get.calculoImc >=18.5 && get.calculoImc <25 ) {
				System.out.println("Usuario estÃ¡ dentro do peso ideal.");
				System.out.println("Para manter-se com o IMC saudÃ¡vel, Ã© importante investir tambÃ©m em atividades, fÃ­sicas diÃ¡rias e \nno consumo de todos os nutrientes necessÃ¡rios para o corpo manter-se em equilÃ­brio.");
	
				
			}else if(get.calculoImc >=25 && get.calculoImc <30 ) {
				System.out.println("Usuario estÃ¡ em sobrepeso.");
				System.out.println("Converse com uma nutricionista e adote uma prÃ¡tica de exercÃ­cios aerÃ³bicos");
	
				
				
			}else if(get.calculoImc >=30 && get.calculoImc <35 ) {
				System.out.println("Usuario estÃ¡ com Obesidade Grau I.");
				System.out.println("Isso se deve ao excesso de gordura que leva Ã  falta de preparo fÃ­sico \ne que acaba otimizando os fatores sedentÃ¡rios e aumentando a obesidade. \nÃ‰ preciso procurar ajuda mÃ©dica com urgÃªncia (Tratamentos de Obesidade) \npara que o quadro nÃ£o se agrave.");
				
				
			}else if(get.calculoImc >=35 && get.calculoImc <40 ) {
				System.out.println("Usuario estÃ¡ com Obesidade Grau II.");
				System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenÃ§as, dentre elas a \ndiabetes, a hipertensÃ£o, ataques do coraÃ§Ã£o, infarto, derrames cerebrais, \nartrite, mÃ¡ circulaÃ§Ã£o e muitas outras.");
				
				
			}else if(get.calculoImc >=40 ) {
				System.out.println("Usuario estÃ¡ com Obesidade Grau III.");
				System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenÃ§as, dentre elas a \ndiabetes, a hipertensÃ£o, ataques do coraÃ§Ã£o, infarto, derrames cerebrais, \nartrite, mÃ¡ circulaÃ§Ã£o e muitas outras.");
	
			}
			
			/*Metodo que contï¿½m a impressï¿½o dos dados aqui em baixo:
	-------------------------------------------------------------------------------
			Essa parte vai no cï¿½digo:
			 cad1.Impressao(); 
	----------------------------------------------------------------------------
			 Essa parte aqui vai na classe:
		 	public void Impressao() {
			System.out.println("\t=============IMC da Crianï¿½a============\n"
					+ "\n\tNome: " + nome + "\n\tIdade: " + idade
					+ "\n\tGï¿½nero: " + gï¿½nero + "\n\tPeso: " + peso
					+ "\n\tAltura: " + altura 
					+ "\n\t======================================="); 
					*/
			
		
	
	}

}
