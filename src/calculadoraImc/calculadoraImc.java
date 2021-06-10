package calculadoraImc;

public class calculadoraImc {

	private double calculoImc;
	
	public double getCalculoImc() {
		return calculoImc;
	}


	public double setCalculoImc(double peso, double altura) {
		calculoImc = calculoImc + peso / (altura * altura);
		return calculoImc;
	}
}
