package demo.pvdemo12fullrestservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app")
@CrossOrigin
public class RecipeController
{
    @Autowired
    private RecipeRepository repository;

    @GetMapping(value = "/recipe/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable long id)
    {
        Recipe recipe = repository.getById(id);

        if (recipe == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(recipe);
    }

    @GetMapping(value = "/recipes")
    public ResponseEntity<Collection<Recipe>> getRecipesWithIngredientsMoreThan(@RequestParam(value = "min", required = false, defaultValue = "0") int min)
    {
        Collection<Recipe> recipes = repository.getAll()
                .stream()
                .filter(recipe -> recipe.getIngredientCount() > min)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(recipes);

    }

    @PostMapping(value="/recipes")
    public ResponseEntity<Recipe> insertRecipe(@RequestBody Recipe recipe){
        repository.insert(recipe);
        URI uri = URI.create("/app/recipes" + recipe.getId());
        return ResponseEntity.created(uri).body(recipe);
    }

    @PutMapping(value = "/recipes/{id}")
    public ResponseEntity<Void> updateRecipe(@PathVariable long id, @RequestBody Recipe recipe){
        if(!repository.update(recipe))
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/recipes/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable long id){
        if(!repository.delete(id))
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().build();
    }


}
