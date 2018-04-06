package a_Zadania.a_Dzien_1.b_Metody;
//W pliku `Main6.java`
//Napisz metodę `checkMaturity`, która:
//
//* przyjmie parametr liczbowy `age`, który oznacza wiek użytkownika,
//* sprawdzi czy użytkownik jest pełnoletni,
//* jeśli jest &ndash; zwróci wartość `true`,
//* jeśli nie &ndash; zwróci wartość `false`.

public class Main6 {

    public static void main(String[] args) {
        System.out.println(checkMaturity(19));

    }
    public static boolean checkMaturity (int age)	{
    	boolean mature=false;
    	if (age>=18)	{
    		mature=true;
    	}
    	return mature;
    }
}
