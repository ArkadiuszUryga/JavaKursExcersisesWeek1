package a_Zadania.a_Dzien_1.b_Metody;

public class Main6a {

	public static void main(String[] args) {
		System.out.println(checkMaturity(17));
		System.out.println(checkMaturity(18));

	}
	static boolean checkMaturity(int age)	{
		
		if (age>=18) {
			return true;
		}
		return false;
	}

}
