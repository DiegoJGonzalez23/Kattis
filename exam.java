//package tutorialstart.Kattis;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Exam {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int correct = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        String[] youranswers = st.nextToken().split(""); 
        
        st = new StringTokenizer(br.readLine());
        String[] friendanswers = st.nextToken().split("");
        int sharedanswers = 0;
        int counter = 0;
        
        for(String x: youranswers) {
            
            if (x.equals(friendanswers[counter])) {
                
                sharedanswers++;
                
            }
            
            counter++;
            
        
        }
        
        int newint;
        if (correct >= sharedanswers) {
            newint = correct-sharedanswers;
            
        }
        else {
            newint = 0;
        }
        
        int yourcorrect = Math.min(sharedanswers, correct) + (youranswers.length-sharedanswers) -newint;
        
        System.out.println(yourcorrect);
        
        
        

    }

}
