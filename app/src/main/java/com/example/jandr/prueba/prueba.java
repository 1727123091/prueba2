package com.example.jandr.prueba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jandr.prueba.VentanaPatologia.FragmentRecuperacion;
import com.example.jandr.prueba.VentanaPatologia.FragmentTratamiento;
import com.example.jandr.prueba.VentanaPatologia.SintomasFragment;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class prueba extends Fragment {

    ImageView imagenTest, imagenSintomas, imagenTratamiento, imagenRecuperacion;
    Class fragment = null;

    public prueba() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prueba, container, false);
        imagenTest = view.findViewById(R.id.imgTest);
        imagenSintomas = view.findViewById(R.id.imgSintomas);
        imagenTratamiento = view.findViewById(R.id.imgTrata);
        imagenRecuperacion = view.findViewById(R.id.imgRecupe);

        imagenTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getContext(), Sintomas.class);
                //startActivity(intent);
                fragment = Test.class;
                showFragment(fragment);
            }
        });

        imagenSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = SintomasFragment.class;
                showFragment(fragment);
            }
        });

        imagenTratamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = FragmentTratamiento.class;
                showFragment(fragment);
            }
        });

        imagenRecuperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = FragmentRecuperacion.class;
                showFragment(fragment);
            }
        });
        return view;
    }


    private void showFragment(Class fragmentClass) {

        Fragment fragment = null;

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.flContent, fragment)
                .commit();

    }
}