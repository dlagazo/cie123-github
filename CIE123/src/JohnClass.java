/**
 * 
 * @author John Garcia
 * @since 2014-12-3
 * @version branch-john, version 1.0
 */

public class JohnClass {

	/**
	 * This class is called JohnClass. Insert description here.
	 * <br>
	 * <b> Bold font Test</b>
	 * <br>
	 * <h1> Header font Test</h1>
	 *  
	 */
	
	public static void main(String[] args)
	{	
	}
	
	
	/**
	 * This is a function that only returns 5
	 * 
	 * @param arg1 This is a string
	 * @param arg2 This is an int
	 * @return This always returns 5
	 * 
	 */	
	public static int someMethod(String arg1, int arg2)
	{
		return 5;
	}
	
	//Write 5 any functions
	/**
	 * This function is for adding two ints.
	 * 
	 * @param arg3 First int Input
	 * @param arg4 Second int Input
	 * @return argsum 
	 */
	public static int someAddMethod(int arg3, int arg4)
	{
		int argsum = arg3 + arg4;
		return argsum;
	}
	
	/**
	 * This function is for subtracting two ints.
	 * 
	 * @param arg3 First int Input
	 * @param arg4 Second int Input
	 * @return argdiff
 	 */
	public static int someSubtractMethod(int arg3, int arg4)
	{
		int argdiff = arg3 - arg4;
		return argdiff;
	}
	
	/**
	 * This greets the user using their name.
	 * 
	 * @param name The name of the user.
	 */
	
	public static void hello(String name)
	{
		System.out.println("Hello" + name);
	}
	/**
	 * This welcomes the user to the world
	 * 
	 * @param world The name of the world.
	 */
	
	public static void world(String world)
	{
		System.out.println("Welcome to " + world);
	}
	
	/**
	 * This is used as a stopper.
	 */
	public static void stopper()
	{
		System.out.println("Stop");
	}
}
