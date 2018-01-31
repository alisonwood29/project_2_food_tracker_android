package example.alisonwood29.com.foodtrackerproject;

import org.junit.Before;
import org.junit.Test;

import example.alisonwood29.com.foodtrackerproject.Models.PieEntry;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 31/01/2018.
 */

public class PieEntryTest {

    PieEntry pieEntry;

    @Before
    public void before(){
        pieEntry = new PieEntry(10, "number");
    }

   @Test
    public void hasCalories(){
        assertEquals(10, pieEntry.getCalories());
   }

   @Test
    public void hasLabel(){
        assertEquals("number", pieEntry.getLabel());
   }

}
