package com.example.jandr.prueba.VentanaPatologia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.jandr.prueba.Fragmentos.Sintomas.InstruccionesActivity;
import com.example.jandr.prueba.Generales.InsttuccionesGenerales;
import com.example.jandr.prueba.R;
import com.example.jandr.prueba.SintomasHipertenso.InstruccionesHipertenso;
import com.example.jandr.prueba.SintomasTuberculosis.InstruccionesTuberculosis;
import com.example.jandr.prueba.VentanasAyuda.ventanaAyuda1;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class SintomasFragment extends Fragment {

    private ImageView ayuda;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sintomas, container, false);

        CardView general = view.findViewById(R.id.cardViewGeneral);
        CardView embarazo = view.findViewById(R.id.cardViewEmbarzada);
        CardView tuberculosis = view.findViewById(R.id.cardViewTuberculosis);
        CardView hipertenso = view.findViewById(R.id.cardViewHipertenso);

        ayuda =  view.findViewById(R.id.imgAyuda);

        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ventanaAyuda1.class);
                startActivity(intent);
            }
        });

        embarazo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InstruccionesActivity.class);
                startActivity(intent);
            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InsttuccionesGenerales.class);
                startActivity(intent);
            }
        });

        tuberculosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InstruccionesTuberculosis.class);
                startActivity(intent);
            }
        });

        hipertenso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InstruccionesHipertenso.class);
                startActivity(intent);
            }
        });


        return view;

    }

}