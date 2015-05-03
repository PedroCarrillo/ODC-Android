package com.pedrocarrillo.odcandroid.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pedrocarrillo.odcandroid.R;
import com.pedrocarrillo.odcandroid.models.Weather;
import com.pedrocarrillo.odcandroid.ui.adapters.WeatherRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class HomeActivityFragment extends Fragment {

    private RecyclerView rv_weather;
    private RecyclerView.LayoutManager mLayoutManager;
    private WeatherRecyclerAdapter adapter;

    private List<Weather> weatherList;

    public HomeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);
        rv_weather = (RecyclerView)view.findViewById(R.id.recycler_view_weather);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mLayoutManager = new LinearLayoutManager(getActivity());
        rv_weather.setLayoutManager(mLayoutManager);

        weatherList = new ArrayList<Weather>();
        weatherList.add(new Weather("holi",15.1f));
        weatherList.add(new Weather("holi2",11.1f));

        adapter = new WeatherRecyclerAdapter(weatherList);

        rv_weather.setAdapter(adapter);

    }
}
