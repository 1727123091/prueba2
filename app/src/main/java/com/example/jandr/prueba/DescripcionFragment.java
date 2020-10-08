package com.example.jandr.prueba;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jandr.prueba.Entidades.Recomendacion;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class DescripcionFragment extends Fragment {

    TextView tituloDescripcion, descripcion;
    ImageView imagenDes;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.detalle_recomendacion_fragment, container, false);
        tituloDescripcion = view.findViewById(R.id.txtTitulo_descripcion);
        imagenDes = view.findViewById(R.id.img_descripcion);
        descripcion = view.findViewById(R.id.txtDescri_descripcion);

        Bundle objetoRecomendacion = getArguments();
        Recomendacion recomendacion = null;

        if (objetoRecomendacion!=null){
            recomendacion = (Recomendacion) objetoRecomendacion.getSerializable("objeto");
            tituloDescripcion.setText(recomendacion.getTitulo());
            imagenDes.setImageResource(recomendacion.getImagen());
            descripcion.setText(recomendacion.getDescripcion());
        }


        return view;
    }
}