package com.example.android.lisbontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PanoramicViews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Place> views = new ArrayList<Place>();

        views.add(new Place(R.drawable.views_miradouro_graca, "Miradouro da Graça", "Calçada da Graça"));
        views.add(new Place(R.drawable.views_miradouro_portas_do_sol, "Miradouro Portas do Sol", "Largo Portas do Sol"));
        views.add(new Place(R.drawable.views_miradouro_s_pedro_alcantara, "Miradouro S. Pedro de Alcântara", "R. São Pedro de Alcântara"));
        views.add(new Place(R.drawable.views_miradouro_santa_luzia_smaller, "Miradouro de Santa Luzia", "Alfama"));
        views.add(new Place(R.drawable.views_amoreiras_360_panoramic_view, "Vista Panorâmica Amoreiras 360", "Av. Eng. Duarte Pacheco, Amoreiras Shopping Center", "$: 5€"));
        views.add(new Place(R.drawable.views_parque_eduardo_vii, "Miradouro do Parque Eduardo VII", "Alameda Cardeal Cerejeira"));
        views.add(new Place(R.drawable.views_park, "Miradouro do Bar Park", "Bairro Alto"));
        views.add(new Place(R.drawable.views_tivoli_lisboa_sky_bar2, "Miradouro do Sky Bar - Tivoli Hotel", "Av. da Liberdade, Hotel Tivoli"));
        views.add(new Place(R.drawable.views_teleferico_parque_nacoes, "Telecabine - Parque das Nações", "Parque das Nações", "$: 3.95€ (IDA)"));
        views.add(new Place(R.drawable.views_exp_pilar7, "Experiência Pilar 7", "Avenida da Índia", "$: 6€"));


        Adapter_LisbonViews adapter = new Adapter_LisbonViews(this, views);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
