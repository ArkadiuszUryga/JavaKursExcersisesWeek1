package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {

    public static void main(String[] args) {
        System.out.println(factorial(6));

    }
    private static int factorial (int n)	{
    	if (n==0)
    			return 1;
    	else
    		return factorial(n-1)*n;
    }
}
