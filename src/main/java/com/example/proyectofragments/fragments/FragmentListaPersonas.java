package com.example.proyectofragments.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofragments.R;
import com.example.proyectofragments.adaptadores.AdaptadorRecycler;
import com.example.proyectofragments.utils.Persona;

import java.util.ArrayList;

public class FragmentListaPersonas extends Fragment {

    private RecyclerView recyclerPersonas;
    private AdaptadorRecycler adaptador;
    private View view;
    private ArrayList<Persona> listaPersonas;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        recyclerPersonas.setAdapter(adaptador);
        listaPersonas = new ArrayList();
        listaPersonas.add(new Persona("Nombre","Apellido", 123, R.drawable.images));
        listaPersonas.add(new Persona("Nombre","Apellido", 123, R.drawable.images_2));
        listaPersonas.add(new Persona("Nombre","Apellido", 123, R.drawable.images_3));
        listaPersonas.add(new Persona("Nombre","Apellido", 123, R.drawable.images_4));
        listaPersonas.add(new Persona("Nombre","Apellido", 123, R.drawable.images_5));
        listaPersonas.add(new Persona("Nombre","Apellido", 123, R.drawable.images_6));

        recyclerPersonas.setLayoutManager(new GridLayoutManager(getContext(),RecyclerView.VERTICAL));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_lista,container,false);
        recyclerPersonas = view.findViewById(R.id.recycler_personas);
        return view;
    }

    //Instancio cosas que tengan que ver con elementos graficos
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
