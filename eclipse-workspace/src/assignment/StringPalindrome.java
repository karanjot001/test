package assignment;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to find whether its Palindrome or not");
		String str = sc.next();
		
		int length = str.length();
		int i=0;
		while(length!=0) {
			if(str.charAt(i) == str.charAt(length-1)) {
				i++;
				length--;
				if(length == 0) {
					System.out.println("The String "+str+" is Palindrome");
				}
			}
			else {
				System.out.println("The String "+str+" is not Palindrome");
				break;
			}
		}
	}
}
