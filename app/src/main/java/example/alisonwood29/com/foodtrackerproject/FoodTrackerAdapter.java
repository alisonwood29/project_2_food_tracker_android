package example.alisonwood29.com.foodtrackerproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

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
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.daily_food_item, parent, false);
        }

        DailyFood currentDailyFood = getItem(position);

        TextView date = (TextView) listItemView.findViewById(R.id.date_view);
        date.setText(currentDailyFood.getDate());

        TextView breakfast = (TextView) listItemView.findViewById(R.id.breakfast_view);
        breakfast.setText(currentDailyFood.getBreakfast().getFood());

        TextView lunch = (TextView) listItemView.findViewById(R.id.lunch_view);
        breakfast.setText(currentDailyFood.getLunch().getFood());

        TextView dinner = (TextView) listItemView.findViewById(R.id.dinner_view);
        breakfast.setText(currentDailyFood.getDinner().getFood());

        return listItemView;

    }


}
