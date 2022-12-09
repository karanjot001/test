package assignment;
import java.util.Scanner;
public class NestedSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your employee ID");
		int empID = sc.nextInt();
		System.out.println("Enter your Department");
		String dept = sc.next();
		
		switch(empID) {
			case 1 : System.out.println("Karanjot Singh"); break;
			
			case 2 : System.out.println("Lakshya Saharan"); break;
			
			case 3 : 
				switch(dept) {
					case "IT" -> System.out.println("IT Dept");
					
					case "HR" -> System.out.println("HR Dept");
				}
				break;
			default: System.out.println("Please enter a valid employee ID");
			
			}
	}
}
