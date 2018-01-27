package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public class LunchTest {

    Lunch lunch;

    @Before
    public void before() {
        lunch = new Lunch("ham sandwich and crisps", 200);
    }

    @Test
    public void canGetFood(){
        assertEquals("ham sandwich and crisps", lunch.getFood());
    }

    @Test
    public void canGetCalories(){
        assertEquals(200, lunch.getCalories());
    }
}
