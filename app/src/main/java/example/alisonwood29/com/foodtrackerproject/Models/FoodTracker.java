package example.alisonwood29.com.foodtrackerproject.Models;

import java.util.ArrayList;

import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;

/**
 * Created by alisonwood29 on 29/01/2018.
 */

public class FoodTracker {

    private ArrayList<DailyFood> dailyFoods;

    public FoodTracker(){
        this.dailyFoods = new ArrayList<>();
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

//    public void formatDate() {
//        try{
//            Date formattedDate = new SimpleDateFormat("dd-MM-yyyy").parse(this.date);
//        } catch (ParseException e){
//            e.printStackTrace();
//        }
//    }
}
