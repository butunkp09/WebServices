package com.webservices.methods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Webservices {
	public static Response getUserDetails( String uRL, String Req) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response reponse=requestSpecification.get(uRL);
		return reponse;
		}
}
