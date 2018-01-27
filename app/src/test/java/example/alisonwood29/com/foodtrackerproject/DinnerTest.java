package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public class DinnerTest {

    Dinner dinner;

    @Before
    public void before(){
        dinner = new Dinner("mac and cheese", 420);
    }

    @Test
    public void canGetFood(){
        assertEquals("mac and cheese", dinner.getFood());
    }

    @Test
    public void canGetCalories(){
        assertEquals(420, dinner.getCalories());
    }

    @Test
    public void canSetFood(){
        dinner.setFood("chicken korma with rice");
        assertEquals("chicken korma with rice", dinner.getFood());
    }

    @Test
    public void canSetCalories(){
        dinner.setCalories(615);
        assertEquals(615, dinner.getCalories());
    }
}
