package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    public static void main(String[] args) {
      System.out.println(maxOfThree(30, 54, 51));  

    }
    private static int maxOfThree (int firstInt, int secInt, int thirdInt)	{
    	int arrayOfInt[] = new int[] {firstInt, secInt, thirdInt};
    	int maxInt=0;
    	for	(int i=0; i<3; i++)	{
    		if (arrayOfInt[i]>maxInt)	{
    			maxInt=arrayOfInt[i];
    		}
    	}
    	return maxInt;
    }
}
