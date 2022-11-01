package packagename;
import java.lang.Math;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find whether its prime or not");
		int number = sc.nextInt();
		int count = 0;
		for(int i=1;i<=Math.sqrt(number);i++) {
			if(number%i == 0) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println("The entered number "+number+" is Prime");
		}
		else {
			System.out.println("The entered number "+number+" is not Prime");
		}
	}
}
