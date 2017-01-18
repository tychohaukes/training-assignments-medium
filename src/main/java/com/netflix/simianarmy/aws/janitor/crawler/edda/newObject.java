package com.netflix.simianarmy.aws.janitor.crawler.edda;

import org.codehaus.jackson.JsonNode;

public class newObject {
	
	String region;
	JsonNode jsonNode;
	
	public newObject (String region, JsonNode jsonNode){
		this.jsonNode = jsonNode;
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public JsonNode getJsonNode() {
		return jsonNode;
	}

	public void setJsonNode(JsonNode jsonNode) {
		this.jsonNode = jsonNode;
	}
	
	
}
