package com.diego.radious.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.diego.radious.R;
import com.diego.radious.controllers.Recta;
import java.util.List;

public class RadioAdapter extends RecyclerView.Adapter<RadioAdapter.MyViewHolder> {

    private List<Recta> rectas;

    public RadioAdapter(List<Recta> rectas) {
        this.rectas = rectas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_radio_rv, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.coordText.setText(rectas.get(position).getPunto().toString());
        holder.radioText.setText(rectas.get(position).toStringRadio());
        String anguloTxt = rectas.get(position).toStringAngulo();
        if (!anguloTxt.equals("NaN"))
            holder.anguloText.setText(anguloTxt);
        else {
            anguloTxt = "No hay ángulo";
            holder.anguloText.setText(anguloTxt);
        }
    }

    @Override
    public int getItemCount() {
        return rectas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView coordText, radioText, anguloText;

        public MyViewHolder(View itemView) {
            super(itemView);
            coordText = itemView.findViewById(R.id.cord_text);
            radioText = itemView.findViewById(R.id.radio_text);
            anguloText = itemView.findViewById(R.id.angulo_text);
        }
    }
}
