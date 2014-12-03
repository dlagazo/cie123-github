/**
 * @author daniel
 * @since 2014-12-7
 * @version branch-dlagazo, version 1.0 
 * */

public class DanielClass {
	/**
	 * This class is called DanielClass. This 
	 * is a description for the class.
	 * <b>This is in bold</b>
	 * <h1>This is header1</h1>
	 * @param args Some parameter
	 */
	public static void main(String[] args){}
	/**
	 * *<b> This function accepts two parameters </b>
	 * @param arg1 This is a String
	 * @param arg2 This is an int
	 * @return This always returns 5.
	 */
	
	public static int someMethod(String arg1, int arg2)
	{
		return 5;
	}
	
	/**
	 * <h1> This function lets you <b>call</b>. It deducts 20 from your load</h1>
	 * @param name The name of the person to call
	 * @param load The amount of remaining balance
	 * @return returns the load - 20
	 */
	
	public static int call(String name, int load)
	{
		System.out.println("Calling " + name);
		return (load - 20);
	}
	/**
	 * <h1> This function lets you send sms. It deducts P1 from your load </h1>
	 * @param name The name of the person to text.
	 * @param load The amount of remaining load
	 * @return returns the load - 1
	 */
    public static int text(String name, int load)
    {
    	System.out.println("Sending text to " + name );
    	System.out.println("Message successfully sent");
    	return (load - 1);
    }



}













