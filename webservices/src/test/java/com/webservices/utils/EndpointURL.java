package com.webservices.utils;

public enum EndpointURL {
	GET_USER_PER_PAGE("/api/users?page=2");
	
	String resourcePath;
	EndpointURL(String resourcePath){
		this.resourcePath=resourcePath;
	}
	public String getResourcePath() {
		return this.resourcePath;
	}
	public String getResourcePath(String data) { 
		return this.resourcePath+data;
	}
	//public static void main (String []args) {
		//System.out.println(URL.fixURL+EndpointURL.GET_USER_PER_PAGE.getResourcePath());
		//System.out.println(resourcePath);
	//}
}
