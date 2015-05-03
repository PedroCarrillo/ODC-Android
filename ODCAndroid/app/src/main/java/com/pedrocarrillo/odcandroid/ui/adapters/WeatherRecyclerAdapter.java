package com.pedrocarrillo.odcandroid.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pedrocarrillo.odcandroid.R;
import com.pedrocarrillo.odcandroid.models.Weather;

import java.util.List;

/**
 * Created by Pedro on 02/05/15.
 */
public class WeatherRecyclerAdapter  extends RecyclerView.Adapter<WeatherRecyclerAdapter.ViewHolder> {

    private List<Weather> weatherList;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView1;
        private TextView mTextView2;

        public ViewHolder(View v) {
            super(v);
            mTextView1 = (TextView)v.findViewById(R.id.tv1);
            mTextView2 = (TextView)v.findViewById(R.id.tv2);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public WeatherRecyclerAdapter(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public WeatherRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.weather_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that
        Weather weather = weatherList.get(position);
        holder.mTextView1.setText(weather.getDescription());
        holder.mTextView2.setText(weather.totalDescription());
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }
}