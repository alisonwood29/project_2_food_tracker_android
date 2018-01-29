package example.alisonwood29.com.foodtrackerproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alisonwood29 on 29/01/2018.
 */

public class FoodTracker {

    private String date;
    private ArrayList<DailyFood> dailyFoods;

    public FoodTracker(String date){
        this.date = date;
        this.dailyFoods = new ArrayList<>();
    }

    public String getDate() {
        return this.date;
    }

    public int dailyMealsCount() {
        return this.dailyFoods.size();
    }

    public void addDailyFood(DailyFood dailyFood) {
        this.dailyFoods.add(dailyFood);
    }

    public ArrayList<DailyFood> getDailyFoodsList() {
        return this.dailyFoods;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public void formatDate() {
//        try{
//            Date formattedDate = new SimpleDateFormat("dd-MM-yyyy").parse(this.date);
//        } catch (ParseException e){
//            e.printStackTrace();
//        }
//    }
}
