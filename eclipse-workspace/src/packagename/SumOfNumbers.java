package packagename;
import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		char op = 'a';
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number");
			int number = sc.nextInt();
			sum = sum + number;
			System.out.println("Enter 'X' to stop or enter any other character to continue");
			op = sc.next().charAt(0);
		
		}while(op != 'x');
		
		System.out.println("SUM: "+sum);
		
	}
}
