//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: XML Confirmation Reader       *//
//*                                            *//
//* Date: 09/08/19                             *//
//*                                            *//
//**********************************************//
package assignresit;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Xml_ConfirmationReader extends XML_Reader
{
	private static String theFilename = "Assignment2/src/assignresit/BookingConfirmations.xml";
	private static Document aBookingConfirmationDocument;
	// constructor
	public Xml_ConfirmationReader()
	{
		System.out.println("Show me the booking confirmations...!");
		
		aBookingConfirmationDocument = serverFileConnection(theFilename);
		setDocument(aBookingConfirmationDocument);
	}
	
	public static Document getDocument()
	{
		return aBookingConfirmationDocument; 
	}
	
	public static void setDocument(Document myDoc)
	{
		aBookingConfirmationDocument = myDoc;
	}
		
	
	// implementing the inherited abstract method
	// so there is a method body this time
	public void textDisplay(Document theDoc)
	{		
	    theDoc = getDocument();
		System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
		NodeList nList = theDoc.getElementsByTagName("Confirmation");
				
		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;

				System.out.println("Booking Confirmation ID : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
				System.out.println("Start Date : " + eElement.getElementsByTagName("startDate").item(0).getTextContent());
				System.out.println("End Date : " + eElement.getElementsByTagName("endDate").item(0).getTextContent());
				System.out.println("Confirmed Jet : " + eElement.getElementsByTagName("ConfirmedPlane").item(0).getTextContent());
				System.out.println("Max Number of Guests : " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());
				System.out.println("Number of Rooms : " + eElement.getElementsByTagName("CabinRooms").item(0).getTextContent());
				System.out.println("Is Bedroom Available : " + eElement.getElementsByTagName("Bedroom").item(0).getTextContent());
				System.out.println("Number of Bathrooms : " + eElement.getElementsByTagName("Bathrooms").item(0).getTextContent());	
				System.out.println("Is Catering Included : " + eElement.getElementsByTagName("Catering").item(0).getTextContent());	
				System.out.println("Total Price (Jet Plane Costs plus Catering Costs : " + eElement.getElementsByTagName("TotPrice").item(0).getTextContent());	

			}
		}//end for loop 
	}// end method 

		
}
