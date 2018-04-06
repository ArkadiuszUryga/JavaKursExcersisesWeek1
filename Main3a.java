package a_Zadania.a_Dzien_1.b_Metody;

public class Main3a {

	public static void main(String[] args) {
		double zlotys = 40;
		System.out.println(zlotys+" złotych to "+convertToUsd(zlotys)+" USD");

	}
	static double convertToUsd(double zlotys) {
		return zlotys*4.04;
	}

}
