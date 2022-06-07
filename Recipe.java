public class Recipe {

    private String name;
    private int cookingTime;
    private String ingredientList;


    public Recipe(String name, int cookingTime, String ingredientList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public String getIngredientList() {
        return this.ingredientList;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime; 
    }
    
}
