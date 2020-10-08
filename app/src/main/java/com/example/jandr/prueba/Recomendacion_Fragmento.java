package com.example.jandr.prueba;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jandr.prueba.Adaptadores.AdapterRecomendaciones;
import com.example.jandr.prueba.Adaptadores.ComunicaFragments;
import com.example.jandr.prueba.Entidades.Recomendacion;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class Recomendacion_Fragmento extends Fragment {

    AdapterRecomendaciones adapterRecomendaciones;
    RecyclerView recyclerViewRecome;
    ArrayList<Recomendacion> listarecomendacion;

    //Referencias para comunicar fragmen
    Activity activitidad;
    ComunicaFragments interfaceComunica;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_recomendacion, container, false);

        recyclerViewRecome = root.findViewById(R.id.listRecomendaciones);
        listarecomendacion = new ArrayList<>();
        //cargar lista
        cargarLista();
        //mostrar datos
        mostrarData();
        return root;
    }


    public void cargarLista(){
        listarecomendacion.add(new Recomendacion("Utilizar mascarilla", "Las mascarillas pueden ayudar a prevenir que las personas que las llevan propaguen el virus y lo contagien a otras personas. Sin embargo, no protegen frente a la COVID-19 por sí solas, sino que deben combinarse con el distanciamiento físico y la higiene de manos. Sigue las recomendaciones de los organismos de salud pública de tu zona.",R.drawable.mascarilla, "https://www.youtube.com/embed/zi6VIw2GgkE"));
        listarecomendacion.add(new Recomendacion("Lavarse las manos", "Lávese las manos con frecuencia con un desinfectante de manos a base de alcohol o con agua y jabón.\n" +
                "\n" +
                "¿Por qué? Lavarse las manos con un desinfectante a base de alcohol o con agua y jabón mata el virus si este está en sus manos.",R.drawable.lavadomano, ""));
        listarecomendacion.add(new Recomendacion("Mantén una distancia segura", "Evita compartir el espacio en tu casa, tanto como sea posible. Si compartes el espacio, limita tus movimientos. Ventila bien la cocina y otros espacios que se compartan. Mantén una distancia de por lo menos 6 pies (2 metros) de los miembros de tu familia.",R.drawable.distancia2m, ""));
        listarecomendacion.add(new Recomendacion("Evite el contacto directo", "Evita compartir objetos personales de la casa, como vajilla, toallas, ropa de cama y dispositivos electrónicos.",R.drawable.evite, ""));
        listarecomendacion.add(new Recomendacion("Cúbrase la nariz y la boca al toser y estornudar", "Si no es posible ponerte una mascarilla, cúbrete la boca y la nariz con un pañuelo o con el codo cuando tosas o estornudes. Después, desecha el pañuelo descartable, o lávalo si es de tela.",R.drawable.cubrete, ""));
        listarecomendacion.add(new Recomendacion("Limpie y desinfecte", "Todos los días usa productos de limpieza en forma de aerosol o paños húmedos para limpiar las superficies que se tocan con frecuencia, incluyendo encimeras, mesas, y pestillos de puertas. Evita limpiar el cuarto y el baño separados que usa solo la persona enferma. Separa ropa de cama y utensilios para el uso exclusivo de la persona enferma.",R.drawable.desinfeccion, ""));
        listarecomendacion.add(new Recomendacion("Monitoree su salud a diario", "Es muy importante estar pendiente de las condiciones que nos encontramos en cada dia, estar pendiente todos los dias de la temperatura o los doleres que se presentan en el cuerpo.",R.drawable.monitoriar, ""));
        listarecomendacion.add(new Recomendacion("Evite tocarse los ojos, la nariz y la boca", "Lávate las manos con frecuencia con agua y jabón por lo menos por 20 segundos, especialmente después de estar en contacto cercano o en el mismo cuarto con la persona enferma. Si no dispones de agua ni jabón, utiliza un desinfectante de manos que contenga por lo menos un 60% de alcohol. Evitar tocarte los ojos, la nariz, y la boca.",R.drawable.evitemanosyb, ""));
    }

    public void mostrarData(){
        recyclerViewRecome.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterRecomendaciones = new AdapterRecomendaciones(getContext(),listarecomendacion);
        recyclerViewRecome.setAdapter(adapterRecomendaciones);

        adapterRecomendaciones.setOnClickLister(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = listarecomendacion.get(recyclerViewRecome.getChildAdapterPosition(view)).getTitulo();
                interfaceComunica.enviarRecomendacion(listarecomendacion.get(recyclerViewRecome.getChildAdapterPosition(view)));
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof Activity){
            this.activitidad = (Activity) context;
            interfaceComunica = (ComunicaFragments) this.activitidad;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}


