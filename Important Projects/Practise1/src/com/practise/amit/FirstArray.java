package com.practise.amit;

import java.util.Arrays;

public class FirstArray {
	
	public static void main(String[] args) {
	
	//String comp[]= new String[5] {"Google","Amazon","Microsoft","Apple","Oracle"};
	
	String comp[]= new String[5];
	
	comp[0]="Google";
    comp[1]="Amazon";
    comp[2]= "Microsoft";
    comp[3]= "Apple";
    comp[4]="Oracle";
    //comp[5]="IBM";
    						
	System.out.println(comp.length);
	System.out.println("abc" +comp);
	
	System.out.println("By using utility "+Arrays.toString(comp));
	
	
	for(int i=0; i< comp.length ; i++) {
		System.out.println(i+","+comp[i].toString());
	}
	}
}
