package example.alisonwood29.com.foodtrackerproject.Models;

/**
 * Created by alisonwood29 on 31/01/2018.
 */

public class PieEntry {

    private int calories;
    private String label;

    public PieEntry(int calories, String label){
        this.calories = calories;
        this.label = label;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getLabel() {
        return this.label;
    }
}
