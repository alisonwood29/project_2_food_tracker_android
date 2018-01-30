package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import example.alisonwood29.com.foodtrackerproject.Models.Breakfast;
import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;
import example.alisonwood29.com.foodtrackerproject.Models.Dinner;
import example.alisonwood29.com.foodtrackerproject.Models.Lunch;

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
        dailyFood = new DailyFood("29/01/2018", breakfast, lunch, dinner);
    }

    @Test
    public void canGetDate(){
        assertEquals("29/01/2018", dailyFood.getDate());
    }

    @Test
    public void canSetDate(){
        dailyFood.setDate("30/01/2018");
        assertEquals("30/01/2018", dailyFood.getDate());
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

    @Test
    public void canGetTotalCalories(){
        assertEquals(1100, dailyFood.totalCalories());
    }

    @Test
    public void canGetMaxCalories(){
        assertEquals(1500, dailyFood.getMaxCalories());
    }

    @Test
    public void canSetMaxCalories(){
        dailyFood.setMaxCalories(1600);
        assertEquals(1600, dailyFood.getMaxCalories());
    }

    @Test
    public void canGetCaloriesRemaining(){
        assertEquals(400, dailyFood.caloriesRemaining());
    }

}
