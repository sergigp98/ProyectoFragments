package com.example.proyectofragments.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofragments.R;
import com.example.proyectofragments.utils.Persona;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.MiHolder> {

    private Context ctx;
    private ArrayList<Persona> listaPersonas;
    private OnMiRecyclerListener listener;

    public AdaptadorRecycler(Context ctx, ArrayList listaPersonas) {
        this.ctx = ctx;
        this.listaPersonas = listaPersonas;
        listener = (OnMiRecyclerListener) ctx;
    }

    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_recycler,parent,false);
        MiHolder miHolder = new MiHolder(view);
        return miHolder;
    }

    //Se ejecuta una vez por cada iteracion
    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int position) {
        final Persona actual = listaPersonas.get(position);
        holder.getImagen().setImageResource(actual.getImagen());

        holder.getBoton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onPersonaSelected(actual);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    //Parte grafica
    class MiHolder extends RecyclerView.ViewHolder{

        private ImageView imagen;
        private Button boton;


        public MiHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen_item);
            boton = itemView.findViewById(R.id.nombre_item);
        }

        public ImageView getImagen() {
            return imagen;
        }

        public Button getBoton() {
            return boton;
        }
    }

    public interface OnMiRecyclerListener{
        void onPersonaSelected (Persona persona);//Para recupear los datos de la persona
    }

}
