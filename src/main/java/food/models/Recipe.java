package food.models;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.jongo.marshall.jackson.oid.MongoId;

public class Recipe {

	@MongoId
	private ObjectId _id;

	private String name;

	private List<Ingredient> ingredients;
	private int prepTime;
	private int cookTime;
	private int servingsMin;
	private int servingsMax;

	private List<Step> steps;

	private List<Preference> preferences;
	private List<Occasion> occasion;

	// TODO - ratings and comments

	private String source;
	private String sourceURL;

	private String submittedBy;
	private boolean approved;
	private Date creationDate;
	private String imageURL;

	public Recipe() {
		super();
	}

	@Override
	public String toString() {
		return name + " - " + steps.size() + " steps - Ingredients: " + ingredients.toString();
	}
	
	public Recipe(ObjectId _id, String name, List<Ingredient> ingredients, int prepTime, int cookTime, int servingsMin,
			int servingsMax, List<Step> steps, List<Preference> preferences, List<Occasion> occasion, String source,
			String sourceURL, String submittedBy, boolean approved, Date creationDate, String imageURL) {
		super();
		this._id = _id;
		this.name = name;
		this.ingredients = ingredients;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
		this.servingsMin = servingsMin;
		this.servingsMax = servingsMax;
		this.steps = steps;
		this.preferences = preferences;
		this.occasion = occasion;
		this.source = source;
		this.sourceURL = sourceURL;
		this.submittedBy = submittedBy;
		this.approved = approved;
		this.creationDate = creationDate;
		this.imageURL = imageURL;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public int getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public int getServingsMin() {
		return servingsMin;
	}

	public void setServingsMin(int servingsMin) {
		this.servingsMin = servingsMin;
	}

	public int getServingsMax() {
		return servingsMax;
	}

	public void setServingsMax(int servingsMax) {
		this.servingsMax = servingsMax;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public List<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	public List<Occasion> getOccasion() {
		return occasion;
	}

	public void setOccasion(List<Occasion> occasion) {
		this.occasion = occasion;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceURL() {
		return sourceURL;
	}

	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}

	public String getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

}

/*
 * 
 * { "ingredients": [ {"name":"sugar","measure": "grams","amount":"100"}
 * {"name":"apple","measure": "unit","amount":"1"} ] }
 * 
 * 
 * 
 */
