//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: JetPlanesReader ext XMLreader *//
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

public class Xml_JetPlanesReader extends XML_Reader
{
	/**/
	
	private static String theFilename = "Assignment2/src/assignresit/Jetplanes.xml";
	private static Document aDocument;
	// constructor  C:\Users\jedigunz\Documents\eclipse\workspace\Assignment2-mod\Assignment2\src\assignresit
	public Xml_JetPlanesReader()
	{
		System.out.println("Show me the planes...!");
		
		aDocument = serverFileConnection(theFilename);
		setDocument(aDocument);
	}
	
	public static Document getDocument()
	{
		return aDocument; 
	}
	
	public static void setDocument(Document myDoc)
	{
		aDocument = myDoc;
	}
		
	
	// implementing the inherited abstract method
	// so there is a method body this time
	public void textDisplay(Document theDoc)
	{		
	    theDoc = getDocument();
		System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
		NodeList nList = theDoc.getElementsByTagName("Jet");
				
		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;

				System.out.println("Jet ID : " + eElement.getAttribute("id"));
				System.out.println("Jet Name : " + eElement.getElementsByTagName("JetName").item(0).getTextContent());
				System.out.println("Location : " + eElement.getElementsByTagName("Location").item(0).getTextContent());
				System.out.println("Price Per Day : " + eElement.getElementsByTagName("PricePerDay").item(0).getTextContent());
				System.out.println("Start Date : " + eElement.getElementsByTagName("startDate").item(0).getTextContent());
				System.out.println("End Date : " + eElement.getElementsByTagName("endDate").item(0).getTextContent());
				System.out.println("Max Number of Guests : " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());
				System.out.println("Catering Available : " + eElement.getElementsByTagName("Catering").item(0).getTextContent());	

			}
		}//end for loop
	}// end method 
			
}//end class

		

		