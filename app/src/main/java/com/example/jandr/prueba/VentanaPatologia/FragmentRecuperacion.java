package com.example.jandr.prueba.VentanaPatologia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jandr.prueba.R;
import com.example.jandr.prueba.RecuperacionEmbarazo.RecuperacionInstruccionesEmbarazo;
import com.example.jandr.prueba.RecuperacionGeneral.RecuperacionInstruccionesGeneral;
import com.example.jandr.prueba.RecuperacionHipertension.RecuperacionInstruccionesHipertencion;
import com.example.jandr.prueba.RecuperacionTuberculosis.RecuperacionInstruccionesTuberculosis;
import com.example.jandr.prueba.VentanasAyuda.ventanaAyuda1;


public class FragmentRecuperacion extends Fragment {

    private ImageView ayuda;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recuperacion, container, false);

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
                Intent intent = new Intent(getContext(), RecuperacionInstruccionesEmbarazo.class);
                startActivity(intent);
            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RecuperacionInstruccionesGeneral.class);
                startActivity(intent);
            }
        });

        tuberculosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RecuperacionInstruccionesTuberculosis.class);
                startActivity(intent);
            }
        });

        hipertenso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RecuperacionInstruccionesHipertencion.class);
                startActivity(intent);
            }
        });


        return view;
    }
}