package assignment;
import java.util.Scanner;
public class Currency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your amount in INR");
		float inr = sc.nextInt();
		
		float usd = inr/81;
		
		System.out.println("Amount in USD: "+usd);
	}
}
