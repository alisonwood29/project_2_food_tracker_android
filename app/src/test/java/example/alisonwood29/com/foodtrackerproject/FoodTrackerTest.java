package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 29/01/2018.
 */

public class FoodTrackerTest {

    FoodTracker foodTracker;
    DailyFood dailyFood;
    Breakfast breakfast;
    Lunch lunch;
    Dinner dinner;

    @Before
    public void before(){
        foodTracker = new FoodTracker("29/01/2018");
        breakfast = new Breakfast("toast with jam", 200);
        lunch = new Lunch("chicken salad", 250);
        dinner = new Dinner("pizza", 650);
        dailyFood = new DailyFood(breakfast, lunch, dinner);
    }

    @Test
    public void canGetDate(){
        assertEquals("29/01/2018", foodTracker.getDate());
    }

//    @Test
//    public void canFormatStringToDate(){
//        foodTracker.formatDate();
//        assertEquals("29-01-2018", foodTracker.getDate());
//    }

    @Test
    public void dailyMealsStartsEmpty(){
        assertEquals(0, foodTracker.dailyMealsCount());
    }

    @Test
    public void canAddToDailyMeals(){
        foodTracker.addDailyFood(dailyFood);
        assertEquals(1, foodTracker.dailyMealsCount());
    }

    @Test
    public void canGetDailyMeals(){
        foodTracker.addDailyFood(dailyFood);
        ArrayList<DailyFood> expected = new ArrayList<>();
        expected.add(dailyFood);
        assertEquals(expected, foodTracker.getDailyFoodsList());
    }

}
