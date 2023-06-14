package demo.pvdemo09queryingmodifyingentities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecipeService {
    @Autowired
    private RecipeRepository repository;

    public long getRecipeCount() {
        return repository.getRecipeCount();
    }

    public Recipe getRecipe(long recipeId) {
        return repository.getRecipe(recipeId);
    }

    public List<Recipe> getRecipes() {
        return repository.getRecipes();
    }

    public void insertRecipe(Recipe recipe) {
        repository.insertRecipe(recipe);
    }

    public void updateRecipe(int i, String recipe) {
        repository.updateRecipe(i, recipe);
    }

    public void deleteRecipe(int id) {
        repository.deleteRecipe(id);
    }

    public int updateSpiceLevel(String type, String spiceLevel){
        return repository.updateSpiceLevel(type, spiceLevel);
    }
}
