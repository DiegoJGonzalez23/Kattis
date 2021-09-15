 package tutorialstart.Kattis;
import java.util.*;

public class BankQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int customers = sc.nextInt();
		long total = 0;
		int time = sc.nextInt();
		
		PriorityQueue<customer> prio = new PriorityQueue<customer>();
		
		for(int x = 0; x<customers;x++) {
			prio.add(new customer(sc.nextInt(),sc.nextInt()));
		}
		
		int p = 0;
		for(int y = 0; y < time; y++) {
			
			if(prio.size() > 0) {
				
				customer curr = prio.poll();
				
				while(curr.timeu < y) {
					if(prio.size() > 0) {
						curr = prio.poll();
					}
					else {
					p = 1;
					break;
					}
				}
				if(p == 0) {
					total += curr.cash;
				}
				
				
				
				
				
			}
			
			else {
				break;
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
