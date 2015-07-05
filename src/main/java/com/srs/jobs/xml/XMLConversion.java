package com.srs.jobs.xml;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.srs.jobs.model.Listing;

public class XMLConversion {

	public void stringToDOM(String xmlSource) 
		throws SAXException, ParserConfigurationException, IOException, TransformerException{
		
		// Parse the given input
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(xmlSource)));
		
		// Write the parsed document to an xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		
		StreamResult result = new StreamResult(new File("jobout.xml"));
		transformer.transform(source, result);
		
	}
	
	
	public Document getXMLDocument(String xmlSource) 
			throws SAXException, ParserConfigurationException, IOException, TransformerException{
			
			// Parse the given input
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(xmlSource)));
			
			// Write the parsed document to an xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			
			StreamResult result = new StreamResult(new File("jobout.xml"));
			transformer.transform(source, result);
			
			return doc;
			
		}
	
	
	/**
	 * Build a Listing object from an XML document
	 * @param Document doc
	 * @return Listing object
	 */
	public ArrayList<Listing> buildListingFromXML(Document doc) {
		
		Listing listing = new Listing();
		ArrayList<Listing> arrayOfListings = new ArrayList<>();
		
		try {
			
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("result");
			
			for(int i = 0; i < nList.getLength(); i++) {
				
				Node nNode = nList.item(i);
				
				System.out.println("\nCurrent Element: " + nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					
					System.out.println("jobtitle : " + eElement.getElementsByTagName("jobtitle").item(0).getTextContent());
					listing.setJobTitle(eElement.getElementsByTagName("jobtitle").item(0).getTextContent());
					System.out.println("company : " + eElement.getElementsByTagName("company").item(0).getTextContent());
					listing.setCompany(eElement.getElementsByTagName("jobtitle").item(0).getTextContent());
					System.out.println("city : " + eElement.getElementsByTagName("city").item(0).getTextContent());
					listing.setCity(eElement.getElementsByTagName("city").item(0).getTextContent());
					System.out.println("state : " + eElement.getElementsByTagName("state").item(0).getTextContent());
					listing.setState(eElement.getElementsByTagName("state").item(0).getTextContent());
					
					arrayOfListings.add(listing);
					listing = new Listing();
					
				}
				
				
			}
			
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
		
		return arrayOfListings;
		
	} // end buildListing()
	
}
