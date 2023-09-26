package com.amit.webservices;

import jakarta.xml.ws.Endpoint;

public class WebServicePublisher {

	public static void main(String[] args) {

		try {
			Endpoint.publish("http://localhost:8082/SoapWebservices/books", new MyWebserviceImpl());

			System.out.println("Published method is invoked..");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
