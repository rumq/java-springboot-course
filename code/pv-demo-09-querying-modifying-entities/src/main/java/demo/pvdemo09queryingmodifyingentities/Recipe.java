package demo.pvdemo09queryingmodifyingentities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "RECIPES")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeId = -1;

    private String name;

    public Recipe(long recipeId, String name) {
        this.recipeId = recipeId;
        this.name = name;
    }

    public Recipe() {
    }

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return recipeId == recipe.recipeId && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", name='" + name + '\'' +
                '}';
    }
}
