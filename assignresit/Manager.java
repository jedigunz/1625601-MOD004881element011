//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: ManagerClass extends userClass*//
//*                                            *//
//* Date:   09/08/19                           *//
//*                                            *//
//**********************************************//
package assignresit;

import java.util.Scanner;
import javax.swing.JOptionPane;

import org.w3c.dom.Document;

import javax.swing.*;

public class Manager extends User
{
	/**/
	
	private static Document bookingsDocument;
	private static Xml_BookingReader myXMLBookingReader;
	
	private static Document bookingConfirmationsDocument;
	private static Xml_ConfirmationReader myXMLBookingConfirmationReader;
	
	// sub-class constructor
	public Manager()
	{
		super();
		System.out.println("Manager User");
	}
	
	public static void editBooking(int aBookingID)
	{
		
	}
	
	public static void editJetPlane(String JetPlane)
	{
		
	}
	
	public static void viewAllBookings()
	{
		myXMLBookingReader = new Xml_BookingReader();
		bookingsDocument = myXMLBookingReader.getDocument();
		
		myXMLBookingReader.textDisplay(bookingsDocument);
		
	}
	
	public static void viewAllConfirmations()
	{
		myXMLBookingConfirmationReader = new Xml_ConfirmationReader();
		bookingsDocument = myXMLBookingConfirmationReader.getDocument();
		
		myXMLBookingConfirmationReader.textDisplay(bookingsDocument);
		
	}
	
}