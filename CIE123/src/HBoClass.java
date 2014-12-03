/** @author Harry Bo
 * @since December 1, 2014
 * @version branch-warfreak, version-1.0
 */


public class HBoClass {
	/** This class is awesome!
	 * 
	 */
	
	/** This method prints a line!
	 * 
	 */
	public static void main(String []args){

		System.out.println("NALULUHAAN MO KATARATA KO!!!!!");
	}
	
	/**
	 ** This method does addition.
	 *@param addend1 The first number to add.
	 *@param addend2 The second number to add.
	 *@return Sum of both numbers.
	 */
	public static int addition(int addend1, int addend2){

		return addend1 + addend2;
	}
	
	/**
	 ** This method does multiplication.
	 *@param multiple1 The first number to add.
	 *@param multiple2 The second number to add.
	 *@return Product of both numbers.
	 */
	public static int multiplication(int multiple1, int multiple2){

		return multiple1*multiple2;
	}
	
	/**
	 ** This method does division.
	 *@param divisible1 The first number to add.
	 *@param divisible 2The second number to add.
	 *@return Quotient of both numbers.
	 */
	public static int division(int divisible1, int divisible2){

		return divisible1/divisible2;
	}
	
	/**
	 ** This method does subtraction.
	 *@param sub1 The first number to add.
	 *@param sub2 The second number to add.
	 *@return Difference of both numbers.
	 */
	public static int subtraction(int sub1, int sub2){

		return sub1 - sub2;
	}
	/**
	 * This method demonstrates the MDAS rule.
	 * @param num1 First number.
	 * @param num2 Second number.
	 * @param num3 Third number.
	 * @param num4 Fourth number.
	 * @param num5 Fifth number.
	 * @return Result after going through the MDAS process of operations.
	 */
	public static int MDAS(int num1, int num2, int num3, int num4, int num5){
		return num1*(num2/num3)+num4-num5;
	}
}
