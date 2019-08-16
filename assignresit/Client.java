//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: ClientClass Extends UserClass *//
//*                                            *//
//* Date:  09/08/19                            *//
//*                                            *//
//**********************************************//
package assignresit;

import java.util.Scanner;
import javax.swing.JOptionPane;

import org.w3c.dom.Document;

import javax.swing.*;

public class Client extends User
{
/**/
	
	private static Xml_JetPlanesReader myXMLJetPlanesReader;
	private static Document planesDocument;
	
	private static Xml_BookingWriter myXMLBookingWriter;
	
	private int BID = 0;
	
	// sub-class constructor
	public Client()
	{
		super();
		System.out.println("Client User");
	}
	
	public static void editBooking(int aBookingID)
	{
		
	}
	
	/*public static void doBooking(String jetPlaneName, int start, int endDate,
								int maxGuests, boolean catering, int bathrooms)*/
	public void doBooking()
	{
		// READER
		myXMLJetPlanesReader = new Xml_JetPlanesReader();
		planesDocument = myXMLJetPlanesReader.getDocument();
		
		myXMLJetPlanesReader.textDisplay(planesDocument);
		System.out.println(" 												");
		System.out.println(" 												");
		// WRITER
		myXMLBookingWriter = new Xml_BookingWriter();
		myXMLBookingWriter.bookingWriter(++BID);
		//myXMLBookingWriter.bookingWriter(++BID);
		
	}
	
}