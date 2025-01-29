package com.example.primaapplicazioneandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class PickCategoriesActivity extends AppCompatActivity {
     public static final String TAG = PickCategoriesActivity.class.getName();
     private MaterialCardView countryCard;
     private MaterialCardView sportCard;
     /*Devo passare i miei dati ad un altra parte dell'applicazione*/
     @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_categories); /*Collega questa classe di controllo con
        la view per activity_pick_categories questo permette di accedere a tutti gli id
         degli elementi anche quelli appartenenti a pagine incluse*/

         countryCard = findViewById(R.id.country_card);
         sportCard = findViewById(R.id.sports_card);

        countryCard.setOnClickListener( view  -> {
           // MaterialCardView fx=  (MaterialCardView) view;
         sportCard.setChecked(!sportCard.isChecked());
        });

    countryCard.setOnClickListener(view -> {
        countryCard.setChecked(!countryCard.isChecked());
    });


    }

}