package example.alisonwood29.com.foodtrackerproject;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public class DailyFood {

    private Breakfast breakfast;
    private Lunch lunch;
    private Dinner dinner;

    public DailyFood(Breakfast breakfast, Lunch lunch, Dinner dinner){
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
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
}
