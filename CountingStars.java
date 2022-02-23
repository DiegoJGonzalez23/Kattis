//package algorithms;
 //Diego Gonzalez
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingStars {
    public static int m;
    public static int n;
    public static char[][] graph;
    public static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        
        int casee = 0;
        String line;
        while((line = br.readLine()) != null) {
            String[] nums = line.split(" ");
            casee++;
        
        m =Integer.parseInt(nums[0]);
        n =Integer.parseInt(nums[1]);
        
        
        graph = new char[m][n];
        visited = new boolean[m][n];
        
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < n; j++) {
                
                graph[i][j] =s.charAt(j);
            }
        }
        int stars = 0;
        
        for(int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
            
                if(!visited[i][j] && graph[i][j]=='-') {
                    stars++;
                    floodfill(i,j);
                    
                    
                }
            }
        }
        
        System.out.println("Case " + casee + ": " + stars );
        
        
        
        
    }
    }
    
    
    public static void floodfill(int r, int c) {
        
        if(r>=m || c >= n ||  r < 0 || c < 0) {
            
        }
        else if(graph[r][c]=='#') {
            
        }
        
        else if(visited[r][c]) {
            
        }
        
        else {
            visited[r][c] = true;
            floodfill(r+1,c);
            floodfill(r-1,c);
            floodfill(r,c+1);
            floodfill(r,c-1);
            
        }
        
        
    }

}
