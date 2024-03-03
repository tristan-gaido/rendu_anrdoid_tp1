package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HoraireAdapter extends RecyclerView.Adapter<HoraireAdapter.HoraireViewHolder> {
    private Context context;
    private List<Horaire> horaires;

    public HoraireAdapter(Context context, List<Horaire> horaires) {
        this.context = context;
        this.horaires = horaires;
    }

    @NonNull
    @Override
    public HoraireViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_horaire, parent, false);
        return new HoraireViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoraireViewHolder holder, int position) {
        Horaire horaire = horaires.get(position);
        holder.textViewHeureDepart.setText("Heure de départ: " + horaire.getHeureDepart());
        holder.textViewHeureArrivee.setText("Heure d'arrivée: " + horaire.getHeureArrivee());
        holder.textViewTypeTransport.setText("Type de transport: " + horaire.getTypeTransport());
    }

    @Override
    public int getItemCount() {
        return horaires.size();
    }

    public class HoraireViewHolder extends RecyclerView.ViewHolder {
        TextView textViewHeureDepart;
        TextView textViewHeureArrivee;
        TextView textViewTypeTransport;

        public HoraireViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewHeureDepart = itemView.findViewById(R.id.textViewHeureDepart);
            textViewHeureArrivee = itemView.findViewById(R.id.textViewHeureArrivee);
            textViewTypeTransport = itemView.findViewById(R.id.textViewTypeTransport);
        }
    }
}
