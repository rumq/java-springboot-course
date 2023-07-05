package demo.pv10springdatarepositories;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "RECIPES")
@EnableAutoConfiguration
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeId = -1;


//    @Temporal(TemporalType.TIMESTAMP)
//    @CreationTimestamp
//    Date creationDateTime;

    @Column(name = "CREATED_DATE_TIME", columnDefinition = "DATETIME(3)")
    @CreationTimestamp
    private OffsetDateTime createdDateTime;

    private String name;
    private String type;
    private String spiceLevel;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public Recipe(long recipeId, String name, String type, String spiceLevel) {
        this.recipeId = recipeId;
        this.name = name;
        this.type = type;
        this.spiceLevel = spiceLevel;
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
        return recipeId == recipe.recipeId && Objects.equals(name, recipe.name) && Objects.equals(type, recipe.type) && Objects.equals(spiceLevel, recipe.spiceLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, name, type, spiceLevel);
    }


    @Override
    public String toString()
    {
        return "Recipe{"
            + "recipeId=" + recipeId
            + ", createdDateTime=" + createdDateTime
            + ", name='" + name + '\''
            + ", type='" + type + '\''
            + ", spiceLevel='" + spiceLevel + '\''
            + '}';
    }
}
