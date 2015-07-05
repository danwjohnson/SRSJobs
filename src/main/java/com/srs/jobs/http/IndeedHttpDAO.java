package com.srs.jobs.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class IndeedHttpDAO {

	public String getIndeedData(String urlString) {
		
		String inputLine;
		String xmlLine = new String();

		try {
			
			URL url = new URL(urlString);
			
			URLConnection conn = url.openConnection();
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream()));
			
			while((inputLine = in.readLine()) != null) {
				
				xmlLine+=inputLine;
				xmlLine+="\n";
				
			}
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		
		}
		
		return xmlLine;
		
	} // end getIndeedData()
	
	
} // end IndeedHTTPDAO
