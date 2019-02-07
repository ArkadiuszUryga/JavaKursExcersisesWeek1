package t1_d1_zadania_domowe;
//W pliku `Main2.java` umieść metodę o sygnaturze `static boolean divisibleBy(int a, int b )`: 
//
//1. Uzupełnij ciało metody tak aby zwracała `true` bądź `false` w zależności czy zmienna `a` jest podzielna przez `b`.

public class Main2 {

	public static void main(String[] args) {
		System.out.println(divisibleBy(4, 2));
		System.out.println(divisibleBy(3, 2));

	}
	private static boolean divisibleBy(int a, int b )	{
		if (a%b==0) {
			return true;
		}
		
		return false;
	}

}
