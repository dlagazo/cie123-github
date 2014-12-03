/**
 * @author ramonimbao
 * @since 2014-12-3
 * @version branch-ramonimbao, version 1.0
 */


/**
 * This class is called RamonClass. This
 * is a description of the class.
 * <marquee><h1>Oh no!</h1></marquee>
 */
public class RamonClass {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * <b>This function lets Ramon eat.</b>
	 * @param foods The foods that you'd feed Ramon
	 */
	public static void eat(String[] foods) {
		for(int i=0; i<foods.length; i++) {
			System.out.println("Eating " + foods + "...");
		}
	}
		
	/**
	 * <b>This function lets Ramon poop.</b>
	 */
	public static void poop() {
		System.out.println("Pooping...");
	}
	
	/**
	 * <b>This function lets Ramon sleep for 
	 * a set number of hours, minutes, and
	 * seconds.</b>
	 * @param hours The number of hours Ramon will sleep.
	 * @param minutes The number of minutes Ramon will sleep.
	 * @param seconds The number of seconds Ramon will sleep.
	 */
	public static void sleep(long hours, long minutes, long seconds) {
		System.out.println("Sleeping for " + hours + "h " + minutes + "m " + seconds + "s...");
	}
	
	
	/**
	 * <b>This function will make Ramon add two
	 * numbers x and y for no reason at all.</b>
	 * @param x The first number
	 * @param y The second number
	 * @return The sum of the two numbers
	 */
	public static float addForNoReason(float x, float y) {
		return x + y;
	}
	
	
	/**
	 * <b>This function will make Ramon spend an
	 * inaccurate amount of money due to how <i>float</i>s
	 * work in computers.</b>
	 */
	public static void spendInaccurately(float amount) {
		System.out.println("Spending Php" + amount + "...");
	}
	
}
