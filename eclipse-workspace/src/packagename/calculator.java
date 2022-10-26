package packagename;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
		System.out.println("Please enter any two integers");
		int op1 = sc.nextInt();
		int op2 = sc.nextInt();
		
		System.out.println("Press 1. for Addition");
		System.out.println("Press 1. for Subtraction");
		System.out.println("Press 1. for Multiplication");
		System.out.println("Press 1. for Division");
		int op3 = sc.nextInt();
		
		switch(op3) {
		case 1: System.out.println("Addition of "+op1+" and "+op2+" is: "+(op1+op2));
		break;
		
		case 2: System.out.println("Subtraction of "+op1+" and "+op2+" is: "+(op1-op2));
		break;
		
		case 3: System.out.println("Multiplication of "+op1+" and "+op2+" is: "+(op1*op2));
		break;
		
		case 4: System.out.println("Division of "+op1+" and "+op2+" is: "+(op1/op2));
		break;
		
		default: System.out.println("Please enter the correct operator!");
			}
		
			System.out.println("Do you want to continue?(Y/N)");
			ch = sc.next().charAt(0);
			
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("You have reached the end of the program. Thankyou!!!");
	}
}
