package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import example.alisonwood29.com.foodtrackerproject.Models.Breakfast;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 27/01/2018.
 */

public class BreakfastTest {

    Breakfast breakfast;

    @Before
    public void before(){
        breakfast = new Breakfast("porridge with milk", 120);
    }

    @Test
    public void canGetFood(){
        assertEquals("porridge with milk", breakfast.getFood());
    }

    @Test
    public void canGetCalories(){
        assertEquals(120, breakfast.getCalories());
    }

    @Test
    public void canSetFood(){
        breakfast.setFood("branflakes with milk");
        assertEquals("branflakes with milk", breakfast.getFood());
    }

    @Test
    public void canSetCalories(){
        breakfast.setCalories(180);
        assertEquals(180, breakfast.getCalories());
    }
}
