package assignment;
import java.util.Scanner;
public class LargestTillZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int num = 0;
		do {
			
			System.out.println("Enter a number: ");
			num = sc.nextInt();
			
			if(num > max) {
				max = num;
			}
		}while(num!=0);
		
		System.out.println("The largest integer entered is "+max);
	}
}
