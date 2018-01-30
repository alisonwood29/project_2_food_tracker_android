package example.alisonwood29.com.foodtrackerproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;
import example.alisonwood29.com.foodtrackerproject.R;

public class DailyFoodViewActivity extends AppCompatActivity {

    TextView date;
    TextView breakfastFood;
    TextView breakfastCalories;
    TextView lunchFood;
    TextView lunchCalories;
    TextView dinnerFood;
    TextView dinnerCalories;
    TextView totalCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_food_view);

        date = findViewById(R.id.select_date);
        breakfastFood = findViewById(R.id.select_breakfast_food);
        breakfastCalories = findViewById(R.id.select_breakfast_calories);
        lunchFood = findViewById(R.id.select_lunch_food);
        lunchCalories = findViewById(R.id.select_lunch_calories);
        dinnerFood = findViewById(R.id.select_dinner_food);
        dinnerCalories = findViewById(R.id.select_dinner_calories);
        totalCalories = findViewById(R.id.total_calories);

        Intent intent = getIntent();
        DailyFood dailyFood = (DailyFood) intent.getSerializableExtra("dailyFood");

        date.setText(dailyFood.getDate());
        breakfastFood.setText(dailyFood.getBreakfast().getFood());
        breakfastCalories.setText(String.valueOf(dailyFood.getBreakfast().getCalories()));
        lunchFood.setText(dailyFood.getLunch().getFood());
        lunchCalories.setText(String.valueOf(dailyFood.getLunch().getCalories()));
        dinnerFood.setText(dailyFood.getDinner().getFood());
        dinnerCalories.setText(String.valueOf(dailyFood.getDinner().getCalories()));
        totalCalories.setText(String.valueOf(dailyFood.totalCalories()));
    }
}
