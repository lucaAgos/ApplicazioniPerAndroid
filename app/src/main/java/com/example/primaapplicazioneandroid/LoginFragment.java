package com.example.primaapplicazioneandroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import org.apache.commons.validator.routines.EmailValidator;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

/*Questo metodo viene eseguito subito dopo onCreateView()
 e si usa per configurare o inizializzare elementi specifici della vista.
 È qui che puoi impostare listener, aggiornare testi, ecc. */

   @Override
   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
      super.onViewCreated(view,savedInstanceState);
       TextInputEditText emailField = view.findViewById(R.id.email);
       TextInputEditText passwordField = view.findViewById(R.id.password);
       Button signIn = view.findViewById(R.id.sign_in);


       signIn.setOnClickListener((bottonePremuto) -> {
           //In questo caso il pulsante è creato staticamente, nell a GUI rispetto
           Log.d(bottonePremuto.getClass().getName(),"Bottone premuto: " +bottonePremuto.getId());

           /**/
           if(checkCredential(emailField.getText().toString(),passwordField.getText().toString())){
               Log.d( this.getClass().getName(),"Accedi alla dashboard");
               /*Gestisce il passaggio da un fragment ad un'activity*/
               Navigation.findNavController(bottonePremuto).navigate(R.id.action_loginFragment_to_pickCountryActivity);

           }else{
               Log.d( this.getClass().getName(),"Errore inserimento");
               // emailField.setError("Check your email"); E' possibile notificare il codice

               Snackbar.make(view.findViewById(R.id.main),"Credenziali non valide", Snackbar.LENGTH_SHORT)
                       .show();

           }

           Log.d( this.getClass().getName(),"Email: " +emailField.getText());

       });
    }

    private  boolean checkCredential(String email,String password){
        return EmailValidator.getInstance().isValid(email) && password.length()>7;

    }


}