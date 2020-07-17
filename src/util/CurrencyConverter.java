package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double converteDolar(double reais, double dolar) {
		return (reais * dolar) * (1.00 + IOF);
	}

}
