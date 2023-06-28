package demo.pv10springdatarepositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class Pv10SpringDataRepositoriesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Pv10SpringDataRepositoriesApplication.class, args);
        RecipeService service  = context.getBean(RecipeService.class);

        // A:  Get recipe count
        long count = service.getRecipeCount();
        System.out.println("*******************");
        System.out.println("** A: getRecipeCount " + count);

        // B: Get Recipe
        System.out.println("*******************");
        System.out.println("** B: getRecipe " + service.getRecipe(2).orElseThrow());

        // C: Get all recipes
        List<Recipe> recipes = service.getRecipes();
        System.out.println("*******************");
        System.out.println("** C: getRecipes count " + recipes.size());
        service.getRecipes().forEach(System.out::println);

        // D: insert Recipe
        Recipe newRecipe = new Recipe(-1, "Scrambled eggs", "NONVEG" , "LOW" );
        Recipe insertedRecipe = service.insertRecipe(newRecipe);
        System.out.println("*******************");
        System.out.println("** D: insertRecipes " + insertedRecipe);
        service.getRecipes().forEach(System.out::println);

        // E: update Recipe
        service.updateRecipe(1L, "Chicken Tikka Masala superior");
        System.out.println("*******************");
        System.out.println("** E: updateRecipes " );
        service.getRecipes().forEach(System.out::println);

        // F: delete Recipe
        service.deleteRecipe(2L);
        System.out.println("*******************");
        System.out.println("** F: deleteRecipes " );
        service.getRecipes().forEach(System.out::println);

        // G: update using jpql with parameters
        int rowsAffected = service.updateSpiceLevel("NONVEG", "HIGH");
        System.out.println("*******************");
        System.out.println("** G:  update using jpql with parameters" );
        System.out.println("Rows affected : " + rowsAffected);
        service.getRecipes().forEach(System.out::println);

        // **** Custom Queries
        // H: get by type
        List<Recipe> nonVegRecipes = service.getNonVegRecipes("NONVEG");

        System.out.println("*******************");
        System.out.println("** H Custom findBy" );
        System.out.println("Rows returned : " + nonVegRecipes.size());
        nonVegRecipes.forEach(System.out::println);

        // *** Use of paging
        // I:

        Page<Recipe> pageOfRecipes =  service.getAPageOfRecipes();
        System.out.println("*******************");
        System.out.println("** I Use of paging - 1" );
        System.out.println("Rows returned : " + pageOfRecipes.getContent().size());
        System.out.println("Total pages " + pageOfRecipes.getTotalPages());
        pageOfRecipes.getContent().forEach(System.out::println);

        pageOfRecipes =  service.getAPageOfRecipes();
        System.out.println("*********");
        System.out.println("** I Use of paging - 2" );
        System.out.println("Rows returned : " + pageOfRecipes.getContent().size());
        System.out.println("Total pages " + pageOfRecipes.getTotalPages());
        pageOfRecipes.getContent().forEach(System.out::println);




    }

}
