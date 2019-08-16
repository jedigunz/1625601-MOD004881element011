//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: ClientLogin extends loginClass*//
//*                                            *//
//* Date: 09/08/19                             *//
//*                                            *//
//**********************************************//
package assignresit;

import java.util.Scanner;

public class ClientLogin extends Login
{
	/**/
	// class instance fields
	private static String clientUsername = " ";
	private static String clientPassword = " ";
	
	private static Scanner inputClientOptions = new Scanner(System.in);
	
	// constructor
	public ClientLogin()
	{
		super();
		System.out.println("Client Logins");
		
	    //Client Login
		System.out.print("Please, enter the Client username: ");
		clientUsername = inputClientOptions.nextLine();
		System.out.print("Please, enter the Client password: ");
		clientPassword = inputClientOptions.nextLine();	
	}
	
	// Polymorphism with Override
	
	// getter method for instance field username
	public static String getUsername()
	{
		return clientUsername;
	}
	
	// setter method for instance field username 
	public static void setUsername(String aUsername)
	{
		clientUsername = aUsername;
	}
	
	// getter method for instance field password
	public static String getPassword()
	{
		return clientPassword;
	}
	
	// setter method for instance field password 
	public static void setPassword(String aPassword)
	{
		clientPassword = aPassword;
	}	
}