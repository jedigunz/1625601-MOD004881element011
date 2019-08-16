//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: BookingsReader extends XMLRead*//
//*                                            *//
//* Date:  09/08/19                            *//
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

public class Xml_BookingReader extends XML_Reader
{
	private static String theFilename = "Assignment2/src/assignresit/Bookings.xml";
	private static Document aBookingDocument;
	// constructor
	public Xml_BookingReader()
	{
		System.out.println("Show me the bookings...!");
		
		aBookingDocument = serverFileConnection(theFilename);
		setDocument(aBookingDocument);
	}
	
	public static Document getDocument()
	{
		return aBookingDocument; 
	}
	
	public static void setDocument(Document myDoc)
	{
		aBookingDocument = myDoc;
	}
		
	
	// implementing the inherited abstract method
	// so there is a method body this time
	public void textDisplay(Document theDoc)
	{		
	    theDoc = getDocument();
		System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
		NodeList nList = theDoc.getElementsByTagName("Booking");
				
		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;

				System.out.println("Booking ID : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
				System.out.println("Start Date : " + eElement.getElementsByTagName("startDate").item(0).getTextContent());
				System.out.println("End Date : " + eElement.getElementsByTagName("endDate").item(0).getTextContent());
				System.out.println("Max Number of Guests : " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());				
				System.out.println("Do you need Catering : " + eElement.getElementsByTagName("Catering").item(0).getTextContent());			

			}
		}//end for loop 
	}// end method 

		
}
		

