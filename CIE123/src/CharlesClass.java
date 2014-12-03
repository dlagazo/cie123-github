/*
 * JavaDoc Test
 */
public class CharlesClass {
	public static void main(String[] args){
		int x = 3, y = 4;
		System.out.println(add(x, y));
		y=negate(y);
		System.out.println(multiply(x, y));
		x=square(x);
		System.out.println(subtract(x, y));
	}
	static int add(int a, int b){
		return a+b;
	}
	static int square(int a){
		return a*a;
	}
	static int multiply(int a, int b){
		return a*b;
	}
	static int subtract(int a, int b){
		return a-b;
	}
	static int negate(int a){
		return -a;
	}
}
