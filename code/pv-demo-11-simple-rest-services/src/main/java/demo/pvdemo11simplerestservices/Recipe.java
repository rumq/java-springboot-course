package demo.pvdemo11simplerestservices;

public class Recipe {
    private long id;
    private String Name;

    private int ingredientCount;

    public Recipe(long id, String name, int ingredientCount) {
        this.id = id;
        Name = name;
        this.ingredientCount = ingredientCount;
    }

    public Recipe() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIngredientCount() {
        return ingredientCount;
    }

    public void setIngredientCount(int ingredientCount) {
        this.ingredientCount = ingredientCount;
    }
}
