public class Start {
    public static void main(String[] args) {
        Meal meal1 = new Meal();
        meal1.setName("Pizza");
        meal1.setIngredients(new String[]{"Cheese", "Tomato", "Dough"});
        meal1.setPrice(12.99);
        meal1.setCalories(800.5f);
        meal1.addIngredients("Pepperoni");
        meal1.removeIngredient("Dough");
        meal1.showDetails();

        Meal meal2 = new Meal("Pasta", new String[]{"Pasta", "Cream", "Chicken"}, 9.99, 650.2f);
        meal2.showDetails();
    }
}
