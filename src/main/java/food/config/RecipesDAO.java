package food.config;

import java.util.ArrayList;
import java.util.List;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import food.models.Recipe;

@Service
public class RecipesDAO {

	@Autowired
	private MongoCollection recipes;
	
	public List<Recipe> findAllRecipes() {
		MongoCursor<Recipe> cur = recipes.find().as(Recipe.class);
		
		List<Recipe> results = new ArrayList<Recipe>(); 
		for (Recipe recipe : cur) {
			results.add(recipe);
		}
		return results;
	}
	
	public List<Recipe> findFilteredRecipees(List<String> filteredOut) {
		
		String query = "{'ingredients.name':{'$ne':'"+filteredOut.get(0)+"'}}"; 
		
		
		System.out.println(query);

		MongoCursor<Recipe> cur = recipes.find(query).as(Recipe.class);
		
		List<Recipe> results = new ArrayList<Recipe>(); 
		for (Recipe recipe : cur) {
			results.add(recipe);
		}
		return results;
	}
	
	
	public void save(Recipe recipe) {
		recipes.save(recipe);
	}
	
	public void removeAll() {
		recipes.remove();
	}
}
