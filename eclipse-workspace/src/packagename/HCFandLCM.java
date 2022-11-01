package packagename;

public class HCFandLCM {
	public static void main(String[] args) {
		int a = 2, b = 8;
		System.out.println("HCF of "+a+" and "+b);
		
		int hcf = 1;
		int temp = 0;
		while(hcf <= b) {
			if((a%hcf == 0) && (b%hcf == 0)) {
				temp = hcf;
			}
			hcf++;
		}
		System.out.printf("The HCF of %d and %d is %d.", a, b, temp);
		
		
		System.out.println("\n\nLCM of "+a+" and "+b);
		int lcm = 0;

	    // maximum number between n1 and n2 is stored in lcm
	    lcm = (a > b) ? a : b;

	    // Always true
	    while(true) {
	      if( lcm % a == 0 && lcm % b == 0 ) {
	        System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
	        break;
	      }
	      lcm++;
	    }
	}
}
