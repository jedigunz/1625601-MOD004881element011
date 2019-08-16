//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description:     Login Class               *//
//*                                            *//
//* Date:  09/08/19                            *//
//*                                            *//
//**********************************************//
package assignresit;

public class Login
{
	/**/
	// class instance fields
	private static String username = " ";
	private static String password = " ";
	
	// constructor
	public Login()
	{
		System.out.println("User Logins");
	}
	
	// getter method for instance field username
	public static String getUsername()
	{
		return username;
	}
	
	// setter method for instance field username 
	public static void setUsername(String aUsername)
	{
		username = aUsername;
	}
	
	// getter method for instance field password
	public static String getPassword()
	{
		return password;
	}
	
	// setter method for instance field password 
	public static void setPassword(String aPassword)
	{
		password = aPassword;
	}
}
