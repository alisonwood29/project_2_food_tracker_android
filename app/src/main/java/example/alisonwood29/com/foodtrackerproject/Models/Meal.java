package example.alisonwood29.com.foodtrackerproject.Models;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public abstract class Meal {

    private String food;
    private int calories;

    public Meal(String food, int calories){
        this.food = food;
        this.calories = calories;
    }

    public String getFood() {
        return this.food;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
