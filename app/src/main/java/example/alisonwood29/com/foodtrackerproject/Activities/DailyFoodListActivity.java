package example.alisonwood29.com.foodtrackerproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import example.alisonwood29.com.foodtrackerproject.Database.AppDatabase;
import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;
import example.alisonwood29.com.foodtrackerproject.Adapters.FoodTrackerAdapter;
import example.alisonwood29.com.foodtrackerproject.R;

public class DailyFoodListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_food_list);

        List<DailyFood> savedFoodsAsList = new ArrayList<>(AppDatabase.getAppDatabase(this).dailyFoodDao().getAllDailyFoods());
        ArrayList<DailyFood> savedFoods = new ArrayList<>(savedFoodsAsList);

        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, savedFoods);

        ListView listView = findViewById(R.id.daily_food_list);
        listView.setAdapter(foodTrackerAdapter);
    }

    public void getDailyFood(View listItem){
        DailyFood dailyFood = (DailyFood) listItem.getTag();
        Log.d(getClass().toString(), "breakfast is " + dailyFood.getBreakfast().getFood());

        Intent intent = new Intent(this, DailyFoodViewActivity.class);
        intent.putExtra("dailyFood", dailyFood);

        startActivity(intent);

    }


}
