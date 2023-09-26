package com.amit.lambda.exp;

public class Home {

	private String area;
	private String type;
	private String sqft;
	private int price;

	public Home(String area, String type, String sqft, int price) {
		//super();
		this.area = area;
		this.type = type;
		this.sqft = sqft;
		this.price = price;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSqft() {
		return sqft;
	}

	public void setSqft(String sqft) {
		this.sqft = sqft;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Home [area=" + area + ", type=" + type + ", sqft=" + sqft + ", price=" + price + "]";
	}

}
