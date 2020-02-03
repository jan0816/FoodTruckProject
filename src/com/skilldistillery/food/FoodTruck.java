package com.skilldistillery.food;

public class FoodTruck {
	private int numericId = 0;
	private String name = "";
	private String foodType = "";
	private double rating = 0;

	public FoodTruck(int numberID) {
		this.numericId = numberID;
	}

	public int getNumId() {
		return this.numericId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return this.foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;

	}

	public double getRating() {
		return this.rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
