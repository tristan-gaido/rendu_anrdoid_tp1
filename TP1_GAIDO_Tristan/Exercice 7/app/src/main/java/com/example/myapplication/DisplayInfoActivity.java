package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayInfoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);

        // Récupérer les données de l'Intent
        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String prenom = intent.getStringExtra("prenom");
        String age = intent.getStringExtra("age");
        String domaine = intent.getStringExtra("domaine");
        String telephone = intent.getStringExtra("telephone");

        // Afficher les données
        TextView nomTextView = findViewById(R.id.nomTextView);
        nomTextView.setText(getString(R.string.nom) + nom);

        TextView prenomTextView = findViewById(R.id.prenomTextView);
        prenomTextView.setText(getString(R.string.prenom) + prenom);

        TextView ageTextView = findViewById(R.id.ageTextView);
        ageTextView.setText(getString(R.string.age) + age);

        TextView domaineTextView = findViewById(R.id.domaineTextView);
        domaineTextView.setText(getString(R.string.competence) + domaine);

        TextView telephoneTextView = findViewById(R.id.telephoneTextView);
        telephoneTextView.setText(getString(R.string.telephone) + telephone);

        Button okButton = findViewById(R.id.okButton);
        Button retourButton = findViewById(R.id.retourButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayInfoActivity.this, PhoneActivity.class);
                intent.putExtra("telephone", telephone);
                startActivity(intent);
            }
        });

        retourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
