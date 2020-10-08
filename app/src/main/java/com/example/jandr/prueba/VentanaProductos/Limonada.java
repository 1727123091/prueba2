package com.example.jandr.prueba.VentanaProductos;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.jandr.prueba.Adaptadores.VideoAdapter;
import com.example.jandr.prueba.Adaptadores.YouTubeVideos;
import com.example.jandr.prueba.R;

import java.util.Vector;

public class Limonada extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<YouTubeVideos> youTubeVideos = new Vector<YouTubeVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limonada);

        // Codigo para ponerle tamaño a la ventana
        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho * 0.95), (int) (alto * 0.85));
        //

        // Codigo para agg video
        recyclerView = (RecyclerView) findViewById(R.id.recycleVideo);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ChcVdoIc-gM\" frameborder=\"0\" allowfullscreen></iframe>"));
        //youTubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vSDqD_G4_ms\" frameborder=\"0\" allowfullscreen></iframe>") );
        //<iframe width="100%" height="100%" src="https://www.youtube.com/embed/vSDqD_G4_ms" frameborder="0" allowfullscreen></iframe>
        VideoAdapter videoAdapter = new VideoAdapter(youTubeVideos);
        recyclerView.setAdapter(videoAdapter);
        //

    }
}