package example.alisonwood29.com.foodtrackerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class FoodInputActivity extends AppCompatActivity {

    EditText date;
    EditText breakfastFood;
    EditText lunchFood;
    EditText dinnerFood;
    EditText breakfastCalories;
    EditText lunchCalories;
    EditText dinnerCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_input);

        date = findViewById(R.id.enter_date);

    }
}
