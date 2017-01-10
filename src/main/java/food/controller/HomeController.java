package food.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import food.config.RecipesDAO;
import food.models.Ingredient;
import food.models.IngredientMeasure;
import food.models.Occasion;
import food.models.Preference;
import food.models.Recipe;
import food.models.Step;

@Controller
public class HomeController {

	@Autowired
	private RecipesDAO recipesDAO;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Recipe> recipes = recipesDAO.findAllRecipes();
		model.addAttribute("recipes",recipes);
		return "home";
	}
	
	@RequestMapping("/filtered")
	public String filtgered(@RequestParam(name="filter") String filter, Model model) {
		System.out.println("Filter: " + filter);
		List<Recipe> recipes = recipesDAO.findFilteredRecipees(Collections.singletonList(filter));
		model.addAttribute("recipes",recipes);
		return "home";
	}
	
	@RequestMapping("/addTestData")
	@ResponseBody
	public String addTestData() {
		
		recipesDAO.removeAll();
		
		Recipe recipe1 = createTestRecipe("Chicken and chips", "sugar");
		recipesDAO.save(recipe1);
		Recipe recipe2 = createTestRecipe("Generic Meat Pie", "milk");
		recipesDAO.save(recipe2);
		
		return recipesDAO.findAllRecipes().toString();
	}
	
	
	private Recipe createTestRecipe(String name, String ingredientName) {
		Recipe recipe = new Recipe();
		
		recipe.setName(name);

		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient(ingredientName, IngredientMeasure.CUPS, 3)); 
		ingredients.add(new Ingredient("bread", IngredientMeasure.UNIT, 3));
		ingredients.add(new Ingredient("butter", IngredientMeasure.GRAMS, 100));
		recipe.setIngredients(ingredients);
		
		recipe.setPrepTime(10);
		recipe.setCookTime(50);
		recipe.setServingsMin(2);
		recipe.setServingsMax(3);

		ArrayList<Step> steps = new ArrayList<Step>();
		steps.add(new Step(1, "Whack all in a bowl", null)); 
		steps.add(new Step(2, "Mix it around a bit", null));
		steps.add(new Step(3, "Cook in the over", null));
		recipe.setSteps(steps);
		
		recipe.setPreferences(Collections.singletonList(Preference.LOW_CARB));
		recipe.setOccasion(Collections.singletonList(Occasion.BREAKFAST));
		
		recipe.setSource("BBC Good Food");
		recipe.setSourceURL("http://bbc.co.uk/some-recipe");
		
		recipe.setSubmittedBy("Dan");
		recipe.setApproved(true);
		recipe.setCreationDate(new Date());
		recipe.setImageURL(null);
		
		
		return recipe;
	}
}
