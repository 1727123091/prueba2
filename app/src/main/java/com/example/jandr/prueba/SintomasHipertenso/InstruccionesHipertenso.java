package com.example.jandr.prueba.SintomasHipertenso;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jandr.prueba.R;

import com.example.jandr.prueba.SintomasHipertenso.ui.main.SectionsPagerAdapter;

public class InstruccionesHipertenso extends AppCompatActivity {

    ViewPager viewPager;
    private LinearLayout linearpuntos;
    private TextView[] puntosSlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones_hipertenso);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        linearpuntos=findViewById(R.id.idLinearPuntos);
        agregarIndicadorPuntos(0);
        viewPager.addOnPageChangeListener(viewListener);
    }

    private void agregarIndicadorPuntos(int pos) {
        puntosSlide = new TextView[4];
        linearpuntos.removeAllViews();

        for (int i=0; i<puntosSlide.length; i++){
            puntosSlide[i]=new TextView(this);
            puntosSlide[i].setText(Html.fromHtml("&#8226;"));
            puntosSlide[i].setTextSize(35);
            puntosSlide[i].setTextColor(getResources().getColor(R.color.color_lauch));
            linearpuntos.addView(puntosSlide[i]);
        }

        if (puntosSlide.length>0){
            puntosSlide[pos].setTextColor(getResources().getColor(R.color.colorPrimaryA));
        }
    }

    ViewPager.OnPageChangeListener viewListener= new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int pos) {
            agregarIndicadorPuntos(pos);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}