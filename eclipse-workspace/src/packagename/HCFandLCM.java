package packagename;
import java.util.Scanner;

public class HCFandLCM{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to find their LCM and HCF");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("***** LCM *****");
		int lcm = a>b ? a:b;
		while(true) {
			if(lcm%a == 0 && lcm%b == 0) {
				System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
				break;
			}
			lcm++;
		}
		
		System.out.println("\n***** HCF *****");
		
		int div=1;
		int max = a>b ? a:b;
		int hcf = 0;
		while(div<max) {
			if(a%div == 0 && b%div == 0) {
				hcf = div;
			}
			div++;
		}
		System.out.println("HCF of "+a+" and "+b+" is: "+hcf);
		
		
		
		
	}
}