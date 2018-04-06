package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    public static void main(String[] args) {
       System.out.println(convertToUsd(20));
        		
    }
    public static double convertToUsd (double zlotys)	{
		double usd=zlotys*4.04;
		return usd;
	}
}
