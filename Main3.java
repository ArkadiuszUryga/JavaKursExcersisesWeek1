
package t1_d1_zadania_domowe;

import java.util.Arrays;
import java.util.Random;

//W pliku `Main3.java` umieść metodę o sygnaturze `static int[] minimum(int[][] arr)`.
//
//1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej dla każdego jej wiersza wyznaczyła minimalną wartość.
//2. Poszczególne minimalne wartości mają być umieszczone w tablicy, którą metoda zwraca.
public class Main3 {

	public static void main(String[] args) {
		int size=raldomize(10);
		System.out.println("Wielkość podstawowej tablicy wynosi: "+size);
		int[][] arr = new int[size][];
		System.out.println("Tablica wynikowa wygląda następująco: "+Arrays.toString(minimum(arr)));

	}
	private static int[] minimum(int[][] arr)	{
		
		int min=50;
		int[] result=new int[arr.length];
		Arrays.fill(result, min);
		int value;
		System.out.println("Tablice składowe:");
		for (int i=0;i<arr.length;i++)	{
			arr[i]=new int[raldomize(10)];
			for (int j=0;j<arr[i].length;j++) {
				value=raldomize(min);
				arr[i][j]=value;
				if (value<result[i]) {
					result[i]=value;
				}
				
				
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		return result;
		
		
		
	}
	//losuje rozmiar tablicy podstawowej i inne rzeczy
	private static int raldomize(int howMuch)	{
		int result;
		Random rand = new Random();
		result=rand.nextInt(howMuch)+1;
		return result;
	}
}