//**********************************************//
//* Author: 1625601                            *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: XMLreader to read XML files   *//
//*                                            *//
//* Date:   09/08/19                           *//
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

public abstract class XML_Reader
{
	/**/
	
	private static File myXMLFile;
	private static DocumentBuilderFactory dbFactory;
	private static DocumentBuilder mydocBuilder;
	private static Document mydoc;
	
	// super class constructor
	public XML_Reader()
	{
		System.out.println("Reading a file");
	}
	
	public static Document serverFileConnection(String afilename)
	{
		try 
		{
			//instantiate your objects
			myXMLFile = new File(afilename); //"/Users/mkyong/staff.xml");
			dbFactory = DocumentBuilderFactory.newInstance();
			mydocBuilder = dbFactory.newDocumentBuilder();
			mydoc = mydocBuilder.parse(myXMLFile);
					
			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			mydoc.getDocumentElement().normalize();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return mydoc;
    }
	
	// abstract method
	// so there is no method body
	public abstract void textDisplay(Document aDoc);
	
}//end class
