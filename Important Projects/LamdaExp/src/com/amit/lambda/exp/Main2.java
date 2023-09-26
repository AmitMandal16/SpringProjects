package com.amit.lambda.exp;

public class Main2 {
	
	public static void playing(String pname, String gname, int hrs, Games game) {
		
		System.out.println(game.play(pname, gname, hrs));
	}

	public static void main(String[] args) {
		
		playing("Amit", "GTA V", 6, new Games() {
			
			@Override
			public String play(String pname, String gname, int hrs) {
				
				return "Playing full day";
			}
		});
		
		playing("Manoj", "Fort night", 6, (pname, gname, hrs)-> pname + " , " +gname+" , "+hrs);
		
	}
}
