package com.example.jandr.prueba.Generales;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jandr.prueba.MainActivity;
import com.example.jandr.prueba.R;
import com.example.jandr.prueba.Test;
import com.example.jandr.prueba.VentanaPatologia.SintomasFragment;
import com.example.jandr.prueba.VentanaProductos.Limonada;
import com.example.jandr.prueba.prueba;

/**
 * A simple {@link Fragment} subclass.
 *
 * create an instance of this fragment.
 */
public class FragmentGeneral6 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_general6, container, false);

        return view;
    }
}