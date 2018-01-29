package example.alisonwood29.com.foodtrackerproject;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public class DailyFood {

    private String date;
    private Breakfast breakfast;
    private Lunch lunch;
    private Dinner dinner;
    private int maxCalories;


    public DailyFood(String date, Breakfast breakfast, Lunch lunch, Dinner dinner){
        this.date = date;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.maxCalories = 1500;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Breakfast getBreakfast() {
        return this.breakfast;
    }

    public Lunch getLunch() {
        return this.lunch;
    }

    public Dinner getDinner() {
        return this.dinner;
    }

    public String getFood(Meal meal) {
        return meal.getFood();
    }

    public int getCalories(Meal meal) {
        return meal.getCalories();
    }

    public int totalCalories() {
        return getCalories(this.breakfast) + getCalories(this.lunch) + getCalories(this.dinner);
    }

    public int getMaxCalories() {
        return this.maxCalories;
    }

    public void setMaxCalories(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    public int caloriesRemaining() {
        return this.maxCalories - totalCalories();
    }
}
