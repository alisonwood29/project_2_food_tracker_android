package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public class DailyFoodTest {

    Breakfast breakfast;
    Lunch lunch;
    Dinner dinner;
    DailyFood dailyFood;

    @Before
    public void before(){
        breakfast = new Breakfast("toast with jam", 200);
        lunch = new Lunch("chicken salad", 250);
        dinner = new Dinner("pizza", 650);
        dailyFood = new DailyFood(breakfast, lunch, dinner);
    }

    @Test
    public void canGetBreakfast(){
        assertEquals(breakfast, dailyFood.getBreakfast());
    }

    @Test
    public void canGetLunch(){
        assertEquals(lunch, dailyFood.getLunch());
    }

    @Test
    public void canGetDinner(){
        assertEquals(dinner, dailyFood.getDinner());
    }

    @Test
    public void canGetTotalCalories(){

    }

    @Test
    public void canGetFoodFromBreakfast(){
        assertEquals("toast with jam", dailyFood.getFood(breakfast));
    }

    @Test
    public void canGetFoodFromLunch(){
        assertEquals("chicken salad", dailyFood.getFood(lunch));
    }

    @Test
    public void canGetCaloriesFromDinner(){
        assertEquals(650, dailyFood.getCalories(dinner));
    }

}
