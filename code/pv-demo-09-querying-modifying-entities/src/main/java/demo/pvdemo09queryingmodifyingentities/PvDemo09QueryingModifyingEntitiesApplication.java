package demo.pvdemo09queryingmodifyingentities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class PvDemo09QueryingModifyingEntitiesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PvDemo09QueryingModifyingEntitiesApplication.class, args);

        RecipeService service = context.getBean(RecipeService.class);

        // A:  Get recipe count
        long count = service.getRecipeCount();
        System.out.println("*******************");
        System.out.println("** A: getRecipeCount " + count);

        // B: Get Recipe
        Recipe recipe = service.getRecipe(2);
        System.out.println("*******************");
        System.out.println("** B: getRecipe " + recipe);

        // C: Get all recipes
        List<Recipe> recipes = service.getRecipes();
        System.out.println("*******************");
        System.out.println("** C: getRecipes ");
        service.getRecipes().forEach(System.out::println);

        // D: insert Recipe
        Recipe newRecipe = new Recipe(-1, "Scrambled eggs", "NONVEG" , "LOW" );
        service.insertRecipe(newRecipe);
        System.out.println("*******************");
        System.out.println("** D: insertRecipes ");
        service.getRecipes().forEach(System.out::println);

        // E: update Recipe
        service.updateRecipe(1, "Chicken Tikka Masala superior");
        System.out.println("*******************");
        System.out.println("** E: updateRecipes " );
        service.getRecipes().forEach(System.out::println);

        // F: delete Recipe
        service.deleteRecipe(2);
        System.out.println("*******************");
        System.out.println("** F: deleteRecipes " );
        service.getRecipes().forEach(System.out::println);

        // G: update using jpql with parameters
        int rowsAffected = service.updateSpiceLevel("NONVEG", "HIGH");
        System.out.println("*******************");
        System.out.println("** G:  update using jpql with parameters" );
        System.out.println("Rows affected : " + rowsAffected);
        service.getRecipes().forEach(System.out::println);




    }

}
