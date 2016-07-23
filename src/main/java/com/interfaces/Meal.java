package com.interfaces;

import java.awt.List;

public interface Meal {

	public List getIngredients();
	
	public boolean containsAllergen(String allergen);
	
	public List getAllergens();
	
	public String getName();
	
	public String getDescription();
	
	public String getRecipe();
	
	public double getPrice();
}
