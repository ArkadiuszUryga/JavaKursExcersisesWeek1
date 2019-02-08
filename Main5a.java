package a_Zadania.a_Dzien_1.b_Metody;

public class Main5a {

	public static void main(String[] args) {
		System.out.println(calculateNet(123, 0.23));

	}
	static double calculateNet(double gross, double vat) {
		
		double netto = gross/(1+vat);
		return netto;
	}

}
