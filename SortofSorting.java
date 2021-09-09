//package kattis;
import java.util.*;

/*
 Diego Gonzalez
 Done on 9-9-21
 
 */

public class SortofSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numbernames = sc.nextInt();
		
		while(numbernames != 0){
		if(numbernames != 0){
			sorty[] names = new sorty[numbernames];
			for(int x = 0; x < numbernames;x++){
				
				sorty j = new sorty(sc.next());
				names[x] = j;
				
				
				
				
				
			}
			Arrays.sort(names);
			
			for(sorty h: names){
				
				System.out.println(h.name);
			}
			
			
			
			
		}
		
		if(numbernames != 0){
		numbernames = sc.nextInt();
		}
		System.out.println();

	}
		
	}
	
	static class sorty implements Comparable<sorty>{
		String name;
		char x;
		char y;
		public sorty(String name){
			
			this.name = name;
			
			
		}
		
		public char[] convert(){
			return name.toCharArray();
		}
		
		
		@Override
		public int compareTo(sorty name1) {
			// TODO Auto-generated method stub
			if (this.name.charAt(0) > name1.name.charAt(0)){
				return 1;
			}
			else if (this.name.charAt(0) < name1.name.charAt(0)){
				return -1;
			}
			
			else{
				
				if (this.name.charAt(1) > name1.name.charAt(1)){
					return 1;
				}
				else if (this.name.charAt(1) < name1.name.charAt(1)){
					return -1;
				
				
				
			}
				
				return 0;
			
		}
		
		
		
	}

}
}
