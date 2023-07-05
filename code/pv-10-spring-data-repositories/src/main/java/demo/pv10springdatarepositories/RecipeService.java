package demo.pv10springdatarepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

    public int nativeQuery()
    {
        return repository.nativeQuery();
    }

    public int deleteNativeQuery()
    {
        final Date date;
        try
        {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("2023-06-30 20:00");
            System.out.println("DATE="+date);
        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
        return  repository.deleteNativeQuery(2, date);

    }

    public int deleteNativeQuerySimple()
    {

        final Date date1;
        final Date date2;
        try
        {
            date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("2023-06-30 20:00");
            date2 = Date.from(OffsetDateTime.now().toInstant());
//            date2 = getDateFromOffsetDateTime(OffsetDateTime.now());
//            date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("2023-07-03 20:00");

            System.out.println("DATE1="+date1);
            System.out.println("DATE2="+date2);
        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
        return  repository.deleteNativeQuerySimple(3, date2);

    }
    public int deleteNativeQuerySimpleLocaDateTime()
    {

        return  repository.deleteNativeQuerySimpleLocalDateTime(3, toLocalDateTimeAtUtc(OffsetDateTime.now()));

    }

    private Date getDateFromOffsetDateTime(final OffsetDateTime offsetDateTime)
    {

        final String dayFull = "" + offsetDateTime.getYear()
            + offsetDateTime.getMonth()
            + offsetDateTime.getDayOfMonth();

        Date date = null;

        try
        {
            date = new SimpleDateFormat("yyyyMMMdd").parse(dayFull);
        }
        catch (ParseException e)
        {

        }
        return date;
    }

    public static LocalDateTime toLocalDateTimeAtUtc(final OffsetDateTime offsetDateTime)
    {
        return offsetDateTime == null ? null : OffsetDateTime.ofInstant(offsetDateTime.toInstant(), ZoneOffset.UTC).toLocalDateTime();
    }

}
