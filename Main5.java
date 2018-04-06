package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {
        System.out.println(calculateNet(123, 0.23));

    }
    public static double calculateNet	(double gross, double vat)	{
    	double net=gross/(1+vat);
    	return net;
    }
}
