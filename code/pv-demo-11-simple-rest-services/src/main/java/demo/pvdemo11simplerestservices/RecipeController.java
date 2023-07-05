package demo.pvdemo11simplerestservices;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app")
@CrossOrigin
public class RecipeController
{

    private Map<Long, Recipe> recipeMap = new HashMap<>();

    {
        recipeMap.put(1L, new Recipe(1L, "Chicken Tikka Masala", 6));
        recipeMap.put(2L, new Recipe(2L, "Chicken Roganghosh", 7));
        recipeMap.put(3L, new Recipe(3L, "Chicken Dopyaja", 8));
        recipeMap.put(4L, new Recipe(4L, "Chicken Tandoori", 9));
    }

    @GetMapping(value = "recipesV1")
    public Collection<Recipe> getRecipesV1()
    {
        return recipeMap.values();
    }

    @GetMapping(value = "/recipesV2")
    public ResponseEntity<Collection<Recipe>> getRecipesV2()
    {
        return ResponseEntity.ok().body(recipeMap.values());
    }

    @GetMapping(value = "/recipe/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable long id)
    {
        Recipe recipe = recipeMap.get(id);

        if (recipe == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(recipe);
    }

    @GetMapping(value = "/recipes")
    public ResponseEntity<Collection<Recipe>> getRecipesWithIngredientsMoreThan(@RequestParam(value = "min", required = false, defaultValue = "8") int min)
    {
        Collection<Recipe> recipes = recipeMap.values()
                .stream()
                .filter(recipe -> recipe.getIngredientCount() > min)
                .toList();
        return ResponseEntity.ok().body(recipes);

    }

    @GetMapping(value = "/count")
    public ResponseEntity<Integer> getCount()
    {
        return ResponseEntity.ok().body(recipeMap.values().size());
    }
}
