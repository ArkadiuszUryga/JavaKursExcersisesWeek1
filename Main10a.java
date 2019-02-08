package a_Zadania.a_Dzien_1.b_Metody;

import java.util.Random;

public class Main10a {

	public static void main(String[] args) {
		String teamA = "Grom";
		String teamB = "Błyskawica";
		Random rand = new Random();
		int teamAFieldA = rand.nextInt(5);
		int teamAFieldB = rand.nextInt(5);
		int teamBFieldA = rand.nextInt(5);
		int teamBFieldB = rand.nextInt(5);
		System.out.println("Wyniki meczów: ");
		System.out.println(teamA+"-"+teamB+": "+teamAFieldA+":"+teamBFieldA);
		System.out.println(teamB+"-"+teamA+": "+teamBFieldB+":"+teamAFieldB);
		System.out.println("Dwumecz: ");
		int teamAsum=teamAFieldA+teamAFieldB;
		int teamBsum=teamBFieldA+teamBFieldB;

		String winner;
		String a="";
		String b="";
		if ((teamAsum)>(teamBsum)) {
			winner=teamA;
		}
		else if((teamAsum)<(teamBsum))	{
			winner=teamB;
		}
		else	{
			if (teamAFieldB<teamBFieldA) {
				winner=teamB;
				b="+bonus";
			}
			else if (teamAFieldB>teamBFieldA) {
				winner=teamA;
				a="+bonus";
			}
			else {
				winner="nie rozstrzygnmięty";
			}
		}
		System.out.println(teamA+": "+teamAsum+" "+a+" "+teamB+": "+teamBsum+" "+b);
		System.out.println("Zwycięzca dwumeczu: "+winner);

	}

}
