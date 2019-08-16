//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description:                               *//
//*                                            *//
//* Date: 09/08/2019                           *//
//*                                            *//
//**********************************************//

package assignresit;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class LukesAirlineManagementSystem
{
	/**/
	// hardcoded username and password;
	// Client username and password
	private final static String clientUsername = "Luke"; //hardcoded client login
	private final static String clientPassword = "Pass";
	// AirlineManager username and password
	private final static String managerUsername = "Admin"; //hardcoded Manager login
	private final static String managerPassword = "Admin";
	
	private static Scanner inputOptions = new Scanner(System.in);
	
	private static int optionNumber = -1; 

	private static ClientLogin aClientLogin;
	private static ManagerLogin aManagerLogin;
	
	private static Client aClient;
	private static Manager aManager;
	
	private static int counter = 0;
	
	public static void clientTextMenu() //Menu displayed for a logged in client
	{
		System.out.println(" ================================================================= ");
		System.out.println("                               VIP Jet Planes                      ");
		System.out.println(" ================================================================= ");
		System.out.println("                                                                   ");
		System.out.println("                               Client Options                      ");
		System.out.println(" ----------------------------------------------------------------- ");
		System.out.println("                     1. Do a Booking                               ");
		System.out.println("                     2. Manage a Booking                           ");
		System.out.println("                     3. EXIT                                       ");
		System.out.println(" ----------------------------------------------------------------- ");
	}
	
	public static void managerTextMenu() //Menu displayed for a logged in manager
	{
		System.out.println(" ================================================================= ");
		System.out.println("                               VIP Jet Planes                      ");
		System.out.println(" ================================================================= ");
		System.out.println("                                                                   ");
		System.out.println("                               Manager Options                     ");
		System.out.println(" ----------------------------------------------------------------- ");
		System.out.println("                     1. View All Bookings                          ");
		System.out.println("                     2. Manage a Booking                           ");
		System.out.println("                     3. EXIT                                       ");
		System.out.println(" ----------------------------------------------------------------- ");
	}
	
	public static void main(String[] args) //main class 
	{		
		while (counter < 3) //while counter for 3 login attempts before chucking you out of system
		{
			//main display first selection menu
			System.out.println(" ================================================================= ");
			System.out.println("                               VIP Jet Planes                      ");
			System.out.println(" ================================================================= ");
			System.out.println(" Please, enter '1' for Client Login or enter '2' for Manager Login");
					
			optionNumber = inputOptions.nextInt();
	
			if (optionNumber==1)  //if option 1 -client option
			{
				// instantiating a ClientLogin object
				aClientLogin = new ClientLogin();
				// instantiating the Client object
				aClient = new Client();
				
				if ( (clientUsername.equals(aClientLogin.getUsername())) && (clientPassword.equals(aClientLogin.getPassword())) )
				{
					counter = 3;
					// Client Successful Login
					System.out.println("Client has logged on successfully! ");
					
					// calling method clientTextMenu for displaying the main Client Options
					clientTextMenu();
					System.out.print(" Please, enter '1' or '2' or '3' for Client Options: ");
					
					optionNumber = inputOptions.nextInt();
			
					if (optionNumber==1)
					{
						aClient.doBooking();
					}
				}
			}
			else if (optionNumber==2) //if option 2 -manager option
			{
				// instantiating a ManagerLogin object
				aManagerLogin = new ManagerLogin();
				
				if ( (managerUsername.equals(aManagerLogin.getUsername())) && (managerPassword.equals(aManagerLogin.getPassword())) )
				{
					counter = 3; 
					
					// Manager Successful Login
					System.out.println("Manager has logged on successfully! ");
					
					// calling method managerTextMenu for displaying the main Manager Options
					managerTextMenu();
					
					System.out.print(" Please, enter '1' or '2' or '3' for Manager Options: ");
					
					optionNumber = inputOptions.nextInt();
			
					if (optionNumber==1)
					{
						aManager.viewAllBookings();
						System.out.println(" 												");
						System.out.println(" 												");
						aManager.viewAllConfirmations();
					}
				}
			}
			else
			{			
				JOptionPane.showMessageDialog(null, "Wrong Option Number!");
				
				counter = counter + 1;
			}
		
		}
		
		
		
	}
	
	
	
}