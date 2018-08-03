package com.example.android.lisbontourguide;

/**
 * Created by Sofia on 10/23/2017.
 */

public class Place {
    private int imageResourceId;
    private String name;
    private String price;
    private String localization;

    public Place(int imageResourceId, String name, String localization, String price) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.localization = localization;
        this.price = price;
    }

    public Place(int imageResourceId, String name, String localization) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.localization = localization;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getLocalization() {
        return localization;
    }
}
