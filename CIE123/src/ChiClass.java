
public class ChiClass {
	/**
	 * This class is called ChiClass. This
	 * is a description for the class
	 * <b>This is in bold</b>
	 * <h1>This is header1 </h1>
	 * @param args
	 */
	public static void main(String[] args){
		/**
		 * This is the main function of the program.
		 * It runs a sequence of functions that outputs strings of messages/
		 */
		sayHello();
		quote();
		kamusta();
		sayGoodbye();
	}
	
	public static void sayHello() {
		/**
		 * This function starts the sequence by saying hello.
		 */
		System.out.println("Hello there!");
	}
	
	public static void sayGoodbye() {
		/**
		 * This function ends the sequence by saying goodbye.
		 */
		System.out.println("Goodbye!");
	}
	
	public static void kamusta() {
		/**
		 * This function asks you how you are.
		 */
		System.out.println("How are you?");
	}
	
	public static void quote() {
		/**
		 * This function tells you what kind of day it is today.
		 */
		System.out.println("Today is a lovely day.");
	}
}