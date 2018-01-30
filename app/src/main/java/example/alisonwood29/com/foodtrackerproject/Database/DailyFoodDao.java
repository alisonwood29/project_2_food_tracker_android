package example.alisonwood29.com.foodtrackerproject.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;

/**
 * Created by alisonwood29 on 30/01/2018.
 */

@Dao
public interface DailyFoodDao {

    @Insert
    void insertDailyFood(DailyFood dailyFood);

    @Query("SELECT * FROM daily_foods")
    List<DailyFood> getAllDailyFoods();
}
