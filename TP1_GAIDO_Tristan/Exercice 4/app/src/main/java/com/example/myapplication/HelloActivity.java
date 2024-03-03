package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView nomLabel = new TextView(this);
        nomLabel.setText(getText(R.string.nom));
        EditText nomEditText = new EditText(this);

        TextView prenomLabel = new TextView(this);
        prenomLabel.setText(getText(R.string.prenom));
        EditText prenomEditText = new EditText(this);

        TextView ageLabel = new TextView(this);
        ageLabel.setText(getText(R.string.age));
        EditText ageEditText = new EditText(this);

        TextView domaineLabel = new TextView(this);
        domaineLabel.setText(getText(R.string.competence));
        EditText domaineEditText = new EditText(this);

        TextView telephoneLabel = new TextView(this);
        telephoneLabel.setText(getText(R.string.telephone));
        EditText telephoneEditText = new EditText(this);

        linearLayout.addView(nomLabel);
        linearLayout.addView(nomEditText);
        linearLayout.addView(prenomLabel);
        linearLayout.addView(prenomEditText);
        linearLayout.addView(ageLabel);
        linearLayout.addView(ageEditText);
        linearLayout.addView(domaineLabel);
        linearLayout.addView(domaineEditText);
        linearLayout.addView(telephoneLabel);
        linearLayout.addView(telephoneEditText);

        Button boutonValider = new Button(this);
        boutonValider.setText(getText(R.string.valider));

        linearLayout.addView(boutonValider);

        boutonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = nomEditText.getText().toString();
                String prenom = prenomEditText.getText().toString();
                String age = ageEditText.getText().toString();
                String domaine = domaineEditText.getText().toString();
                String telephone = telephoneEditText.getText().toString();

                if (!nom.isEmpty() && !prenom.isEmpty() && !age.isEmpty() && !domaine.isEmpty() && !telephone.isEmpty()) {
                    Toast.makeText(HelloActivity.this, getText(R.string.validation_ok), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(HelloActivity.this, getText(R.string.validation_ko), Toast.LENGTH_SHORT).show();
                }
            }
        });
        setContentView(linearLayout);
    }
}
