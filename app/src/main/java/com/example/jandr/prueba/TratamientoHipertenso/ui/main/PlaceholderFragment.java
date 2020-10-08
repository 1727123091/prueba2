package com.example.jandr.prueba.TratamientoHipertenso.ui.main;

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

import com.example.jandr.prueba.R;
import com.example.jandr.prueba.TratamientoGeneral.TratamientoGeneral1;
import com.example.jandr.prueba.TratamientoGeneral.TratamientoGeneral2;
import com.example.jandr.prueba.TratamientoGeneral.TratamientoGeneral3;
import com.example.jandr.prueba.TratamientoGeneral.TratamientoGeneral4;
import com.example.jandr.prueba.TratamientoHipertenso.TratamientoHipertenso1;
import com.example.jandr.prueba.TratamientoHipertenso.TratamientoHipertenso2;
import com.example.jandr.prueba.TratamientoHipertenso.TratamientoHipertenso3;
import com.example.jandr.prueba.TratamientoHipertenso.TratamientoHipertenso4;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static Fragment newInstance(int index) {
        Fragment fragment=null;

        switch (index){
            case 1: fragment = new TratamientoHipertenso1();break;
            case 2: fragment = new TratamientoHipertenso2();break;
            case 3: fragment = new TratamientoHipertenso3();break;
            case 4: fragment = new TratamientoHipertenso4();break;
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
        View root = inflater.inflate(R.layout.fragment_tratamiento_instrucciones_hipertenso, container, false);
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