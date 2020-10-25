package com.automation.learningjava;

public class Product {
	
	private String fruitName;
	private String fruitPrice;
	public Product(String fruitName, String fruitPrice) {
		super();
		this.fruitName = fruitName;
		this.fruitPrice = fruitPrice;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(String fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	
	public static void main(String[] args) {
		Product prod1 = new Product("Apple", "$10");
		System.out.println(prod1);
		Product prod2 = new Product("Orange", "$5");
		System.out.println(prod2);
	}
	@Override
	public String toString() {
		return "Product [fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + "]";
	}
	
	
}
