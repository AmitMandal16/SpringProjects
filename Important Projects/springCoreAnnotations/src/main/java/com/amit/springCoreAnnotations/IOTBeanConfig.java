package com.amit.springCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.amit.springCoreAnnotations")

public class IOTBeanConfig {
	
	@Bean(name="IOTDevice", initMethod = "initbean" , destroyMethod = "destroybean")
	public IOTDevice IOTDevice() {
		
		IOTDevice iot = new IOTDevice();
		iot.setDevice("Air Conditioner");
		iot.setDescription("Temprature sensor");
		
		return iot;
	}
	

}
