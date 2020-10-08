package com.example.jandr.prueba.VentanaProductos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jandr.prueba.R;
import com.example.jandr.prueba.VentanasAyuda.ventanaAyuda1;

/**
 * A simple {@link Fragment} subclass.
 *
 * create an instance of this fragment.
 */
public class ProductosMedicinales extends Fragment {

    private ImageView limonada, evaporizacion, gargara;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_productos_medicinales, container, false);

        limonada =  view.findViewById(R.id.imgLimo);
        evaporizacion =  view.findViewById(R.id.imgEva);
        gargara =  view.findViewById(R.id.imgGar);

        limonada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Limonada.class);
                startActivity(intent);
            }
        });

        evaporizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Evaporizacion.class);
                startActivity(intent);
            }
        });

        gargara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Gargaras.class);
                startActivity(intent);
            }
        });

        return view;
    }
}