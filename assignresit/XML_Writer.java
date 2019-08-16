//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description:XML Writer to write to XML file*//
//*                                            *//
//* Date:    09/08/19                          *//
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
import java.io.IOException;

import org.w3c.dom.NamedNodeMap;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XML_Writer
{
	/**/
	
	private static File myXMLWriteFile;
	private static DocumentBuilderFactory dbWriterFactory;
	private static DocumentBuilder mydocWriteBuilder;
	private static Document myWritedoc;
	private static Element rootElement;
	private static Node rootNode;
	private static Node booking;
	private static String myXMLWriteFilepath = "Assignment2/src/assignresit/Bookings.xml";
	
	// super class constructor
	public XML_Writer()
	{
		System.out.println("Writing to a file");
	}
	
	public static Document serverFileConnection(String afilename)
	{
		try 
		{
			//instantiate your objects			
			//myXMLWriteFile = new File(afilename); //"/Users/mkyong/staff.xml");
			myXMLWriteFilepath = "Assignment2/src/assignresit/Bookings.xml";
			
			dbWriterFactory = DocumentBuilderFactory.newInstance();
			mydocWriteBuilder = dbWriterFactory.newDocumentBuilder();
			myWritedoc = mydocWriteBuilder.parse(myXMLWriteFilepath);
			//newDocument();
			
			
			//rootElement = myWritedoc.createElement("AirlineBookings");
			//myWritedoc.appendChild(rootElement);	

			//// booking elements
			////booking = myWritedoc.createElement("Booking");
			////rootElement.appendChild(booking);

			//rootNode = myWritedoc.getFirstChild();					
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		return myWritedoc;
    }

}//end class