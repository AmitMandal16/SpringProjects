package com.amit.springAOP.pointcuts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Items {

	int itemId;
	String itemName;
	float price;
	int avlQty;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getAvlQty() {
		return avlQty;
	}

	public void setAvlQty(int avlQty) {
		this.avlQty = avlQty;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", avlQty=" + avlQty + "]";
	}
	
	public void printItemdetails() {
		
		SimpleDateFormat simple= new SimpleDateFormat("dd.MM.yyyy - HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Details for items are given below : \n" +getItemName()+ 
		" , "+ simple.format(date)+ " , " +toString());
		
	}

}
