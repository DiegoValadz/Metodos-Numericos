package com.diego.radious.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.diego.radious.R;
import com.diego.radious.controllers.IterJacobi;
import com.diego.radious.controllers.Jacobi;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class JacobiEasAdapter extends RecyclerView.Adapter<JacobiEasAdapter.MyJacEasVH> {
        private Jacobi jacobi;
        private ArrayList<IterJacobi> iterJacobis;

        public JacobiEasAdapter(Jacobi jacobi) {
            this.jacobi = jacobi;
            iterJacobis=jacobi.getListJacobi();
        }

    @Override
    public MyJacEasVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jacobi_eas,parent,false);
        MyJacEasVH vh = new MyJacEasVH(v);
        return vh;    }

    @Override
    public void onBindViewHolder(MyJacEasVH holder, int position) {
        holder.i.setText(String.valueOf(position));
        DecimalFormat fmt = new DecimalFormat("#.0000");
        holder.x1.setText(String.valueOf(fmt.format(iterJacobis.get(position).getEaX1())));
        holder.x2.setText(String.valueOf(fmt.format(iterJacobis.get(position).getEaX2())));
        holder.x3.setText(String.valueOf(fmt.format(iterJacobis.get(position).getEaX3())));
    }

    @Override
    public int getItemCount() {
        return iterJacobis.size();
    }


    public class MyJacEasVH extends RecyclerView.ViewHolder {
        private TextView i,x1,x2,x3;
        public MyJacEasVH(View itemView) {
            super(itemView);
            i= itemView.findViewById(R.id.eas_i);
            x1= itemView.findViewById(R.id.eas_x1);
            x2= itemView.findViewById(R.id.eas_x2);
            x3= itemView.findViewById(R.id.eas_x3);
        }
    }
}
