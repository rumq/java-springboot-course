package demo.pvdemo12fullrestservices;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class RecipeRepository
{
    long nextId = 1;
    private Map<Long, Recipe> catalog = new HashMap<>();

    {
        insert(new Recipe(1L, "Chicken Tikka Masala", 6));
        insert( new Recipe(2L, "Chicken Roganghosh", 7));
        insert( new Recipe(3L, "Chicken Dopyaja", 8));
        insert( new Recipe(4L, "Chicken Tandoori", 9));
    }

    public Collection<Recipe> getAll(){
        return catalog.values();
    }

    public  Recipe getById(long id) {
        return catalog.get(id);
    }

    public Recipe insert(Recipe recipe){
        recipe.setId(nextId++);
        catalog.put((recipe.getId()), recipe);
        return recipe;
    }

    public boolean update(Recipe recipe){
        if (!catalog.containsKey(recipe.getId())) {
            return false;
        } else {
            catalog.put(recipe.getId(), recipe);
            return true;
        }
    }

    public boolean delete(long id) {
        if(!catalog.containsKey(id)){
            return false;
        } else {
            catalog.remove(id);
            return true;
        }
    }
}
