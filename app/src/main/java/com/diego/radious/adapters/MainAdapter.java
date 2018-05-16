package com.diego.radious.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.diego.radious.R;
import com.diego.radious.fragments.DiferenciacionFragment;
import com.diego.radious.fragments.BiseccionDatosFragment;
import com.diego.radious.fragments.JacobiFragment;
import com.diego.radious.fragments.MainFragment;
import com.diego.radious.fragments.RadioFragment;
import com.diego.radious.models.Element;

import java.util.List;

/**
 * Created by diego on 31/03/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private Context context;
    private List<Element> elements;

    public MainAdapter(Context context, List<Element> elements) {
        this.context = context;
        this.elements = elements;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_main_rv,parent,false);
        MainViewHolder vh = new MainViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.titulo.setText(elements.get(position).getTitle());
        holder.descripcion.setText( elements.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo,descripcion;
        public MainViewHolder(final View itemView) {
            super(itemView);
            titulo= itemView.findViewById(R.id.titulo_main);
            descripcion = itemView.findViewById(R.id.descripcion_main);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment fragment = selectFragment(getAdapterPosition());
                    changeFragment(fragment);

                }
            });



        }

        private void changeFragment(Fragment fragment) {
            AppCompatActivity activity = (AppCompatActivity) context;
            activity.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container_main,fragment,"Main_Fragment")
                    .addToBackStack(null)
                    .commit();
        }

        private Fragment selectFragment(int position) {
            Fragment fragmentAux;
            switch (position) {
                case 0:
                    fragmentAux = new RadioFragment();
                    break;
                case 1:
                    fragmentAux = new BiseccionDatosFragment();
                    break;
                case 2:
                    fragmentAux = new JacobiFragment();
                    break;
                case 3:
                    fragmentAux = new DiferenciacionFragment();
                    break;
                default:
                    fragmentAux = new MainFragment();

            }
            return fragmentAux;
        }
    }
}
