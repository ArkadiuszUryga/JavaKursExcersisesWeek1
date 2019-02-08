package t1_d1_zadania_domowe;

import java.util.Random;

public class RandomNumber {
	protected static int raldomize(int howMuch)	{
		int result;
		Random rand = new Random();
		result=rand.nextInt(howMuch)+1;
		return result;
	}
}
