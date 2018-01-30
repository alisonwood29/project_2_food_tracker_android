package example.alisonwood29.com.foodtrackerproject.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import example.alisonwood29.com.foodtrackerproject.Breakfast;
import example.alisonwood29.com.foodtrackerproject.DailyFood;
import example.alisonwood29.com.foodtrackerproject.Dinner;
import example.alisonwood29.com.foodtrackerproject.Lunch;

/**
 * Created by alisonwood29 on 30/01/2018.
 */

@Dao
public interface DailyFoodDao {

    @Insert
    public void insertDailyFood(DailyFood dailyFood);

    @Query("SELECT * FROM daily_foods")
    public List<DailyFood> getAllDailyFoods();

}
