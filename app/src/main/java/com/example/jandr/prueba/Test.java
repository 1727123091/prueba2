package com.example.jandr.prueba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class Test extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        

        WebView web = view.findViewById(R.id.WebTest);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setBuiltInZoomControls(true);
        web.loadUrl("https://www.coronavirusecuador.com/prueba-covid-19/");

        web.setWebViewClient(new WebViewClient(){
           public boolean shouldOverriceUrlLoading (WebView view1, String url){
               return false;
           }
        });

        return view;
    }
}