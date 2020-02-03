package com.skilldistillery.food;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// TODO STORY 1:
		// user input name, foodtype and rating for up to 5 trucks
		// each set of input, new FoodTruck object is created
		// its fields set to the user's input and add to array
		// truck id automatically assigned in FoodTruck ctor from static field

		// TODO STORY 2: user inputs quit for name, input ends and program continues

		// TODO STORY 3:
		// AFTER INPUT COMPLETE, USER SEES MENU TO CHOOSE
		// *LIST ALL EXISTING FOOD TRUCKS
		// *SEE AVG RATING OF FOOD TRUCKS
		// * DISPLAY HIGHEST RATED FOOD TRUCK
		// *QUIT PROGRAM

		// TODO STORY 4:
		// AFTER CHOOSING MENU ITEM, USER SEES MENU AGAIN
		// CAN CHOOSE ANOTHER ITEM UNTIL QUIT

		FoodTruck[] ftArray = new FoodTruck[5];
		int howManyFoodTrucks = 0;

		for (int i = 0; i < ftArray.length; i++) {
			FoodTruck userInputTruck = null;
			System.out.print("Enter food truck name: ");
			String fts = kb.next();
			if (fts.equalsIgnoreCase("QUIT")) {
				break;
			}
			userInputTruck = new FoodTruck(i);
			userInputTruck.setName(fts);
			System.out.print("Enter food type: ");
			String food = kb.next();
			userInputTruck.setFoodType(food);
			System.out.print("Enter a rating from 0.0 - 5.0: ");
			double ratings = kb.nextDouble();
			userInputTruck.setRating(ratings);
			System.out.println();

			ftArray[i] = userInputTruck;
			howManyFoodTrucks++;
		}

		while (true) {
			System.out.println("MENU (CHOOSE 1-4): ");
			System.out.println("1. LIST ALL EXISTING FOOD TRUCKS ");
			System.out.println("2. SEE AVERAGE RATING OF FOOD TRUCKS ");
			System.out.println("3. DISPLAY HIGHEST RATED FOOD TRUCK ");
			System.out.println("4. QUIT PROGRAM ");

			int menu = kb.nextInt();
			if (menu == 1) {
				for (int i = 0; i < howManyFoodTrucks; i++) {
					System.out.println(ftArray[i].getName());
				}
			} else if (menu == 2) {
				double rating = 0.0;
				for (int i = 0; i < howManyFoodTrucks; i++) {
					rating = (rating + ftArray[i].getRating());
					System.out.println(rating);
				}
				double average = rating / howManyFoodTrucks;
				System.out.println("Average rating of food trucks: " + average);
			} else if (menu == 3) {
				double highestRated = 0.0;
				FoodTruck highestRatedFoodTruck = null;
				for (int i = 0; i < howManyFoodTrucks; i++) {
					if (ftArray[i].getRating() > highestRated) {
						// System.out.println(ftArray[i].getRating());
						String highest = (ftArray[i].getRating() + " " + ftArray[i].getName());
						highestRated = ftArray[i].getRating();
						highestRatedFoodTruck = ftArray[i];
					}
				}
				System.out.println("Highest rated: " + highestRated);
				System.out.println("Best rated food truck: " + highestRatedFoodTruck.getName());
			} else if (menu == 4) {
				break;
			} else {
				System.out.println("Please input only a number 1 through 4.");
			}
		}
		kb.close();
	}
}
