package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhoneActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_activity);

        Intent intent = getIntent();
        String telephone = intent.getStringExtra("telephone");

        TextView telephoneTextView = findViewById(R.id.telephoneTextView);
        telephoneTextView.setText(getString(R.string.telephone) + telephone);

        Button appelerButton = findViewById(R.id.appelerButton);
        appelerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + telephone));
                startActivity(callIntent);
            }
        });
    }
}
