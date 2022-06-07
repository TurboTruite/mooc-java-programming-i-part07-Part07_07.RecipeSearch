import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public void printList() {
        System.out.println("\nRecipes: ");

        for (Recipe recipe: recipeList) {
            System.out.println(recipe);
        }


    }


    
}
