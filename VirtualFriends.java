package s;
import java.util.*;
import java.io.*;


public class VirtualFriends {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        int testcases = Integer.parseInt(st.nextToken());
        
        
        for(int iii = 0; iii < testcases; iii++) {
            st = new StringTokenizer(br.readLine());
            int friendships = Integer.parseInt(st.nextToken());
            
            HashMap<String, Integer> ids = new HashMap<>();
            
            
            ufds arr = new ufds(2*friendships);
            
            int count = 0;
            for(int i = 0; i < friendships; i++) {
            st = new StringTokenizer(br.readLine());
            String friend1 = st.nextToken();
            String friend2 = st.nextToken();
            
            
            if(!ids.containsKey(friend1)) {
                ids.put(friend1, count);
                count++;
            }
            
            if(!ids.containsKey(friend2)) {
                ids.put(friend2, count);
                count++;
            }
            int friendss = 0;
            System.out.println(arr.Union(ids.get(friend1), ids.get(friend2)));
            
            
            
      
            }  

    }

}
    static class ufds{
        
        int[] parents;
        int[] sizer;
        
        public ufds(int n) {
            parents = new int[n];
            sizer = new int[n];
            for(int p = 0; p < n; p++) {
                parents[p] = p;
                sizer[p] = 1;
            }
        }
        
        public int Find(int x) {
            if(x == parents[x]) {
                return x;
            }
            else {
                 parents[x] = Find(parents[x]);
            }
            return parents[x];
        }
        
        public  int Union(int x, int y) {
            int parentofx = Find(x);
            int parentofy = Find(y);
            if(parentofx != parentofy) {
                parents[parentofy] = parentofx;
                sizer[parentofx] += sizer[parentofy];
                
                
            }
            
            return sizer[parentofx];
            
        }
        
        
    }

}