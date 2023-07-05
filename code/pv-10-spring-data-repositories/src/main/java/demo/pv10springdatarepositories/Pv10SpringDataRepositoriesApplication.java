package demo.pv10springdatarepositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class Pv10SpringDataRepositoriesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Pv10SpringDataRepositoriesApplication.class, args);
        RecipeService service  = context.getBean(RecipeService.class);

        insertRecipes(service);
        // A:  Get recipe count
        long count = service.getRecipeCount();
        System.out.println("*******************");
        System.out.println("** A: getRecipeCount " + count);
//
//        // B: Get Recipe
//        System.out.println("*******************");
//        System.out.println("** B: getRecipe " + service.getRecipe(2).orElseThrow());
//
        // C: Get all recipes
        List<Recipe> recipes = service.getRecipes();
        System.out.println("*******************");
        System.out.println("** C: getRecipes ");
        service.getRecipes().forEach(System.out::println);

        System.out.println("*******************");
        System.out.println("** Native ");
        System.out.println(service.nativeQuery());

        System.out.println("*******************");
        System.out.println("** Native Delete");
        System.out.println(service.deleteNativeQuery());

        System.out.println("*******************");
        System.out.println("** Native Delete Simple");
        System.out.println(service.deleteNativeQuerySimple());

        System.out.println("*******************");
        System.out.println("** Native Delete Simple LocalDateTime");
        System.out.println(service.deleteNativeQuerySimpleLocaDateTime());

        System.out.println("*******************");
        System.out.println("** At the end");
        service.getRecipes().forEach(System.out::println);


        //
//        // D: insert Recipe
//        Recipe newRecipe = new Recipe(-1, "Scrambled eggs", "NONVEG" , "LOW" );
//        service.insertRecipe(newRecipe);
//        System.out.println("*******************");
//        System.out.println("** D: insertRecipes ");
//        service.getRecipes().forEach(System.out::println);
//
//        // E: update Recipe
//        service.updateRecipe(1L, "Chicken Tikka Masala superior");
//        System.out.println("*******************");
//        System.out.println("** E: updateRecipes " );
//        service.getRecipes().forEach(System.out::println);
//
//        // F: delete Recipe
//        service.deleteRecipe(2L);
//        System.out.println("*******************");
//        System.out.println("** F: deleteRecipes " );
//        service.getRecipes().forEach(System.out::println);
//
//        // G: update using jpql with parameters
//        int rowsAffected = service.updateSpiceLevel("NONVEG", "HIGH");
//        System.out.println("*******************");
//        System.out.println("** G:  update using jpql with parameters" );
//        System.out.println("Rows affected : " + rowsAffected);
//        service.getRecipes().forEach(System.out::println);

    }

    private static void insertRecipes(final RecipeService service)
    {
        for (int i = 0; i < 3; i++)
        {
            Recipe newRecipe = new Recipe(-1, UUID.randomUUID() + "-eggs", "NONVEG" , "LOW" );
//            newRecipe.creationDateTime = new Date(LocalDateTime.of(2023, 06, 28, 1, 1, 1));
            service.insertRecipe(newRecipe);

        }


    }

}
