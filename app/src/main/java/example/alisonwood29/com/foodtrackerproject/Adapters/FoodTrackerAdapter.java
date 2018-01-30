package example.alisonwood29.com.foodtrackerproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import example.alisonwood29.com.foodtrackerproject.Models.DailyFood;
import example.alisonwood29.com.foodtrackerproject.R;

/**
 * Created by alisonwood29 on 29/01/2018.
 */

public class FoodTrackerAdapter extends ArrayAdapter<DailyFood> {

    public FoodTrackerAdapter(Context context, ArrayList<DailyFood> dailyFoods){
        super(context, 0, dailyFoods);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if(listItemView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            listItemView = inflater.inflate(R.layout.daily_food_item, parent, false);
        }

        DailyFood currentDailyFood = getItem(position);


        TextView date = listItemView.findViewById(R.id.date_view);
        date.setText(currentDailyFood.getDate());

        TextView breakfast = listItemView.findViewById(R.id.breakfast_view);
        breakfast.setText(currentDailyFood.getBreakfast().getFood());

        TextView lunch = listItemView.findViewById(R.id.lunch_view);
        lunch.setText(currentDailyFood.getLunch().getFood());

        TextView dinner = listItemView.findViewById(R.id.dinner_view);
        dinner.setText(currentDailyFood.getDinner().getFood());

        return listItemView;

    }


}
