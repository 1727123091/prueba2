package com.example.jandr.prueba.VentanasAyuda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jandr.prueba.R;

public class ventanaAyuda1 extends AppCompatActivity {

    TextView texto;
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_ayuda1);

        //Animaciones del texto
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        texto = findViewById(R.id.txtText);
        logo = findViewById(R.id.ImgH);

        texto.setAnimation(animacion2);
        logo.setAnimation(animacion1);

        // Codigo para ponerle tamaño a la ventana
        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho * 0.95), (int) (alto * 0.85));
    }
}