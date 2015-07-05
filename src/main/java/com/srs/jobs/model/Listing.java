package com.srs.jobs.model;

public class Listing {

	public String jobKey;
	public String jobTitle;
	public String company;
	public String city;
	public String state;
	public String country;
	public String formattedLocation;
	public String source;
	public String dateListed;
	public String snippet;
	public String url;
	public String onMouseDown;
	public String latitude;
	public String longitude;
	public boolean sponsored;
	public boolean expired;
	public boolean indeedApply;
	public String formattedLocationFull;
	public String formattedRelativeTime;
	
	
	
	
	// Getters and Setters
	public String getJobKey() {
		
		return jobKey;
	
	}
	
	public void setJobKey(String jobKey) {
		
		this.jobKey = jobKey;
	
	}
	
	public String getJobTitle() {
	
		return jobTitle;
	
	}
	
	public void setJobTitle(String jobTitle) {
	
		this.jobTitle = jobTitle;
	
	}
	
	public String getCompany() {
	
		return company;
	
	}
	
	public void setCompany(String company) {
	
		this.company = company;
	
	}
	
	public String getCity() {
	
		return city;
	
	}
	
	public void setCity(String city) {
	
		this.city = city;
	
	}
	
	public String getState() {
		
		return state;
	
	}
	
	public void setState(String state) {
	
		this.state = state;
	
	}
	
	public String getCountry() {
		
		return country;
	
	}
	
	public void setCountry(String country) {
	
		this.country = country;
	
	}
	
	public String getFormattedLocation() {
		
		return formattedLocation;
	
	}
	
	public void setFormattedLocation(String formattedLocation) {
	
		this.formattedLocation = formattedLocation;
	
	}
	
	public String getSource() {
	
		return source;
	
	}
	
	public void setSource(String source) {
	
		this.source = source;
	
	}
	
	public String getDateListed() {
	
		return dateListed;
	
	}
	
	public void setDateListed(String dateListed) {
	
		this.dateListed = dateListed;
	
	}
	
	public String getSnippet() {
	
		return snippet;
	
	}
	
	public void setSnippet(String snippet) {
	
		this.snippet = snippet;
	
	}
	
	public String getUrl() {
	
		return url;
	
	}
	
	public void setUrl(String url) {
	
		this.url = url;
	
	}
	
	public String getOnMouseDown() {
	
		return onMouseDown;
	
	}
	
	public void setOnMouseDown(String onMouseDown) {
	
		this.onMouseDown = onMouseDown;
	
	}
	
	public String getLatitude() {
	
		return latitude;
	
	}
	
	public void setLatitude(String latitude) {
	
		this.latitude = latitude;
	
	}
	
	public String getLongitude() {
	
		return longitude;
	
	}
	
	public void setLongitude(String longitude) {
	
		this.longitude = longitude;
	
	}
	
	public boolean isSponsored() {
	
		return sponsored;
	
	}
	
	public void setSponsored(boolean sponsored) {
	
		this.sponsored = sponsored;
	
	}
	
	public boolean isExpired() {
	
		return expired;
	
	}
	
	public void setExpired(boolean expired) {
	
		this.expired = expired;
	
	}
	
	public boolean isIndeedApply() {
	
		return indeedApply;
	
	}
	
	public void setIndeedApply(boolean indeedApply) {
	
		this.indeedApply = indeedApply;
	
	}
	
	public String getFormattedLocationFull() {
	
		return formattedLocationFull;
	
	}
	
	public void setFormattedLocationFull(String formattedLocationFull) {
	
		this.formattedLocationFull = formattedLocationFull;
	
	}
	
	public String getFormattedRelativeTime() {
	
		return formattedRelativeTime;
	
	}
	
	public void setFormattedRelativeTime(String formattedRelativeTime) {
	
		this.formattedRelativeTime = formattedRelativeTime;
	
	}
	
	
	
	@Override
	public String toString() {
		return "Listing [jobKey=" + jobKey + ", jobTitle=" + jobTitle
				+ ", company=" + company + ", city=" + city + ", state="
				+ state + ", country=" + country + ", formattedLocation="
				+ formattedLocation + ", source=" + source + ", dateListed="
				+ dateListed + ", snippet=" + snippet + ", url=" + url
				+ ", onMouseDown=" + onMouseDown + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", sponsored=" + sponsored
				+ ", expired=" + expired + ", indeedApply=" + indeedApply
				+ ", formattedLocationFull=" + formattedLocationFull
				+ ", formattedRelativeTime=" + formattedRelativeTime + "]";
	}
	
}
