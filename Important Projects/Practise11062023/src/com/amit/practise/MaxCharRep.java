package com.amit.practise;

public class MaxCharRep {

	public static void main(String[] args) {
		
		
		int arr[] = new int[127];
		
		String st= "amitmandal";
		
		for(int i=0; i<st.length(); i++) {
			
			arr[st.charAt(i)]= arr[st.charAt(i)]+1;
			
		}
		
		int max=-1;
		
		char c= ' ';
		
		for(int i=0; i<st.length(); i++) {
			
			if(max< arr[st.charAt(i)]) {
				
				max= arr[st.charAt(i)];
				c = st.charAt(i);			
			}
			
		}
		
		System.out.println("Max character in the String --> " +c+ " and no of rep --> " +max);
		
	}
	
}
