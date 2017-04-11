package Instance;
import StaticStuff.*;
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

	public static void main(String[] args){
		
		new Instance();
		//TODO: research how to integrate with wearables (fitbit, etc.)
	}
	
	public ArrayList<String> loginMenu(Scanner input){
		System.out.println("Press any key to login or enter 'register' to sign up for a new account.");
		String accountEntry = input.nextLine();
		
		if(accountEntry.equalsIgnoreCase("register")){
			ArrayList<String> register = getRegistryData();
			return register;
		}
		else{
			ArrayList<String> login = getLoginData();
			return login;
		}
	}
	
	public int mainMenu(Scanner input){
		
	}
	
	public ArrayList<String> getLoginData(){
		
	}
	
	public ArrayList<String> getRegistryData(){
		
	}
}
