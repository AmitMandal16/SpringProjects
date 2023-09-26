package com.question1;

public class Delivery {

	long over;
	long ball;
	long runs;
	String batsman;
	String bowler;
	String nonStriker;
	
	
	
	public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}



	public void displayDeliveryDetails() {
		System.out.println("\nDelivery Details : \nOver : " +over+
				"\nBall : " +ball+ "\nRuns : " +runs+ "\nBatsman : " +batsman+ "\nBowler : " +bowler+
				"\nNonStriker : " +nonStriker);
	}

}
