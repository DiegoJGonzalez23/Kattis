package csa;
import java.util.*;
/*
 * Diego Gonzalez
 * Prof Crudele
 * 1-26-22
 */
public class echo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        for(int i = 1; i<number+1; i++) {
            
            String echo = sc.next();
            if(i% 2 == 1) {
                System.out.println(echo);
            }
            
            
        }
        

    }

}
