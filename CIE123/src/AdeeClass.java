/**
 * @author adeejavier
 * @since 2014-11-03
 * @version branch-adeejavier, version-1.0
 */

public class AdeeClass {

	public static void main(String[] args){}

/**
 * This method returns the load of the person after consuming for call
 * @param name Name of the person 
 * @param load Load of the person
 * @return Total load after call
 */
public static int call(String name, int load)
{
	System.out.println("Calling ", name);
	return (load - 10);
			
}

/**
 * This method returns the load of the person after consuming for text message
 * @param name Name of the Person
 * @param message Message of the person
 * @return The message
 */


public static int text(String name, int message)
{
	System.out.println("Texting ", name);
	System.out.println("The message");
	return (load - 1);
}


/**
 * This method returns the total load of the person after reloading
 * @param name Name of the person 
 * @param load Load of the person
 * @return Total load after reloading
 */

public static int reload(String name, int load)
{
	System.out.println("Reloading ", name);
	return (load + 5);
	}


/**
 * This method returns the total load of the person after giving load
 * @param name Name of the person 
 * @param load Load of the person
 * @return Total load after giving loading
 */

public static int lessload(String name, int load)
{
	System.out.println("Giving loadto ", name);
	return (load - 5);
	}


/**
 * This method notifies person for total load
 * @param name Name of the person 
 * @param load Load of the person
 * @return Total load after giving loading
 */

public static int notify(String name, int load)
{
	System.out.println("You're load is  ", name);
	return (load);
}
	}