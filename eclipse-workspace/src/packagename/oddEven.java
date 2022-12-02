package packagename;
import java.util.Scanner;

public class oddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find whether its odd or even");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println(number+" is Even");
		}
		else {
			System.out.println(number+" is Odd");
		}
	}
}
