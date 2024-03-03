package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    private EditText editTextDepart;
    private EditText editTextArrivee;
    private Button buttonRechercher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextDepart = findViewById(R.id.editTextDepart);
        editTextArrivee = findViewById(R.id.editTextArrivee);
        buttonRechercher = findViewById(R.id.buttonRechercher);

        buttonRechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String villeDepart = editTextDepart.getText().toString();
                String villeArrivee = editTextArrivee.getText().toString();

                Intent intent = new Intent(MainActivity.this, ListeHorairesActivity.class);
                intent.putExtra("ville_depart", villeDepart);
                intent.putExtra("ville_arrivee", villeArrivee);
                startActivity(intent);
            }
        });
    }
}
