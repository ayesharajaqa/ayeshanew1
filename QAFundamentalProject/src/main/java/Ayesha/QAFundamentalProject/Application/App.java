package Ayesha.QAFundamentalProject.Application;

import java.sql.SQLException;
import java.util.Scanner;

import Templates.User;
import Utilities.Database;

public class App 
{
    public static void main( String[] args )
    {
        
    	//Attempt to establish a connection to the MySQL Database by invoking the 'connect' method in the 'Database' Class
    	try {
        	Database.connection();
        } catch (ClassNotFoundException | SQLException e) {
        	//Catch Exception when the class 'SQL' cannot be found
        	//Catch any exception relating to an SQL error
        	//Print the exception to the console - could create an error handler class/method?
        	e.printStackTrace();
        }
    	
    	User user= new User();
    	
    	if(!user.loggedin()) {
    		System.out.println("Welcome to QA. Please select an option.");
    		System.out.println("1. Register for a login.");
    		System.out.println("2. Log in.");
    		
    		int selection;
    		Scanner scan = new Scanner(System.in);
    		
    		selection = scan.nextInt();
    		
    		switch (selection) {
    		case 1: //User has selected to register
    			user = Controls.addNewUser(user);
    			break;
    		case 2: //User has selected to log in
    			System.out.println("Logging in...");
    			System.out.println("Enter Username:");
    			user.setUsername(scan.next());
    			System.out.println("Enter Password:");
    			user.setPassword(scan.next());
    			break;
    		case 9: //Hidden root menu - for administration
    			System.out.println("Root Menu");
    			System.out.println("Please enter root password:");
    			user.setUsername("root");
    			user.setPassword(scan.next());
    			break;
    		default:
    			//User has entered an unexpected choice.
    			System.out.println("Sorry that was an invalid choice. Please try again.");
    		}
    	}
    	
    	//Display Menus
    	
    	
    	
    }
}
