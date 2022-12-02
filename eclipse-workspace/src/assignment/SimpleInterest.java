package assignment;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount, time and rate respectively");
		int principal = sc.nextInt();
		float time = sc.nextFloat();
		float rate = sc.nextFloat();
		
		float si = (principal * time * rate)/100;
		System.out.println("Simple Interest is: "+si);
		
	}
}
