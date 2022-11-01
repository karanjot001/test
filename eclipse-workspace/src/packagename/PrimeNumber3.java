package packagename;

public class PrimeNumber3 {
	public static void main(String[] args) {
		int number = 144;
		int n = 2;
		int count = 0;
		while(n < (number/2)) {
			if(number%n == 0) {
				count++;
				if(count>0) {
					System.out.println(n);
					break;
				}
			}
			n++;
		}
		if(count > 0) {
			System.out.println(number+" is not Prime");
		}
		else {
			System.out.println(number+" is Prime");
		}
	}
}
