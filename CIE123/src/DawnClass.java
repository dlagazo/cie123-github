/**
 * @author corpuzdawn
 * @since 2014-12-3
 * @version branch-corpuzdawn. version 1.0
 */

	/**
	 * This class is called DawnClass. This
	 * is a sample class.
	 * <h1> My first try </h1>
	 */
public class DawnClass {


	public static void main(String[] args)
	{
		
	}
	/**
	 * <b> This function accepts two parameters
	 * @param arg1 This is a string
	 * @param arg2 This is an int
	 * @return This always returns 5.
	 */
	public static int someMethod(String arg1, int arg2){
		return 5;
	}
	
	//5 functions
	
	/**
	 * <b> This function returns the sum of two numbers
	 * @param num1 This is the first number
	 * @param num2 This is the second number
	 * 
	 */
	
	public static int addition( int num1, int num2){
		return num1 + num1; 
	}
	
	/**
	 * <b> This function returns the difference of two numbers
	 * @param num1 This is the first number
	 * @param num2 This is the second number
	 * 
	 */
	public static int subtraction( int num1, int num2){
		return num1-num2;
		
	}
	
	
	/**
	 * <b> This function returns the product of two numbers
	 * @param num1 This is the first number
	 * @param num2 This is the second number
	 * 
	 */
	public static int multiplication( int num1, int num2){
		return num1*num2;
		
	}
	
	/**
	 * <b> This function returns the quotient of two numbers
	 * @param num1 This is the first number
	 * @param num2 This is the second number
	 * 
	 */
	public static int division( int num1, int num2){
		return num1*num2;
		
	}
	
	/**
	 * <b> This function shows an attack
	 * @param sound 1 This is the sound of the gun
	 * @param numshot number of shots of the gun
	 * @return number of shots and prints the sound of the gun
	 */
	public static int gun(String sound1, int numshot){
		System.out.print("BANG!");
		return numshot;
	}
	
	

}
