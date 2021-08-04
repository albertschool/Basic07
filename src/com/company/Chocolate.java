//Rachel Perlman && Menny Abudy
package com.company;

public class Chocolate {
	private String manufacturer;
	private int cubes;
	private int calories;
	private double price;
	
	public Chocolate(String newManufacturer,int newCubes,int newCalories,double newPrice) {
		this.manufacturer = newManufacturer;
		this.cubes = newCubes;
		this.calories = newCalories;
		this.price = newPrice;
	}
	public Chocolate(Chocolate other) {
		this.manufacturer = other.manufacturer;
		this.cubes = other.cubes;
		this.calories = other.calories;
		this.price = other.price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getCubes() {
		return cubes;
	}
	public void setCubes(int cubes) {
		this.cubes = cubes;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Chocolate [manufacturer=" + manufacturer + ", cubes=" + cubes + ", calories=" + calories + ", price="
				+ price + "]";
	}
}
