package ss;
import java.util.*;




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
	for(customer boy: linesort){
		if(boy.timeu>= timenow && timenow < time){
			total += boy.cash;
			timenow++;
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
}
