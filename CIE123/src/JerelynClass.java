/** * 
 * @author Jerelyn Co
 * @version V1.0
 * This is my class yo! <b> this is in the html tag b </b>
 */

public class JerelynClass {
	/*
	 * this is the main method of the class
	 */
	public static void main(String[] args){
		hello("Hi", 5);
	}
	/* hello returns the string arg1 with the int arg2.
	 * @param arg1 is the string
	 * @param arg2 is the int
	 */
	public static String hello(String arg1, int arg2){
		return arg1 + " " + arg2;
	}
	/* sum returns the sum of x and y
	 * @param x is the first number
	 * @param y is the second number
	 */
	public static int sum(int x, int y){
		return x+y;
	}
	/* multiply returns the sum of x and y
	 * @param x is the first number
	 * @param y is the second number
	 */
	public static int multiply(int x, int y){
		return x*y;
	}
	/* divide returns the quotient of x and y
	 * @param x is the first number
	 * @param y is the second number
	 */
	public static double divide(int x, int y){
		return x/y;
	}
}
