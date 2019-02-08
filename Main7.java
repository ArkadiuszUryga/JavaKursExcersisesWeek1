package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {
        System.out.println(checkEven(15));

    }
    public static String checkEven (int number)	{
    	int modulo=number%2;
    	String even;
    	if (modulo==0)	
    		even="Even";
    	
    	else 
    		even="Odd";
    	
    	return even;
    }
}
