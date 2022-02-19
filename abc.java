import java.util.Arrays;
import java.util.Scanner;


public class ABCs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in); //tochararray returns an array of characters
        
        int order1 = scan.nextInt();
        int order2 = scan.nextInt();
        int order3 = scan.nextInt();
        
        String letters  = scan.nextLine();
        
        
        char[] characters = scan.next().toCharArray();
        int[] sortedarray = new int[3];
        
        sortedarray[0] = order1;
        sortedarray[1] = order2;
        sortedarray[2] = order3;
        
        Arrays.sort(sortedarray);
        
        
        for(int i=0;i<3;i++) {
            if(characters[i] =='C') {
                System.out.print(sortedarray[2] + " ");
            }
            
            if(characters[i] =='B') {
                System.out.print(sortedarray[1] + " ");
            }
            
            if(characters[i] =='A') {
                System.out.print(sortedarray[0] + " ");
            }
            
        }
        
        
    }

}
