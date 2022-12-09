package assignment;

public class SubProdAndSumOfIntegers {
	public static void main(String[] args) {
		int num = 142;
		int originalNum = num;
		
		int rem = 0;
		int sum = 0;
		int prod = 1;
		while(num!=0) {
			rem = num%10;
			num = num/10;
			sum = sum + rem;
			prod = prod * rem;
		}
		System.out.println("Sum of the digits of "+originalNum+": "+sum);
		System.out.println("Product of the digits of "+originalNum+": "+prod);
		System.out.println("Product - Sum: "+(prod - sum));
	}
}
