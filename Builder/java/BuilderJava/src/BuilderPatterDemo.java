public class BuilderPatterDemo {

    public static void main(String[] args) {
        

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal : ");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareChickenMeal();
        System.out.println("A ChickenBurger Meal : ");
        nonVegMeal.showItems();
        System.out.println("Total Price : " + nonVegMeal.getCost());
    }
    
}
