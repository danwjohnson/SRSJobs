package com.srs.jobs.main;

import com.srs.jobs.domain.JobsProcessor;

public class JobsMain {

	public static void main(String args[]) throws Exception {
		
		String runUrl = 
				"http://api.indeed.com/ads/apisearch?publisher=4639223378892690&q=java&l=austin%2C+tx&sort=&radius=&st=&jt=&start=&limit=&fromage=&filter=&latlong=1&co=us&chnl=&userip=1.2.3.4&useragent=Mozilla/%2F4.0%28Firefox%29&v=2";
		
		JobsProcessor jobProcessor = new JobsProcessor();
		jobProcessor.processJobs(runUrl);
		
	} // end main
	
} // end JobsMain
