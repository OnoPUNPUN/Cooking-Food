public class Meal extends Food {

    public Meal()
    {
        super();
    }

    public Meal(String name, String[] ingredients, double price, float calories)
    {
        super(name, ingredients, price, calories);
    }

    @Override
    public void showDetails()
    {
        System.out.println("Meal Deatails: ");
        System.out.println("Name: " + getName());
        System.out.println("Ingredients: " + String.join(", ", getIngredients()));
        System.out.println("Price: $" + getPrice());
        System.out.println("Calories: " + getCalories());
    }
    
}
