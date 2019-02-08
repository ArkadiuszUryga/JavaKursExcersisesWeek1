
package t1_d1_zadania_domowe;

import java.util.Arrays;
import java.util.Random;

//W pliku `Main4.java` umieść metodę o sygnaturze `static int[] lessMore(int[][] arr)`.
//
//1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej obliczyć średnią arytmetyczną.
//2. Oblicz ile elementów jest mniejszych a ile większych od średniej.
//3. Metoda ma zwrócić tablicę składającą się z 2 elementów 1 - ilość elementów mniejszych od średniej, 2- ilość elementów większych.
public class Main4 {

	public static void main(String[] args) {
		int size=raldomize(10);
		System.out.println("Wielkość podstawowej tablicy wynosi: "+size);
		int[][] arr = new int[size][];
		System.out.println("Tablica wynikowa wygląda następująco: "+Arrays.toString(lessMore(arr)));

	}
	
	private static int[] lessMore(int[][] arr)	{
		int[] result=new int[2];
		int value;
		int sum=0;
		int count=0;
		System.out.println("Tablice składowe:");
		for (int i=0;i<arr.length;i++)	{
			arr[i]=new int[raldomize(10)];
			for (int j=0;j<arr[i].length;j++) {
				value=raldomize(50);
				arr[i][j]=value;
				sum+=value;
				count++;
				
				
				
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		double average=sum/count;
		int less=0;
		int more=0;
		
		System.out.println("Średnia "+average);
		for (int i=0;i<arr.length;i++)	{
			
			for (int j=0;j<arr[i].length;j++) {
				if (arr[i][j]<=average) {
					less++;
				}
				else	{
					more++;
				}
				
				result[0]=less;
				result[1]=more;
				
			}
			
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
