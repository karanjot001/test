package packagename;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 19;
		int count = 0;
		for(int i=1;i<=(number/2);i++) {
			if(number%i == 0) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println("The entered number "+number+" is Prime");
		}
		else {
			System.out.println("The entered number "+number+" is not Prime");
		}
	}
}
