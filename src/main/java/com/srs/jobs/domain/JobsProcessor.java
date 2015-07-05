package com.srs.jobs.domain;

import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.Document;

import com.srs.jobs.http.IndeedHttpDAO;
import com.srs.jobs.model.Listing;
import com.srs.jobs.xml.XMLConversion;

public class JobsProcessor {

	public void processJobs(String urlString) throws Exception{
		
		String url = null;
		//Listing listing = new Listing();
		ArrayList<Listing> listings = new ArrayList<>();
		
		String jobXML = new String();
		url = urlString;

		IndeedHttpDAO indeedDao = new IndeedHttpDAO();
		jobXML = indeedDao.getIndeedData(url);
		
		System.out.println(jobXML);
		
		XMLConversion conversion = new XMLConversion();
		conversion.stringToDOM(jobXML);
		
		Document doc = conversion.getXMLDocument(jobXML);
		listings = conversion.buildListingFromXML(doc);
		
		
		// Iterate through the ArrayList of listings;
		System.out.println("\n\n\nIterate through the ArrayList of listings");
		Iterator<Listing> itr = listings.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
	}
	
}
