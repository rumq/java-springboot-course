package demo.pv10springdatarepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class RecipeService {
    @Autowired
    private RecipeRepository repository;

    public long getRecipeCount() {
//        return repository.getRecipeCount();
        return repository.count();
    }

    public Optional<Recipe> getRecipe(long recipeId) {
//        return repository.getRecipe(recipeId);

        return repository.findById(recipeId);
    }

    public List<Recipe> getRecipes() {
//        return repository.getRecipes();
        List<Recipe> recipes = new ArrayList<>();
        repository.findAll().forEach(recipes::add);
        return recipes;
    }

    public Recipe insertRecipe(Recipe recipe) {
//        repository.insertRecipe(recipe);
        return repository.save(recipe);
    }

    public void updateRecipe(Long id, String recipeName) {
//        repository.updateRecipe(i, recipe);
        Recipe r = repository.findById(id).orElseThrow();
        r.setName(recipeName);
        repository.save(r);
    }

    public void deleteRecipe(Long id) {
//        repository.deleteRecipe(id);
        repository.deleteById(id);

    }

    public int updateSpiceLevel(String type, String spiceLevel){
//        return repository.updateAllBySpiceLevelEqualsAndTypeEquals(type, spiceLevel);
       return repository.updateSpiceLevel(type, spiceLevel);
    }

}
