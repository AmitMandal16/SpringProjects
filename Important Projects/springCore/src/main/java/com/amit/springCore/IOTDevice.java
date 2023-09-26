package com.amit.springCore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class IOTDevice {

	private String device;
	private String description ;
	
	

	/**
	 * @param device
	 * @param description
	 */
	public IOTDevice(String device, String description) {
		this.device = device;
		this.description = description;
	}

	IOTDevice() {
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

	@PostConstruct
	public void initbean() {
		
		System.out.println("Init method called..");

	}

	@PreDestroy
	public void destroybean() {
		
		System.out.println("Destroy method called..");

	}

	@Override
	public String toString() {
		return "IOTDevice [device=" + device + ", description=" + description + "]";
	}

}
