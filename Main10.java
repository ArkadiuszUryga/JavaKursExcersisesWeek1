package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    public static void main(String[] args) {
        System.out.println(fotballWin(0, 0, 0, 0));

    }
    private static char fotballWin(int goalsA_FieldA, int goalsA_FieldB, int goalsB_FieldA, int goalsB_FieldB)	{
    	char result;
    	int goalsA=goalsA_FieldA+goalsA_FieldB;
    	int goalsB=goalsB_FieldA+goalsB_FieldB;
    	if (goalsA>goalsB)	{
    		result='1';
    	}
    	else if (goalsA<goalsB) {
    		result='2';
    	}
    	else	{	//remis w dwumeczu
    		if (goalsA_FieldB>goalsB_FieldA)	{
    			result='1';
    		}
    		else if (goalsA_FieldB<goalsB_FieldA)	{
    			result='2';
    		}
    		else	{
    			result='x';
    		}
    	}
    	return result;
    }
}
