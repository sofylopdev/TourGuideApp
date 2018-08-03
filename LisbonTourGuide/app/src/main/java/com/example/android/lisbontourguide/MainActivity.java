package com.example.android.lisbontourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToMonuments(View v){
        Intent intent = new Intent(this,Monuments.class);
        startActivity(intent);
    }
    public void goToViews(View v){
        Intent intent = new Intent(this,PanoramicViews.class);
        startActivity(intent);
    }
    public void goToRestaurants(View v){
        Intent intent = new Intent(this,Restaurants.class);
        startActivity(intent);
    }
    public void goToNightlife(View v){
        Intent intent = new Intent(this,Nightlife.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
