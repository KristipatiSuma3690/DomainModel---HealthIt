package com.healthit.model;

public class Fruits {
	private String fruitName;
	private Integer fruitId;
	private String fruitType;   //seed,seedless,medium,small
	private String category;  //hybrid,local
	private String region;
	private double price;
	public Fruits() {
		super();
	}
	public Fruits(String fruitName,int fruitId, String fruitType, String category, String region, double price) {
		super();
		this.fruitName = fruitName;
		this.fruitId = fruitId;
		this.fruitType = fruitType;
		this.category = category;
		this.region = region;
		this.price = price;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public Integer getFruitId() {
		return fruitId;
	}
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitType() {
		return fruitType;
	}
	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Health [fruitName=" + fruitName + ", fruitId=" + fruitId + ", fruitType=" + fruitType + ", category="
				+ category + ", region=" + region + ", price=" + price + "]";
	}
	
	
	
	

}
