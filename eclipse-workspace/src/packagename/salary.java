package packagename;
import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("\nHello "+name);
		
		System.out.println("\nPlease enter your salary");
		float sal = sc.nextFloat();
		System.out.println("Your salary before bonus was: "+sal);
		if(sal > 10000.0) {
			sal = sal + 2000;
		}
		else {
			sal = sal + 1000;
		}
		
		System.out.print("Your salary after adding bonus is: "+sal);
	}
}
