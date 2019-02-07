package t1_d1_zadania_domowe;
//W pliku `Main1.java` umieść metodę o sygnaturze `static double dogAge(double dogAge)` , która przeliczy wiek psa w psich latach. 
//
//* funkcja powinna przyjmować wiek psa jako parametr,
//* dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
//* powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//* funkcja powinna zwrócić wiek psa.
public class Main1 {

	public static void main(String[] args) {
		System.out.println(dogAge(1));
		System.out.println(dogAge(2));
		System.out.println(dogAge(3));
		System.out.println(dogAge(5));
		System.out.println(dogAge(10));
		System.out.println(dogAge(20));

	}
	private static double dogAge(double dogAge)	{
		double humanAge;
		if (dogAge>2.0) {
			dogAge-=2;
			humanAge=dogAge*4;
			humanAge+=21;
		}
		else	{
			humanAge=dogAge*10.5;
		}
			
		return humanAge;
		
	}

}
