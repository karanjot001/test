package assignment;
import java.util.Scanner;
public class ArmstrongNumber2 {
	public static void main(String[] args) {

		int i = 0;
		for(int j=1;j<=10;j++) {
			int rem = 0;
			int sum = 0;
			int OriginalNum = i;
			while(i!=0) {
				rem = i%10;
				sum = sum + (rem*rem*rem);
				i = i/10;
			}
			if(OriginalNum == sum) {
				System.out.println(OriginalNum+ " is an Armstrong Number");
			}
			else {
				System.out.println(OriginalNum+ " is not an Armstrong Number");
			}
			i = j;
		}
	}
}

