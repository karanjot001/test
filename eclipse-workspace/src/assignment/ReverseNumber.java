package assignment;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 23597;
		int reversenum = 0;
		
		int rem = 0;
		
		while(num!=0) {
			rem = num%10;
			num = num/10;
			reversenum = (reversenum * 10) + rem; 
		}
		System.out.println("Reversed Number is: "+reversenum);
	}
}
