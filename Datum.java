//package ss;
import java.util.*;


// Diego Gonzalez;
// Datum 2009 kattis problem;
// 9.13.21



public class Datum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int day = sc.nextInt();
		int month = sc.nextInt();
		
		String[] daystr = {"Wednesday", "Thursday", "Friday","Saturday","Sunday","Monday","Tuesday"};
		int[] monthdays = {31,59,90,120,151,181,212,243,273,304,334,365};
		
		int numba = -9;
		
		if(month == 1){
			 numba  = day;
		}
		
		else{
			 numba = day + monthdays[month-2];
		}
		
		int finalnumba = numba % 7 ;
		
		System.out.println(daystr[finalnumba]);
		
		
		
		

	}

}
