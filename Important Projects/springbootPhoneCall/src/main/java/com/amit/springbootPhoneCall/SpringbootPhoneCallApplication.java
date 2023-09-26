package com.amit.springbootPhoneCall;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringbootPhoneCallApplication  implements ApplicationRunner{
	
	private  final static String ACCOUNT_SID="";
	private  final static String AUTH_ID="";
	private  final static String TWILIO_NUMBER="";
	
	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPhoneCallApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		Message.creator(new PhoneNumber("to"), new PhoneNumber(TWILIO_NUMBER),
				"Welcome to spring boot!!..").create();
		
		System.out.println("Sending Messages...");
		
		Call.creator(new PhoneNumber("to"), new PhoneNumber(TWILIO_NUMBER), 
				new URI("http://demo.twilio.com/docs/voice.xml")).create();
		
		System.out.println("Calling...");
		
	}

}
