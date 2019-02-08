package t1_d1_zadania_domowe;

import java.util.Arrays;

//W pliku `Main5.java` umieść metodę o sygnaturze `static int[] append(int[] arr)`. 
//
//1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy,
// której rozmiar ma być 2-krotnie większy od tablicy podanej.
//2. Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
//3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
//Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};
public class Main5 {

	public static void main(String[] args) {
		//rozmiar tablicy
		int size=RandomNumber.raldomize(10);
		int[] arr = new int[size];
		//wypełnienie tablicy losowymi liczbami
		for (int i=0;i<arr.length;i++) {
			arr[i]=RandomNumber.raldomize(50);
		}
		System.out.println("Oto nasza tablica startowa:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Oto nasza tablica wynikowa:");
		System.out.println(Arrays.toString(append(arr)));

	}
	
	private static int[] append(int[] arr)	{
		
		int[] copiedArray=Arrays.copyOf(arr, arr.length*2);
		//Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności
		int counter=1;
		int arraySize=copiedArray.length;
		for (int i=0;i<arr.length;i++)	{
			copiedArray[arraySize-counter]=arr[i];
			counter++;
		}
		return copiedArray;
		
	}


}
