package packagename;

public class StaticMethod {
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 5;
		int result = add(a,b,c);
		System.out.println(result);
	}
}
