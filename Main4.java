package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {
        System.out.println(createName("imie", "nazwisko", "pseudonim"));

    }
    public static String createName (String name, String surname, String nick)	{
    	String joined=name+" \""+nick+"\" "+surname;
    	return joined;
    }
}
