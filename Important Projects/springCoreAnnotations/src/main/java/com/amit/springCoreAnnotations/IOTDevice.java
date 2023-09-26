package com.amit.springCoreAnnotations;

//@Component
public class IOTDevice {

	private String device;
	private String description ;
	
	IOTDevice(){
		System.out.println("Invoked the default construtor");
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void initbean() {
		System.out.println("Init method is called..");
	}
	
	public void destroybean() {
		System.out.println("destroybean method is called..");
	}
	
	@Override
	public String toString() {
		return "IOTDevice [device=" + device + ", description=" + description + "]";
	}

}
