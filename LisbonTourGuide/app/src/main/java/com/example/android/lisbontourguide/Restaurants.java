package com.example.android.lisbontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Place> restaurants = new ArrayList<Place>();

        restaurants.add(new Place(R.drawable.restaurante_a_casa_do_bacalhau, "A Casa do Bacalhau", "Rua do Grilo 54, Beato"));
        restaurants.add(new Place(R.drawable.restaurante_adega_das_gravatas, "Adega das Gravatas", "Tv. Pregoeiro 15, Carnide"));
        restaurants.add(new Place(R.drawable.restaurante_adega_tia_matilde, "Adega Tia Matilde", "R. Beneficência 77, Entrecampos"));
        restaurants.add(new Place(R.drawable.restaurante_as_velhas, "As Velhas", "R. da Conceição da Glória 21, Av. da Liberdade"));
        restaurants.add(new Place(R.drawable.restaurante_bota_feijao, "Bota Feijão", "R. Conselheiro Lopo Vaz 5, Moscavide"));
        restaurants.add(new Place(R.drawable.restaurante_cervejaria_trindade, "Cervejaria Trindade","R. Nova da Trindade 20 C, Chiado"));
        restaurants.add(new Place(R.drawable.restaurante_chapito, "Chapitô","Costa do Castelo 7"));
        restaurants.add(new Place(R.drawable.restaurante_farol_de_santa_luzia, "Farol de Santa Luzia","Largo de Santa Luzia, 5, Alfama"));
        restaurants.add(new Place(R.drawable.restaurante_floresta_salitre, "Florestra Salitre","Rua do Salitre 42D, Avenida da Liberdade"));
        restaurants.add(new Place(R.drawable.restaurante_cova_funda, "Cova Funda", "Rua Augusto Machado, 3, Areeiro"));

        Adapter_LisbonViews adapter = new Adapter_LisbonViews(this, restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
