package com.srs.jobs.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadJobsXMLTest {

	public static void main(String args[]) {
		
		try {
			
			File inXMLFile = new File("jobout.xml");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(inXMLFile);
			
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("result");
			
			for(int i = 0; i < nList.getLength(); i++) {
				
				Node nNode = nList.item(i);
				
				System.out.println("\nCurrent Element: " + nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					
					System.out.println("jobtitle : " + eElement.getElementsByTagName("jobtitle").item(0).getTextContent());
					System.out.println("company : " + eElement.getElementsByTagName("company").item(0).getTextContent());
					System.out.println("city : " + eElement.getElementsByTagName("city").item(0).getTextContent());
					System.out.println("state : " + eElement.getElementsByTagName("state").item(0).getTextContent());



					
				}
				
			}
			
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
		
	}
	
}
