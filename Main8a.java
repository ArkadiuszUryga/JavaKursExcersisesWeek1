package a_Zadania.a_Dzien_1.b_Metody;

public class Main8a {
	public static void main(String[] args) {
	System.out.println(maxOfThree(10, 26, 2));
}
static int maxOfThree(int firstInt, int secondInt, int thirdInt)	{
	int[] integers = {firstInt, secondInt, thirdInt};
	int maxInt=0;
	for (int a=0; a<integers.length; a++) {
		if(integers[a]>maxInt) {
			maxInt=integers[a];
		}
	}
	
	return maxInt;
	
}
}
