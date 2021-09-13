//package ss;

// Diego Gonzalez
// Problem Babelfish
// 9.13.21



import java.util.*;


public class Babelfish {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dict = new HashMap<>();
		
		int p = 1;
		while(sc.hasNext()){
			String t = sc.nextLine();
			
			
			
			if(p == 0){
				if(dict.containsKey(t)){
					
					System.out.println(dict.get(t));
				}
				
				else{
					System.out.println("eh");
				}
				
				
				
			}
			
			else{
			
			
			if (t.equals("")){
				
				p = 0;
				
				
			}
			
			else{
			String[]  dicky = t.split(" ");
			dict.put(dicky[1], dicky[0]);
			
			
			}
			}
			
		}

	}

}
