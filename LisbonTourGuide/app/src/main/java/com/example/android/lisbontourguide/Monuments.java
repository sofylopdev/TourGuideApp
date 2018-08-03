package com.example.android.lisbontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Place> monuments = new ArrayList<Place>();

        monuments.add(new Place(R.drawable.monumentos_torre_belem, "Torre de Belém","Belém", "$: 6€" ));
        monuments.add(new Place(R.drawable.monumentos_mosteiro_jeronimos, "Mosteiro dos Jerónimos","Belém", "$: 10€"));
        monuments.add(new Place(R.drawable.monumentos_padrao_descobrimentos, "Padrão dos Descobrimentos","Belém", "$: 5€"));
        monuments.add(new Place(R.drawable.monumentos_castelo_de_sao_jorge, "Castelo de S. Jorge"," R. de Santa Cruz do Castelo", "$: 8.5€"));
        monuments.add(new Place(R.drawable.monumentos_se_lisboa, "Sé de Lisboa"," Largo da Sé"));
        monuments.add(new Place(R.drawable.monumentos_basilica_estrela, "Basílica da Estrela","Praça da Estrela"));
        monuments.add(new Place(R.drawable.monumentos_panteao_nacional, "Panteão Nacional","Campo de Santa Clara", "$: 4€"));
        monuments.add(new Place(R.drawable.monumentos_terreiro_paco, "Terreiro do Paço", "Praça do Comércio"));
        monuments.add(new Place(R.drawable.monumentos_teatro_d_maria, "Teatro D. Maria","Praça Dom Pedro IV", "$: 8€"));
        monuments.add(new Place(R.drawable.monumentos_palacio_nacional_da_ajuda, "Palácio Nacional da Ajuda","Largo Ajuda", "$: 5€"));

        Adapter_LisbonViews adapter = new Adapter_LisbonViews(this, monuments);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
