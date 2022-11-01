package packagename;
import java.lang.Math;
public class PrimeNumber3 {
	public static void main(String[] args) {
		int number = 24;
		int n = 2;
		int count = 0;
		while(n < Math.sqrt(number)) {
			if(number%n == 0) {
				System.out.println(n);
				count++;
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
