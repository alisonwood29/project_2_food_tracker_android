package example.alisonwood29.com.foodtrackerproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import example.alisonwood29.com.foodtrackerproject.Models.Breakfast;
import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;
import example.alisonwood29.com.foodtrackerproject.Database.AppDatabase;
import example.alisonwood29.com.foodtrackerproject.Models.Dinner;
import example.alisonwood29.com.foodtrackerproject.Models.FoodTracker;
import example.alisonwood29.com.foodtrackerproject.Models.Lunch;
import example.alisonwood29.com.foodtrackerproject.R;

public class FoodInputActivity extends AppCompatActivity {

    EditText date;
    EditText breakfastFood;
    EditText lunchFood;
    EditText dinnerFood;
    EditText breakfastCalories;
    EditText lunchCalories;
    EditText dinnerCalories;
    Button saveDailyFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_input);

        date = findViewById(R.id.enter_date);
        breakfastFood = findViewById(R.id.breakfast_food);
        lunchFood = findViewById(R.id.lunch_food);
        dinnerFood = findViewById(R.id.dinner_food);
        breakfastCalories = findViewById(R.id.breakfast_calories);
        lunchCalories = findViewById(R.id.lunch_calories);
        dinnerCalories = findViewById(R.id.dinner_calories);
        saveDailyFoods = findViewById(R.id.save_button);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_daily_food_list){
            Intent intent = new Intent(this, DailyFoodListActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void onSaveButtonClick(View button){

        String dateInput = date.getText().toString();

        String breakfastFoodInput = breakfastFood.getText().toString();
        int breakfastCaloriesInput = Integer.valueOf(breakfastCalories.getText().toString());
        Breakfast breakfast = new Breakfast(breakfastFoodInput, breakfastCaloriesInput);

        Log.d(getClass().toString(), "Breakfast Food Is " + breakfastFoodInput);
        Log.d(getClass().toString(), "Breakfast Calories are " + breakfastCaloriesInput);

        String lunchFoodInput = lunchFood.getText().toString();
        int lunchCaloriesInput = Integer.valueOf(lunchCalories.getText().toString());
        Lunch lunch = new Lunch(lunchFoodInput, lunchCaloriesInput);

        String dinnerFoodInput = dinnerFood.getText().toString();
        int dinnerCaloriesInput = Integer.valueOf(dinnerCalories.getText().toString());
        Dinner dinner = new Dinner(dinnerFoodInput, dinnerCaloriesInput);

        DailyFood dailyFoodInput = new DailyFood(dateInput, breakfast, lunch, dinner);

        AppDatabase.getAppDatabase(this).dailyFoodDao().insertDailyFood(dailyFoodInput);

        List<DailyFood> savedFoods = AppDatabase.getAppDatabase(this).dailyFoodDao().getAllDailyFoods();
        Log.d("Saved foods", savedFoods.get(2).getLunch().getFood());

    }


}
