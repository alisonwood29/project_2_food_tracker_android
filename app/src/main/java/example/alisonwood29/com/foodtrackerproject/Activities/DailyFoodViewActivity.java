package example.alisonwood29.com.foodtrackerproject.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

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
    PieChart caloriePieChart;
    List<PieEntry> calorieEntries;

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
        caloriePieChart = findViewById(R.id.calorie_pie_chart);

        Intent intent = getIntent();
        DailyFood dailyFood = (DailyFood) intent.getSerializableExtra("dailyFood");

        date.setText(dailyFood.getDate());
        breakfastFood.setText(dailyFood.getBreakfast().getFood());
        breakfastCalories.setText(String.valueOf(dailyFood.getBreakfast().getCalories() + " calories"));
        lunchFood.setText(dailyFood.getLunch().getFood());
        lunchCalories.setText(String.valueOf(dailyFood.getLunch().getCalories() + " calories"));
        dinnerFood.setText(dailyFood.getDinner().getFood());
        dinnerCalories.setText(String.valueOf(dailyFood.getDinner().getCalories() + " calories"));
        totalCalories.setText(String.valueOf("total calories: " + dailyFood.totalCalories()));

        caloriePieChart.setHoleRadius(70);
        caloriePieChart.setCenterText("Daily calorie intake is:\n" + dailyFood.getMaxCalories() + " calories");
        caloriePieChart.setDescription(null);
//        caloriePieChart.setMaxAngle(270f);
        caloriePieChart.setEntryLabelTextSize(16);
        caloriePieChart.setEntryLabelColor(Color.BLACK);
        caloriePieChart.setCenterTextSize(16);



        calorieEntries = new ArrayList<>();

        calorieEntries.add(new PieEntry(dailyFood.totalCalories(), "total calories"));
        calorieEntries.add(new PieEntry(dailyFood.caloriesRemaining(), "remaining calories"));

        PieDataSet calorieDataSet = new PieDataSet(calorieEntries, "Calories");
        PieData calorieData = new PieData(calorieDataSet);

        caloriePieChart.setData(calorieData);
        caloriePieChart.invalidate();

        ArrayList<Integer> colours = new ArrayList<>();
        colours.add(Color.CYAN);
        colours.add(Color.GRAY);

        calorieDataSet.setColors(colours);


    }
}
