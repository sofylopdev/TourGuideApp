package com.example.android.lisbontourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sofia on 10/23/2017.
 */

public class Adapter_LisbonViews extends ArrayAdapter<Place>{


    public Adapter_LisbonViews(@NonNull Context context,  @NonNull List<Place> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentView = convertView;

        if(currentView ==null){
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Place currentPlace = getItem(position);

        ImageView currentImage = currentView.findViewById(R.id.placeImage);
        currentImage.setImageResource(currentPlace.getImageResourceId());
        TextView currentTitle = currentView.findViewById(R.id.placeTitle);
        currentTitle.setText(currentPlace.getName());

        TextView local = currentView.findViewById(R.id.localization);
        local.setText(currentPlace.getLocalization());


        TextView price = currentView.findViewById(R.id.price);
        if (currentPlace.getPrice() != null){
            price.setText(currentPlace.getPrice());
            price.setVisibility(View.VISIBLE);
        }else{
            price.setVisibility(View.GONE);
        }

        return currentView;
    }
}
