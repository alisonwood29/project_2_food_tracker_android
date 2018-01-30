package example.alisonwood29.com.foodtrackerproject.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import example.alisonwood29.com.foodtrackerproject.Database.AppDatabase;
import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;
import example.alisonwood29.com.foodtrackerproject.Models.FoodTracker;
import example.alisonwood29.com.foodtrackerproject.Adapters.FoodTrackerAdapter;
import example.alisonwood29.com.foodtrackerproject.R;

public class DailyFoodListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_food_list);

        List<DailyFood> savedFoodsAsList = new ArrayList<>(AppDatabase.getAppDatabase(this).dailyFoodDao().getAllDailyFoods());
        ArrayList<DailyFood> savedFoods = new ArrayList<>(savedFoodsAsList);
//        savedFoods = AppDatabase.getAppDatabase(this).dailyFoodDao().getAllDailyFoods();


//        FoodTracker foodTracker = new FoodTracker();
//        ArrayList<DailyFood> dailyFoodList = foodTracker.getDailyFoodsList();

        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, savedFoods);

        ListView listView = findViewById(R.id.daily_food_list);
        listView.setAdapter(foodTrackerAdapter);

    }
}
