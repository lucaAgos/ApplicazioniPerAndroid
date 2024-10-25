package com.example.primaapplicazioneandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    /*Ridefinisce il comportamento di onCreate che è presente
     AppCompatActivity
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //La ridefinizione prevede
        //di chiamare il comportamento del metodo presente nella classe
        // AppCompatActivity
        //La classe R è self imported e gestita da andorid studio.
        //La classe R viene utilizzata per aggiungere componenti in modo dinamico
        setContentView(R.layout.activity_main); //Associa un activity ad un layout
        System.out.println(R.id.scrittaCiao);
      //  TextView scrittaCiao = findViewById(R.id.scrittaCiao);

    }
}