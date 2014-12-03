import java.util.List;

/**
 * @author christianbermejo
 * @since 2014-12-3
 * @version branch-christianbermejo, version 1.0
 */


public class DanielClass1 {
	/**
	 * This class is called DanielClass1.
	 * Originally to be named ChristianClass,
	 * This was named in haste. This is its description
	 * <b> ChristianClass </b>
	 */
	
	public static void main(String[] args) {
	
	}
	
	/**<b> This function allows you to write in the database.
	 * And whether it is public or private </b>
	 * It accepts 2 parameter
	 * @param post This is a String
	 * @param ispublic This is a Boolean
	 * @return isSuccessful Returns 1 or 0 depending on success.
	 */
	public int writeIn(String post, Boolean ispublic) {
		int isSuccessful = 0;
		
		/* function here */
		return isSuccessful;
	}
	
	/** <b> This function allows you to set the date of the 
	 * proposed post. </b>
	 * @param month accepts 01-12
	 * @param day accepts 01-31
	 * @param year accepts a 4 digit number for the time being
	 * @return void; sets date of the text automatically
	 */
	public void setDate(int month, int day, int year) {
		
	}
	
	/** <b> this function deletes the whole post but does not exit you
	 * from the editing screen. It merely resets the post edit box </b>
	 * @param no params are needed
	 * @return void; a mere reset. no need for returns.
	 * 
	 */
	public void resetPost() {
		
	}
	
	/**<b> this function searches through the database and processes it
	 * only if it is public </b>
	 * @param keyword The keyword to be search
	 * @param ispublic This is whether post is public or private
	 * @return Returns as List[] of search results
	 */
	public List[] search(String keyword, boolean ispublic) {
		List[] a = null;
		
		return a;
	}
	
	/**<b> This function refreshes the database and adds to list[] </b>
	 * @param List[] List of database
	 * @return void; no return
	 */
	public void refresh(List[] data) {
		
	}
}
