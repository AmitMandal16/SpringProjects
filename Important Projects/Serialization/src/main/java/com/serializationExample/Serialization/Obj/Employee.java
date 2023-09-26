package com.serializationExample.Serialization.Obj;

import org.json.simple.JSONAware;

public class Employee implements JSONAware {

	private int eid;
	private String name;
	private String techStack;
	
	public Employee(int eid, String name, String techStack) {
	
		this.eid = eid;
		this.name = name;
		this.techStack = techStack;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	@Override
	public String toJSONString() {
		
		return String.format( "{ \"eid\": %d, \"name\": \"%s\", \"techStac\": \"%s\"}", eid, name, techStack);
	}

	
	
}
