package assignment;
import java.util.Scanner;
public class SwitchFruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Please input a fruit that you like");
			String fruit = sc.next();
			
			switch(fruit) {
			case "Apple" : System.out.println("Your favourite fruit is apple");
							break;
			case "Mango" : System.out.println("Your favourite fruit is Mango");
			break;
			
			case "Banana" : System.out.println("Your favourite fruit is Banana");
			break;
			
			case "Orange" : System.out.println("Your favourite fruit is Orange");
			break;
			
			case "Pineapple" : System.out.println("Your favourite fruit is Pineapple");
			break;
			
			default : System.out.println("Please input a valid fruit");
			break;
			}
			System.out.println("Do you wish to continue? (Y/N)");
			ch = sc.next().charAt(0);
			
		}while(ch == 'y' || ch == 'Y');
		System.out.println("You ended the program");
	}
}
