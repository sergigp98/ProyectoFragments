package com.example.proyectofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.proyectofragments.fragments.FragmentListaPersonas;

public class MainActivity extends AppCompatActivity {

    FrameLayout layout;
    //private FragmentManager fm;//Lo instancio y lo utilizo cuando lo vaya a utilizar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        cargaInicial();
    }

    private void cargaInicial() {
        //gestiona
        /*fm = getSupportFragmentManager();//Instanciarlo
        //mover fragment
        FragmentTransaction ft = fm.beginTransaction();*/

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.sitio_fragments, new FragmentListaPersonas());
        //ft.addToBackStack(null);
        ft.commit();

    }

    private void instancias() {
        layout = findViewById(R.id.sitio_fragments);
    }
}
