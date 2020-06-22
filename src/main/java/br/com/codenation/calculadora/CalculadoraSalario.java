package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double baseSalary) {
		return baseSalary > 1039.00 ? Math.round(calcInss(baseSalary)) : 0;
	}

	private double calcInss(double baseSalary) {
		return calcIrrf(baseSalary - ((baseSalary / 100) * getInssPercentage(baseSalary)));
	}

	private int getInssPercentage(double baseSalary) {
		if (baseSalary <= 1500.00)
			return 8;
		if (baseSalary > 1500.00 && baseSalary <= 4000.00)
			return 9;
		return 11;
	}

	private double calcIrrf(double grossInssSalary) {
		return grossInssSalary - ((grossInssSalary / 100) * getIrrfPercentage(grossInssSalary));
	}

	private double getIrrfPercentage(double grossInssSalary) {
		if (grossInssSalary <= 3000.00)
			return 0.0;
		if (grossInssSalary > 3000.00 && grossInssSalary <= 6000.00)
			return 7.5;
		return 15.0;
	}
}