package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListeHorairesActivity extends Activity {
    private RecyclerView recyclerViewHoraires;
    private HoraireAdapter horaireAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_horaires);

        recyclerViewHoraires = findViewById(R.id.recyclerViewHoraires);
        recyclerViewHoraires.setLayoutManager(new LinearLayoutManager(this));

        String villeDepart = getIntent().getStringExtra("ville_depart");
        String villeArrivee = getIntent().getStringExtra("ville_arrivee");

        List<Horaire> horaires = getHoraires(villeDepart, villeArrivee);

        horaireAdapter = new HoraireAdapter(this, horaires);
        recyclerViewHoraires.setAdapter(horaireAdapter);
    }

    private List<Horaire> getHoraires(String villeDepart, String villeArrivee) {
        List<Horaire> horaires = new ArrayList<>();
        horaires.add(new Horaire("08:00", "09:30", "Train rapide"));
        horaires.add(new Horaire("10:00", "11:30", "Train express"));
        horaires.add(new Horaire("13:00", "14:30", "Train local"));
        return horaires;
    }
}
