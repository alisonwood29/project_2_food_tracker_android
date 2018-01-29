package example.alisonwood29.com.foodtrackerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DailyFoodListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_food_list);

        FoodTracker foodTracker = new FoodTracker();
        ArrayList<DailyFood> dailyFoodList = foodTracker.getDailyFoodsList();

        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, dailyFoodList);

        ListView listView = (ListView) findViewById(R.id.daily_food_list);
        listView.setAdapter(foodTrackerAdapter);

    }
}
