package packagename;
import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = 0;
		char op = 'a';
		
		while(op!='x' || op!='X') {
			System.out.println("Enter a number");
			a = sc.nextInt();
			sum = sum + a;
			System.out.println("Do you want to continue? Press X to stop or Y to continue");
			op = sc.next().charAt(0);
			if(op == 'x' || op == 'X') {
				break;
			}
		}
		
		System.out.println("Sum: "+sum);
	}
}
