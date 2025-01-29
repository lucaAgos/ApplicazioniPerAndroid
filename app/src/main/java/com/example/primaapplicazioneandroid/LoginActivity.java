package com.example.primaapplicazioneandroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import org.apache.commons.validator.routines.EmailValidator;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*
        TextInputEditText emailField = super.findViewById(R.id.email);
        TextInputEditText passwordField = super.findViewById(R.id.password);
        Button signIn = super.findViewById(R.id.sign_in);


        signIn.setOnClickListener((bottonePremuto) -> {
             //In questo caso il pulsante è creato staticamente, nell a GUI rispetto
            Log.d(bottonePremuto.getClass().getName(),"Bottone premuto: " +bottonePremuto.getId());

             if(checkCredential(emailField.getText().toString(),passwordField.getText().toString())){
                 Log.d( this.getClass().getName(),"Accedi alla dashboard");

                 Intent intent = new Intent(this,PickCountryActivity.class);
                 savedInstanceState.putString("EMAIL_KEY",emailField.getText().toString());
                 //Salvo nell'oggetto savedInstanceState la mail da passare all'altra pagina
                 super.startActivity(intent); //Esegue il trasferimento
                  */
                 /*
                 Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                 // Creare un Intent con l'azione ACTION_VIEW e l'URI specificato
                 Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Rendere esplicito l'Intent specificando il pacchetto dell'app Google Maps
                 mapIntent.setPackage("com.google.android.apps.maps");

                // Avviare un'attività che può gestire l'Intent
                 startActivity(mapIntent);*/


                 /*Questo codice permette di andare a far selezionare all'utente un file (immagine)
                 Succesivamnte eseguire delle operazioni, ANCHE CON IL FILE CHE L'UTENTE HA SELEZIONATO
                 */
                 /*In questo specifico caso il sistema operativo trova l'applicazione adeguata per andare
                 a mostrare all'utente le immagini disponibili */

                 /*
                 ActivityResultLauncher<String> launcher = super.registerForActivityResult(
                         new ActivityResultContracts.GetContent(), // Contratto per ottenere un contenuto
                         new ActivityResultCallback<Uri>() {
                             @Override
                             public void onActivityResult(Uri uri) {
                                 try{
                                     Bitmap b = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                                     ((ImageView)findViewById(R.id.imageView)).setImageBitmap(b);

                                 }catch (FileNotFoundException e){
                                     Log.d( this.getClass().getName(),"Impossibile trovare il file");

                                 }catch(IOException e){
                                     Log.d( this.getClass().getName(),"Errore generale");

                                 }

                             }
                         }
                 );
               */

            /*
             }else{
                 Log.d( this.getClass().getName(),"Errore inserimento");
                // emailField.setError("Check your email"); E' possibile notificare il codice

                 Snackbar.make(super.findViewById(R.id.main),"Credenziali non valide", Snackbar.LENGTH_SHORT)
                         .show();

             }

            Log.d( this.getClass().getName(),"Email: " +emailField.getText());



        });*/
    }

    private  boolean checkCredential(String email,String password){
         return EmailValidator.getInstance().isValid(email) && password.length()>7;

    }




}