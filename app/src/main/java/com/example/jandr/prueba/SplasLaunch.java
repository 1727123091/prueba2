package com.example.jandr.prueba;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplasLaunch extends AppCompatActivity {

    ImageView logo;
    TextView trackin;
    TextView covi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_launch);

        //Agregar Animaciones
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        trackin = findViewById(R.id.txtTra);
        covi = findViewById(R.id.txtCov);
        logo = findViewById(R.id.logoimg);

        trackin.setAnimation(animacion2);
        covi.setAnimation(animacion2);
        logo.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplasLaunch.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}