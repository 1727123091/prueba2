package com.example.jandr.prueba.Generales.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.jandr.prueba.Fragmentos.Sintomas.FragmentEmbarazada1;
import com.example.jandr.prueba.Fragmentos.Sintomas.FragmentEmbarazada2;
import com.example.jandr.prueba.Fragmentos.Sintomas.FragmentEmbarazada3;
import com.example.jandr.prueba.Fragmentos.Sintomas.FragmentEmbarazada4;
import com.example.jandr.prueba.Generales.FragmentGeneral;
import com.example.jandr.prueba.Generales.FragmentGeneral1;
import com.example.jandr.prueba.Generales.FragmentGeneral2;
import com.example.jandr.prueba.Generales.FragmentGeneral3;
import com.example.jandr.prueba.Generales.FragmentGeneral4;
import com.example.jandr.prueba.Generales.FragmentGeneral5;
import com.example.jandr.prueba.Generales.FragmentGeneral6;
import com.example.jandr.prueba.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static Fragment newInstance(int index) {
        Fragment fragment=null;

        switch (index){
            case 1: fragment = new FragmentGeneral();break;
            case 2: fragment = new FragmentGeneral1();break;
            case 3:fragment = new FragmentGeneral2();break;
            case 4: fragment = new FragmentGeneral3();break;
            case 5: fragment = new FragmentGeneral4();break;
            case 6: fragment = new FragmentGeneral5();break;
            case 7: fragment = new FragmentGeneral6();break;
        }

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_insttucciones_generales, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}