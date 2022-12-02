package assignment;
import java.util.Scanner;
public class Sum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to find their sum");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = x+y;
		
		System.out.println("Sum of "+x+" and "+y+": "+sum);
	}

}
