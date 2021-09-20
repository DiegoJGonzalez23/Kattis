package javacreate;
import java.lang.Math;
import java.util.*;

// Diego Gonzalez
// Period 2
// 9.20.21
// Fraction Classes

public class fraa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction d = new Fraction(3,4);
		Fraction g = new Fraction(4,5);
		
		System.out.println(reduce(d.multiplication(g)).ToString());
		System.out.println((d.multiplication(g)).ToString());
		
		}
	
	
	
	
	
	
	public static class Fraction {
		
		private int num;
		private int den;
		
		public Fraction(int n, int d){
			
			num = n;
			den = d;
		}
		
		public String ToString(){
			
			return num +  "/" + den;
			
		}
		
		public Fraction multiplication(Fraction g){
			int nn = num * g.getnum();
			int dd = den * g.getden();
			
			return new Fraction(nn,dd);
			
			
		}
		
		public Fraction division(Fraction g){
			int nn = num * g.getden();
			int dd = den * g.getnum();
			
			return new Fraction(nn,dd);
			
			
		}
		
		public Fraction addition(Fraction g){
			
			int nn = num * g.getden() + g.getnum() * den;
			int dd = g.getden() * den;
			return new Fraction(nn,dd);
		}
		
		public Fraction subtract(Fraction g){
			
			int nn = num * g.getden() - g.getnum() * den;
			int dd = g.getden() * den;
			return new Fraction(nn,dd);
		}
		
		
		public int getnum(){
			return num;
		}
		public int getden(){
			return den;
		}
		
		
		
	}
	
	public static Fraction reduce(Fraction d){
		
		
		 int nn = d.getnum();
		 int dd = d.getden();
		
		for(int y= d.getden(); y > 1 ;y--){
			if (nn % y == 0 && dd % y == 0){
				nn /= y;
				dd /= y;
			}
		}
		
		return new Fraction(nn,dd);
		
		
		
		
		
		
	}

}
