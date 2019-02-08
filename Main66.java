package t1_d1_zadania_domowe;

import java.util.Arrays;

//W pliku `Main6.java` umieść metodę o sygnaturze `static int evenSum(int[][] arr)`.
//
//1. Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów z nieparzystych indeksów.
//2. Metoda ma zwrócić sumę.
//Przykład: dla tablicy int arr[][] = {{1,2,3},{4,5,6}}; int sum = 2 + 5;
public class Main66 {

	public static void main(String[] args) {
		System.out.println("Oto nasza tablica startowa:");
		//creating base array with random numbers
				int size=RandomNumber.raldomize(10);
				int[][] arr = new int[size][];
				for (int i=0;i<arr.length;i++) {
					int secondSize=RandomNumber.raldomize(10);
					arr[i]=new int[secondSize];
					for (int j=0;j<arr[i].length;j++) {
						arr[i][j]=RandomNumber.raldomize(50);
						System.out.print(arr[i][j]+", ");
					}
					System.out.println();
					
				}
				
		System.out.println("Suma wszystkich nieparzytych indeksów tabeli wynosi: "+evenSum(arr));		
				

	}
	
	private static int evenSum(int[][] arr)	{
		int result=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if (j%2!=0) {
					result+=arr[i][j];
				}
			}
		}
		return result;
		
	}

}
