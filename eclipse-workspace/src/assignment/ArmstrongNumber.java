package assignment;
import java.lang.Math;
public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int num = 5;
		
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while(num!=0) {
			rem = num%10;
			sum = sum + (rem * rem * rem);
			num = num/10;
		}
		if(temp == sum) {
			System.out.println(temp+" is an Armstrong Number");
		}
		else {
			System.out.println(temp+" is not an Armstrong Number");
		}
		
	}
}
