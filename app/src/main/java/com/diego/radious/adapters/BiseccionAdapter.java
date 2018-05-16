package com.diego.radious.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.diego.radious.R;
import com.diego.radious.controllers.Biseccion;
import com.diego.radious.controllers.Iteracion;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 31/03/2018.
 */

public class BiseccionAdapter extends RecyclerView.Adapter<BiseccionAdapter.BiseccionVH>{

    private Biseccion biseccion;
    private List<Iteracion> iteracionList = new ArrayList<>();

    public BiseccionAdapter(Biseccion biseccion) {
        this.biseccion = biseccion;
        this.iteracionList = biseccion.getIteracionList();
    }

    @Override
    public BiseccionVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_iter_rv,parent,false);
        BiseccionVH vh = new BiseccionVH(v);


        return vh;
    }

    @Override
    public void onBindViewHolder(BiseccionVH holder, int position) {
        holder.i.setText(String.valueOf(position));
        DecimalFormat format = new DecimalFormat("#.000");
        holder.a.setText(String.valueOf(format.format(iteracionList.get(position).getA())));
        holder.fa.setText(String.valueOf(format.format(iteracionList.get(position).getF_a())));
        holder.b.setText(String.valueOf(format.format(iteracionList.get(position).getB())));
        holder.fb.setText(String.valueOf(format.format(iteracionList.get(position).getF_b())));
        holder.m.setText(String.valueOf(format.format(iteracionList.get(position).getM())));
        holder.fm.setText(String.valueOf(format.format(iteracionList.get(position).getF_m())));
        /*if(position==0)
            holder.ea.setText("No");
        else*/
        holder.ea.setText(String.valueOf(format.format(iteracionList.get(position).getE_A())));
    }

    @Override
    public int getItemCount() {
        return iteracionList.size();
    }

    public class BiseccionVH extends RecyclerView.ViewHolder {
        private TextView i,a,fa,b,fb,m,fm,ea;
        public BiseccionVH(View itemView) {
            super(itemView);

            i = itemView.findViewById(R.id.item_i);
            a = itemView.findViewById(R.id.item_a);
            fa = itemView.findViewById(R.id.item_fa);
            b = itemView.findViewById(R.id.item_b);
            fb = itemView.findViewById(R.id.item_fb);
            m = itemView.findViewById(R.id.item_m);
            fm = itemView.findViewById(R.id.item_fm);
            ea = itemView.findViewById(R.id.item_ea);




        }
    }
}
