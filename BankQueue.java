//package ss;
import java.util.*;

// Diego Gonzalez
// Bank Queue
// 9.15.21


public class Bankq {
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int customernumber = sc.nextInt();
	int time = sc.nextInt();
	
	ArrayList<customer> linesort = new ArrayList<>();
	ArrayList<customer> linefinal = new ArrayList<>();
	
	for(int x = 0; x < customernumber; x++){
		linesort.add(new customer(sc.nextInt(),sc.nextInt()));
	}
	
	Collections.sort(linesort);
	
	
		
	
	
	
		
	
	
	int timenow = 0;
	int total = 0;
	for(int x = time-1; x >= 0; x--){
		customer best = maxCusto(linesort, x);
		
		if(best.timeu != (-900)){
			linesort.remove(best);
			total += best.cash;
			
		}
		
	}
	
	System.out.println(total);
	
	
	
	
	
	
	}
	
	static class customer implements Comparable<customer>{
		
		int cash;
		int timeu;
		
		public customer(int cash, int timeu) {
			
			this.cash = cash;
			this.timeu = timeu;
			
			
		}
		

		@Override
		public int compareTo(customer o) {
			// TODO Auto-generated method stub
			if (this.timeu > o.timeu) {
				return 1;
			}
			else if(o.timeu>this.timeu) {
				return -1;
			}
			
			else {
				if (this.cash > o.cash) {
					return -1;
				}
				else if(o.cash>this.cash) {
					return 1;
				}
				
				
			}
			
			return 0;
		}
	
	

	}
	
	public static customer maxCusto(ArrayList<customer> n, int timen){
		customer a = new customer(-900,-900);
		Collections.reverse(n);
		for(customer x: (n)){
			
			if (x.timeu >= timen && x.cash > a.cash){
				a = x;
			}
			
			
		}
		
		return a;
		
		
		
	}
}
