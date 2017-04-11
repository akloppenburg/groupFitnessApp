package StaticStuff;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * The user class provides a variety of methods for interfacing with the current user.  In its current implementation, it is loaded only
 *  once per instance.  The constructor queries the text file 'database' called "users.txt" and finds a user based on a username and
 *  password.  Then, the user's various attributes (groups, statistics, etc.) can be accessed.
 * @author Alex Kloppenburg
 * @version 1.0
 */
public class User {
	
	String userID;
	String name;
	
	/**
	 * The User constructor creates a new User object with the user's specific name and User ID given their username and password.  It
	 * does this by searching a faux database in the form of the "users.txt" file and iterating through the contents to find the specific
	 * User ID and name.
	 * @param username the username given by the person trying to access a specific user
	 * @param password the password given by the person trying to access a specific user
	 * @see String
	 * @see Scanner
	 */
	public User(String username, String password){
		//Try-catch gets the FileNotFoundException
		try{
			Scanner input = new Scanner(new File("users.txt"));
			
			/*	Data is stored in the file as username, password, UID, and name on a line separated by spaces
			 * 	This while loop iterates through and sets the UID and name if the username and password match the user input
			 */
			while(input.hasNextLine()){
				String potentialUsername = input.next();
				String potentialPassword = input.next();
				String potentialUserID = input.next();
				String potentialName = input.nextLine();
				
				if(potentialUsername.equals(username) && potentialPassword.equals(password)){
					this.userID = potentialUserID;
					this.name = potentialName;
				}
			}
			
			input.close();
		}
		catch(FileNotFoundException f){
			System.err.println("Error found: " + f.getLocalizedMessage());
		}
	}
	
	/**
	 * The getUserID method simply returns the current User's user ID.
	 * @return userID the unique 10-digit user ID number associated with the current user
	 */
	public String getUserID(){
		return userID;
		
	}
	
	/**
	 * The getGroups method returns an ArrayList of Group objects containing all the groups that the current user is a member of.
	 * @return groups An ArrayList of Group objects associated with the current user
	 */
	public ArrayList<Group> getGroups(){
		ArrayList<Group> groups = new ArrayList<Group>();
		return groups;
		//TODO: returns the current user's groups they are in
	}
	
	/**
	 * 
	 * @return
	 */
	public Statistics getUserStatistics(){
		return null;
		//TODO: returns the current user's statistics
	}
	
	/**
	 * 
	 */
	public void addUser(String username, String password){
		
	}
}