package example.alisonwood29.com.foodtrackerproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alisonwood29 on 29/01/2018.
 */

public class FoodTracker {

    private ArrayList<DailyFood> dailyFoods;

    public FoodTracker(){
        this.dailyFoods = new ArrayList<>();
//        Breakfast breakfast = new Breakfast("toast with jam", 200);
//        Lunch lunch = new Lunch("chicken salad", 250);
//        Dinner dinner = new Dinner("pizza", 650);
//        DailyFood dailyFood = new DailyFood("29/01/2018", breakfast, lunch, dinner);
//        addDailyFood(dailyFood);
//        this was to make sure that the listView was actually working
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
