import java.util.*;
import java.io.*;

// Diego Gonzalez, uses a binary search for integers


public class CD {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        int x = (Integer.parseInt(st.nextToken())); //int();
        int y = (Integer.parseInt(st.nextToken()));
        
        
        while(x != 0 && y != 0) {
            
            int[] jacks = new int[x];
            
            for(int i = 0 ; i < x; i++) {
                st = new StringTokenizer(br.readLine());
                jacks[i] = Integer.parseInt(st.nextToken());}
            
            int count = 0;
            
            for(int p = 0; p < y; p++) {
                
                st = new StringTokenizer(br.readLine());
                int checker = (Integer.parseInt(st.nextToken()));
                
                if(checker == jacks[binarysearch(checker,jacks)]) {count++;}
                
    
            }
            
            
            System.out.println(count);
            st = new StringTokenizer(br.readLine());
            x = (Integer.parseInt(st.nextToken()));
            y = (Integer.parseInt(st.nextToken()));
            
            
            
            
        }
        
    
        
        
        
        

    }
    
    
    public static int binarysearch(int num, int[] jack) {
        int low = 0;
        int high = jack.length-1;
        int mid = (low+high)/2;
        
        while(low<high) {
            
            mid = (low+high)/2;
            
            if(num <= jack[mid]) {
                
                high = mid;
            }
        
        
            else {
                low = mid + 1;
            }
            
            
            
            
        }
        
        return high;
    }
}
