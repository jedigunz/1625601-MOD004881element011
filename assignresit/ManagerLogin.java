//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: ManagerLogin extends LoginClass//
//*                                            *//
//* Date:   09/08/19                           *//
//*                                            *//
//**********************************************//
package assignresit;

import java.util.Scanner;

public class ManagerLogin extends Login
{
	/**/
	// class instance fields
	private static String managerUsername = " ";
	private static String managerPassword = " ";
	
	private static Scanner inputManagerOptions = new Scanner(System.in);
	
	// constructor
	public ManagerLogin()
	{
		super();
		System.out.println("Manager Logins");
		
		//Manager Login
		System.out.println("Please, enter the Manager username:  ");
		managerUsername = inputManagerOptions.nextLine();
		System.out.println("Please, enter the Manager password:  ");
		managerPassword = inputManagerOptions.nextLine();	
	}
	
	// Polymorphism with Override
	
	// getter method for instance field username
	public static String getUsername()
	{
		return managerUsername;
	}
	
	// setter method for instance field username 
	public static void setUsername(String aUsername)
	{
		managerUsername = aUsername;
	}
	
	// getter method for instance field password
	public static String getPassword()
	{
		return managerPassword;
	}
	
	// setter method for instance field password 
	public static void setPassword(String aPassword)
	{
		managerPassword = aPassword;
	}
}