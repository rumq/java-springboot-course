package demo.pvdemo09queryingmodifyingentities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeRepository {
    @PersistenceContext
    protected EntityManager entityManager;
    public long getRecipeCount() {
        String jpql = "select count(r) from Recipe r";
        TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
        return query.getSingleResult();
    }

    public Recipe getRecipe(long recipeId) {
        return entityManager.find(Recipe.class, recipeId);
    }

    public List<Recipe> getRecipes() {
        String jpql = "select r from Recipe r";
        TypedQuery<Recipe> query = entityManager.createQuery(jpql, Recipe.class);
        return query.getResultList();

    }

    @Transactional
    public void insertRecipe(Recipe recipe) {
        entityManager.persist(recipe);
    }

    @Transactional
    public void updateRecipe(int id, String recipeName) {
        Recipe recipe = entityManager.find(Recipe.class, id);
        recipe.setName(recipeName);
    }


    @Transactional
    public void deleteRecipe(int id) {
        Recipe recipe = entityManager.find(Recipe.class, id);
        entityManager.remove(recipe);
    }
}
