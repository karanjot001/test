package packagename;

import java.util.Scanner;

public class stringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
		System.out.println("Please enter a String to check whether its a Palindrome");
		String str = sc.next();
		
		int len = str.length();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(len-1)) {
				len--;
				count++;
			}
		}
		if(count == str.length()) {
			System.out.println("The String "+str+" is a Palindrome");
		}
		else {
			System.out.println("The String "+str+" is not a Palindrome");
		}
		
		System.out.println("Want to try again?(Y/N)");
		ch = sc.next().charAt(0);
	}while(ch == 'y' || ch == 'Y');
	System.out.print("You have reached to the end of the program. Thankyou!");

	}
}
