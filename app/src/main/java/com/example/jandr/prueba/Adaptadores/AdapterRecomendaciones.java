package com.example.jandr.prueba.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.jandr.prueba.Entidades.Recomendacion;
import com.example.jandr.prueba.R;

import java.util.ArrayList;



public class AdapterRecomendaciones extends RecyclerView.Adapter<AdapterRecomendaciones.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<Recomendacion> model;
    Context context;
    private  View.OnClickListener listener;

    public AdapterRecomendaciones(Context context, ArrayList<Recomendacion> model){
        this.inflater = LayoutInflater.from(context);
        this.model=model;
    }

    public Context getContext() {
        return context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_recomendaciones, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }


    public void setOnClickLister(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nombre = model.get(position).getTitulo();
        int imagen = model.get(position).getImagen();
        holder.titulo.setText(nombre);
        holder.imagen.setImageResource(imagen);
        //Picasso.with(getContext()).load(model.get(position).getVideoUrl());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.txtTitulo);
            imagen = itemView.findViewById(R.id.imagen_reco);
            //itemView.setOnClickListener(this);
        }



    }
}
