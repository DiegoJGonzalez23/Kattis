//package ss;

// Diego Gonzalez 
// Statistics Problem
// 9.13.21

import java.util.*;


public class Statistics {
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int pp = 1;
		while(sc.hasNextInt()){
			
			int number = sc.nextInt();
			int[] stats = new int[number];
			for(int x = 0; x<number;x++){
				
				stats[x] = sc.nextInt();
				
				
			}
			
			
			int max = getMax(stats);
			int min = getMin(stats);
			System.out.println("Case " + pp + ": " + min + " " + max + " " +  (max-min));
			
		
			pp++;
			
		}
		sc.close();
		
		
	}
	
	public static int getMax(int[] stat){
		int a = -99000000;
		for(int p: stat){
			if (p >= a){
				a = p;}
			
			
			
			
			
		}
		return a;
		
		
	}
	
	public static int getMin(int[] stat){
		int a = 99000000;
		for(int p: stat){
			if (p <= a){
				a = p;}
			
			
			
			
			
		}
		return a;
		
		
	}


}
