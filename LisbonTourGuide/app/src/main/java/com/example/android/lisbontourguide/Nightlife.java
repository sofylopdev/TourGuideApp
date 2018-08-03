package com.example.android.lisbontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Nightlife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Place> nightlife = new ArrayList<Place>();

        nightlife.add(new Place(R.drawable.night_lux, "Lux Frágil", " Av. Infante D. Henrique, Armazém A, Cais da Pedra a Sta Apolónia"));
        nightlife.add(new Place(R.drawable.night_lust_in_rio, "Meninos do Rio/ Lust in Rio", "Cais Sodré"));
        nightlife.add(new Place(R.drawable.night_incognito_bar, "Incógnito Bar", "R. Poiais de São Bento, 37"));
        nightlife.add(new Place(R.drawable.night_ministerium_club, "Ministerium Bar", "Praça do Comércio, 72"));
        nightlife.add(new Place(R.drawable.night_music_box, "Music Box", "R. Nova do Carvalho, 24, Bairro Alto"));
        nightlife.add(new Place(R.drawable.night_maria_caxuxa, "Maria Caxuxa", "Bairro Alto"));
        nightlife.add(new Place(R.drawable.night_pensao_amor, "Pensão Amor", "Bairro Alto"));
        nightlife.add(new Place(R.drawable.night_tasca_do_chico, "Tasca do Chico", "Bairro Alto"));
        nightlife.add(new Place(R.drawable.night_night_baiuca, "Baiuca", "Alfama"));
        nightlife.add(new Place(R.drawable.night_pavilhao_chines, "Pavilhão Chinês", "R. Dom Pedro V, 89, Príncipe Real"));

        Adapter_LisbonViews adapter = new Adapter_LisbonViews(this, nightlife);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
