package assignment;

public class CountOccurrences {
	public static void main(String[] args) {
		int number = 133447;
		String stringNumber = Integer.toString(number);
		
		for(int i=0;i<stringNumber.length();i++) {
			int count = 0;
			char digit = stringNumber.charAt(i);
			for(int j=0;j<stringNumber.length();j++) {
				if(stringNumber.charAt(i) == stringNumber.charAt(j)) {
					count++;
				}
				if(j == (stringNumber.length()-1)) {
					System.out.println(digit+" occurs "+count+" times");
				}
			}
		}
	}
}
