//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: Bookingwriter ext XMLwriter   *//
//*                                            *//
//* Date:  09/08/19                            *//
//*                                            *//
//**********************************************//
package assignresit;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import java.io.IOException;
import java.awt.AWTError;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Xml_BookingWriter extends XML_Writer
{
	private static String theWriteFilename = "Assignment2/src/assignresit/Bookings.xml";
	private static Document aWriteBookingDocument;
	
	private static Node booking;
	private static String myXMLWriteFilepath = "Assignment2/src/assignresit/Bookings.xml";
	
	private static Document theBookingWriting;
	
	private static Scanner bookingOptions = new Scanner(System.in);
	
	private static String bookingFirstName = "";
	private static String bookingLastName = "";
	private static int start = -1;
	private static int end = -1;
	private static int maximumGuests = -1;
	private static String catering = "";
	private static String exit ="";
	
	private static Node rootNode;
	
	// constructor
	public Xml_BookingWriter()
	{
		System.out.println("Write me the bookings...!");
		
		aWriteBookingDocument = serverFileConnection(theWriteFilename);
		aWriteBookingDocument.normalize();
		setDocument(aWriteBookingDocument);
	}
	
	public static Document getDocument()
	{
		return aWriteBookingDocument; 
	}
	
	public static void setDocument(Document myDoc)
	{
		aWriteBookingDocument = myDoc;
	}
	
	private static Element newBookingNode(String id) {
	    // Create booking root element with id
	    Element booking = theBookingWriting.createElement("Booking");
	    Attr bookingId = theBookingWriting.createAttribute("id");
	    bookingId.setValue(id);
	    booking.setAttributeNode(bookingId);
	    
	    
	    // Child nodes
	    Element firstname = theBookingWriting.createElement("FirstName");
	    Element lastname = theBookingWriting.createElement("LastName");
	    Element startDate = theBookingWriting.createElement("startDate");
	    Element endDate = theBookingWriting.createElement("endDate");
	    Element maxGuests = theBookingWriting.createElement("MaxGuests");
	    Element catering = theBookingWriting.createElement("Catering");
	    
	    // Append to booking
	    booking.appendChild(firstname);
	    booking.appendChild(lastname);
	    booking.appendChild(startDate);
	    booking.appendChild(endDate);
	    booking.appendChild(maxGuests);
	    booking.appendChild(catering);
	    
	    return booking;
	}
	
	public static void bookingWriter(int bookingWritingID) //String aWriteFilePath)
	{
		try
		{
		    // Get document
			theBookingWriting = getDocument();
			
	         // Override the value of BID with the number of existing bookings, then +1
            bookingWritingID = theBookingWriting.getElementsByTagName("Booking").getLength();
            bookingWritingID++;
            String newId = "bid_" + bookingWritingID;
            
            // New booking element
			Element booking = newBookingNode(newId);
			
			// Append new empty booking node
			theBookingWriting.getDocumentElement().appendChild(booking);
			
			// output id
			NamedNodeMap attr = booking.getAttributes();
            System.out.println("Debug id: " + attr.getNamedItem("id"));
			
			/*
						
				
			NodeList list = theBookingWriting.getElementsByTagName("Booking");  //getChildNodes();
			
			Node node = list.item(bookingWritingID);
			
			*/
			
//			Element eElement = (Element) node;

			
			/**/
				
			System.out.println("Start your luxurious booking...");
			System.out.println("*******************************");
				
			System.out.print("Please enter your first name:  ");
			bookingFirstName = bookingOptions.nextLine();
			booking.getElementsByTagName("FirstName").item(0).setTextContent(bookingFirstName);
			
			System.out.print("Please enter your last name:  ");
			bookingLastName = bookingOptions.nextLine();
			booking.getElementsByTagName("LastName").item(0).setTextContent(bookingLastName);
		
			System.out.print("Please enter your preferred booking start date:  ");
			start = bookingOptions.nextInt();
			booking.getElementsByTagName("startDate").item(0).setTextContent(String.valueOf(start));
			
			System.out.print("Please enter your preferred booking end date:  ");
			end = bookingOptions.nextInt();
			booking.getElementsByTagName("endDate").item(0).setTextContent(String.valueOf(end));

			
			// nextInt causes nextLine not to work, so consume a newline first and then ask the input
			bookingOptions.nextLine();
			System.out.print("Please enter 'Yes' or 'No' for your catering preference:  ");
			catering = bookingOptions.nextLine();
			booking.getElementsByTagName("Catering").item(0).setTextContent(catering);
			
			/*
			exit = bookingOptions.nextLine();
			*/
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
//			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "0");
			DOMSource source = new DOMSource(theBookingWriting);
			StreamResult result = new StreamResult(new File(myXMLWriteFilepath));			
			transformer.transform(source, result);
		}		
		catch(TransformerException tfe)
		{
			tfe.printStackTrace();
		} catch(Exception e) {
		    e.printStackTrace();
		}
			
	}//end method
	
}//end class

