abstract class Food {

    private String name;
    private String[] ingredients;
    private double price;
    private float calories;

    Food()
    {
        this.name= "";
        this.ingredients = new String[0];
        this.price = 0.00;
        this.calories = 0.0f;
    }

    Food(String name, String[] ingredients, double price, float calories)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setIngredients(String[] ingredients)
    {
        this.ingredients = ingredients;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setCalories(float calories)
    {
        this.calories = calories;
    }

    public String getName(){return name;}
    public String[] getIngredients(){return ingredients;}
    public double getPrice(){return price;}
    public float getCalories(){return calories;}

    public void removeIngredient(String ingredient)
    {
        boolean found = false;

        for(String ing : ingredients)
        {
            if(ing.equals(ingredient))
            {
                found = true;
            }
        }

        if(found)
        {
            String[] newIngredients = new String[ingredients.length - 1];
            int index = 0;
            for(String ing : ingredients)
            {
                if(!ing.equals(ingredient))
                {
                    newIngredients[index++] = ing;
                }
            }

            ingredients = newIngredients;
            System.out.println(ingredient + "Removed from ingredients.");
        } else{
            System.out.println(ingredient + "not found in ingredients.");
        }
    }

    public void addIngredients(String ingredient)
    {
        String[] newIngredients = new String[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[ingredients.length] = ingredient;
        ingredients = newIngredients;
        System.out.println(ingredient + " added to ingredients.");
    }

    public abstract void showDetails();
}