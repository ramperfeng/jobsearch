package com.api.json;

import org.json.JSONObject;

public class JsonParsing {
	
	
	public static void main(String[] args) {
		
		
		
		
		String actual ="{ \"name\" : \"ram\", "
				+ "\"age\" : \"30\", "
				+ "\"address\" : \"chennai\" }";
		String act="{ \"assessmentDecisionIndicator\" :\"true\","
				+ "\"assessmentCreationDate\" :\"2019-01-18T09:15:50.461Z\"}";
				 
		
		JSONObject jsonObject = new JSONObject(act);
		String  cc = jsonObject.getString("assessmentDecisionIndicator");
		System.out.println(cc);
	}
}
