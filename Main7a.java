package a_Zadania.a_Dzien_1.b_Metody;

public class Main7a {

	public static void main(String[] args) {
		System.out.println(checkEven(1));
		System.out.println(checkEven(2));

	}
	private static String checkEven(int number) {
		if (number%2==0) {
			return "even";
		}
		return "odd";
	}

}
