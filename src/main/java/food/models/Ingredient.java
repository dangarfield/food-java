package food.models;

public class Ingredient {

	private String name;
	private IngredientMeasure measure;
	private long amount;

	public Ingredient() {
		super();
	}

	@Override
	public String toString() {
		return amount + " " + measure + " of " + name;
	}
	public Ingredient(String name, IngredientMeasure measure, long amount) {
		super();
		this.name = name;
		this.measure = measure;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IngredientMeasure getMeasure() {
		return measure;
	}

	public void setMeasure(IngredientMeasure measure) {
		this.measure = measure;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}
