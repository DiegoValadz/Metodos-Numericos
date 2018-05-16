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

public class JacobiAdapter extends RecyclerView.Adapter<JacobiAdapter.JacobiViewHolder> {

    private ArrayList<IterJacobi> iterJacobis;

    public JacobiAdapter(Jacobi jacobi) {
        iterJacobis = jacobi.getListJacobi();
    }

    @Override
    public JacobiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jacobi_rv, parent, false);
        JacobiViewHolder vh = new JacobiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(JacobiViewHolder holder, int position) {
        holder.i.setText(String.valueOf(position));
        DecimalFormat fmt = new DecimalFormat("#.0000");
        holder.x1.setText(String.valueOf(fmt.format(iterJacobis.get(position).getX1())));
        holder.x1dos.setText(String.valueOf(fmt.format(iterJacobis.get(position).getX1_2())));
        holder.x2.setText(String.valueOf(fmt.format(iterJacobis.get(position).getX2())));
        holder.x2dos.setText(String.valueOf(fmt.format(iterJacobis.get(position).getX2_2())));
        holder.x3.setText(String.valueOf(fmt.format(iterJacobis.get(position).getX3())));
        holder.x3dos.setText(String.valueOf(fmt.format(iterJacobis.get(position).getX3_2())));
    }

    @Override
    public int getItemCount() {
        return iterJacobis.size();
    }

    public class JacobiViewHolder extends RecyclerView.ViewHolder {
        private TextView i, x1, x1dos, x2, x2dos, x3, x3dos;

        public JacobiViewHolder(View itemView) {
            super(itemView);
            i = itemView.findViewById(R.id.item_i);
            x1 = itemView.findViewById(R.id.item_x1);
            x1dos = itemView.findViewById(R.id.item_x1_2);
            x2 = itemView.findViewById(R.id.item_x2);
            x2dos = itemView.findViewById(R.id.item_x2_2);
            x3 = itemView.findViewById(R.id.item_x3);
            x3dos = itemView.findViewById(R.id.item_x3_3);
        }
    }
}
