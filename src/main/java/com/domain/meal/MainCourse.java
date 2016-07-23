package com.domain.meal;

import java.awt.List;
import java.util.Map;

import com.interfaces.Meal;

public class MainCourse implements Meal {

	private final String name;
	private final String description;
	private final String recipe;
	private final Map<String, String> ingredients;
	private final double price;
	
	public MainCourse(String name, String description, String recipe, Map<String, String> ingredients, double price) {
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
		this.recipe = recipe;
		this.price = price;
		
	}
	
	@Override
	public List getIngredients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAllergen(String allergen) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllergens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
