package com.automation.learningjava;

public class Animel {
	
	private String animalName;
	private String animalColor;
	public Animel(String animalName, String animalColor) {
		super();
		this.animalName = animalName;
		this.animalColor = animalColor;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalColor() {
		return animalColor;
	}
	public void setAnimalColor(String animalColor) {
		this.animalColor = animalColor;
	}

	public static void main(String[] args) {
		
		Animel an1 = new Animel("Hourse", "Black");
		System.out.println(an1);
		Animel an2 = new Animel("Tiger", "Yellow and black");
		System.out.println(an2);
		
	}
	@Override
	public String toString() {
		return "Animel [animalName=" + animalName + ", animalColor=" + animalColor + "]";
	}
	
	
}
