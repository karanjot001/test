package assignment;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Fibonacci terms do you want to print?");
		int n = sc.nextInt();
		
		
		int a = 0;
		System.out.println("Term 1: "+a);
		int b = 1;
		System.out.println("Term 2: "+b);
		int c;
		for(int i=2;i<n;i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.println("Term "+i+": "+c);
		}
	}
}
