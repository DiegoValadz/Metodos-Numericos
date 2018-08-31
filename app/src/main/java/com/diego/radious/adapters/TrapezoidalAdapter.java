package com.diego.radious.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.diego.radious.R;
import com.diego.radious.controllers.Evaluacion;

import java.util.ArrayList;
import java.util.List;

public class TrapezoidalAdapter extends RecyclerView.Adapter<TrapezoidalAdapter.TrapezoidalVH> {

    ArrayList<Evaluacion> evaluacions;

    public TrapezoidalAdapter(ArrayList<Evaluacion> evaluacions) {
        this.evaluacions = evaluacions;
    }

    @Override
    public TrapezoidalVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trapezoidal,parent,false);
        TrapezoidalVH vh = new TrapezoidalVH(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TrapezoidalVH holder, int position) {
        holder.zero.setText(String.valueOf(evaluacions.get(position).getX()));
        holder.uno.setText(String.valueOf(evaluacions.get(position).getEv()));

    }

    @Override
    public int getItemCount() {
        return evaluacions.size();
    }

    public class TrapezoidalVH extends RecyclerView.ViewHolder {
        TextView zero,uno;
        public TrapezoidalVH(View itemView) {
            super(itemView);
            zero = itemView.findViewById(R.id.trap_rv_0);
            uno = itemView.findViewById(R.id.trap_rv_1);
        }
    }
}
