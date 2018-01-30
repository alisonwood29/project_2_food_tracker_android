package example.alisonwood29.com.foodtrackerproject.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import example.alisonwood29.com.foodtrackerproject.DailyFood;

/**
 * Created by alisonwood29 on 30/01/2018.
 */

@Database(entities = {DailyFood.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{

   public abstract DailyFoodDao dailyFoodDao();

    private static AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "food_tracker_database").allowMainThreadQueries().build();

        }
        return INSTANCE;
    }
}
