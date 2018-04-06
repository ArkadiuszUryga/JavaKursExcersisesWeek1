package a_Zadania.a_Dzien_1.b_Metody;

public class Main9a {

	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));

	}
	static int factorial(int number)	{
		
		if (number<1) {
			return 0;
		}
		else if (number==1) {
			return 1;
		}
		else	{
			int factorial=1;
			for (int i=1;i<=number;i++) {
				factorial*=i;
			}
			return factorial;
		}
		
		
	}

}
