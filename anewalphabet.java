//package kattis;
import java.util.*;


public class anewalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> dict = new HashMap<>();
		String[] alph = {"a","b","c","d","e","f","g","h","i","j","k","l",
				"m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		String[] newalph = {"@","8","(" , "|)" ,"3","#","6","[-]","|","_|","|<", "1", "[]\\/[]",  
				"[]\\[]","0", "|D", "(,)","|Z","$", "']['",  "|_|","\\/","\\/\\/","}{","`/","2"};
		
		int x = 0;
		for(String a: alph){
			
			
			dict.put(a,newalph[x]);
			x++;
			
			
		}
		
		String[] inp = sc.nextLine().split("");
		for(String p: inp){
			if(dict.containsKey(p.toLowerCase())){
				
				System.out.print(dict.get(p.toLowerCase()));
				
			}
			
			else{
				System.out.print(p);
			}
		}
		
		
		
		
		
		
		

	}

}
