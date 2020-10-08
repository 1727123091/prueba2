package com.example.jandr.prueba.VentanaAcerca;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.jandr.prueba.R;

/**
 * A simple {@link Fragment} subclass.
 *
 * create an instance of this fragment.
 */
public class AcercaDe extends Fragment {

    TextView texto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_acerca_de, container, false);

        //Animaciones del texto
        Animation animacion1 = AnimationUtils.loadAnimation(getContext(), R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(getContext(), R.anim.desplazamiento_abajo);

        texto = view.findViewById(R.id.txtacerca);

        texto.setAnimation(animacion2);

        return view;
    }
}