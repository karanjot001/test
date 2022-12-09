package assignment;
import java.util.Scanner;
public class SumTillZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int num = 1;
		do{
			System.out.println("Enter integers to find their sum");
			num = sc.nextInt();
			sum = sum+num;
		}while(num!=0);
		
		System.out.println("Sum: "+sum);
	}
}
